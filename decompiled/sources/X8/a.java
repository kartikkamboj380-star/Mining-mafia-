package X8;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements T8.b {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void n(a aVar, W8.c cVar, int i10, Object obj, boolean z9, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z9 = true;
        }
        aVar.m(cVar, i10, obj, z9);
    }

    private final int o(W8.c cVar, Object obj) {
        int iJ = cVar.j(a());
        h(obj, iJ);
        return iJ;
    }

    @Override // T8.a
    public Object d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return k(decoder, null);
    }

    protected abstract Object f();

    protected abstract int g(Object obj);

    protected abstract void h(Object obj, int i10);

    protected abstract Iterator i(Object obj);

    protected abstract int j(Object obj);

    public final Object k(W8.e decoder, Object obj) {
        Object objF;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (obj == null || (objF = p(obj)) == null) {
            objF = f();
        }
        Object obj2 = objF;
        int iG = g(obj2);
        W8.c cVarA = decoder.a(a());
        if (!cVarA.i()) {
            while (true) {
                int iN = cVarA.n(a());
                if (iN == -1) {
                    break;
                }
                n(this, cVarA, iG + iN, obj2, false, 8, null);
            }
        } else {
            l(cVarA, obj2, iG, o(cVarA, obj2));
        }
        cVarA.b(a());
        return q(obj2);
    }

    protected abstract void l(W8.c cVar, Object obj, int i10, int i11);

    protected abstract void m(W8.c cVar, int i10, Object obj, boolean z9);

    protected abstract Object p(Object obj);

    protected abstract Object q(Object obj);

    private a() {
    }
}
