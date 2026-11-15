package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2826aD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4096kK0 f26454a = C4096kK0.a(new byte[0]);

    public static final C4096kK0 a(int i10) {
        return C4096kK0.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final C4096kK0 b(int i10) {
        return C4096kK0.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
