package I8;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {
    public static final Object a(long j10, p169q8.b bVar) {
        if (j10 <= 0) {
            return Unit.f45918a;
        }
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        if (j10 < Long.MAX_VALUE) {
            c(c0687p.getContext()).M(j10, c0687p);
        }
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }

    public static final Object b(long j10, p169q8.b bVar) {
        Object objA = a(d(j10), bVar);
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }

    public static final Y c(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.f45954F);
        Y y9 = element instanceof Y ? (Y) element : null;
        return y9 == null ? V.a() : y9;
    }

    public static final long d(long j10) {
        boolean zF = kotlin.time.b.F(j10);
        if (zF) {
            return kotlin.time.b.r(kotlin.time.b.H(j10, kotlin.time.c.q(999999L, H8.b.NANOSECONDS)));
        }
        if (zF) {
            throw new p129m8.k();
        }
        return 0L;
    }
}
