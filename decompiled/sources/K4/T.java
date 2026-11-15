package K4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.HandlerC3644gj0;

/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f2629a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f2630b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2631c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f2632d = new Object();

    public final Looper a() {
        Looper looper;
        Object obj = this.f2632d;
        synchronized (obj) {
            try {
                if (this.f2631c != 0) {
                    Preconditions.checkNotNull(this.f2629a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f2629a == null) {
                    AbstractC0786o0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f2629a = handlerThread;
                    handlerThread.start();
                    this.f2630b = new HandlerC3644gj0(this.f2629a.getLooper());
                    AbstractC0786o0.k("Looper thread started.");
                } else {
                    AbstractC0786o0.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f2631c++;
                looper = this.f2629a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final Handler b() {
        return this.f2630b;
    }
}
