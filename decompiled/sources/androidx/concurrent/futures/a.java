package androidx.concurrent.futures;

import com.google.common.util.concurrent.p;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f8441d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f8442e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f8443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f8444g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f8445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f8446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile h f8447c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f8448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f8449d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f8450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f8451b;

        static {
            if (a.f8441d) {
                f8449d = null;
                f8448c = null;
            } else {
                f8449d = new c(false, null);
                f8448c = new c(true, null);
            }
        }

        c(boolean z9, Throwable th) {
            this.f8450a = z9;
            this.f8451b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f8452b = new d(new C0139a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f8453a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0139a extends Throwable {
            C0139a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f8453a = (Throwable) a.g(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f8454d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f8455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f8456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f8457c;

        e(Runnable runnable, Executor executor) {
            this.f8455a = runnable;
            this.f8456b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8462e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f8458a = atomicReferenceFieldUpdater;
            this.f8459b = atomicReferenceFieldUpdater2;
            this.f8460c = atomicReferenceFieldUpdater3;
            this.f8461d = atomicReferenceFieldUpdater4;
            this.f8462e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f8461d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f8462e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f8460c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f8459b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f8458a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8446b != eVar) {
                        return false;
                    }
                    aVar.f8446b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8445a != obj) {
                        return false;
                    }
                    aVar.f8445a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8447c != hVar) {
                        return false;
                    }
                    aVar.f8447c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f8465b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f8464a = thread;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f8463c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f8464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f8465b;

        h(boolean z9) {
        }

        void a(h hVar) {
            a.f8443f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f8464a;
            if (thread != null) {
                this.f8464a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f8443f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f8443f = gVar;
        if (th != null) {
            f8442e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8444g = new Object();
    }

    protected a() {
    }

    private void c(StringBuilder sb) {
        try {
            Object objL = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objL));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    private static CancellationException f(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object g(Object obj) {
        obj.getClass();
        return obj;
    }

    private e h(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f8446b;
        } while (!f8443f.a(this, eVar2, e.f8454d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f8457c;
            eVar4.f8457c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void i(a aVar) {
        aVar.o();
        aVar.d();
        e eVarH = aVar.h(null);
        while (eVarH != null) {
            e eVar = eVarH.f8457c;
            j(eVarH.f8455a, eVarH.f8456b);
            eVarH = eVar;
        }
    }

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f8442e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object k(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw f("Task was cancelled.", ((c) obj).f8451b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f8453a);
        }
        if (obj == f8444g) {
            return null;
        }
        return obj;
    }

    static Object l(Future future) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void o() {
        h hVar;
        do {
            hVar = this.f8447c;
        } while (!f8443f.c(this, hVar, h.f8463c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f8465b;
        }
    }

    private void p(h hVar) {
        hVar.f8464a = null;
        while (true) {
            h hVar2 = this.f8447c;
            if (hVar2 == h.f8463c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f8465b;
                if (hVar2.f8464a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f8465b = hVar4;
                    if (hVar3.f8464a == null) {
                    }
                } else if (!f8443f.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        c cVar;
        Object obj = this.f8445a;
        if (obj == null) {
            if (f8441d) {
                cVar = new c(z9, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z9 ? c.f8448c : c.f8449d;
            }
            if (f8443f.b(this, obj, cVar)) {
                if (z9) {
                    m();
                }
                i(this);
                return true;
            }
        }
        return false;
    }

    protected void d() {
    }

    @Override // com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        e eVar = this.f8446b;
        if (eVar != e.f8454d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f8457c = eVar;
                if (f8443f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f8446b;
                }
            } while (eVar != e.f8454d);
        }
        j(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8445a;
        if (obj != null) {
            return k(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f8447c;
            if (hVar != h.f8463c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.a(hVar);
                    if (f8443f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8445a;
                            if (obj2 != null) {
                                return k(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(hVar2);
                        break;
                    }
                    hVar = this.f8447c;
                    if (hVar == h.f8463c) {
                    }
                }
            }
            return k(this.f8445a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8445a;
            if (obj3 != null) {
                return k(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z9 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z9) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z9) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8445a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8445a != null;
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(Object obj) {
        if (obj == null) {
            obj = f8444g;
        }
        if (!f8443f.b(this, null, obj)) {
            return false;
        }
        i(this);
        return true;
    }

    protected boolean r(Throwable th) {
        if (!f8443f.b(this, null, new d((Throwable) g(th)))) {
            return false;
        }
        i(this);
        return true;
    }

    protected final boolean t() {
        Object obj = this.f8445a;
        return (obj instanceof c) && ((c) obj).f8450a;
    }

    public String toString() {
        String strN;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                strN = n();
            } catch (RuntimeException e10) {
                strN = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strN != null && !strN.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strN);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8445a;
            if (obj2 != null) {
                return k(obj2);
            }
            h hVar = this.f8447c;
            if (hVar != h.f8463c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f8443f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8445a;
                            } else {
                                p(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return k(obj);
                    }
                    hVar = this.f8447c;
                } while (hVar != h.f8463c);
            }
            return k(this.f8445a);
        }
        throw new InterruptedException();
    }
}
