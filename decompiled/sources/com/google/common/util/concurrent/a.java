package com.google.common.util.concurrent;

import com.google.android.gms.internal.ads.AbstractC2114Mw0;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Z5.a implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f39899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final o f39900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f39901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f39902g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f39903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f39904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile l f39905c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, l lVar, l lVar2);

        abstract e d(a aVar, e eVar);

        abstract l e(a aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f39906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f39907d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f39908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f39909b;

        static {
            if (a.f39899d) {
                f39907d = null;
                f39906c = null;
            } else {
                f39907d = new c(false, null);
                f39906c = new c(true, null);
            }
        }

        c(boolean z9, Throwable th) {
            this.f39908a = z9;
            this.f39909b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f39910b = new d(new C0368a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f39911a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$d$a, reason: collision with other inner class name */
        class C0368a extends Throwable {
            C0368a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f39911a = (Throwable) X5.j.h(th);
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f39916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f39917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f39918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f39919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f39920e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f39916a = atomicReferenceFieldUpdater;
            this.f39917b = atomicReferenceFieldUpdater2;
            this.f39918c = atomicReferenceFieldUpdater3;
            this.f39919d = atomicReferenceFieldUpdater4;
            this.f39920e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f39919d, aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f39920e, aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f39918c, aVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            return (e) this.f39919d.getAndSet(aVar, eVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a aVar, l lVar) {
            return (l) this.f39918c.getAndSet(aVar, lVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            this.f39917b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            this.f39916a.lazySet(lVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f39921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p f39922b;

        g(a aVar, p pVar) {
            this.f39921a = aVar;
            this.f39922b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39921a.f39903a != this) {
                return;
            }
            if (a.f39901f.b(this.f39921a, this, a.v(this.f39922b))) {
                a.s(this.f39921a, false);
            }
        }
    }

    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f39904b != eVar) {
                        return false;
                    }
                    aVar.f39904b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f39903a != obj) {
                        return false;
                    }
                    aVar.f39903a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f39905c != lVar) {
                        return false;
                    }
                    aVar.f39905c = lVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                try {
                    eVar2 = aVar.f39904b;
                    if (eVar2 != eVar) {
                        aVar.f39904b = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                try {
                    lVar2 = aVar.f39905c;
                    if (lVar2 != lVar) {
                        aVar.f39905c = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            lVar.f39931b = lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            lVar.f39930a = thread;
        }
    }

    interface i extends p {
    }

    static abstract class j extends a implements i {
        j() {
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z9) {
            return super.cancel(z9);
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.p
        public final void e(Runnable runnable, Executor executor) {
            super.e(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }

    private static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f39923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f39924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f39925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f39926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f39927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f39928f;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$k$a, reason: collision with other inner class name */
        class C0369a implements PrivilegedExceptionAction {
            C0369a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0369a());
            }
            try {
                f39925c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f39924b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f39926d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f39927e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f39928f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f39923a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return AbstractC2114Mw0.a(f39923a, aVar, f39924b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return AbstractC2114Mw0.a(f39923a, aVar, f39926d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, l lVar, l lVar2) {
            return AbstractC2114Mw0.a(f39923a, aVar, f39925c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = aVar.f39904b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = aVar.f39905c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            f39923a.putObject(lVar, f39928f, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            f39923a.putObject(lVar, f39927e, thread);
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final l f39929c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f39930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile l f39931b;

        l(boolean z9) {
        }

        void a(l lVar) {
            a.f39901f.f(this, lVar);
        }

        void b() {
            Thread thread = this.f39930a;
            if (thread != null) {
                this.f39930a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            a.f39901f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.common.util.concurrent.a$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z9;
        Throwable th;
        b fVar;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f39899d = z9;
        f39900e = new o(a.class);
        ?? r10 = 0;
        r10 = 0;
        try {
            fVar = new k();
            th = null;
        } catch (Error | Exception e10) {
            th = e10;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                h hVar = new h();
                r10 = e11;
                fVar = hVar;
            }
        }
        f39901f = fVar;
        if (r10 != 0) {
            o oVar = f39900e;
            Logger loggerA = oVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            oVar.a().log(level, "SafeAtomicHelper is broken!", r10);
        }
        f39902g = new Object();
    }

    protected a() {
    }

    private void A() {
        for (l lVarE = f39901f.e(this, l.f39929c); lVarE != null; lVarE = lVarE.f39931b) {
            lVarE.b();
        }
    }

    private void B(l lVar) {
        lVar.f39930a = null;
        while (true) {
            l lVar2 = this.f39905c;
            if (lVar2 == l.f39929c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f39931b;
                if (lVar2.f39930a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f39931b = lVar4;
                    if (lVar3.f39930a == null) {
                    }
                } else if (!f39901f.c(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void l(StringBuilder sb) {
        try {
            Object objW = w(this);
            sb.append("SUCCESS, result=[");
            o(sb, objW);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        } catch (Exception e11) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e11.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void m(StringBuilder sb) {
        String strA;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f39903a;
        if (obj instanceof g) {
            sb.append(", setFuture=[");
            p(sb, ((g) obj).f39922b);
            sb.append("]");
        } else {
            try {
                strA = X5.l.a(z());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb.append(", info=[");
                sb.append(strA);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            l(sb);
        }
    }

    private void o(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void p(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static CancellationException q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e r(e eVar) {
        e eVar2 = eVar;
        e eVarD = f39901f.d(this, e.f39912d);
        while (eVarD != null) {
            e eVar3 = eVarD.f39915c;
            eVarD.f39915c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(a aVar, boolean z9) {
        e eVar = null;
        while (true) {
            aVar.A();
            if (z9) {
                aVar.x();
                z9 = false;
            }
            aVar.n();
            e eVarR = aVar.r(eVar);
            while (eVarR != null) {
                eVar = eVarR.f39915c;
                Runnable runnable = eVarR.f39913a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f39921a;
                    if (aVar.f39903a == gVar) {
                        if (f39901f.b(aVar, gVar, v(gVar.f39922b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarR.f39914b;
                    Objects.requireNonNull(executor);
                    t(runnable2, executor);
                }
                eVarR = eVar;
            }
            return;
        }
    }

    private static void t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f39900e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object u(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw q("Task was cancelled.", ((c) obj).f39909b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f39911a);
        }
        return obj == f39902g ? t.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object v(p pVar) {
        Throwable thA;
        if (pVar instanceof i) {
            Object cVar = ((a) pVar).f39903a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f39908a) {
                    cVar = cVar2.f39909b != null ? new c(false, cVar2.f39909b) : c.f39907d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((pVar instanceof Z5.a) && (thA = Z5.b.a((Z5.a) pVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f39899d) && zIsCancelled) {
            c cVar3 = c.f39907d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objW = w(pVar);
            if (!zIsCancelled) {
                return objW == null ? f39902g : objW;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + pVar));
        } catch (Error | Exception e10) {
            return new d(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + pVar, e12));
        }
    }

    private static Object w(Future future) {
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

    protected boolean C(Object obj) {
        if (obj == null) {
            obj = f39902g;
        }
        if (!f39901f.b(this, null, obj)) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean D(Throwable th) {
        if (!f39901f.b(this, null, new d((Throwable) X5.j.h(th)))) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean E(p pVar) {
        d dVar;
        X5.j.h(pVar);
        Object obj = this.f39903a;
        if (obj == null) {
            if (pVar.isDone()) {
                if (!f39901f.b(this, null, v(pVar))) {
                    return false;
                }
                s(this, false);
                return true;
            }
            g gVar = new g(this, pVar);
            if (f39901f.b(this, null, gVar)) {
                try {
                    pVar.e(gVar, com.google.common.util.concurrent.e.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Error | Exception unused) {
                        dVar = d.f39910b;
                    }
                    f39901f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f39903a;
        }
        if (obj instanceof c) {
            pVar.cancel(((c) obj).f39908a);
        }
        return false;
    }

    protected final boolean F() {
        Object obj = this.f39903a;
        return (obj instanceof c) && ((c) obj).f39908a;
    }

    @Override // Z5.a
    protected final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f39903a;
        if (obj instanceof d) {
            return ((d) obj).f39911a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        c cVar;
        Object obj = this.f39903a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f39899d) {
            cVar = new c(z9, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z9 ? c.f39906c : c.f39907d;
            Objects.requireNonNull(cVar);
        }
        a aVar = this;
        boolean z10 = false;
        while (true) {
            if (f39901f.b(aVar, obj, cVar)) {
                s(aVar, z9);
                if (obj instanceof g) {
                    p pVar = ((g) obj).f39922b;
                    if (pVar instanceof i) {
                        aVar = (a) pVar;
                        obj = aVar.f39903a;
                        if ((obj == null) | (obj instanceof g)) {
                            z10 = true;
                        }
                    } else {
                        pVar.cancel(z9);
                    }
                }
                return true;
            }
            obj = aVar.f39903a;
            if (!(obj instanceof g)) {
                return z10;
            }
        }
    }

    @Override // com.google.common.util.concurrent.p
    public void e(Runnable runnable, Executor executor) {
        e eVar;
        X5.j.i(runnable, "Runnable was null.");
        X5.j.i(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f39904b) != e.f39912d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f39915c = eVar;
                if (f39901f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f39904b;
                }
            } while (eVar != e.f39912d);
        }
        t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f39903a;
        if ((obj != null) && (!(obj instanceof g))) {
            return u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f39905c;
            if (lVar != l.f39929c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f39901f.c(this, lVar, lVar2)) {
                        do {
                            u.a(this, nanos);
                            if (Thread.interrupted()) {
                                B(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f39903a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        B(lVar2);
                        break;
                    }
                    lVar = this.f39905c;
                    if (lVar == l.f39929c) {
                    }
                }
            }
            Object obj3 = this.f39903a;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f39903a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return u(obj4);
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
    public boolean isCancelled() {
        return this.f39903a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f39903a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void n() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            l(sb);
        } else {
            m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void x() {
    }

    final void y(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(F());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String z() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f39912d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f39913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f39914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f39915c;

        e(Runnable runnable, Executor executor) {
            this.f39913a = runnable;
            this.f39914b = executor;
        }

        e() {
            this.f39913a = null;
            this.f39914b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f39903a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return u(obj2);
            }
            l lVar = this.f39905c;
            if (lVar != l.f39929c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f39901f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f39903a;
                            } else {
                                B(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return u(obj);
                    }
                    lVar = this.f39905c;
                } while (lVar != l.f39929c);
            }
            Object obj3 = this.f39903a;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        throw new InterruptedException();
    }
}
