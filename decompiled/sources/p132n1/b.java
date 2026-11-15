package p132n1;

import I8.B0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f46542a;

    private /* synthetic */ b(B0 b10) {
        this.f46542a = b10;
    }

    public static final /* synthetic */ b c(B0 b10) {
        return new b(b10);
    }

    public static boolean f(B0 b10, Object obj) {
        return (obj instanceof b) && Intrinsics.b(b10, ((b) obj).j());
    }

    public static int g(B0 b10) {
        return b10.hashCode();
    }

    public static String i(B0 b10) {
        return "BaseRequestDelegate(job=" + b10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f46542a, obj);
    }

    public int hashCode() {
        return g(this.f46542a);
    }

    public final /* synthetic */ B0 j() {
        return this.f46542a;
    }

    public String toString() {
        return i(this.f46542a);
    }

    public static B0 e(B0 b10) {
        return b10;
    }
}
