package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class TX0 implements InterfaceC4502nY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f23538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZX0 f23539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4628oY0 f23540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3998jY0 f23541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23543f = 0;

    /* synthetic */ TX0(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC4628oY0 interfaceC4628oY0, C3998jY0 c3998jY0, byte[] bArr) {
        this.f23538a = mediaCodec;
        this.f23539b = new ZX0(handlerThread);
        this.f23540c = interfaceC4628oY0;
        this.f23541d = c3998jY0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final ByteBuffer V(int i10) {
        return this.f23538a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void a(Surface surface) {
        this.f23538a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        this.f23540c.zzg();
        return this.f23539b.e(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void c(int i10, long j10) {
        this.f23538a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void d(int i10) {
        this.f23538a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void e(int i10, boolean z9) {
        this.f23538a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void f(int i10, int i11, int i12, long j10, int i13) {
        this.f23540c.a(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void g(int i10, int i11, VM0 vm0, long j10, int i12) {
        this.f23540c.d(i10, 0, vm0, j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void h(final Runnable runnable) {
        this.f23539b.c(new Runnable() { // from class: com.google.android.gms.internal.ads.NX0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f21271a.k(runnable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final boolean i(InterfaceC4376mY0 interfaceC4376mY0) {
        this.f23539b.h(interfaceC4376mY0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void j(List list) {
        this.f23538a.subscribeToVendorParameters(list);
    }

    final /* synthetic */ void k(Runnable runnable) {
        this.f23540c.zzg();
        this.f23539b.c(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void k0(Bundle bundle) {
        this.f23540c.c(bundle);
    }

    final /* synthetic */ void l(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        C3998jY0 c3998jY0;
        ZX0 zx0 = this.f23539b;
        MediaCodec mediaCodec = this.f23538a;
        zx0.a(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        this.f23540c.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c3998jY0 = this.f23541d) != null) {
            c3998jY0.b(mediaCodec);
        }
        this.f23543f = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final ByteBuffer x(int i10) {
        return this.f23538a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final int zze() {
        this.f23540c.zzg();
        return this.f23539b.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final MediaFormat zzg() {
        return this.f23539b.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void zzk() {
        this.f23540c.zze();
        MediaCodec mediaCodec = this.f23538a;
        mediaCodec.flush();
        this.f23539b.g();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void zzl() {
        C3998jY0 c3998jY0;
        C3998jY0 c3998jY1;
        try {
            try {
                if (this.f23543f == 1) {
                    this.f23540c.b();
                    this.f23539b.b();
                }
                this.f23543f = 2;
            } finally {
                if (!this.f23542e) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f23538a.stop();
                    }
                    if (i10 >= 35 && (c3998jY1 = this.f23541d) != null) {
                        c3998jY1.c(this.f23538a);
                    }
                    this.f23538a.release();
                    this.f23542e = true;
                }
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (c3998jY0 = this.f23541d) != null) {
                c3998jY0.c(this.f23538a);
            }
            this.f23538a.release();
            this.f23542e = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4502nY0
    public final void zzo() {
        this.f23538a.detachOutputSurface();
    }
}
