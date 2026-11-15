package p141o0;

import K.l;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f47115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile RunnableC0486a f47116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile RunnableC0486a f47117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f47118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f47119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f47120n;

    /* JADX INFO: renamed from: o0.a$a, reason: collision with other inner class name */
    final class RunnableC0486a extends d implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f47121f;

        RunnableC0486a() {
        }

        @Override // p141o0.d
        protected Object b() {
            try {
                return a.this.I();
            } catch (l e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // p141o0.d
        protected void g(Object obj) {
            a.this.B(this, obj);
        }

        @Override // p141o0.d
        protected void h(Object obj) {
            a.this.C(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47121f = false;
            a.this.D();
        }
    }

    public a(Context context) {
        super(context);
        this.f47119m = -10000L;
    }

    void B(RunnableC0486a runnableC0486a, Object obj) {
        H(obj);
        if (this.f47117k == runnableC0486a) {
            v();
            this.f47119m = SystemClock.uptimeMillis();
            this.f47117k = null;
            e();
            D();
        }
    }

    void C(RunnableC0486a runnableC0486a, Object obj) {
        if (this.f47116j != runnableC0486a) {
            B(runnableC0486a, obj);
            return;
        }
        if (j()) {
            H(obj);
            return;
        }
        c();
        this.f47119m = SystemClock.uptimeMillis();
        this.f47116j = null;
        f(obj);
    }

    void D() {
        if (this.f47117k != null || this.f47116j == null) {
            return;
        }
        if (this.f47116j.f47121f) {
            this.f47116j.f47121f = false;
            this.f47120n.removeCallbacks(this.f47116j);
        }
        if (this.f47118l > 0 && SystemClock.uptimeMillis() < this.f47119m + this.f47118l) {
            this.f47116j.f47121f = true;
            this.f47120n.postAtTime(this.f47116j, this.f47119m + this.f47118l);
        } else {
            if (this.f47115i == null) {
                this.f47115i = E();
            }
            this.f47116j.c(this.f47115i);
        }
    }

    protected Executor E() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean F() {
        return this.f47117k != null;
    }

    public abstract Object G();

    protected Object I() {
        return G();
    }

    @Override // p141o0.c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f47116j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f47116j);
            printWriter.print(" waiting=");
            printWriter.println(this.f47116j.f47121f);
        }
        if (this.f47117k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f47117k);
            printWriter.print(" waiting=");
            printWriter.println(this.f47117k.f47121f);
        }
        if (this.f47118l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f47118l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f47119m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f47119m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p141o0.c
    protected boolean n() {
        if (this.f47116j == null) {
            return false;
        }
        if (!l()) {
            o();
        }
        if (this.f47117k != null) {
            if (this.f47116j.f47121f) {
                this.f47116j.f47121f = false;
                this.f47120n.removeCallbacks(this.f47116j);
            }
            this.f47116j = null;
            return false;
        }
        if (this.f47116j.f47121f) {
            this.f47116j.f47121f = false;
            this.f47120n.removeCallbacks(this.f47116j);
            this.f47116j = null;
            return false;
        }
        boolean zA = this.f47116j.a(false);
        if (zA) {
            this.f47117k = this.f47116j;
            A();
        }
        this.f47116j = null;
        return zA;
    }

    @Override // p141o0.c
    protected void p() {
        super.p();
        b();
        this.f47116j = new RunnableC0486a();
        D();
    }

    public void A() {
    }

    public void H(Object obj) {
    }
}
