package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2583Vx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BN0 f24606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CP0 f24607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f24608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f24609e = new AtomicBoolean(false);

    C2583Vx(C1908Ix c1908Ix, ScheduledExecutorService scheduledExecutorService) {
        this.f24608d = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void e() {
        try {
            String strI = I0.j.a("GET_VARIATIONS_HEADER") ? I0.i.i() : null;
            if (strI != null && !strI.isEmpty()) {
                this.f24605a = strI;
                byte[] bArrDecode = Base64.decode(strI, 10);
                this.f24606b = BN0.d0(bArrDecode, HL0.b());
                if (((Boolean) H4.B.c().d(AbstractC3892ii.la)).booleanValue()) {
                    this.f24607c = CP0.d0(bArrDecode, HL0.b());
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.ja)).booleanValue()) {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.ia)).booleanValue()) {
                        this.f24608d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.Ux
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f24138a.e();
                            }
                        }, ((Integer) H4.B.c().d(AbstractC3892ii.ka)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (C3598gM0 e10) {
            e = e10;
            G4.t.l().k(e, "ChromeVariations");
        } catch (IllegalArgumentException e11) {
            e = e11;
            G4.t.l().k(e, "ChromeVariations");
        }
    }

    public final void a() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ia)).booleanValue() && !this.f24609e.getAndSet(true)) {
            e();
        }
    }

    public final String b() {
        CP0 cp0 = this.f24607c;
        if (cp0 != null) {
            return Base64.encodeToString(cp0.i(), 10);
        }
        return null;
    }

    public final String c() {
        return this.f24605a;
    }

    public final BN0 d() {
        return this.f24606b;
    }
}
