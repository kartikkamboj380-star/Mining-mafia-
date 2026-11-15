package G8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f1066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f1068c;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f1069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1070b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f1071c;

        a() {
            this.f1069a = f.this.f1066a.iterator();
        }

        private final void a() {
            while (this.f1069a.hasNext()) {
                Object next = this.f1069a.next();
                if (((Boolean) f.this.f1068c.invoke(next)).booleanValue() == f.this.f1067b) {
                    this.f1071c = next;
                    this.f1070b = 1;
                    return;
                }
            }
            this.f1070b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1070b == -1) {
                a();
            }
            return this.f1070b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1070b == -1) {
                a();
            }
            if (this.f1070b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f1071c;
            this.f1071c = null;
            this.f1070b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Sequence sequence, boolean z9, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f1066a = sequence;
        this.f1067b = z9;
        this.f1068c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
