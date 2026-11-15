package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.AbstractC1169o;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class WX0 implements InterfaceC4628oY0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f24795g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f24796h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f24797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f24798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f24800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IN f24801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24802f;

    public WX0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        IN in = new IN(InterfaceC3471fM.f28270a);
        this.f24797a = mediaCodec;
        this.f24798b = handlerThread;
        this.f24801e = in;
        this.f24800d = new AtomicReference();
    }

    private static VX0 f() {
        ArrayDeque arrayDeque = f24795g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new VX0();
                }
                return (VX0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] g(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void a(int i10, int i11, int i12, long j10, int i13) {
        zzg();
        VX0 vx0F = f();
        vx0F.a(i10, 0, i12, j10, i13);
        Handler handler = this.f24799c;
        String str = AbstractC4634ob0.f32117a;
        handler.obtainMessage(1, vx0F).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void b() {
        if (this.f24802f) {
            zze();
            this.f24798b.quit();
        }
        this.f24802f = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void c(Bundle bundle) {
        zzg();
        Handler handler = this.f24799c;
        String str = AbstractC4634ob0.f32117a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void d(int i10, int i11, VM0 vm0, long j10, int i12) {
        zzg();
        VX0 vx0F = f();
        vx0F.a(i10, 0, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = vx0F.f24307d;
        cryptoInfo.numSubSamples = vm0.f24252f;
        cryptoInfo.numBytesOfClearData = g(vm0.f24250d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g(vm0.f24251e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrH = h(vm0.f24248b, cryptoInfo.key);
        bArrH.getClass();
        cryptoInfo.key = bArrH;
        byte[] bArrH2 = h(vm0.f24247a, cryptoInfo.iv);
        bArrH2.getClass();
        cryptoInfo.iv = bArrH2;
        cryptoInfo.mode = vm0.f24249c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(vm0.f24253g, vm0.f24254h));
        Handler handler = this.f24799c;
        String str = AbstractC4634ob0.f32117a;
        handler.obtainMessage(2, vx0F).sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ void e(Message message) {
        VX0 vx0;
        ArrayDeque arrayDeque;
        int i10 = message.what;
        VX0 vx1 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                vx0 = (VX0) message.obj;
                int i11 = vx0.f24304a;
                MediaCodec.CryptoInfo cryptoInfo = vx0.f24307d;
                long j10 = vx0.f24308e;
                int i12 = vx0.f24309f;
                try {
                    synchronized (f24796h) {
                        this.f24797a.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                    }
                } catch (RuntimeException e10) {
                    AbstractC1169o.a(this.f24800d, null, e10);
                }
            } else if (i10 == 3) {
                this.f24801e.a();
            } else if (i10 != 4) {
                AbstractC1169o.a(this.f24800d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.f24797a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e11) {
                    AbstractC1169o.a(this.f24800d, null, e11);
                }
            }
            if (vx1 != null) {
                arrayDeque = f24795g;
                synchronized (arrayDeque) {
                    arrayDeque.add(vx1);
                }
            }
        }
        vx0 = (VX0) message.obj;
        try {
            this.f24797a.queueInputBuffer(vx0.f24304a, 0, vx0.f24306c, vx0.f24308e, vx0.f24309f);
        } catch (RuntimeException e12) {
            AbstractC1169o.a(this.f24800d, null, e12);
        }
        vx1 = vx0;
        if (vx1 != null) {
            arrayDeque = f24795g;
            synchronized (arrayDeque) {
                arrayDeque.add(vx1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void zza() {
        if (this.f24802f) {
            return;
        }
        HandlerThread handlerThread = this.f24798b;
        handlerThread.start();
        this.f24799c = new UX0(this, handlerThread.getLooper());
        this.f24802f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void zze() {
        if (this.f24802f) {
            try {
                Handler handler = this.f24799c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                IN in = this.f24801e;
                in.b();
                Handler handler2 = this.f24799c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                in.c();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4628oY0
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.f24800d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
