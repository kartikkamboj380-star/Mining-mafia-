package J0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final H f1900a = new H(C.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final E f1901a = C.a();
    }

    static E a() {
        try {
            return new F((WebViewProviderFactoryBoundaryInterface) t9.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new n();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static H c() {
        return a.f1900a;
    }

    public static E d() {
        return b.f1901a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? j.a() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
