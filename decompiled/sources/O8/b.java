package O8;

import I8.C;
import I8.I0;
import I8.a1;
import N8.K;
import N8.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import p129m8.m;
import p129m8.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(Function2 function2, Object obj, p169q8.b bVar) {
        p169q8.b bVarA = h.a(bVar);
        try {
            CoroutineContext context = bVarA.getContext();
            Object objI = K.i(context, null);
            try {
                h.b(bVarA);
                Object objD = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? p179r8.b.d(function2, obj, bVarA) : ((Function2) I.c(function2, 2)).invoke(obj, bVarA);
                K.f(context, objI);
                if (objD != p179r8.b.e()) {
                    bVarA.resumeWith(m.b(objD));
                }
            } catch (Throwable th) {
                K.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            m.a aVar = m.f46450b;
            bVarA.resumeWith(m.b(n.a(th2)));
        }
    }

    public static final Object b(z zVar, Object obj, Function2 function2) {
        Object c10;
        try {
            c10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? p179r8.b.d(function2, obj, zVar) : ((Function2) I.c(function2, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c10 = new C(th, false, 2, null);
        }
        if (c10 == p179r8.b.e()) {
            return p179r8.b.e();
        }
        Object objP0 = zVar.p0(c10);
        if (objP0 == I0.f1720b) {
            return p179r8.b.e();
        }
        if (objP0 instanceof C) {
            throw ((C) objP0).f1702a;
        }
        return I0.h(objP0);
    }

    public static final Object c(z zVar, Object obj, Function2 function2) throws Throwable {
        Object c10;
        try {
            c10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? p179r8.b.d(function2, obj, zVar) : ((Function2) I.c(function2, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c10 = new C(th, false, 2, null);
        }
        if (c10 == p179r8.b.e()) {
            return p179r8.b.e();
        }
        Object objP0 = zVar.p0(c10);
        if (objP0 == I0.f1720b) {
            return p179r8.b.e();
        }
        if (objP0 instanceof C) {
            Throwable th2 = ((C) objP0).f1702a;
            if (!(th2 instanceof a1) || ((a1) th2).f1757a != zVar) {
                throw th2;
            }
            if (c10 instanceof C) {
                throw ((C) c10).f1702a;
            }
        } else {
            c10 = I0.h(objP0);
        }
        return c10;
    }
}
