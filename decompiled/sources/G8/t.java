package G8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f1106b;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f1107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1108b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f1109c;

        a() {
            this.f1107a = t.this.f1105a.iterator();
        }

        private final void a() {
            if (this.f1107a.hasNext()) {
                Object next = this.f1107a.next();
                if (((Boolean) t.this.f1106b.invoke(next)).booleanValue()) {
                    this.f1108b = 1;
                    this.f1109c = next;
                    return;
                }
            }
            this.f1108b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1108b == -1) {
                a();
            }
            return this.f1108b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1108b == -1) {
                a();
            }
            if (this.f1108b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f1109c;
            this.f1109c = null;
            this.f1108b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f1105a = sequence;
        this.f1106b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
