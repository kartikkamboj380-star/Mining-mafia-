package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class ZX0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f26211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f26212c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f26217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f26218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f26219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f26220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f26221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f26223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC4376mY0 f26224o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26210a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p190t.e f26213d = new p190t.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p190t.e f26214e = new p190t.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f26215f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f26216g = new ArrayDeque();

    ZX0(HandlerThread handlerThread) {
        this.f26211b = handlerThread;
    }

    private final void j() {
        ArrayDeque arrayDeque = this.f26216g;
        if (!arrayDeque.isEmpty()) {
            this.f26218i = (MediaFormat) arrayDeque.getLast();
        }
        this.f26213d.b();
        this.f26214e.b();
        this.f26215f.clear();
        arrayDeque.clear();
    }

    private final boolean k() {
        return this.f26221l > 0 || this.f26222m;
    }

    private final void l(MediaFormat mediaFormat) {
        this.f26214e.a(-2);
        this.f26216g.add(mediaFormat);
    }

    private final void m() {
        IllegalStateException illegalStateException = this.f26223n;
        if (illegalStateException != null) {
            this.f26223n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f26219j;
        if (codecException != null) {
            this.f26219j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f26220k;
        if (cryptoException == null) {
            return;
        }
        this.f26220k = null;
        throw cryptoException;
    }

    public final void a(MediaCodec mediaCodec) {
        AbstractC2418Ss0.i(this.f26212c == null);
        HandlerThread handlerThread = this.f26211b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f26212c = handler;
    }

    public final void b() {
        synchronized (this.f26210a) {
            this.f26222m = true;
            this.f26211b.quit();
            j();
        }
    }

    public final void c(Runnable runnable) {
        synchronized (this.f26210a) {
            m();
            runnable.run();
        }
    }

    public final int d() {
        synchronized (this.f26210a) {
            try {
                m();
                int iE = -1;
                if (k()) {
                    return -1;
                }
                p190t.e eVar = this.f26213d;
                if (!eVar.d()) {
                    iE = eVar.e();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int e(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f26210a) {
            try {
                m();
                if (k()) {
                    return -1;
                }
                p190t.e eVar = this.f26214e;
                if (eVar.d()) {
                    return -1;
                }
                int iE = eVar.e();
                if (iE >= 0) {
                    if (this.f26217h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f26215f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f26217h = (MediaFormat) this.f26216g.remove();
                    iE = -2;
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat f() {
        MediaFormat mediaFormat;
        synchronized (this.f26210a) {
            try {
                mediaFormat = this.f26217h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void g() {
        synchronized (this.f26210a) {
            this.f26221l++;
            Handler handler = this.f26212c;
            String str = AbstractC4634ob0.f32117a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.XX0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f25298a.i();
                }
            });
        }
    }

    public final void h(InterfaceC4376mY0 interfaceC4376mY0) {
        synchronized (this.f26210a) {
            this.f26224o = interfaceC4376mY0;
        }
    }

    final /* synthetic */ void i() {
        Object obj = this.f26210a;
        synchronized (obj) {
            try {
                if (this.f26222m) {
                    return;
                }
                long j10 = this.f26221l - 1;
                this.f26221l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 >= 0) {
                    j();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.f26223n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f26210a) {
            this.f26220k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f26210a) {
            this.f26219j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f26210a) {
            try {
                this.f26213d.a(i10);
                InterfaceC4376mY0 interfaceC4376mY0 = this.f26224o;
                if (interfaceC4376mY0 != null) {
                    DY0 dy0 = ((AY0) interfaceC4376mY0).f17363a;
                    if (dy0.c1() != null) {
                        dy0.c1().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f26210a) {
            try {
                MediaFormat mediaFormat = this.f26218i;
                if (mediaFormat != null) {
                    l(mediaFormat);
                    this.f26218i = null;
                }
                this.f26214e.a(i10);
                this.f26215f.add(bufferInfo);
                InterfaceC4376mY0 interfaceC4376mY0 = this.f26224o;
                if (interfaceC4376mY0 != null) {
                    DY0 dy0 = ((AY0) interfaceC4376mY0).f17363a;
                    if (dy0.c1() != null) {
                        dy0.c1().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f26210a) {
            l(mediaFormat);
            this.f26218i = null;
        }
    }
}
