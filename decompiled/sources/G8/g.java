package G8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f1073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f1074b;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f1075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1076b = -2;

        a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f1076b == -2) {
                objInvoke = g.this.f1073a.invoke();
            } else {
                Function1 function1 = g.this.f1074b;
                Object obj = this.f1075a;
                Intrinsics.c(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f1075a = objInvoke;
            this.f1076b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1076b < 0) {
                a();
            }
            return this.f1076b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1076b < 0) {
                a();
            }
            if (this.f1076b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f1075a;
            Intrinsics.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f1076b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f1073a = getInitialValue;
        this.f1074b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
