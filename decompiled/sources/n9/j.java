package n9;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47087d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f47088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f47089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f47090c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new j(method3, method2, method);
        }

        private a() {
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f47088a = method;
        this.f47089b = method2;
        this.f47090c = method3;
    }

    public final Object a(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.f47088a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f47089b;
                Intrinsics.c(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f47090c;
            Intrinsics.c(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
