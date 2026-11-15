package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2631Wv implements InterfaceC2982bS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5438v f24885a = new C5438v(true, 65536);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f24886b = 15000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f24887c = 30000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f24888d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24889e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24891g;

    C2631Wv() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void a(C4748pV0 c4748pV0) {
        o(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void b(C2856aS0 c2856aS0, A01 a01, InterfaceC3299e[] interfaceC3299eArr) {
        int i10;
        this.f24890f = 0;
        for (InterfaceC3299e interfaceC3299e : interfaceC3299eArr) {
            if (interfaceC3299e != null) {
                int i11 = this.f24890f;
                int i12 = interfaceC3299e.zza().f24072c;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = 13107200;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.f24890f = i11 + i10;
            }
        }
        this.f24885a.d(this.f24890f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean d(C2856aS0 c2856aS0) {
        long j10 = c2856aS0.f26518g ? this.f24889e : this.f24888d;
        return j10 <= 0 || c2856aS0.f26516e >= j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean e(C2856aS0 c2856aS0) {
        char c10;
        long j10 = c2856aS0.f26516e;
        boolean z9 = true;
        if (j10 > this.f24887c) {
            c10 = 0;
        } else {
            c10 = j10 < this.f24886b ? (char) 2 : (char) 1;
        }
        int iE = this.f24885a.e();
        int i10 = this.f24890f;
        if (c10 != 2 && (c10 != 1 || !this.f24891g || iE >= i10)) {
            z9 = false;
        }
        this.f24891g = z9;
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void f(C4748pV0 c4748pV0) {
        o(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void g(C4748pV0 c4748pV0) {
        o(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean h(C4748pV0 c4748pV0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final InterfaceC4683p i(C4748pV0 c4748pV0) {
        return this.f24885a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final long j(C4748pV0 c4748pV0) {
        return 0L;
    }

    public final synchronized void k(int i10) {
        this.f24886b = ((long) i10) * 1000;
    }

    public final synchronized void l(int i10) {
        this.f24887c = ((long) i10) * 1000;
    }

    public final synchronized void m(int i10) {
        this.f24888d = ((long) i10) * 1000;
    }

    public final synchronized void n(int i10) {
        this.f24889e = ((long) i10) * 1000;
    }

    final void o(boolean z9) {
        this.f24890f = 0;
        this.f24891g = false;
        if (z9) {
            this.f24885a.c();
        }
    }
}
