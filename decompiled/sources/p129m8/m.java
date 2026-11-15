package p129m8;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f46450b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f46451a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f46452a;

        public b(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f46452a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.b(this.f46452a, ((b) obj).f46452a);
        }

        public int hashCode() {
            return this.f46452a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f46452a + ')';
        }
    }

    private /* synthetic */ m(Object obj) {
        this.f46451a = obj;
    }

    public static final /* synthetic */ m a(Object obj) {
        return new m(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof m) && Intrinsics.b(obj, ((m) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f46452a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f46451a, obj);
    }

    public int hashCode() {
        return e(this.f46451a);
    }

    public final /* synthetic */ Object i() {
        return this.f46451a;
    }

    public String toString() {
        return h(this.f46451a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
