package p102k1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f45591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f45592b = d.f45593a;

    public b(Function1 function1) {
        this.f45591a = function1;
    }

    public final Object a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f45592b;
        d dVar = d.f45593a;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f45592b;
            if (objInvoke == dVar) {
                Function1 function1 = this.f45591a;
                Intrinsics.c(function1);
                objInvoke = function1.invoke(obj);
                this.f45592b = objInvoke;
                this.f45591a = null;
            }
        }
        return objInvoke;
    }
}
