package p199t8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.b;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: t8.a$a, reason: collision with other inner class name */
    private static final class C0540a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0540a f49741a = new C0540a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f49742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f49743c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.c(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (Intrinsics.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.b(AbstractC7024j.T(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i10++;
            }
            f49742b = method2;
            for (Method method3 : methods) {
                if (Intrinsics.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f49743c = method;
        }

        private C0540a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0540a.f49742b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public c b() {
        return new b();
    }
}
