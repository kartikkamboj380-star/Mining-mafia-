package I0;

import J0.AbstractC0708a;
import J0.AbstractC0712e;
import J0.B;
import J0.C;
import J0.D;
import J0.E;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f1575a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f1576b = Uri.parse("");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1577c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f1578d = new WeakHashMap();

    public interface a {
        void onPostMessage(WebView webView, e eVar, Uri uri, boolean z9, I0.a aVar);
    }

    public static d a(WebView webView, String str, Set set) {
        if (B.f1848W.c()) {
            return h(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw B.a();
    }

    public static void b(WebView webView, String str, Set set, a aVar) {
        if (!B.f1847V.c()) {
            throw B.a();
        }
        h(webView).b(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper looperB = J0.j.b(webView);
        if (looperB == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperB + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    private static WebViewProviderBoundaryInterface d(WebView webView) {
        return f().createWebView(webView);
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC0712e.a();
        }
        try {
            return g();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static E f() {
        return C.d();
    }

    private static PackageInfo g() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static D h(WebView webView) {
        if (!B.f1889s0.c() || !f1577c) {
            return new D(d(webView));
        }
        WeakHashMap weakHashMap = f1578d;
        D d10 = (D) weakHashMap.get(webView);
        if (d10 != null) {
            return d10;
        }
        D d11 = new D(d(webView));
        weakHashMap.put(webView, d11);
        return d11;
    }

    public static String i() {
        if (B.f1850Y.c()) {
            return f().getStatics().getVariationsHeader();
        }
        throw B.a();
    }

    public static WebViewClient j(WebView webView) {
        AbstractC0708a.e eVar = B.f1833H;
        if (eVar.b()) {
            return AbstractC0712e.b(webView);
        }
        if (!eVar.c()) {
            throw B.a();
        }
        c(webView);
        return h(webView).c();
    }

    public static boolean k() {
        if (B.f1844S.c()) {
            return f().getStatics().isMultiProcessEnabled();
        }
        throw B.a();
    }

    public static void l(WebView webView, String str) {
        if (!B.f1847V.c()) {
            throw B.a();
        }
        h(webView).d(str);
    }

    public static void m(WebView webView, boolean z9) {
        if (!B.f1865g0.c()) {
            throw B.a();
        }
        h(webView).e(z9);
    }

    public static void n(WebView webView, String str) {
        if (!B.f1859d0.c()) {
            throw B.a();
        }
        h(webView).f(str);
    }
}
