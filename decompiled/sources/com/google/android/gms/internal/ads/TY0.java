package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TY0 implements InterfaceC4502nY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f23547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3998jY0 f23548b;

    /* synthetic */ TY0(MediaCodec mediaCodec, C3998jY0 c3998jY0, byte[] bArr) {
        this.f23547a = mediaCodec;
        this.f23548b = c3998jY0;
        if (Build.VERSION.SDK_INT < 35 || c3998jY0 == null) {
            return;
        }
        c3998jY0.b(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final ByteBuffer V(int i10) {
        return this.f23547a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void a(Surface surface) {
        this.f23547a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f23547a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void c(int i10, long j10) {
        this.f23547a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void d(int i10) {
        this.f23547a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void e(int i10, boolean z9) {
        this.f23547a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void f(int i10, int i11, int i12, long j10, int i13) {
        this.f23547a.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void g(int i10, int i11, VM0 vm0, long j10, int i12) {
        this.f23547a.queueSecureInputBuffer(i10, 0, vm0.b(), j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void j(List list) {
        this.f23547a.subscribeToVendorParameters(list);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void k0(Bundle bundle) {
        this.f23547a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final ByteBuffer x(int i10) {
        return this.f23547a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final int zze() {
        return this.f23547a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final MediaFormat zzg() {
        return this.f23547a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void zzk() {
        this.f23547a.flush();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void zzl() {
        C3998jY0 c3998jY0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.f23547a.stop();
            }
            if (i10 >= 35 && this.f23548b != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (c3998jY0 = this.f23548b) != null) {
                c3998jY0.c(this.f23547a);
            }
            this.f23547a.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void zzo() {
        this.f23547a.detachOutputSurface();
    }
}
