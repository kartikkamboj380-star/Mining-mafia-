package B4;

import H4.InterfaceC0591d1;
import H4.Y1;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f278a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0591d1 f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f280c;

    public void a(a aVar) {
        Y1 y9;
        synchronized (this.f278a) {
            this.f280c = aVar;
            InterfaceC0591d1 interfaceC0591d1 = this.f279b;
            if (interfaceC0591d1 == null) {
                return;
            }
            if (aVar == null) {
                y9 = null;
            } else {
                try {
                    y9 = new Y1(aVar);
                } catch (RemoteException e10) {
                    L4.p.d("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            interfaceC0591d1.B1(y9);
        }
    }

    public final void b(InterfaceC0591d1 interfaceC0591d1) {
        synchronized (this.f278a) {
            try {
                this.f279b = interfaceC0591d1;
                a aVar = this.f280c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC0591d1 c() {
        InterfaceC0591d1 interfaceC0591d1;
        synchronized (this.f278a) {
            interfaceC0591d1 = this.f279b;
        }
        return interfaceC0591d1;
    }

    public static abstract class a {
        public abstract void a();

        public abstract void c();

        public void d() {
        }

        public void e() {
        }

        public void b(boolean z9) {
        }
    }
}
