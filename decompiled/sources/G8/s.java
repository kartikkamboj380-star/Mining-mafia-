package G8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1102b;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f1104b;

        a(s sVar) {
            this.f1103a = sVar.f1102b;
            this.f1104b = sVar.f1101a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1103a > 0 && this.f1104b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f1103a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f1103a = i10 - 1;
            return this.f1104b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f1101a = sequence;
        this.f1102b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // G8.c
    public Sequence a(int i10) {
        int i11 = this.f1102b;
        return i10 >= i11 ? n.f() : new r(this.f1101a, i10, i11);
    }

    @Override // G8.c
    public Sequence b(int i10) {
        return i10 >= this.f1102b ? this : new s(this.f1101a, i10);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
