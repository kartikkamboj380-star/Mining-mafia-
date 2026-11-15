package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5696x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f34712a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34718g;

    public final void a() {
        this.f34713b = false;
        this.f34714c = 0;
    }

    public final void b(J1 j10) {
        if (this.f34713b) {
            return;
        }
        byte[] bArr = this.f34712a;
        j10.J(bArr, 0, 10);
        j10.zzl();
        int i10 = AbstractC3807i1.f29234g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f34713b = true;
        }
    }

    public final void c(InterfaceC5570w2 interfaceC5570w2, long j10, int i10, int i11, int i12, C5444v2 c5444v2) {
        AbstractC2418Ss0.j(this.f34718g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f34713b) {
            int i13 = this.f34714c;
            int i14 = i13 + 1;
            this.f34714c = i14;
            if (i13 == 0) {
                this.f34715d = j10;
                this.f34716e = i10;
                this.f34717f = 0;
            }
            this.f34717f += i11;
            this.f34718g = i12;
            if (i14 >= 16) {
                d(interfaceC5570w2, c5444v2);
            }
        }
    }

    public final void d(InterfaceC5570w2 interfaceC5570w2, C5444v2 c5444v2) {
        if (this.f34714c > 0) {
            interfaceC5570w2.c(this.f34715d, this.f34716e, this.f34717f, this.f34718g, c5444v2);
            this.f34714c = 0;
        }
    }
}
