package u9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class f extends Handler implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f50052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f50054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50055d;

    public f(c cVar, Looper looper, int i10) {
        super(looper);
        this.f50054c = cVar;
        this.f50053b = i10;
        this.f50052a = new k();
    }

    @Override // u9.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f50052a.a(jVarA);
                if (!this.f50055d) {
                    this.f50055d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                j jVarB = this.f50052a.b();
                if (jVarB == null) {
                    synchronized (this) {
                        jVarB = this.f50052a.b();
                        if (jVarB == null) {
                            this.f50055d = false;
                            return;
                        }
                    }
                }
                this.f50054c.h(jVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f50053b);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f50055d = true;
        } catch (Throwable th) {
            this.f50055d = false;
            throw th;
        }
    }
}
