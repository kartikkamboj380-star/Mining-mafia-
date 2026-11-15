package O8;

import N8.AbstractC0832i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p129m8.m;
import p129m8.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private static final void a(p169q8.b bVar, Throwable th) throws Throwable {
        m.a aVar = m.f46450b;
        bVar.resumeWith(m.b(n.a(th)));
        throw th;
    }

    public static final void b(Function2 function2, Object obj, p169q8.b bVar) {
        try {
            p169q8.b bVarC = p179r8.b.c(p179r8.b.a(function2, obj, bVar));
            m.a aVar = m.f46450b;
            AbstractC0832i.b(bVarC, m.b(Unit.f45918a));
        } catch (Throwable th) {
            a(bVar, th);
        }
    }

    public static final void c(p169q8.b bVar, p169q8.b bVar2) throws Throwable {
        try {
            p169q8.b bVarC = p179r8.b.c(bVar);
            m.a aVar = m.f46450b;
            AbstractC0832i.b(bVarC, m.b(Unit.f45918a));
        } catch (Throwable th) {
            a(bVar2, th);
        }
    }
}
