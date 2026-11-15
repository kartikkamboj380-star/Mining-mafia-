package G8;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f1112b;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f1113a;

        a() {
            this.f1113a = u.this.f1111a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1113a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return u.this.f1112b.invoke(this.f1113a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f1111a = sequence;
        this.f1112b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
