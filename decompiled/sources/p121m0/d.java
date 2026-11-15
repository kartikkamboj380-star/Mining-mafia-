package p121m0;

import F8.c;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;
import p131n0.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f46342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U.c f46343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f46344c;

    public d(V store, U.c factory, a extras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f46342a = store;
        this.f46343b = factory;
        this.f46344c = extras;
    }

    public static /* synthetic */ T b(d dVar, c cVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = g.f46537a.b(cVar);
        }
        return dVar.a(cVar, str);
    }

    public final T a(c modelClass, String key) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        T tB = this.f46342a.b(key);
        if (!modelClass.a(tB)) {
            b bVar = new b(this.f46344c);
            bVar.c(g.a.f46538a, key);
            T tA = e.a(this.f46343b, modelClass, bVar);
            this.f46342a.d(key, tA);
            return tA;
        }
        Object obj = this.f46343b;
        if (obj instanceof U.e) {
            Intrinsics.c(tB);
            ((U.e) obj).d(tB);
        }
        Intrinsics.d(tB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return tB;
    }
}
