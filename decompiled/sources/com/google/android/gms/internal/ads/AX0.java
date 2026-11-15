package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class AX0 extends AbstractC1600Cz {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f17360i = Float.floatToIntBits(Float.NaN);

    private static void m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f17360i) {
            iFloatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3046bz
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferG;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f18020b.f34196c;
        if (i11 == 2) {
            byteBufferG = g(i10 + i10);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferG);
                iPosition += 2;
            }
        } else if (i11 == 1342177280) {
            byteBufferG = g((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferG);
                iPosition += 3;
            }
        } else if (i11 == 1610612736) {
            byteBufferG = g(i10);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition + 3) & 255;
                int i13 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                m(i12 | i13 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferG);
                iPosition += 4;
            }
        } else if (i11 == 21) {
            byteBufferG = g((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferG);
                iPosition += 3;
            }
        } else {
            if (i11 != 22) {
                throw new IllegalStateException();
            }
            byteBufferG = g(i10);
            while (iPosition < iLimit) {
                int i14 = byteBuffer.get(iPosition) & 255;
                int i15 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                m(i14 | i15 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferG);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferG.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600Cz
    public final C5558vx i(C5558vx c5558vx) throws C1494Ay {
        int i10 = c5558vx.f34196c;
        String str = AbstractC4634ob0.f32117a;
        if (i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736) {
            if (i10 == 4) {
                return C5558vx.f34193e;
            }
            if (i10 != 2) {
                throw new C1494Ay("Unhandled input format:", c5558vx);
            }
        }
        return new C5558vx(c5558vx.f34194a, c5558vx.f34195b, 4);
    }
}
