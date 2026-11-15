package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2852aQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26499a;

    public C2852aQ0() {
        this.f26499a = new HashMap();
    }

    public final C2852aQ0 a(String str, int i10) {
        this.f26499a.put(str, Integer.valueOf(i10));
        return this;
    }

    public final C2852aQ0 b(String str, long j10) {
        this.f26499a.put(str, Long.valueOf(j10));
        return this;
    }

    public final C2852aQ0 c(String str, float f10) {
        this.f26499a.put(str, Float.valueOf(f10));
        return this;
    }

    public final C2852aQ0 d(String str, String str2) {
        this.f26499a.put(str, str2);
        return this;
    }

    public final C2852aQ0 e(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.f26499a.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.f26499a.put(str, byteBufferAllocate);
        return this;
    }

    public final C2852aQ0 f(String str) {
        this.f26499a.remove(str);
        return this;
    }

    public final C5871yQ0 g() {
        return new C5871yQ0(this.f26499a, null);
    }
}
