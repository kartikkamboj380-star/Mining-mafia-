package K4;

import com.google.android.gms.internal.ads.AbstractC2315Qt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f2588a = new RunnableC0757a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Thread f2589b;

    public abstract void a();

    public com.google.common.util.concurrent.p b() {
        return AbstractC2315Qt.f22473a.j0(this.f2588a);
    }

    final /* synthetic */ void c(Thread thread) {
        this.f2589b = thread;
    }
}
