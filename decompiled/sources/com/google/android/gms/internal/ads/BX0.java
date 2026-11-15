package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class BX0 extends AbstractC1600Cz {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f17640m = AbstractC4634ob0.f32118b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f17642o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final long a(long j10) {
        return Math.max(0L, j10 - AbstractC4634ob0.N(this.f17637j + this.f17636i, this.f18020b.f34194a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz, com.google.android.gms.internal.ads.InterfaceC3046bz
    public final ByteBuffer b() {
        int i10;
        if (super.zzg() && (i10 = this.f17641n) > 0) {
            g(i10).put(this.f17640m, 0, this.f17641n).flip();
            this.f17641n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f17639l);
        this.f17642o += (long) (iMin / this.f18020b.f34197d);
        this.f17639l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f17639l <= 0) {
            int i11 = i10 - iMin;
            int length = (this.f17641n + i11) - this.f17640m.length;
            ByteBuffer byteBufferG = g(length);
            int i12 = this.f17641n;
            String str = AbstractC4634ob0.f32117a;
            int iMax = Math.max(0, Math.min(length, i12));
            byteBufferG.put(this.f17640m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i11));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferG.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i13 = i11 - iMax2;
            int i14 = this.f17641n - iMax;
            this.f17641n = i14;
            byte[] bArr = this.f17640m;
            System.arraycopy(bArr, iMax, bArr, 0, i14);
            byteBuffer.get(this.f17640m, this.f17641n, i13);
            this.f17641n += i13;
            byteBufferG.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    public final C5558vx i(C5558vx c5558vx) throws C1494Ay {
        if (!AbstractC4634ob0.a(c5558vx.f34196c)) {
            throw new C1494Ay("Unhandled input format:", c5558vx);
        }
        this.f17638k = true;
        return (this.f17636i == 0 && this.f17637j == 0) ? C5558vx.f34193e : c5558vx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    protected final void j() {
        if (this.f17638k) {
            int i10 = this.f17641n;
            if (i10 > 0) {
                this.f17642o += (long) (i10 / this.f18020b.f34197d);
            }
            this.f17641n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    protected final void k() {
        if (this.f17638k) {
            this.f17638k = false;
            int i10 = this.f17637j;
            int i11 = this.f18020b.f34197d;
            this.f17640m = new byte[i10 * i11];
            this.f17639l = this.f17636i * i11;
        }
        this.f17641n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    protected final void l() {
        this.f17640m = AbstractC4634ob0.f32118b;
    }

    public final void m(int i10, int i11) {
        this.f17636i = i10;
        this.f17637j = i11;
    }

    public final void n() {
        this.f17642o = 0L;
    }

    public final long o() {
        return this.f17642o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz, com.google.android.gms.internal.ads.InterfaceC3046bz
    public final boolean zzg() {
        return super.zzg() && this.f17641n == 0;
    }
}
