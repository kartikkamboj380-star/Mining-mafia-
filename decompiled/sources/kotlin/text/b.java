package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f46016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f46019d;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46020a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IntRange f46023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46024e;

        a() {
            int iJ = kotlin.ranges.b.j(b.this.f46017b, 0, b.this.f46016a.length());
            this.f46021b = iJ;
            this.f46022c = iJ;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void a() {
            Pair pair;
            if (this.f46022c < 0) {
                this.f46020a = 0;
                this.f46023d = null;
                return;
            }
            if (b.this.f46018c > 0) {
                int i10 = this.f46024e + 1;
                this.f46024e = i10;
                if (i10 >= b.this.f46018c) {
                    this.f46023d = new IntRange(this.f46021b, StringsKt__StringsKt.T(b.this.f46016a));
                    this.f46022c = -1;
                } else if (this.f46022c > b.this.f46016a.length() && (pair = (Pair) b.this.f46019d.invoke(b.this.f46016a, Integer.valueOf(this.f46022c))) != null) {
                    int iIntValue = ((Number) pair.a()).intValue();
                    int iIntValue2 = ((Number) pair.b()).intValue();
                    this.f46023d = kotlin.ranges.b.n(this.f46021b, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f46021b = i11;
                    this.f46022c = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f46023d = new IntRange(this.f46021b, StringsKt__StringsKt.T(b.this.f46016a));
                    this.f46022c = -1;
                }
            } else if (this.f46022c > b.this.f46016a.length()) {
                this.f46023d = new IntRange(this.f46021b, StringsKt__StringsKt.T(b.this.f46016a));
                this.f46022c = -1;
            } else {
                int iIntValue3 = ((Number) pair.a()).intValue();
                int iIntValue4 = ((Number) pair.b()).intValue();
                this.f46023d = kotlin.ranges.b.n(this.f46021b, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f46021b = i12;
                this.f46022c = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f46020a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f46020a == -1) {
                a();
            }
            if (this.f46020a == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f46023d;
            Intrinsics.d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f46023d = null;
            this.f46020a = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f46020a == -1) {
                a();
            }
            return this.f46020a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f46016a = input;
        this.f46017b = i10;
        this.f46018c = i11;
        this.f46019d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
