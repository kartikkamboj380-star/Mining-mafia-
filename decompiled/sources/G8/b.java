package G8;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1056b;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f1057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1058b;

        a(b bVar) {
            this.f1057a = bVar.f1055a.iterator();
            this.f1058b = bVar.f1056b;
        }

        private final void a() {
            while (this.f1058b > 0 && this.f1057a.hasNext()) {
                this.f1057a.next();
                this.f1058b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f1057a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f1057a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f1055a = sequence;
        this.f1056b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // G8.c
    public Sequence a(int i10) {
        int i11 = this.f1056b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f1055a, i11);
    }

    @Override // G8.c
    public Sequence b(int i10) {
        int i11 = this.f1056b;
        int i12 = i11 + i10;
        return i12 < 0 ? new s(this, i10) : new r(this.f1055a, i11, i12);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
