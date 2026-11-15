package p202u1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p129m8.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Function1 b(final d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new Function1() { // from class: u1.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.c(dVar, (g) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(d dVar, g result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof g.c) {
            g.c cVar = (g.c) result;
            dVar.a(cVar.a(), cVar.b(), cVar.c(), cVar.d());
        } else if (result instanceof g.b) {
            dVar.c(((g.b) result).a());
        } else {
            if (!(result instanceof g.a)) {
                throw new k();
            }
            dVar.b();
        }
        return Unit.f45918a;
    }
}
