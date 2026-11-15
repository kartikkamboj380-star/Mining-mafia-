package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class c implements Iterator, A8.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f46026f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f46027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46031e;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f46027a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f46028b = 0;
        int i10 = this.f46030d;
        int i11 = this.f46029c;
        this.f46029c = this.f46031e + i10;
        return this.f46027a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f46028b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f46031e < 0) {
            this.f46028b = 2;
            return false;
        }
        int length = this.f46027a.length();
        int length2 = this.f46027a.length();
        for (int i13 = this.f46029c; i13 < length2; i13++) {
            char cCharAt = this.f46027a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f46027a.length() && this.f46027a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f46028b = 1;
                this.f46031e = i10;
                this.f46030d = length;
                return true;
            }
        }
        i10 = -1;
        this.f46028b = 1;
        this.f46031e = i10;
        this.f46030d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
