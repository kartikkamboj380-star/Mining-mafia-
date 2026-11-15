package p145o4;

import p125m4.f;
import p125m4.i;
import p185s4.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static void a(i iVar, f fVar) {
        if (!(iVar instanceof s)) {
            a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().l(((s) iVar).d().f(fVar), 1);
        }
    }
}
