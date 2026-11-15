package com.google.android.gms.ads;

import B4.n;
import B4.t;
import B4.v;
import H4.C0650x1;
import L4.p;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.C1894Iq;
import com.google.android.gms.internal.ads.InterfaceC4291lt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        C0650x1.f().o(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return C0650x1.f().n();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return C0650x1.f().q();
    }

    @NonNull
    public static t getRequestConfiguration() {
        return C0650x1.f().r();
    }

    @NonNull
    public static v getVersion() {
        C0650x1.f();
        String[] strArrSplit = TextUtils.split("24.9.0", "\\.");
        if (strArrSplit.length != 3) {
            return new v(0, 0, 0);
        }
        try {
            return new v(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new v(0, 0, 0);
        }
    }

    public static void initialize(@NonNull Context context) {
        C0650x1.f().g(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull n nVar) {
        C0650x1.f().p(context, nVar);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        C0650x1.f().l(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z9) {
        return C0650x1.f().t(z9);
    }

    public static p180s.f registerCustomTabsSession(@NonNull Context context, @NonNull p180s.c cVar, @NonNull String str, p180s.b bVar) {
        C0650x1.f();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        InterfaceC4291lt interfaceC4291ltA = C1894Iq.a(context);
        if (interfaceC4291ltA == null) {
            p.c("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (p180s.f) com.google.android.gms.dynamic.b.h0(interfaceC4291ltA.R4(com.google.android.gms.dynamic.b.N0(context), com.google.android.gms.dynamic.b.N0(cVar), str, com.google.android.gms.dynamic.b.N0(bVar)));
        } catch (RemoteException | IllegalArgumentException e10) {
            p.d("Unable to register custom tabs session. Error: ", e10);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        C0650x1.f().m(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        C0650x1.f();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            p.c("The webview to be registered cannot be null.");
            return;
        }
        InterfaceC4291lt interfaceC4291ltA = C1894Iq.a(webView.getContext());
        if (interfaceC4291ltA == null) {
            p.c("Internal error, query info generator is null.");
            return;
        }
        try {
            interfaceC4291ltA.i0(com.google.android.gms.dynamic.b.N0(webView));
        } catch (RemoteException e10) {
            p.d("", e10);
        }
    }

    public static void setAppMuted(boolean z9) {
        C0650x1.f().k(z9);
    }

    public static void setAppVolume(float f10) {
        C0650x1.f().j(f10);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        C0650x1.f().u(str);
    }

    public static void setRequestConfiguration(@NonNull t tVar) {
        C0650x1.f().s(tVar);
    }

    @Deprecated
    public static void startPreload(@NonNull Context context, @NonNull List<S4.b> list, @NonNull S4.a aVar) {
        C0650x1.f().i(context, list, aVar);
    }

    @KeepForSdk
    private static void stop() {
        C0650x1.f().h();
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        C0650x1.f().g(context, null, onInitializationCompleteListener);
    }
}
