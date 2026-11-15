package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class I {
    public static Collection a(Object obj) {
        if ((obj instanceof A8.a) && !(obj instanceof A8.b)) {
            k(obj, "kotlin.collections.MutableCollection");
        }
        return d(obj);
    }

    public static Map b(Object obj) {
        if ((obj instanceof A8.a) && !(obj instanceof A8.c)) {
            k(obj, "kotlin.collections.MutableMap");
        }
        return e(obj);
    }

    public static Object c(Object obj, int i10) {
        if (obj != null && !g(obj, i10)) {
            k(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw j(e10);
        }
    }

    public static Map e(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw j(e10);
        }
    }

    public static int f(Object obj) {
        if (obj instanceof InterfaceC7039i) {
            return ((InterfaceC7039i) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof p259z8.n) {
            return 3;
        }
        if (obj instanceof p259z8.o) {
            return 4;
        }
        return obj instanceof p259z8.q ? 6 : -1;
    }

    public static boolean g(Object obj, int i10) {
        return (obj instanceof p129m8.c) && f(obj) == i10;
    }

    public static boolean h(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof A8.a) || (obj instanceof A8.c);
        }
        return false;
    }

    private static Throwable i(Throwable th) {
        return Intrinsics.k(th, I.class.getName());
    }

    public static ClassCastException j(ClassCastException classCastException) {
        throw ((ClassCastException) i(classCastException));
    }

    public static void k(Object obj, String str) {
        l((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void l(String str) {
        throw j(new ClassCastException(str));
    }
}
