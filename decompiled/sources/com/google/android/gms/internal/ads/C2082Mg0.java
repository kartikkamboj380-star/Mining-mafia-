package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2082Mg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2082Mg0 f20901a = new C2082Mg0();

    private C2082Mg0() {
    }

    public static final C2082Mg0 a() {
        return f20901a;
    }

    public static final boolean k(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("javascript: ");
                    sb.append(str);
                    webView.loadUrl(sb.toString());
                    return true;
                }
            } catch (Exception e10) {
                e10.getMessage();
                AbstractC3386eg0.f28050a.getClass();
            }
        }
        return false;
    }

    public final void b(WebView webView, String str, JSONObject jSONObject) {
        j(webView, "init", jSONObject, str);
    }

    public final void c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        j(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void d(WebView webView, String str) {
        j(webView, "finishSession", str);
    }

    public final void e(WebView webView, String str, String str2) {
        j(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void f(WebView webView, String str, String str2) {
        j(webView, "setState", str2, str);
    }

    public final void g(WebView webView, String str, String str2) {
        j(webView, "setDeviceLockState", str2);
    }

    public final void h(WebView webView, String str, float f10) {
        j(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public final void i(WebView webView, JSONObject jSONObject) {
        j(webView, "setLastActivity", jSONObject);
    }

    final void j(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            AbstractC3386eg0.f28050a.getClass();
            return;
        }
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb.append(string);
                } else {
                    sb.append('\"');
                    sb.append(string);
                    sb.append('\"');
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            k(webView, string2);
        } else {
            handler.post(new RunnableC2031Lg0(this, webView, string2));
        }
    }
}
