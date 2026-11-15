package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1908Ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I0.b f19695a = null;

    C1908Ix() {
    }

    public final void a(WebView webView) {
        if (this.f19695a != null) {
            try {
                I0.i.n(webView, "GMA_WEBVIEW_PROFILE");
                AbstractC0786o0.k("WebViewCompat Profile is defined");
            } catch (IllegalStateException e10) {
                String strConcat = "WebViewCompat error: ".concat(e10.toString());
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f(strConcat);
                if (((Boolean) H4.B.c().d(AbstractC3892ii.zf)).booleanValue()) {
                    G4.t.l().j(e10, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void b(C2115Mx c2115Mx) {
        ProfileStore profileStore;
        if (!I0.j.a("MULTI_PROFILE")) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) AbstractC4272lj0.a("androidx.webkit.ProfileStore", Constants.GET_INSTANCE, new AbstractC4146kj0[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i11 = AbstractC0786o0.f2696b;
            L4.p.a("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) AbstractC4272lj0.a("androidx.webkit.ProfileStore$-CC", Constants.GET_INSTANCE, new AbstractC4146kj0[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                L4.p.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.f19695a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) H4.B.c().d(AbstractC3892ii.yf)).booleanValue()) {
                long jElapsedRealtime = G4.t.o().elapsedRealtime() - c2115Mx.f20960a;
                PR prA = c2115Mx.f20961b.d().a();
                prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "webview_p_l");
                prA.c("webview_p_l", Long.toString(jElapsedRealtime));
                prA.d();
                return;
            }
            return;
        }
        int i12 = AbstractC0786o0.f2696b;
        L4.p.f("WebViewCompat failure: No instance");
        if (((Boolean) H4.B.c().d(AbstractC3892ii.yf)).booleanValue()) {
            PR prA2 = c2115Mx.f20961b.d().a();
            prA2.c(HandleInvocationsFromAdViewer.KEY_ACTION, "webview_p_f");
            prA2.c("webview_p_f", "No instance");
            prA2.d();
        }
    }
}
