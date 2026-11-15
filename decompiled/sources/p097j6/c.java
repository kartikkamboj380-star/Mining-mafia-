package p097j6;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p087i6.g;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f45552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f45554c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f45556e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f45555d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45557f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f45552a = eVar;
        this.f45553b = i10;
        this.f45554c = timeUnit;
    }

    @Override // p097j6.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f45555d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f45556e = new CountDownLatch(1);
                this.f45557f = false;
                this.f45552a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f45556e.await(this.f45553b, this.f45554c)) {
                        this.f45557f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f45556e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p097j6.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f45556e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
