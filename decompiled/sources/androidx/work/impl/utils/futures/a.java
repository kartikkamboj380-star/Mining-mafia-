package androidx.work.impl.utils.futures;

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
    static final boolean f11370d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f11371e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f11372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f11373g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f11374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f11375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f11376c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f11377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f11378d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f11379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f11380b;

        static {
            if (a.f11370d) {
                f11378d = null;
                f11377c = null;
            } else {
                f11378d = new c(false, null);
                f11377c = new c(true, null);
            }
        }

        c(boolean z9, Throwable th) {
            this.f11379a = z9;
            this.f11380b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f11381b = new d(new C0185a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f11382a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0185a extends Throwable {
            C0185a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f11382a = (Throwable) a.d(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f11383d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f11384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f11385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f11386c;

        e(Runnable runnable, Executor executor) {
            this.f11384a = runnable;
            this.f11385b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11391e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f11387a = atomicReferenceFieldUpdater;
            this.f11388b = atomicReferenceFieldUpdater2;
            this.f11389c = atomicReferenceFieldUpdater3;
            this.f11390d = atomicReferenceFieldUpdater4;
            this.f11391e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11390d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11391e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f11389c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f11388b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f11387a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f11392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p f11393b;

        g(a aVar, p pVar) {
            this.f11392a = aVar;
            this.f11393b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11392a.f11374a != this) {
                return;
            }
            if (a.f11372f.b(this.f11392a, this, a.j(this.f11393b))) {
                a.g(this.f11392a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11375b != eVar) {
                        return false;
                    }
                    aVar.f11375b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11374a != obj) {
                        return false;
                    }
                    aVar.f11374a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11376c != iVar) {
                        return false;
                    }
                    aVar.f11376c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f11396b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f11395a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f11394c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f11395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f11396b;

        i(boolean z9) {
        }

        void a(i iVar) {
            a.f11372f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f11395a;
            if (thread != null) {
                this.f11395a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f11372f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f11372f = hVar;
        if (th != null) {
            f11371e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11373g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
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

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f11375b;
        } while (!f11372f.a(this, eVar2, e.f11383d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f11386c;
            eVar4.f11386c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void g(a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarF = aVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f11386c;
                Runnable runnable = eVarF.f11384a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f11392a;
                    if (aVar.f11374a == gVar) {
                        if (f11372f.b(aVar, gVar, j(gVar.f11393b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarF.f11385b);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f11371e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f11380b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11382a);
        }
        if (obj == f11373g) {
            return null;
        }
        return obj;
    }

    static Object j(p pVar) {
        if (pVar instanceof a) {
            Object obj = ((a) pVar).f11374a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f11379a) {
                return cVar.f11380b != null ? new c(false, cVar.f11380b) : c.f11378d;
            }
            return obj;
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f11370d) && zIsCancelled) {
            return c.f11378d;
        }
        try {
            Object objK = k(pVar);
            return objK == null ? f11373g : objK;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f11376c;
        } while (!f11372f.c(this, iVar, i.f11394c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f11396b;
        }
    }

    private void o(i iVar) {
        iVar.f11395a = null;
        while (true) {
            i iVar2 = this.f11376c;
            if (iVar2 == i.f11394c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f11396b;
                if (iVar2.f11395a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f11396b = iVar4;
                    if (iVar3.f11395a == null) {
                    }
                } else if (!f11372f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        c cVar;
        Object obj = this.f11374a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f11370d) {
            cVar = new c(z9, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z9 ? c.f11377c : c.f11378d;
        }
        a aVar = this;
        boolean z10 = false;
        while (true) {
            if (f11372f.b(aVar, obj, cVar)) {
                if (z9) {
                    aVar.l();
                }
                g(aVar);
                if (obj instanceof g) {
                    p pVar = ((g) obj).f11393b;
                    if (pVar instanceof a) {
                        aVar = (a) pVar;
                        obj = aVar.f11374a;
                        if ((obj == null) | (obj instanceof g)) {
                            z10 = true;
                        }
                    } else {
                        pVar.cancel(z9);
                    }
                }
                return true;
            }
            obj = aVar.f11374a;
            if (!(obj instanceof g)) {
                return z10;
            }
        }
    }

    @Override // com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f11375b;
        if (eVar != e.f11383d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11386c = eVar;
                if (f11372f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11375b;
                }
            } while (eVar != e.f11383d);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11374a;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f11376c;
            if (iVar != i.f11394c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f11372f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11374a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                        break;
                    }
                    iVar = this.f11376c;
                    if (iVar == i.f11394c) {
                    }
                }
            }
            return i(this.f11374a);
        }
        while (nanos > 0) {
            Object obj3 = this.f11374a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
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
        return this.f11374a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f11374a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f11374a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f11393b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean p(Object obj) {
        if (obj == null) {
            obj = f11373g;
        }
        if (!f11372f.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean q(Throwable th) {
        if (!f11372f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean r(p pVar) {
        d dVar;
        d(pVar);
        Object obj = this.f11374a;
        if (obj == null) {
            if (pVar.isDone()) {
                if (!f11372f.b(this, null, j(pVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, pVar);
            if (f11372f.b(this, null, gVar)) {
                try {
                    pVar.e(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f11381b;
                    }
                    f11372f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f11374a;
        }
        if (obj instanceof c) {
            pVar.cancel(((c) obj).f11379a);
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
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
            Object obj2 = this.f11374a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f11376c;
            if (iVar != i.f11394c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f11372f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11374a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f11376c;
                } while (iVar != i.f11394c);
            }
            return i(this.f11374a);
        }
        throw new InterruptedException();
    }
}
