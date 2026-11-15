package kotlin.ranges;

import kotlin.collections.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterable, A8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0464a f45995d = new C0464a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45998c;

    /* JADX INFO: renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0464a {
        public /* synthetic */ C0464a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        private C0464a() {
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f45996a = i10;
        this.f45997b = p199t8.c.b(i10, i11, i12);
        this.f45998c = i12;
    }

    public final int a() {
        return this.f45996a;
    }

    public final int b() {
        return this.f45997b;
    }

    public final int e() {
        return this.f45998c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f45996a == aVar.f45996a && this.f45997b == aVar.f45997b && this.f45998c == aVar.f45998c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C iterator() {
        return new E8.a(this.f45996a, this.f45997b, this.f45998c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f45996a * 31) + this.f45997b) * 31) + this.f45998c;
    }

    public boolean isEmpty() {
        if (this.f45998c > 0) {
            return this.f45996a > this.f45997b;
        }
        return this.f45996a < this.f45997b;
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f45998c > 0) {
            sb = new StringBuilder();
            sb.append(this.f45996a);
            sb.append("..");
            sb.append(this.f45997b);
            sb.append(" step ");
            i10 = this.f45998c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f45996a);
            sb.append(" downTo ");
            sb.append(this.f45997b);
            sb.append(" step ");
            i10 = -this.f45998c;
        }
        sb.append(i10);
        return sb.toString();
    }
}
