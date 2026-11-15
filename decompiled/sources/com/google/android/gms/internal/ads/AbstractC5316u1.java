package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5316u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C4561o1 f33696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC5190t1 f33697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C4813q1 f33698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33699d;

    protected AbstractC5316u1(InterfaceC4938r1 interfaceC4938r1, InterfaceC5190t1 interfaceC5190t1, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f33697b = interfaceC5190t1;
        this.f33699d = i10;
        this.f33696a = new C4561o1(interfaceC4938r1, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int f(J1 j10, long j11, C3933j2 c3933j2) {
        if (j11 == j10.zzn()) {
            return 0;
        }
        c3933j2.f30283a = j11;
        return 1;
    }

    protected static final boolean g(J1 j10, long j11) {
        long jZzn = j11 - j10.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        j10.n((int) jZzn);
        return true;
    }

    public final InterfaceC4311m2 a() {
        return this.f33696a;
    }

    public final void b(long j10) {
        C4813q1 c4813q1 = this.f33698c;
        if (c4813q1 == null || c4813q1.e() != j10) {
            C4561o1 c4561o1 = this.f33696a;
            this.f33698c = new C4813q1(j10, c4561o1.d(j10), 0L, c4561o1.e(), c4561o1.b(), c4561o1.f(), c4561o1.g());
        }
    }

    public final boolean c() {
        return this.f33698c != null;
    }

    public final int d(J1 j10, C3933j2 c3933j2) {
        while (true) {
            C4813q1 c4813q1 = this.f33698c;
            c4813q1.getClass();
            long jB = c4813q1.b();
            long jC = c4813q1.c();
            long jH = c4813q1.h();
            if (jC - jB <= this.f33699d) {
                e(false, jB);
                return f(j10, jB, c3933j2);
            }
            if (!g(j10, jH)) {
                return f(j10, jH, c3933j2);
            }
            j10.zzl();
            C5064s1 c5064s1A = this.f33697b.a(j10, c4813q1.d());
            int iD = c5064s1A.d();
            if (iD == -3) {
                e(false, jH);
                return f(j10, jH, c3933j2);
            }
            if (iD == -2) {
                c4813q1.f(c5064s1A.e(), c5064s1A.f());
            } else {
                if (iD != -1) {
                    g(j10, c5064s1A.f());
                    e(true, c5064s1A.f());
                    return f(j10, c5064s1A.f(), c3933j2);
                }
                c4813q1.g(c5064s1A.e(), c5064s1A.f());
            }
        }
    }

    protected final void e(boolean z9, long j10) {
        this.f33698c = null;
        this.f33697b.zzb();
    }
}
