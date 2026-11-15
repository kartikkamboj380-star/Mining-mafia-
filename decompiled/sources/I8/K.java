package I8;

import N8.AbstractC0835l;
import N8.C0831h;
import N8.C0834k;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1727a = new a(null);

    public static final class a extends kotlin.coroutines.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final K d(CoroutineContext.Element element) {
            if (element instanceof K) {
                return (K) element;
            }
            return null;
        }

        private a() {
            super(kotlin.coroutines.d.f45954F, new Function1() { // from class: I8.J
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return K.a.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public K() {
        super(kotlin.coroutines.d.f45954F);
    }

    public static /* synthetic */ K p1(K k10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return k10.o1(i10, str);
    }

    @Override // kotlin.coroutines.d
    public final void N(p169q8.b bVar) {
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0831h) bVar).w();
    }

    @Override // kotlin.coroutines.d
    public final p169q8.b V0(p169q8.b bVar) {
        return new C0831h(this, bVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return kotlin.coroutines.d.a.a(this, bVar);
    }

    public abstract void l1(CoroutineContext coroutineContext, Runnable runnable);

    public void m1(CoroutineContext coroutineContext, Runnable runnable) {
        l1(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return kotlin.coroutines.d.a.b(this, bVar);
    }

    public boolean n1(CoroutineContext coroutineContext) {
        return true;
    }

    public K o1(int i10, String str) {
        AbstractC0835l.a(i10);
        return new C0834k(this, i10, str);
    }

    public String toString() {
        return T.a(this) + '@' + T.b(this);
    }
}
