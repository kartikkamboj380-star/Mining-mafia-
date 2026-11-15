package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5946z1 implements J1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PQ0 f35615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35617d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35620g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f35618e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f35614a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    static {
        R4.b("media3.extractor");
    }

    public C5946z1(PQ0 pq0, long j10, long j11) {
        this.f35615b = pq0;
        this.f35617d = j10;
        this.f35616c = j11;
    }

    private final void f(int i10) {
        int i11 = this.f35619f + i10;
        int length = this.f35618e.length;
        if (i11 > length) {
            String str = AbstractC4634ob0.f32117a;
            this.f35618e = Arrays.copyOf(this.f35618e, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final int g(int i10) {
        int iMin = Math.min(this.f35620g, i10);
        i(iMin);
        return iMin;
    }

    private final int h(byte[] bArr, int i10, int i11) {
        int i12 = this.f35620g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f35618e, 0, bArr, i10, iMin);
        i(iMin);
        return iMin;
    }

    private final void i(int i10) {
        int i11 = this.f35620g - i10;
        this.f35620g = i11;
        this.f35619f = 0;
        byte[] bArr = this.f35618e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f35618e = bArr2;
    }

    private final int j(byte[] bArr, int i10, int i11, int i12, boolean z9) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iF = this.f35615b.F(bArr, i10 + i12, i11 - i12);
        if (iF != -1) {
            return i12 + iF;
        }
        if (i12 == 0 && z9) {
            return -1;
        }
        throw new EOFException();
    }

    private final void k(int i10) {
        if (i10 != -1) {
            this.f35617d += (long) i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void E(int i10) throws EOFException, InterruptedIOException {
        c(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.J1, com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iH = h(bArr, i10, i11);
        if (iH == 0) {
            iH = j(bArr, i10, i11, 0, true);
        }
        k(iH);
        return iH;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final boolean G(int i10, boolean z9) throws EOFException, InterruptedIOException {
        int iG = g(i10);
        while (iG < i10 && iG != -1) {
            iG = j(this.f35614a, -iG, Math.min(i10, iG + CodedOutputStream.DEFAULT_BUFFER_SIZE), iG, z9);
        }
        k(iG);
        return iG != -1;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final boolean H(byte[] bArr, int i10, int i11, boolean z9) {
        if (!c(i11, z9)) {
            return false;
        }
        System.arraycopy(this.f35618e, this.f35619f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void I(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        K(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void J(byte[] bArr, int i10, int i11) {
        H(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final boolean K(byte[] bArr, int i10, int i11, boolean z9) throws EOFException, InterruptedIOException {
        int iH = h(bArr, i10, i11);
        while (iH < i11 && iH != -1) {
            iH = j(bArr, i10, i11, iH, z9);
        }
        k(iH);
        return iH != -1;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final int L(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        C5946z1 c5946z1;
        int iMin;
        f(i11);
        int i12 = this.f35620g;
        int i13 = this.f35619f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c5946z1 = this;
            iMin = c5946z1.j(this.f35618e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c5946z1.f35620g += iMin;
        } else {
            c5946z1 = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c5946z1.f35618e, c5946z1.f35619f, bArr, i10, iMin);
        c5946z1.f35619f += iMin;
        return iMin;
    }

    public final boolean c(int i10, boolean z9) throws EOFException, InterruptedIOException {
        f(i10);
        int iJ = this.f35620g - this.f35619f;
        while (iJ < i10) {
            int i11 = i10;
            boolean z10 = z9;
            iJ = j(this.f35618e, this.f35619f, i11, iJ, z10);
            if (iJ == -1) {
                return false;
            }
            this.f35620g = this.f35619f + iJ;
            i10 = i11;
            z9 = z10;
        }
        this.f35619f += i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final long e() {
        return this.f35617d + ((long) this.f35619f);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void n(int i10) throws EOFException, InterruptedIOException {
        G(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final int zzd(int i10) throws EOFException, InterruptedIOException {
        int iG = g(1);
        if (iG == 0) {
            iG = j(this.f35614a, 0, Math.min(1, CodedOutputStream.DEFAULT_BUFFER_SIZE), 0, true);
        }
        k(iG);
        return iG;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void zzl() {
        this.f35619f = 0;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final long zzn() {
        return this.f35617d;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final long zzo() {
        return this.f35616c;
    }
}
