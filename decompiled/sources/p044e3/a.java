package p044e3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43267a = new a();

    private a() {
    }

    public static final boolean a() {
        return false;
    }

    public static final Class b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        if (a()) {
            return Class.forName(className);
        }
        return null;
    }
}
