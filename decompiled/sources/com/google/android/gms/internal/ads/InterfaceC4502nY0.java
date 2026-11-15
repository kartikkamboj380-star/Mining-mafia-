package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4502nY0 {
    ByteBuffer V(int i10);

    void a(Surface surface);

    int b(MediaCodec.BufferInfo bufferInfo);

    void c(int i10, long j10);

    void d(int i10);

    void e(int i10, boolean z9);

    void f(int i10, int i11, int i12, long j10, int i13);

    void g(int i10, int i11, VM0 vm0, long j10, int i12);

    default void h(Runnable runnable) {
        runnable.run();
    }

    default boolean i(InterfaceC4376mY0 interfaceC4376mY0) {
        return false;
    }

    void j(List list);

    void k0(Bundle bundle);

    ByteBuffer x(int i10);

    int zze();

    MediaFormat zzg();

    void zzk();

    void zzl();

    void zzo();
}
