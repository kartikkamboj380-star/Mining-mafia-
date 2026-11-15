package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3445f9 extends ThreadLocal {
    C3445f9(AbstractC3571g9 abstractC3571g9) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
