package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3046bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f26964a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    default long a(long j10) {
        return j10;
    }

    ByteBuffer b();

    void c(ByteBuffer byteBuffer);

    void d();

    void e(C2739Yx c2739Yx);

    C5558vx f(C5558vx c5558vx);

    boolean zzc();

    void zze();

    boolean zzg();
}
