package K8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2969b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f2970c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2971a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f2972a;

        public a(Throwable th) {
            this.f2972a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f2972a, ((a) obj).f2972a);
        }

        public int hashCode() {
            Throwable th = this.f2972a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // K8.k.c
        public String toString() {
            return "Closed(" + this.f2972a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th) {
            return k.c(new a(th));
        }

        public final Object b() {
            return k.c(k.f2970c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f2971a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && Intrinsics.b(obj, ((k) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f2972a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f2971a, obj);
    }

    public int hashCode() {
        return g(this.f2971a);
    }

    public final /* synthetic */ Object k() {
        return this.f2971a;
    }

    public String toString() {
        return j(this.f2971a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
