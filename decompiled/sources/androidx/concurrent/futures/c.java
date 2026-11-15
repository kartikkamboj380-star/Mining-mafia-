package androidx.concurrent.futures;

import com.google.common.util.concurrent.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f8466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f8467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f8468c = androidx.concurrent.futures.d.u();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8469d;

        a() {
        }

        private void e() {
            this.f8466a = null;
            this.f8467b = null;
            this.f8468c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d dVar = this.f8468c;
            if (dVar != null) {
                dVar.e(runnable, executor);
            }
        }

        void b() {
            this.f8466a = null;
            this.f8467b = null;
            this.f8468c.q(null);
        }

        public boolean c(Object obj) {
            this.f8469d = true;
            d dVar = this.f8467b;
            boolean z9 = dVar != null && dVar.b(obj);
            if (z9) {
                e();
            }
            return z9;
        }

        public boolean d() {
            this.f8469d = true;
            d dVar = this.f8467b;
            boolean z9 = dVar != null && dVar.a(true);
            if (z9) {
                e();
            }
            return z9;
        }

        public boolean f(Throwable th) {
            this.f8469d = true;
            d dVar = this.f8467b;
            boolean z9 = dVar != null && dVar.c(th);
            if (z9) {
                e();
            }
            return z9;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f8467b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8466a));
            }
            if (this.f8469d || (dVar = this.f8468c) == null) {
                return;
            }
            dVar.q(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0140c {
        Object a(a aVar);
    }

    private static final class d implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f8470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f8471b = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String n() {
                a aVar = (a) d.this.f8470a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f8466a + "]";
            }
        }

        d(a aVar) {
            this.f8470a = new WeakReference(aVar);
        }

        boolean a(boolean z9) {
            return this.f8471b.cancel(z9);
        }

        boolean b(Object obj) {
            return this.f8471b.q(obj);
        }

        boolean c(Throwable th) {
            return this.f8471b.r(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z9) {
            a aVar = (a) this.f8470a.get();
            boolean zCancel = this.f8471b.cancel(z9);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // com.google.common.util.concurrent.p
        public void e(Runnable runnable, Executor executor) {
            this.f8471b.e(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f8471b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f8471b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f8471b.isDone();
        }

        public String toString() {
            return this.f8471b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f8471b.get(j10, timeUnit);
        }
    }

    public static p a(InterfaceC0140c interfaceC0140c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f8467b = dVar;
        aVar.f8466a = interfaceC0140c.getClass();
        try {
            Object objA = interfaceC0140c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f8466a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
