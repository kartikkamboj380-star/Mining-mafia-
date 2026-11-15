package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0 f20313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f20315e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20318h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f20321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f20325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f20326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f20327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f20328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f20329s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f20311a = new Z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f20316f = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20319i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20320j = 0;

    public L0(Context context) {
        this.f20312b = context;
    }

    private final void j() {
        this.f20323m = 0L;
        this.f20327q = -1L;
        this.f20324n = -1L;
        this.f20321k = 0L;
        this.f20322l = 0L;
    }

    private final void k() {
        if (Build.VERSION.SDK_INT < 30 || this.f20315e == null) {
            return;
        }
        Z z9 = this.f20311a;
        float fG = z9.c() ? z9.g() : this.f20316f;
        float f10 = this.f20317g;
        if (fG != f10) {
            if (fG != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (z9.c() && z9.e() >= 5000000000L) {
                    f11 = 0.1f;
                }
                if (Math.abs(fG - this.f20317g) < f11) {
                    return;
                }
            } else if (fG == -1.0f && z9.d() < 30) {
                return;
            }
            this.f20317g = fG;
            l(false);
        }
    }

    private final void l(boolean z9) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f20315e) == null || this.f20320j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        boolean z10 = this.f20314d;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float f11 = this.f20317g;
            if (f11 != -1.0f) {
                f10 = this.f20319i * f11;
            }
        }
        if (z9 || this.f20318h != f10) {
            this.f20318h = f10;
            B0.a(this.f20315e, f10);
        }
    }

    private final void m() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f20315e) == null || this.f20320j == Integer.MIN_VALUE || this.f20318h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.f20318h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        B0.a(this.f20315e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(int i10) {
        if (this.f20320j == i10) {
            return;
        }
        this.f20320j = i10;
        l(true);
    }

    public final void b() {
        this.f20314d = true;
        j();
        DisplayManager displayManager = (DisplayManager) this.f20312b.getSystemService("display");
        C0 k10 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                k10 = Build.VERSION.SDK_INT >= 33 ? new K0(choreographer, displayManager, null) : new D0(choreographer, displayManager, null);
            } catch (RuntimeException e10) {
                YU.d("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        this.f20313c = k10;
        if (k10 != null) {
            k10.a();
        }
        l(false);
    }

    public final void c(Surface surface) {
        if (this.f20315e == surface) {
            return;
        }
        m();
        this.f20315e = surface;
        l(true);
    }

    public final void d() {
        j();
    }

    public final void e(float f10) {
        this.f20319i = f10;
        l(false);
    }

    public final void f(float f10) {
        this.f20316f = f10;
        this.f20311a.a();
        k();
    }

    public final void g(long j10) {
        long j11 = this.f20324n;
        if (j11 != -1) {
            this.f20327q = j11;
            this.f20328r = this.f20325o;
            this.f20329s = this.f20326p;
            this.f20321k = this.f20322l;
        }
        this.f20323m++;
        this.f20311a.b(j10 * 1000);
        k();
    }

    public final void h() {
        this.f20314d = false;
        C0 c10 = this.f20313c;
        if (c10 != null) {
            c10.b();
        }
        m();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    public final long i(long j10, long j11) {
        long j12;
        long j13;
        long j14;
        float f10;
        long jF;
        if (this.f20327q != -1) {
            Z z9 = this.f20311a;
            if (z9.c()) {
                jF = z9.f() * (this.f20323m - this.f20327q);
                f10 = this.f20319i;
            } else {
                long j15 = j11 - this.f20329s;
                f10 = this.f20319i;
                jF = j15 * 1000;
            }
            j12 = this.f20328r + ((long) (jF / f10));
            if (Math.abs(j10 - j12) > 20000000) {
                j();
                j12 = j10;
            }
        } else {
            j12 = j10;
        }
        this.f20324n = this.f20323m;
        this.f20325o = j12;
        this.f20326p = j11;
        C0 c10 = this.f20313c;
        if (c10 != null) {
            long j16 = c10.f17762c;
            long j17 = this.f20313c.f17763d;
            if (j16 != -9223372036854775807L && j17 != -9223372036854775807L) {
                long j18 = j16 + (((j12 - j16) / j17) * j17);
                if (j12 <= j18) {
                    j13 = j18 - j17;
                } else {
                    j13 = j18;
                    j18 += j17;
                }
                long j19 = j17 / 2;
                long j20 = j18 - j12;
                long j21 = j12 - j13;
                long jAbs = Math.abs(j20 - j21);
                if (jAbs < j19) {
                    long j22 = j17 / 4;
                    if (jAbs < j22) {
                        j14 = this.f20321k;
                        if (j14 == 0) {
                            if (j20 < j21) {
                                j22 = -j22;
                            }
                        }
                        if (j20 + j14 >= j21) {
                            j18 = j13;
                        }
                        return j18 - ((j17 * 80) / 100);
                    }
                    j22 = 0;
                    this.f20322l = j22;
                    j14 = j22;
                    if (j20 + j14 >= j21) {
                        j18 = j13;
                    }
                    return j18 - ((j17 * 80) / 100);
                }
                j14 = this.f20321k;
                this.f20322l = j14;
                if (j20 + j14 >= j21) {
                    j18 = j13;
                }
                return j18 - ((j17 * 80) / 100);
            }
        }
        return j12;
    }
}
