package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5177sv0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2474Tu0 f33267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f33268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f33269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33272j;

    public C5177sv0(final byte[] bArr) {
        InterfaceC2474Tu0 interfaceC2474Tu0 = new InterfaceC2474Tu0() { // from class: com.google.android.gms.internal.ads.su0
            @Override // com.google.android.gms.internal.ads.InterfaceC2474Tu0
            public final /* synthetic */ byte[] a(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.f33267e = interfaceC2474Tu0;
        AbstractC2418Ss0.a(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f33271i;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f33269g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f33270h, bArr, i10, iMin);
        this.f33270h += iMin;
        this.f33271i -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C2066Ly0 {
        c(c4454nA0);
        Uri uri = c4454nA0.f31730a;
        this.f33268f = uri;
        byte[] bArrA = this.f33267e.a(uri);
        this.f33269g = bArrA;
        long j10 = c4454nA0.f31734e;
        int length = bArrA.length;
        if (j10 > length) {
            throw new C2066Ly0(2008);
        }
        int i10 = (int) j10;
        this.f33270h = i10;
        int i11 = length - i10;
        this.f33271i = i11;
        long j11 = c4454nA0.f31735f;
        if (j11 != -1) {
            this.f33271i = (int) Math.min(i11, j11);
        }
        this.f33272j = true;
        f(c4454nA0);
        return j11 != -1 ? j11 : this.f33271i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f33268f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        if (this.f33272j) {
            this.f33272j = false;
            h();
        }
        this.f33268f = null;
        this.f33269g = null;
    }
}
