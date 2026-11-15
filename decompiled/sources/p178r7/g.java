package p178r7;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import org.json.JSONObject;
import p208u7.d;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f48364a = new g();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f48365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48366b;

        a(WebView webView, String str) {
            this.f48365a = webView;
            this.f48366b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.n(this.f48365a, this.f48366b);
        }
    }

    private g() {
    }

    public static final g a() {
        return f48364a;
    }

    public void b(WebView webView, String str) {
        g(webView, "finishSession", str);
    }

    public void c(WebView webView, String str, float f10) {
        g(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public void d(WebView webView, String str, String str2) {
        g(webView, "setNativeViewHierarchy", str2, str);
    }

    public void e(WebView webView, String str, JSONObject jSONObject) {
        g(webView, "init", jSONObject, str);
    }

    public void f(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void g(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            d.a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        j(sb, objArr);
        sb.append(")}");
        h(webView, sb);
    }

    void h(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            n(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    public void i(WebView webView, JSONObject jSONObject) {
        g(webView, "setLastActivity", jSONObject);
    }

    void j(StringBuilder sb, Object[] objArr) {
        String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                string = "null";
            } else {
                if (obj instanceof String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    public void k(WebView webView, String str) {
        g(webView, "publishImpressionEvent", str);
    }

    public void l(WebView webView, String str, String str2) {
        g(webView, "setState", str2, str);
    }

    public void m(WebView webView, String str, JSONObject jSONObject) {
        g(webView, "publishLoadedEvent", jSONObject, str);
    }

    public boolean n(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }
}
