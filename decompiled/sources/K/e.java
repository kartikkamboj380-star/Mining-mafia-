package K;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f2388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f2389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2390d;

    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f2390d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f2387a) {
                    return;
                }
                this.f2387a = true;
                this.f2390d = true;
                a aVar = this.f2388b;
                Object obj = this.f2389c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f2390d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f2390d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f2389c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f2389c = cancellationSignal;
                    if (this.f2387a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f2389c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f2388b == aVar) {
                    return;
                }
                this.f2388b = aVar;
                if (this.f2387a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
