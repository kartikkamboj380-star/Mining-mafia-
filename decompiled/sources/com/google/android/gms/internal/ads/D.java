package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class D extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f18028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5942z f18030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IOException f18031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f18033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f18035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ I f18036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I i10, Looper looper, E e10, InterfaceC5942z interfaceC5942z, int i11, long j10) {
        super(looper);
        Objects.requireNonNull(i10);
        this.f18036i = i10;
        this.f18028a = e10;
        this.f18030c = interfaceC5942z;
        this.f18029b = j10;
    }

    private final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f18029b;
        InterfaceC5942z interfaceC5942z = this.f18030c;
        interfaceC5942z.getClass();
        interfaceC5942z.e(this.f18028a, jElapsedRealtime, j10, this.f18032e);
        this.f18031d = null;
        I i10 = this.f18036i;
        D dJ = i10.j();
        dJ.getClass();
        i10.i().execute(dJ);
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f18031d;
        if (iOException != null && this.f18032e > i10) {
            throw iOException;
        }
    }

    public final void b(long j10) {
        I i10 = this.f18036i;
        AbstractC2418Ss0.i(i10.j() == null);
        i10.k(this);
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            d();
        }
    }

    public final void c(boolean z9) {
        this.f18035h = z9;
        this.f18031d = null;
        if (hasMessages(1)) {
            this.f18034g = true;
            removeMessages(1);
            if (!z9) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f18034g = true;
                    this.f18028a.zzb();
                    Thread thread = this.f18033f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z9) {
            this.f18036i.k(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC5942z interfaceC5942z = this.f18030c;
            interfaceC5942z.getClass();
            interfaceC5942z.j(this.f18028a, jElapsedRealtime, jElapsedRealtime - this.f18029b, true);
            this.f18030c = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f18035h) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            d();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        I i11 = this.f18036i;
        i11.k(null);
        long j10 = this.f18029b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        InterfaceC5942z interfaceC5942z = this.f18030c;
        interfaceC5942z.getClass();
        if (this.f18034g) {
            interfaceC5942z.j(this.f18028a, jElapsedRealtime, j11, false);
            return;
        }
        int i12 = message.what;
        if (i12 == 2) {
            try {
                interfaceC5942z.n(this.f18028a, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                YU.f("LoadTask", "Unexpected exception handling load completed", e10);
                this.f18036i.l(new H(e10));
                return;
            }
        }
        if (i12 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f18031d = iOException;
        int i13 = this.f18032e + 1;
        this.f18032e = i13;
        B bF = interfaceC5942z.f(this.f18028a, jElapsedRealtime, j11, iOException, i13);
        if (bF.b() == 3) {
            i11.l(this.f18031d);
        } else if (bF.b() != 2) {
            if (bF.b() == 1) {
                this.f18032e = 1;
            }
            b(bF.c() != -9223372036854775807L ? bF.c() : Math.min((this.f18032e - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            synchronized (this) {
                z9 = this.f18034g;
                this.f18033f = Thread.currentThread();
            }
            if (!z9) {
                E e10 = this.f18028a;
                String simpleName = e10.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    e10.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f18033f = null;
                Thread.interrupted();
            }
            if (this.f18035h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e11) {
            if (this.f18035h) {
                return;
            }
            obtainMessage(3, e11).sendToTarget();
        } catch (Exception e12) {
            if (this.f18035h) {
                return;
            }
            YU.f("LoadTask", "Unexpected exception loading stream", e12);
            obtainMessage(3, new H(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            if (this.f18035h) {
                return;
            }
            YU.f("LoadTask", "OutOfMemory error loading stream", e13);
            obtainMessage(3, new H(e13)).sendToTarget();
        } catch (Error e14) {
            if (!this.f18035h) {
                YU.f("LoadTask", "Unexpected error loading stream", e14);
                obtainMessage(4, e14).sendToTarget();
            }
            throw e14;
        }
    }
}
