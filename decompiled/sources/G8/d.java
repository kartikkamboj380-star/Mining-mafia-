package G8;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f1060b;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f1061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1062b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f1063c;

        a() {
            this.f1061a = d.this.f1059a.iterator();
        }

        private final void a() {
            while (this.f1061a.hasNext()) {
                Object next = this.f1061a.next();
                if (!((Boolean) d.this.f1060b.invoke(next)).booleanValue()) {
                    this.f1063c = next;
                    this.f1062b = 1;
                    return;
                }
            }
            this.f1062b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1062b == -1) {
                a();
            }
            return this.f1062b == 1 || this.f1061a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1062b == -1) {
                a();
            }
            if (this.f1062b != 1) {
                return this.f1061a.next();
            }
            Object obj = this.f1063c;
            this.f1063c = null;
            this.f1062b = 0;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f1059a = sequence;
        this.f1060b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
