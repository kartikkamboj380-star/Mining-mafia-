package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4441n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P10 f31674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P10 f31675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31677i;

    public C4441n4(P10 p10, P10 p11, boolean z9) throws C2817a9 {
        this.f31675g = p10;
        this.f31674f = p11;
        this.f31673e = z9;
        p11.G(12);
        this.f31669a = p11.h();
        p10.G(12);
        this.f31677i = p10.h();
        M1.a(p10.b() == 1, "first_chunk must be 1");
        this.f31670b = -1;
    }

    public final boolean a() {
        int i10 = this.f31670b + 1;
        this.f31670b = i10;
        if (i10 == this.f31669a) {
            return false;
        }
        this.f31672d = this.f31673e ? this.f31674f.j() : this.f31674f.Y();
        if (this.f31670b == this.f31676h) {
            P10 p10 = this.f31675g;
            this.f31671c = p10.h();
            p10.J(4);
            int i11 = this.f31677i - 1;
            this.f31677i = i11;
            this.f31676h = i11 > 0 ? (-1) + p10.h() : -1;
        }
        return true;
    }
}
