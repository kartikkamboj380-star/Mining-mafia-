package p142o1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47165c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f47166d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p142o1.a f47167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p142o1.a f47168b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        o1.a.b bVar = o1.a.b.f47155a;
        f47166d = new f(bVar, bVar);
    }

    public f(p142o1.a aVar, p142o1.a aVar2) {
        this.f47167a = aVar;
        this.f47168b = aVar2;
    }

    public final p142o1.a a() {
        return this.f47168b;
    }

    public final p142o1.a b() {
        return this.f47167a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(this.f47167a, fVar.f47167a) && Intrinsics.b(this.f47168b, fVar.f47168b);
    }

    public int hashCode() {
        return (this.f47167a.hashCode() * 31) + this.f47168b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f47167a + ", height=" + this.f47168b + ')';
    }
}
