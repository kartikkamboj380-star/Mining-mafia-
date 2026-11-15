package W;

import L8.InterfaceC0804e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0987l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L8.x f6387a;

    public C0987l() {
        M m10 = M.f6207b;
        Intrinsics.d(m10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f6387a = L8.M.a(m10);
    }

    public final I a() {
        return (I) this.f6387a.getValue();
    }

    public final InterfaceC0804e b() {
        return this.f6387a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final I c(I newState) {
        Object value;
        I i10;
        Intrinsics.checkNotNullParameter(newState, "newState");
        L8.x xVar = this.f6387a;
        do {
            value = xVar.getValue();
            i10 = (I) value;
            if (i10 instanceof B ? true : Intrinsics.b(i10, M.f6207b)) {
                i10 = newState;
            } else if (i10 instanceof C0981f) {
                if (newState.a() > i10.a()) {
                    i10 = newState;
                }
            } else if (!(i10 instanceof r)) {
                throw new p129m8.k();
            }
        } while (!xVar.h(value, i10));
        return i10;
    }
}
