package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1843Hq0 implements InterfaceC1687Eq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5043rr0 f19405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19406b;

    C1843Hq0(C4148kk0 c4148kk0, C5043rr0 c5043rr0, long j10) {
        this.f19405a = c5043rr0;
        this.f19406b = j10;
    }

    private static boolean c(C2456Tl0 c2456Tl0) {
        int iD0 = c2456Tl0.e0().d0().d0();
        int iE0 = c2456Tl0.e0().d0().e0();
        byte[] versionArray = AbstractC5458v9.a();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iD0);
        byteBufferAllocate.putInt(iE0);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1687Eq0
    public final boolean a(C2456Tl0 c2456Tl0) {
        if (c2456Tl0 == null || c2456Tl0.equals(C2456Tl0.i0())) {
            this.f19405a.b(20204);
            return false;
        }
        if (c(c2456Tl0)) {
            return true;
        }
        this.f19405a.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1687Eq0
    public final boolean b(C2456Tl0 c2456Tl0) {
        if (c2456Tl0 == null || c2456Tl0.equals(C2456Tl0.i0())) {
            this.f19405a.b(20202);
            return true;
        }
        if (!c(c2456Tl0)) {
            this.f19405a.b(20205);
            return true;
        }
        boolean z9 = c2456Tl0.e0().f0() - System.currentTimeMillis() <= this.f19406b;
        if (z9) {
            this.f19405a.b(20203);
        }
        return z9;
    }
}
