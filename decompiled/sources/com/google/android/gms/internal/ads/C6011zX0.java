package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6011zX0 extends AbstractC1600Cz {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f35770l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f35772n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte[] f35775q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35771m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35773o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35774p = 0;

    public C6011zX0() {
        byte[] bArr = AbstractC4634ob0.f32118b;
        this.f35772n = bArr;
        this.f35775q = bArr;
    }

    private final void o(boolean z9) {
        int i10;
        int length;
        int i11 = this.f35774p;
        int length2 = this.f35772n.length;
        if (i11 != length2) {
            if (!z9) {
                return;
            } else {
                z9 = true;
            }
        }
        if (this.f35771m == 0) {
            if (z9) {
                q(i11, 3);
                length = i11;
            } else {
                AbstractC2418Ss0.i(i11 >= (length2 >> 1));
                length = this.f35772n.length >> 1;
                q(length, 0);
            }
            i10 = length;
        } else {
            int i12 = length2 >> 1;
            int i13 = i11 - i12;
            if (z9) {
                int iP = p(i13) + (this.f35772n.length >> 1);
                q(iP, 2);
                int i14 = i12 + i13;
                i10 = iP;
                length = i14;
            } else {
                int iP2 = p(i13);
                q(iP2, 1);
                i10 = iP2;
                length = i13;
            }
        }
        if (length % this.f35767i != 0) {
            throw new IllegalStateException(AbstractC4040jt0.d("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        AbstractC2418Ss0.i(i11 >= i10);
        this.f35774p -= length;
        int i15 = this.f35773o + length;
        this.f35773o = i15;
        this.f35773o = i15 % this.f35772n.length;
        int i16 = this.f35771m;
        int i17 = this.f35767i;
        this.f35771m = i16 + (i10 / i17);
        this.f35770l += (long) ((length - i10) / i17);
    }

    private final int p(int i10) {
        int iS = ((s(2000000L) - this.f35771m) * this.f35767i) - (this.f35772n.length >> 1);
        AbstractC2418Ss0.i(iS >= 0);
        int iMin = (int) Math.min((i10 * 0.2f) + 0.5f, iS);
        int i11 = this.f35767i;
        return (iMin / i11) * i11;
    }

    private final void q(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return;
        }
        AbstractC2418Ss0.a(this.f35774p >= i10);
        if (i11 == 2) {
            int i13 = this.f35773o;
            int i14 = this.f35774p;
            int i15 = i13 + i14;
            byte[] bArr = this.f35772n;
            int length = bArr.length;
            if (i15 <= length) {
                System.arraycopy(bArr, i15 - i10, this.f35775q, 0, i10);
            } else {
                int i16 = i14 - (length - i13);
                if (i16 >= i10) {
                    System.arraycopy(bArr, i16 - i10, this.f35775q, 0, i10);
                } else {
                    int i17 = i10 - i16;
                    System.arraycopy(bArr, length - i17, this.f35775q, 0, i17);
                    System.arraycopy(this.f35772n, 0, this.f35775q, i17, i16);
                }
            }
        } else {
            int i18 = this.f35773o;
            int i19 = i18 + i10;
            byte[] bArr2 = this.f35772n;
            int length2 = bArr2.length;
            if (i19 <= length2) {
                System.arraycopy(bArr2, i18, this.f35775q, 0, i10);
            } else {
                int i20 = length2 - i18;
                System.arraycopy(bArr2, i18, this.f35775q, 0, i20);
                System.arraycopy(this.f35772n, 0, this.f35775q, i20, i10 - i20);
            }
        }
        AbstractC2418Ss0.d(i10 % this.f35767i == 0, "sizeToOutput is not aligned to frame size: %s", i10);
        AbstractC2418Ss0.i(this.f35773o < this.f35772n.length);
        byte[] bArr3 = this.f35775q;
        AbstractC2418Ss0.d(i10 % this.f35767i == 0, "byteOutput size is not aligned to frame size %s", i10);
        if (i11 != 3) {
            for (int i21 = 0; i21 < i10; i21 += 2) {
                int i22 = i21 + 1;
                int iR = r(bArr3[i22], bArr3[i21]);
                if (i11 == 0) {
                    i12 = ((((i21 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i12 = 10;
                    if (i11 == 2) {
                        i12 = 10 + (((90000 * i21) / (i10 - 1)) / 1000);
                    }
                }
                int i23 = (iR * i12) / 100;
                if (i23 >= 32767) {
                    bArr3[i21] = -1;
                    bArr3[i22] = 127;
                } else if (i23 <= -32768) {
                    bArr3[i21] = 0;
                    bArr3[i22] = -128;
                } else {
                    bArr3[i21] = (byte) (i23 & 255);
                    bArr3[i22] = (byte) (i23 >> 8);
                }
            }
        }
        g(i10).put(bArr3, 0, i10).flip();
    }

    private static int r(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private final int s(long j10) {
        return (int) ((j10 * ((long) this.f18020b.f34194a)) / 1000000);
    }

    private static final boolean t(byte b10, byte b11) {
        return Math.abs(r(b10, b11)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int i10;
        int iPosition;
        while (byteBuffer.hasRemaining() && !h()) {
            if (this.f35769k != 0) {
                AbstractC2418Ss0.i(this.f35773o < this.f35772n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (t(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i11 = this.f35767i;
                            iLimit = i11 * (iPosition2 / i11);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i12 = this.f35773o;
                int i13 = this.f35774p;
                int i14 = i12 + i13;
                int length = this.f35772n.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int iMin = Math.min(iPosition3, i10);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f35772n, i14, iMin);
                int i15 = this.f35774p + iMin;
                this.f35774p = i15;
                AbstractC2418Ss0.i(i15 <= this.f35772n.length);
                boolean z9 = iLimit < iLimit2 && iPosition3 < i10;
                o(z9);
                if (z9) {
                    this.f35769k = 0;
                    this.f35771m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f35772n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (t(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i16 = this.f35767i;
                            iPosition = ((iLimit4 / i16) * i16) + i16;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f35769k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    g(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    protected final C5558vx i(C5558vx c5558vx) throws C1494Ay {
        if (c5558vx.f34196c == 2) {
            return c5558vx.f34194a == -1 ? C5558vx.f34193e : c5558vx;
        }
        throw new C1494Ay("Unhandled input format:", c5558vx);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    public final void j() {
        if (this.f35774p > 0) {
            o(true);
            this.f35771m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    public final void k() {
        if (zzc()) {
            int i10 = this.f18020b.f34195b;
            this.f35767i = i10 + i10;
            int iS = s(100000L) / 2;
            int i11 = this.f35767i;
            int i12 = (iS / i11) * i11;
            int i13 = i12 + i12;
            if (this.f35772n.length != i13) {
                this.f35772n = new byte[i13];
                this.f35775q = new byte[i13];
            }
        }
        this.f35769k = 0;
        this.f35770l = 0L;
        this.f35771m = 0;
        this.f35773o = 0;
        this.f35774p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    public final void l() {
        this.f35768j = false;
        byte[] bArr = AbstractC4634ob0.f32118b;
        this.f35772n = bArr;
        this.f35775q = bArr;
    }

    public final void m(boolean z9) {
        this.f35768j = z9;
    }

    public final long n() {
        return this.f35770l;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz, com.google.android.gms.internal.ads.InterfaceC3046bz
    public final boolean zzc() {
        return super.zzc() && this.f35768j;
    }
}
