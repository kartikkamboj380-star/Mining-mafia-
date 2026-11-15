package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2270Pw0 extends AbstractC2920ay0 implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f22227d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C1701Ex0 f22228e = new C1701Ex0(AbstractC1907Iw0.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f22229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC1959Jw0 f22230g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f22231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile C1751Fw0 f22232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile C2218Ow0 f22233c;

    static {
        boolean z9;
        Throwable th;
        Throwable th2;
        AbstractC1959Jw0 c2062Lw0;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f22229f = z9;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                c2062Lw0 = new C2166Nw0(bArr);
            } catch (Error | Exception e10) {
                try {
                    c2062Lw0 = new C2011Kw0(bArr);
                    th = null;
                    th2 = e10;
                } catch (Error | Exception e11) {
                    th = e11;
                    th2 = e10;
                    c2062Lw0 = new C2062Lw0(bArr);
                }
            }
        } else {
            try {
                c2062Lw0 = new C2011Kw0(bArr);
            } catch (NoClassDefFoundError unused2) {
                c2062Lw0 = new C2062Lw0(bArr);
            }
        }
        th = null;
        th2 = null;
        f22230g = c2062Lw0;
        if (th != null) {
            C1701Ex0 c1701Ex0 = f22228e;
            Logger loggerA = c1701Ex0.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c1701Ex0.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    AbstractC2270Pw0() {
    }

    private final void b(C2218Ow0 c2218Ow0) {
        c2218Ow0.f21733a = null;
        while (true) {
            C2218Ow0 c2218Ow1 = this.f22233c;
            if (c2218Ow1 != C2218Ow0.f21732c) {
                C2218Ow0 c2218Ow2 = null;
                while (c2218Ow1 != null) {
                    C2218Ow0 c2218Ow3 = c2218Ow1.f21734b;
                    if (c2218Ow1.f21733a != null) {
                        c2218Ow2 = c2218Ow1;
                    } else if (c2218Ow2 != null) {
                        c2218Ow2.f21734b = c2218Ow3;
                        if (c2218Ow2.f21733a == null) {
                        }
                    } else if (!f22230g.c(this, c2218Ow1, c2218Ow3)) {
                    }
                    c2218Ow1 = c2218Ow3;
                }
                return;
            }
            return;
        }
    }

    static boolean f(AbstractC2270Pw0 abstractC2270Pw0, Object obj, Object obj2) {
        return f22230g.g(abstractC2270Pw0, obj, obj2);
    }

    final boolean c(C1751Fw0 c1751Fw0, C1751Fw0 c1751Fw1) {
        return f22230g.d(this, c1751Fw0, c1751Fw1);
    }

    final C1751Fw0 d(C1751Fw0 c1751Fw0) {
        return f22230g.f(this, c1751Fw0);
    }

    final void g() {
        for (C2218Ow0 c2218Ow0E = f22230g.e(this, C2218Ow0.f21732c); c2218Ow0E != null; c2218Ow0E = c2218Ow0E.f21734b) {
            Thread thread = c2218Ow0E.f21733a;
            if (thread != null) {
                c2218Ow0E.f21733a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object h(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f22231a;
        if ((obj != null) && AbstractC1907Iw0.r(obj)) {
            return AbstractC1907Iw0.q(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2218Ow0 c2218Ow0 = this.f22233c;
            if (c2218Ow0 != C2218Ow0.f21732c) {
                C2218Ow0 c2218Ow1 = new C2218Ow0();
                while (true) {
                    AbstractC1959Jw0 abstractC1959Jw0 = f22230g;
                    abstractC1959Jw0.b(c2218Ow1, c2218Ow0);
                    if (abstractC1959Jw0.c(this, c2218Ow0, c2218Ow1)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(c2218Ow1);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f22231a;
                            if ((obj2 != null) && AbstractC1907Iw0.r(obj2)) {
                                return AbstractC1907Iw0.q(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(c2218Ow1);
                        break;
                    }
                    c2218Ow0 = this.f22233c;
                    if (c2218Ow0 == C2218Ow0.f21732c) {
                    }
                }
            }
            Object obj3 = this.f22231a;
            Objects.requireNonNull(obj3);
            return AbstractC1907Iw0.q(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f22231a;
            if ((obj4 != null) && AbstractC1907Iw0.r(obj4)) {
                return AbstractC1907Iw0.q(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j10);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z9 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb2 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z9) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z9) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    final Object i() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f22231a;
        if ((obj2 != null) && AbstractC1907Iw0.r(obj2)) {
            return AbstractC1907Iw0.q(obj2);
        }
        C2218Ow0 c2218Ow0 = this.f22233c;
        if (c2218Ow0 != C2218Ow0.f21732c) {
            C2218Ow0 c2218Ow1 = new C2218Ow0();
            do {
                AbstractC1959Jw0 abstractC1959Jw0 = f22230g;
                abstractC1959Jw0.b(c2218Ow1, c2218Ow0);
                if (abstractC1959Jw0.c(this, c2218Ow0, c2218Ow1)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(c2218Ow1);
                            throw new InterruptedException();
                        }
                        obj = this.f22231a;
                    } while (!((obj != null) & AbstractC1907Iw0.r(obj)));
                    return AbstractC1907Iw0.q(obj);
                }
                c2218Ow0 = this.f22233c;
            } while (c2218Ow0 != C2218Ow0.f21732c);
        }
        Object obj3 = this.f22231a;
        Objects.requireNonNull(obj3);
        return AbstractC1907Iw0.q(obj3);
    }
}
