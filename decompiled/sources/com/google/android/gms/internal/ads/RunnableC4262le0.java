package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.le0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4262le0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f31305k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f31306l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f31307m = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Boolean f31308v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L4.a f31310b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AQ f31314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f31315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2583Vx f31316h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1688Er f31318j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4766pe0 f31311c = C5143se0.e0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31312d = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31317i = false;

    public RunnableC4262le0(Context context, L4.a aVar, AQ aq, DW dw, C1688Er c1688Er, C2583Vx c2583Vx) {
        this.f31309a = context;
        this.f31310b = aVar;
        this.f31314f = aq;
        this.f31318j = c1688Er;
        this.f31316h = c2583Vx;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ha)).booleanValue()) {
            this.f31315g = K4.F0.X();
        } else {
            this.f31315g = AbstractC5931yu0.l();
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f31305k) {
            try {
                if (f31308v == null) {
                    if (((Boolean) AbstractC3140cj.f27183b.e()).booleanValue()) {
                        f31308v = Boolean.valueOf(Math.random() < ((Double) AbstractC3140cj.f27182a.e()).doubleValue());
                    } else {
                        f31308v = Boolean.FALSE;
                    }
                }
                zBooleanValue = f31308v.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(final C3006be0 c3006be0) {
        AbstractC2315Qt.f22473a.j0(new Runnable() { // from class: com.google.android.gms.internal.ads.ke0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30849a.c(c3006be0);
            }
        });
    }

    final /* synthetic */ void c(C3006be0 c3006be0) {
        synchronized (f31307m) {
            try {
                if (!this.f31317i) {
                    this.f31317i = true;
                    if (a()) {
                        try {
                            G4.t.g();
                            this.f31312d = K4.F0.g0(this.f31309a);
                        } catch (RemoteException | RuntimeException e10) {
                            G4.t.l().j(e10, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f31313e = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f31309a);
                        int iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.ca)).intValue();
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.qd)).booleanValue()) {
                            long j10 = iIntValue;
                            AbstractC2315Qt.f22476d.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                        } else {
                            long j11 = iIntValue;
                            AbstractC2315Qt.f22476d.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.ia)).booleanValue()) {
                            this.f31316h.a();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a() && c3006be0 != null) {
            synchronized (f31306l) {
                try {
                    C4766pe0 c4766pe0 = this.f31311c;
                    if (c4766pe0.A() >= ((Integer) H4.B.c().d(AbstractC3892ii.da)).intValue()) {
                        return;
                    }
                    C4388me0 c4388me0F0 = C4640oe0.f0();
                    c4388me0F0.a0(c3006be0.m());
                    c4388me0F0.A(c3006be0.b());
                    c4388me0F0.B(c3006be0.a());
                    c4388me0F0.b0(3);
                    c4388me0F0.D(this.f31310b.f3097a);
                    c4388me0F0.E(this.f31312d);
                    c4388me0F0.F(Build.VERSION.RELEASE);
                    c4388me0F0.G(Build.VERSION.SDK_INT);
                    c4388me0F0.c0(c3006be0.o());
                    c4388me0F0.I(c3006be0.c());
                    c4388me0F0.K(this.f31313e);
                    c4388me0F0.d0(c3006be0.n());
                    c4388me0F0.L(c3006be0.d());
                    c4388me0F0.M(c3006be0.e());
                    c4388me0F0.O(c3006be0.f());
                    c4388me0F0.P(this.f31314f.d(c3006be0.f()));
                    c4388me0F0.R(c3006be0.g());
                    c4388me0F0.X(c3006be0.h());
                    c4388me0F0.W(c3006be0.k());
                    c4388me0F0.U(c3006be0.i());
                    c4388me0F0.V(c3006be0.j());
                    c4388me0F0.C(c3006be0.l());
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.ha)).booleanValue()) {
                        c4388me0F0.H(this.f31315g);
                    }
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.ia)).booleanValue()) {
                        C2583Vx c2583Vx = this.f31316h;
                        BN0 bn0D = c2583Vx.d();
                        String strC = c2583Vx.c();
                        if (bn0D != null) {
                            c4388me0F0.Y(bn0D);
                        }
                        if (strC != null) {
                            c4388me0F0.Z(strC);
                        }
                    }
                    C4892qe0 c4892qe0D0 = C5017re0.d0();
                    c4892qe0D0.A(c4388me0F0);
                    c4766pe0.B(c4892qe0D0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrI;
        if (a()) {
            Object obj = f31306l;
            synchronized (obj) {
                try {
                    if (this.f31311c.A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            C4766pe0 c4766pe0 = this.f31311c;
                            bArrI = ((C5143se0) c4766pe0.w()).i();
                            c4766pe0.C();
                        }
                        new CW(this.f31309a, this.f31310b.f3097a, this.f31318j, Binder.getCallingUid(), null).zza(new C6008zW((String) H4.B.c().d(AbstractC3892ii.ba), 60000, new HashMap(), bArrI, CommonGatewayClient.HEADER_PROTOBUF, false));
                    } catch (Exception e10) {
                        if ((e10 instanceof C4619oU) && ((C4619oU) e10).a() == 3) {
                            return;
                        }
                        G4.t.l().k(e10, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
