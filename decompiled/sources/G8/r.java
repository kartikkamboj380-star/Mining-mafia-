package G8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1097c;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f1098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1099b;

        a() {
            this.f1098a = r.this.f1095a.iterator();
        }

        private final void a() {
            while (this.f1099b < r.this.f1096b && this.f1098a.hasNext()) {
                this.f1098a.next();
                this.f1099b++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f1099b < r.this.f1097c && this.f1098a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (this.f1099b >= r.this.f1097c) {
                throw new NoSuchElementException();
            }
            this.f1099b++;
            return this.f1098a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(Sequence sequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f1095a = sequence;
        this.f1096b = i10;
        this.f1097c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f1097c - this.f1096b;
    }

    @Override // G8.c
    public Sequence a(int i10) {
        return i10 >= f() ? n.f() : new r(this.f1095a, this.f1096b + i10, this.f1097c);
    }

    @Override // G8.c
    public Sequence b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        Sequence sequence = this.f1095a;
        int i11 = this.f1096b;
        return new r(sequence, i11, i10 + i11);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
