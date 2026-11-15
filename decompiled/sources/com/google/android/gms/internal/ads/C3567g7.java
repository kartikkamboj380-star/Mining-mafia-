package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3567g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I6 f28575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L90 f28576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4436n10 f28577c = new C4436n10(new byte[64], 64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28580f;

    public C3567g7(I6 i10, L90 l90) {
        this.f28575a = i10;
        this.f28576b = l90;
    }

    public final void a() {
        this.f28580f = false;
        this.f28575a.zza();
    }

    public final void b(P10 p10) {
        long jE;
        char c10;
        C4436n10 c4436n10 = this.f28577c;
        p10.L(c4436n10.f31642a, 0, 3);
        c4436n10.f(0);
        c4436n10.h(8);
        this.f28578d = c4436n10.i();
        this.f28579e = c4436n10.i();
        c4436n10.h(6);
        p10.L(c4436n10.f31642a, 0, c4436n10.j(8));
        c4436n10.f(0);
        if (this.f28578d) {
            c4436n10.h(4);
            long j10 = c4436n10.j(3);
            c4436n10.h(1);
            int iJ = c4436n10.j(15) << 15;
            c4436n10.h(1);
            long j11 = c4436n10.j(15);
            c4436n10.h(1);
            if (this.f28580f || !this.f28579e) {
                c10 = 30;
            } else {
                c4436n10.h(4);
                long j12 = ((long) c4436n10.j(3)) << 30;
                c4436n10.h(1);
                int iJ2 = c4436n10.j(15) << 15;
                c4436n10.h(1);
                c10 = 30;
                long j13 = c4436n10.j(15);
                c4436n10.h(1);
                this.f28576b.e(j12 | ((long) iJ2) | j13);
                this.f28580f = true;
            }
            jE = this.f28576b.e((j10 << c10) | ((long) iJ) | j11);
        } else {
            jE = 0;
        }
        I6 i10 = this.f28575a;
        i10.n0(jE, 4);
        i10.o0(p10);
        i10.l0(false);
    }
}
