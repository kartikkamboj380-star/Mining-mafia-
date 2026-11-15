package r9;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7112o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48490a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC7112o f48491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T f48492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC7112o f48493d;

    /* JADX INFO: renamed from: r9.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        AbstractC7112o c7120x;
        try {
            Class.forName("java.nio.file.Files");
            c7120x = new K();
        } catch (ClassNotFoundException unused) {
            c7120x = new C7120x();
        }
        f48491b = c7120x;
        T.a aVar = T.f48391b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f48492c = T.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = s9.h.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f48493d = new s9.h(classLoader, false, null, 4, null);
    }

    public final a0 a(T file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return b(file, false);
    }

    public abstract a0 b(T t10, boolean z9);

    public abstract void c(T t10, T t11);

    public final void d(T dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        e(dir, false);
    }

    public final void e(T dir, boolean z9) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        s9.c.a(this, dir, z9);
    }

    public final void f(T dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        g(dir, false);
    }

    public abstract void g(T t10, boolean z9);

    public final void h(T path) {
        Intrinsics.checkNotNullParameter(path, "path");
        i(path, false);
    }

    public abstract void i(T t10, boolean z9);

    public final boolean j(T path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return s9.c.b(this, path);
    }

    public abstract List k(T t10);

    public final C7111n l(T path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return s9.c.c(this, path);
    }

    public abstract C7111n m(T t10);

    public abstract AbstractC7110m n(T t10);

    public final a0 o(T file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return p(file, false);
    }

    public abstract a0 p(T t10, boolean z9);

    public abstract c0 q(T t10);
}
