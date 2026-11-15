package p187s6;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p087i6.g;
import p117l6.C;
import p117l6.P;
import p117l6.e0;
import p125m4.f;
import p125m4.i;
import p125m4.k;
import p145o4.l;
import p176r5.C7094k;
import p197t6.d;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f49340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f49341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f49342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f49343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f49344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f49345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f49346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f49347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P f49348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f49350k;

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C f49351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C7094k f49352b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f49351a, this.f49352b);
            e.this.f49348i.c();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f49351a.d());
            e.o(dG);
        }

        private b(C c10, C7094k c7094k) {
            this.f49351a = c10;
            this.f49352b = c7094k;
        }
    }

    e(i iVar, d dVar, P p10) {
        this(dVar.f49691f, dVar.f49692g, ((long) dVar.f49693h) * 1000, iVar, p10);
    }

    public static /* synthetic */ void a(e eVar, C7094k c7094k, boolean z9, C c10, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            c7094k.d(exc);
            return;
        }
        if (z9) {
            eVar.j();
        }
        c7094k.e(c10);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            l.a(eVar.f49347h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f49340a) * Math.pow(this.f49341b, h()));
    }

    private int h() {
        if (this.f49350k == 0) {
            this.f49350k = m();
        }
        int iM = (int) ((m() - this.f49350k) / this.f49342c);
        int iMin = l() ? Math.min(100, this.f49349j + iM) : Math.max(0, this.f49349j - iM);
        if (this.f49349j != iMin) {
            this.f49349j = iMin;
            this.f49350k = m();
        }
        return iMin;
    }

    private boolean k() {
        return this.f49345f.size() < this.f49344e;
    }

    private boolean l() {
        return this.f49345f.size() == this.f49344e;
    }

    private long m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final C c10, final C7094k c7094k) {
        g.f().b("Sending report through Google DataTransport: " + c10.d());
        final boolean z9 = SystemClock.elapsedRealtime() - this.f49343d < 2000;
        this.f49347h.a(p125m4.d.h(c10.b()), new k() { // from class: s6.c
            @Override // p125m4.k
            public final void a(Exception exc) {
                e.a(this.f49334a, c7094k, z9, c10, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    C7094k i(C c10, boolean z9) {
        synchronized (this.f49345f) {
            try {
                C7094k c7094k = new C7094k();
                if (!z9) {
                    n(c10, c7094k);
                    return c7094k;
                }
                this.f49348i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + c10.d());
                    this.f49348i.a();
                    c7094k.e(c10);
                    return c7094k;
                }
                g.f().b("Enqueueing report: " + c10.d());
                g.f().b("Queue size: " + this.f49345f.size());
                this.f49346g.execute(new b(c10, c7094k));
                g.f().b("Closing task for report: " + c10.d());
                c7094k.e(c10);
                return c7094k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: s6.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f49338a, countDownLatch);
            }
        }).start();
        e0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d10, double d11, long j10, i iVar, P p10) {
        this.f49340a = d10;
        this.f49341b = d11;
        this.f49342c = j10;
        this.f49347h = iVar;
        this.f49348i = p10;
        this.f49343d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f49344e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f49345f = arrayBlockingQueue;
        this.f49346g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f49349j = 0;
        this.f49350k = 0L;
    }
}
