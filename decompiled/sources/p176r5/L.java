package p176r5;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class L extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48289a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f48290b = new H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f48292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f48293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f48294f;

    L() {
    }

    private final void v() {
        Preconditions.checkState(this.f48291c, "Task is not yet complete");
    }

    private final void w() {
        if (this.f48291c) {
            throw C7087d.a(this);
        }
    }

    private final void x() {
        if (this.f48292d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        synchronized (this.f48289a) {
            try {
                if (this.f48291c) {
                    this.f48290b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task a(Executor executor, InterfaceC7088e interfaceC7088e) {
        this.f48290b.a(new x(executor, interfaceC7088e));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f48290b.a(new z(AbstractC7095l.f48300a, onCompleteListener));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(InterfaceC7088e interfaceC7088e) {
        a(AbstractC7095l.f48300a, interfaceC7088e);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(Executor executor, OnCompleteListener onCompleteListener) {
        this.f48290b.a(new z(executor, onCompleteListener));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(Executor executor, InterfaceC7089f interfaceC7089f) {
        this.f48290b.a(new B(executor, interfaceC7089f));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(InterfaceC7089f interfaceC7089f) {
        d(AbstractC7095l.f48300a, interfaceC7089f);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, InterfaceC7090g interfaceC7090g) {
        this.f48290b.a(new D(executor, interfaceC7090g));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(InterfaceC7090g interfaceC7090g) {
        f(AbstractC7095l.f48300a, interfaceC7090g);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f48289a) {
            exc = this.f48294f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f48289a) {
            try {
                v();
                x();
                Exception exc = this.f48294f;
                if (exc != null) {
                    throw new C7092i(exc);
                }
                obj = this.f48293e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, InterfaceC7086c interfaceC7086c) {
        L l10 = new L();
        this.f48290b.a(new t(executor, interfaceC7086c, l10));
        y();
        return l10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(InterfaceC7086c interfaceC7086c) {
        return h(AbstractC7095l.f48300a, interfaceC7086c);
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z9;
        synchronized (this.f48289a) {
            try {
                z9 = false;
                if (this.f48291c && !this.f48292d && this.f48294f == null) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task j(Executor executor, InterfaceC7086c interfaceC7086c) {
        L l10 = new L();
        this.f48290b.a(new v(executor, interfaceC7086c, l10));
        y();
        return l10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(InterfaceC7086c interfaceC7086c) {
        return j(AbstractC7095l.f48300a, interfaceC7086c);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object l(Class cls) {
        Object obj;
        synchronized (this.f48289a) {
            try {
                v();
                x();
                if (cls.isInstance(this.f48294f)) {
                    throw ((Throwable) cls.cast(this.f48294f));
                }
                Exception exc = this.f48294f;
                if (exc != null) {
                    throw new C7092i(exc);
                }
                obj = this.f48293e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        return this.f48292d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z9;
        synchronized (this.f48289a) {
            z9 = this.f48291c;
        }
        return z9;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, InterfaceC7093j interfaceC7093j) {
        L l10 = new L();
        this.f48290b.a(new F(executor, interfaceC7093j, l10));
        y();
        return l10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(InterfaceC7093j interfaceC7093j) {
        Executor executor = AbstractC7095l.f48300a;
        L l10 = new L();
        this.f48290b.a(new F(executor, interfaceC7093j, l10));
        y();
        return l10;
    }

    public final void q(Object obj) {
        synchronized (this.f48289a) {
            w();
            this.f48291c = true;
            this.f48293e = obj;
        }
        this.f48290b.b(this);
    }

    public final boolean r(Object obj) {
        synchronized (this.f48289a) {
            try {
                if (this.f48291c) {
                    return false;
                }
                this.f48291c = true;
                this.f48293e = obj;
                this.f48290b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f48289a) {
            w();
            this.f48291c = true;
            this.f48294f = exc;
        }
        this.f48290b.b(this);
    }

    public final boolean t(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f48289a) {
            try {
                if (this.f48291c) {
                    return false;
                }
                this.f48291c = true;
                this.f48294f = exc;
                this.f48290b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u() {
        synchronized (this.f48289a) {
            try {
                if (this.f48291c) {
                    return false;
                }
                this.f48291c = true;
                this.f48292d = true;
                this.f48290b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
