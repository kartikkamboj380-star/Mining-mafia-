package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import Q4.AbstractC0928c;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5242tR implements GI, InterfaceC0580a, InterfaceC5220tG, InterfaceC3208dG, InterfaceC5726xH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2436Tb0 f33400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QR f33401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5011rb0 f33402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3502fb0 f33403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5884yX f33404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f33405g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f33407i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33406h = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AtomicBoolean f33409k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final AtomicBoolean f33410l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f33408j = ((Boolean) H4.B.c().d(AbstractC3892ii.f29607K7)).booleanValue();

    public C5242tR(Context context, C2436Tb0 c2436Tb0, QR qr, C5011rb0 c5011rb0, C3502fb0 c3502fb0, C5884yX c5884yX, String str) {
        this.f33399a = context;
        this.f33400b = c2436Tb0;
        this.f33401c = qr;
        this.f33402d = c5011rb0;
        this.f33403e = c3502fb0;
        this.f33404f = c5884yX;
        this.f33405g = str;
    }

    private final boolean b() {
        String strG0;
        if (this.f33407i == null) {
            synchronized (this) {
                if (this.f33407i == null) {
                    String str = (String) H4.B.c().d(AbstractC3892ii.f29751Z1);
                    G4.t.g();
                    try {
                        strG0 = K4.F0.g0(this.f33399a);
                    } catch (RemoteException unused) {
                        strG0 = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strG0 != null) {
                        try {
                            zMatches = Pattern.matches(str, strG0);
                        } catch (RuntimeException e10) {
                            G4.t.l().j(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f33407i = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f33407i.booleanValue();
    }

    private final PR e(String str) {
        C5011rb0 c5011rb0 = this.f33402d;
        C4886qb0 c4886qb0 = c5011rb0.f32991b;
        PR prA = this.f33401c.a();
        prA.a(c4886qb0.f32672b);
        C3502fb0 c3502fb0 = this.f33403e;
        prA.b(c3502fb0);
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        prA.c("ad_format", this.f33405g.toUpperCase(Locale.ROOT));
        List list = c3502fb0.f28433t;
        if (!list.isEmpty()) {
            prA.c("ancn", (String) list.get(0));
        }
        if (c3502fb0.b()) {
            prA.c("device_connectivity", true != G4.t.l().v(this.f33399a) ? "offline" : "online");
            prA.c("event_timestamp", String.valueOf(G4.t.o().currentTimeMillis()));
            prA.c("offline_ad", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29677R7)).booleanValue()) {
            boolean zA = AbstractC0928c.a(c5011rb0);
            prA.c("scar", String.valueOf(zA));
            if (zA) {
                H4.h2 h2Var = c5011rb0.f32990a.f31840a.f35795d;
                prA.c("ragent", h2Var.f1278G);
                prA.c("rtype", AbstractC0928c.b(AbstractC0928c.c(h2Var)));
            }
        }
        return prA;
    }

    private final void h(PR pr) {
        if (!this.f33403e.b()) {
            pr.d();
            return;
        }
        this.f33404f.n(new AX(G4.t.o().currentTimeMillis(), this.f33402d.f32991b.f32672b.f29455b, pr.g(), 2));
    }

    private final boolean i() {
        int i10 = this.f33403e.f28397b;
        return i10 == 2 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void H0(H4.Z0 z9) {
        H4.Z0 z10;
        if (this.f33408j) {
            PR prE = e("ifts");
            prE.c("reason", "adapter");
            int i10 = z9.f1252a;
            String str = z9.f1253b;
            if (z9.f1254c.equals(MobileAds.ERROR_DOMAIN) && (z10 = z9.f1255d) != null && !z10.f1254c.equals(MobileAds.ERROR_DOMAIN)) {
                H4.Z0 z11 = z9.f1255d;
                i10 = z11.f1252a;
                str = z11.f1253b;
            }
            if (i10 >= 0) {
                prE.c("arec", String.valueOf(i10));
            }
            String strA = this.f33400b.a(str);
            if (strA != null) {
                prE.c("areec", strA);
            }
            prE.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void P(GL gl) {
        if (this.f33408j) {
            PR prE = e("ifts");
            prE.c("reason", "exception");
            if (!TextUtils.isEmpty(gl.getMessage())) {
                prE.c("msg", gl.getMessage());
            }
            prE.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        if (b() || this.f33403e.b()) {
            PR prE = e("impression");
            prE.c("imp_type", String.valueOf(this.f33403e.f28403e));
            if (this.f33406h > 0) {
                prE.c("p_imp_l", String.valueOf(G4.t.o().currentTimeMillis() - this.f33406h));
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.af)).booleanValue() && i()) {
                G4.t.g();
                prE.c("foreground", true != K4.F0.l(this.f33399a) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
                prE.c("fg_show", true == this.f33409k.get() ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
            }
            h(prE);
        }
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        if (this.f33403e.b()) {
            h(e("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void v() {
        if (b()) {
            PR prE = e("adapter_impression");
            prE.c("imp_type", String.valueOf(this.f33403e.f28403e));
            if (this.f33410l.get()) {
                prE.c("po", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                prE.c("pil", String.valueOf(G4.t.o().currentTimeMillis() - this.f33406h));
            } else {
                prE.c("po", "0");
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.af)).booleanValue() && i()) {
                G4.t.g();
                prE.c("foreground", true != K4.F0.l(this.f33399a) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
                prE.c("fg_show", true != this.f33409k.get() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.bf)).booleanValue() && i()) {
                prE.c("fg_al", true == G4.t.k().f() ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
            }
            prE.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void w() {
        if (b()) {
            e("adapter_shown").d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void zze() {
        if (this.f33408j) {
            PR prE = e("ifts");
            prE.c("reason", "blocked");
            prE.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5726xH
    public final void zzk() {
        if (b()) {
            this.f33410l.set(true);
            this.f33406h = G4.t.o().currentTimeMillis();
            PR prE = e("presentation");
            boolean zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.af)).booleanValue();
            String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            if (zBooleanValue && i()) {
                AtomicBoolean atomicBoolean = this.f33409k;
                G4.t.g();
                atomicBoolean.set(!K4.F0.l(this.f33399a));
                prE.c("foreground", true != atomicBoolean.get() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.bf)).booleanValue() && i()) {
                if (true != G4.t.k().f()) {
                    str = "0";
                }
                prE.c("fg_al", str);
            }
            prE.d();
        }
    }
}
