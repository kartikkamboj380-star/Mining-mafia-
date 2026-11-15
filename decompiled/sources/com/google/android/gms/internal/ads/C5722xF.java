package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5722xF implements J4.B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5011rb0 f34766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3502fb0 f34767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f34768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QR f34769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f34770f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34765a = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C1715Fe0 f34771g = C1767Ge0.d0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34772h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34773i = false;

    C5722xF(C5011rb0 c5011rb0, C3502fb0 c3502fb0, Clock clock, QR qr, ScheduledExecutorService scheduledExecutorService) {
        this.f34766b = c5011rb0;
        this.f34767c = c3502fb0;
        this.f34768d = clock;
        this.f34769e = qr;
        this.f34770f = scheduledExecutorService;
    }

    private final void d() {
        synchronized (this.f34765a) {
            try {
                QR qr = this.f34769e;
                String str = this.f34766b.f32991b.f32672b.f29455b;
                String strEncodeToString = Base64.encodeToString(((C1767Ge0) this.f34771g.w()).i(), 1);
                if (((Boolean) H4.B.c().d(AbstractC3892ii.qe)).booleanValue()) {
                    PR prA = qr.a();
                    prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "pclma");
                    prA.c("pclmd", strEncodeToString);
                    prA.c("gqi", str);
                    prA.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(int i10) {
        synchronized (this.f34765a) {
            try {
                if (!this.f34773i && this.f34772h) {
                    C1715Fe0 c1715Fe0 = this.f34771g;
                    C2596Wd0 c2596Wd0D0 = C2648Xd0.d0();
                    c2596Wd0D0.B(i10);
                    c2596Wd0D0.A(this.f34768d.currentTimeMillis());
                    c1715Fe0.A((C2648Xd0) c2596Wd0D0.w());
                    if (i10 == 10) {
                        d();
                        this.f34773i = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J4.B
    public final void B2() {
    }

    @Override // J4.B
    public final void F4() {
        e(8);
    }

    @Override // J4.B
    public final void H1() {
        e(3);
    }

    @Override // J4.B
    public final void N0() {
        e(4);
    }

    @Override // J4.B
    public final void S3(int i10) {
    }

    @Override // J4.B
    public final void Z1() {
        e(5);
    }

    @Override // J4.B
    public final void Z2() {
        e(7);
    }

    @Override // J4.B
    public final void Z4() {
        e(6);
    }

    public final void a() {
        synchronized (this.f34765a) {
            if (this.f34767c.f28370E0 > 0 && !this.f34772h) {
                this.f34771g.B(this.f34768d.currentTimeMillis());
                this.f34772h = true;
                this.f34770f.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.wF
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f34502a.b();
                    }
                }, this.f34767c.f28370E0, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void b() {
        synchronized (this.f34765a) {
            try {
                if (this.f34773i) {
                    return;
                }
                this.f34773i = true;
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J4.B
    public final void b4() {
        e(9);
    }

    @Override // J4.B
    public final void c() {
    }

    @Override // J4.B
    public final void t4() {
        e(10);
    }
}
