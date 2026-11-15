package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3563g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f28564f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P10 f28565g = new P10(255);

    C3563g5() {
    }

    public final void a() {
        this.f28559a = 0;
        this.f28560b = 0L;
        this.f28561c = 0;
        this.f28562d = 0;
        this.f28563e = 0;
    }

    public final boolean b(J1 j10, long j11) {
        AbstractC2418Ss0.a(j10.zzn() == j10.e());
        P10 p10 = this.f28565g;
        p10.z(4);
        while (true) {
            if ((j11 != -1 && j10.zzn() + 4 >= j11) || !M1.e(j10, p10.H(), 0, 4, true)) {
                break;
            }
            p10.G(0);
            if (p10.Y() == 1332176723) {
                j10.zzl();
                return true;
            }
            j10.n(1);
        }
        do {
            if (j11 != -1 && j10.zzn() >= j11) {
                break;
            }
        } while (j10.zzd(1) != -1);
        return false;
    }

    public final boolean c(J1 j10, boolean z9) throws C2817a9 {
        a();
        P10 p10 = this.f28565g;
        p10.z(27);
        if (M1.e(j10, p10.H(), 0, 27, z9) && p10.Y() == 1332176723) {
            if (p10.R() != 0) {
                if (z9) {
                    return false;
                }
                throw C2817a9.c("unsupported bit stream revision");
            }
            this.f28559a = p10.R();
            this.f28560b = p10.e();
            p10.a();
            p10.a();
            p10.a();
            int iR = p10.R();
            this.f28561c = iR;
            this.f28562d = iR + 27;
            p10.z(iR);
            if (M1.e(j10, p10.H(), 0, this.f28561c, z9)) {
                for (int i10 = 0; i10 < this.f28561c; i10++) {
                    int[] iArr = this.f28564f;
                    int iR2 = p10.R();
                    iArr[i10] = iR2;
                    this.f28563e += iR2;
                }
                return true;
            }
        }
        return false;
    }
}
