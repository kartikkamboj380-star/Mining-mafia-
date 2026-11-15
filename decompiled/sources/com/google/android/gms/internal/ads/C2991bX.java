package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2991bX extends AbstractC3367eX {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray f26839h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f26840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CF f26841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TelephonyManager f26842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TW f26843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumC1668Eh f26844g;

    static {
        SparseArray sparseArray = new SparseArray();
        f26839h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC5272tg.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC5272tg enumC5272tg = EnumC5272tg.CONNECTING;
        sparseArray.put(iOrdinal, enumC5272tg);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC5272tg);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC5272tg);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC5272tg.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC5272tg enumC5272tg2 = EnumC5272tg.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC5272tg2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC5272tg2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC5272tg2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC5272tg2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC5272tg2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC5272tg.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC5272tg);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC5272tg);
    }

    C2991bX(Context context, CF cf, TW tw, PW pw, InterfaceC0790q0 interfaceC0790q0) {
        super(pw, interfaceC0790q0);
        this.f26840c = context;
        this.f26841d = cf;
        this.f26843f = tw;
        this.f26842e = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ EnumC5272tg f(Bundle bundle) {
        return (EnumC5272tg) f26839h.get(AbstractC2176Ob0.a(AbstractC2176Ob0.a(bundle, "device"), "network").getInt("active_network_state", -1), EnumC5272tg.UNSPECIFIED);
    }

    private static final EnumC1668Eh g(boolean z9) {
        return z9 ? EnumC1668Eh.ENUM_TRUE : EnumC1668Eh.ENUM_FALSE;
    }

    public final void b(boolean z9) {
        AbstractC5685wx0.r(this.f26841d.a(new Bundle()), new C2865aX(this, z9), AbstractC2315Qt.f22479g);
    }

    final /* synthetic */ C4517ng c(Bundle bundle) {
        EnumC4013jg enumC4013jg;
        C3888ig c3888igE0 = C4517ng.e0();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            this.f26844g = EnumC1668Eh.ENUM_TRUE;
        } else {
            this.f26844g = EnumC1668Eh.ENUM_FALSE;
            if (i10 == 0) {
                c3888igE0.A(EnumC4265lg.CELL);
            } else if (i10 != 1) {
                c3888igE0.A(EnumC4265lg.NETWORKTYPE_UNSPECIFIED);
            } else {
                c3888igE0.A(EnumC4265lg.WIFI);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC4013jg = EnumC4013jg.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    enumC4013jg = EnumC4013jg.THREE_G;
                    break;
                case 13:
                    enumC4013jg = EnumC4013jg.LTE;
                    break;
                default:
                    enumC4013jg = EnumC4013jg.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            c3888igE0.B(enumC4013jg);
        }
        return (C4517ng) c3888igE0.w();
    }

    final /* synthetic */ byte[] d(boolean z9, ArrayList arrayList, C4517ng c4517ng, EnumC5272tg enumC5272tg) {
        C5020rg c5020rgI0 = C4895qg.I0();
        c5020rgI0.M(arrayList);
        Context context = this.f26840c;
        c5020rgI0.B(g(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c5020rgI0.C(G4.t.j().e(context, this.f26842e));
        TW tw = this.f26843f;
        c5020rgI0.K(tw.f());
        c5020rgI0.L(tw.j());
        c5020rgI0.D(tw.d());
        c5020rgI0.F(enumC5272tg);
        c5020rgI0.O(c4517ng);
        c5020rgI0.E(this.f26844g);
        c5020rgI0.I(g(z9));
        c5020rgI0.G(tw.b());
        c5020rgI0.H(G4.t.o().currentTimeMillis());
        c5020rgI0.A(g(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return ((C4895qg) c5020rgI0.w()).i();
    }

    final /* synthetic */ TW e() {
        return this.f26843f;
    }
}
