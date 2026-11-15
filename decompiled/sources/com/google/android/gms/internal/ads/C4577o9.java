package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4577o9 extends NP0 {
    public C4577o9(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.NP0
    public final void c(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
