package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3368eX0 extends AbstractC1600Cz {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f27796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f27797j;

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void c(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i10;
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int[] iArr = this.f27797j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f18020b.f34197d) * this.f18021c.f34197d);
        while (iPosition < iLimit) {
            for (int i15 : iArr) {
                int iD = (AbstractC4634ob0.d(this.f18020b.f34196c) * i15) + iPosition;
                int i16 = this.f18020b.f34196c;
                if (i16 == 2) {
                    byteBufferG.putShort(byteBuffer.getShort(iD));
                } else if (i16 == 3) {
                    byteBufferG.put(byteBuffer.get(iD));
                } else if (i16 == 4) {
                    byteBufferG.putFloat(byteBuffer.getFloat(iD));
                } else if (i16 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iD;
                    } else {
                        i10 = iD + 2;
                    }
                    byte b10 = byteBuffer.get(i10);
                    byte b11 = byteBuffer.get(iD + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iD += 2;
                    }
                    i11 = ((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680) | ((byteBuffer.get(iD) << 8) & 65280);
                    i12 = i11 >> 8;
                    if ((i12 & (-16777216)) != 0 || (i12 & (-8388608)) == -8388608) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC2418Ss0.f(z9, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                    AbstractC2418Ss0.a(byteBufferG.remaining() >= 3);
                    if (byteBufferG.order() == byteOrder) {
                        i13 = (i11 >> 24) & 255;
                    } else {
                        i13 = i12 & 255;
                    }
                    byte b12 = (byte) i13;
                    int i17 = (i11 >> 16) & 255;
                    if (byteBufferG.order() == byteOrder) {
                        i14 = i12 & 255;
                    } else {
                        i14 = (i11 >> 24) & 255;
                    }
                    byteBufferG.put(b12).put((byte) i17).put((byte) i14);
                } else {
                    if (i16 != 22) {
                        if (i16 == 268435456) {
                            byteBufferG.putShort(byteBuffer.getShort(iD));
                        } else if (i16 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i10 = iD;
                            } else {
                                i10 = iD + 2;
                            }
                            byte b13 = byteBuffer.get(i10);
                            byte b14 = byteBuffer.get(iD + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iD += 2;
                            }
                            i11 = ((b13 << 24) & (-16777216)) | ((b14 << 16) & 16711680) | ((byteBuffer.get(iD) << 8) & 65280);
                            i12 = i11 >> 8;
                            if ((i12 & (-16777216)) != 0) {
                                z9 = true;
                            } else {
                                z9 = true;
                            }
                            AbstractC2418Ss0.f(z9, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                            AbstractC2418Ss0.a(byteBufferG.remaining() >= 3);
                            if (byteBufferG.order() == byteOrder) {
                                i13 = (i11 >> 24) & 255;
                            } else {
                                i13 = i12 & 255;
                            }
                            byte b15 = (byte) i13;
                            int i18 = (i11 >> 16) & 255;
                            if (byteBufferG.order() == byteOrder) {
                                i14 = i12 & 255;
                            } else {
                                i14 = (i11 >> 24) & 255;
                            }
                            byteBufferG.put(b15).put((byte) i18).put((byte) i14);
                        } else if (i16 != 1610612736) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 21);
                            sb.append("Unexpected encoding: ");
                            sb.append(i16);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    byteBufferG.putInt(byteBuffer.getInt(iD));
                }
            }
            iPosition += this.f18020b.f34197d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    public final C5558vx i(C5558vx c5558vx) throws C1494Ay {
        int[] iArr = this.f27796i;
        if (iArr == null) {
            return C5558vx.f34193e;
        }
        int i10 = c5558vx.f34196c;
        if (!AbstractC4634ob0.a(i10)) {
            throw new C1494Ay("Unhandled input format:", c5558vx);
        }
        int i11 = c5558vx.f34195b;
        boolean z9 = i11 != iArr.length;
        int i12 = 0;
        while (true) {
            int length = iArr.length;
            if (i12 >= length) {
                return z9 ? new C5558vx(c5558vx.f34194a, length, i10) : C5558vx.f34193e;
            }
            int i13 = iArr[i12];
            if (i13 >= i11) {
                String string = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 59);
                sb.append("Channel map (");
                sb.append(string);
                sb.append(") trying to access non-existent input channel.");
                throw new C1494Ay(sb.toString(), c5558vx);
            }
            z9 |= i13 != i12;
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    protected final void k() {
        this.f27797j = this.f27796i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    protected final void l() {
        this.f27797j = null;
        this.f27796i = null;
    }

    public final void m(int[] iArr) {
        this.f27796i = iArr;
    }
}
