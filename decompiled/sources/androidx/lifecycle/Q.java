package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1173t f10182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f10183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f10184c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1173t f10185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1164j.a f10186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10187c;

        public a(C1173t registry, AbstractC1164j.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f10185a = registry;
            this.f10186b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10187c) {
                return;
            }
            this.f10185a.i(this.f10186b);
            this.f10187c = true;
        }
    }

    public Q(r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f10182a = new C1173t(provider);
        this.f10183b = new Handler();
    }

    private final void f(AbstractC1164j.a aVar) {
        a aVar2 = this.f10184c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f10182a, aVar);
        this.f10184c = aVar3;
        Handler handler = this.f10183b;
        Intrinsics.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public AbstractC1164j a() {
        return this.f10182a;
    }

    public void b() {
        f(AbstractC1164j.a.ON_START);
    }

    public void c() {
        f(AbstractC1164j.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC1164j.a.ON_STOP);
        f(AbstractC1164j.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC1164j.a.ON_START);
    }
}
