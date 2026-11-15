package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ha {
    private static final HashMap<String, kq> kq = new HashMap<>();

    public static com.bytedance.sdk.component.dgq.rhi kq(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.dgq.rhi.bob bobVar) {
        WebView webViewKq = kq(context, attributeSet, i10, bobVar, false);
        if (webViewKq == null) {
            return null;
        }
        com.bytedance.sdk.component.dgq.rhi rhiVar = new com.bytedance.sdk.component.dgq.rhi(context, true, bobVar);
        rhiVar.setWebView(webViewKq);
        rhiVar.csi();
        return rhiVar;
    }

    public static WebView oq(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.dgq.rhi.bob bobVar) {
        return kq(context, attributeSet, i10, bobVar, true);
    }

    public static void oq(com.bytedance.sdk.component.dgq.rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        try {
            rhiVar.removeAllViews();
            rhiVar.rjo();
            rhiVar.setWebChromeClient(null);
            rhiVar.setWebViewClient(null);
            rhiVar.setDownloadListener(null);
            rhiVar.setJavaScriptEnabled(true);
            rhiVar.setCacheMode(-1);
            rhiVar.setSupportZoom(false);
            rhiVar.setUseWideViewPort(true);
            rhiVar.setJavaScriptCanOpenWindowsAutomatically(true);
            rhiVar.setDomStorageEnabled(true);
            rhiVar.setBuiltInZoomControls(false);
            rhiVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            rhiVar.setLoadWithOverviewMode(false);
            rhiVar.setDefaultTextEncodingName("UTF-8");
            rhiVar.setDefaultFontSize(16);
            WebView webView = rhiVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.dgq.csi) {
                ((com.bytedance.sdk.component.dgq.csi) webView).kq();
            }
        } catch (Throwable unused) {
        }
    }

    private static WebView kq(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.dgq.rhi.bob bobVar, boolean z9) {
        WebView webViewOq;
        kq kqVar;
        if (bobVar == null || attributeSet != null || i10 != 0 || (kqVar = kq.get(bobVar.wki)) == null) {
            webViewOq = null;
        } else {
            webViewOq = kqVar.oq();
            if (webViewOq != null) {
                if (webViewOq instanceof com.bytedance.sdk.component.dgq.csi) {
                    ((com.bytedance.sdk.component.dgq.csi) webViewOq).setRecycler(false);
                }
                kq(bobVar, false);
            }
        }
        if (webViewOq != null || !z9) {
            return webViewOq;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        kq(bobVar, true);
        return i10 != 0 ? new com.bytedance.sdk.component.dgq.csi(context, attributeSet, i10) : new com.bytedance.sdk.component.dgq.csi(context, attributeSet);
    }

    private static class kq {
        private final String fou;
        public final int oq;
        public final HashSet<String> kq = new HashSet<>();
        private final ArrayList<WebView> bob = new ArrayList<>();

        public kq(String str, JSONObject jSONObject) {
            this.fou = str;
            this.oq = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.kq.add(strOptString);
                    }
                }
            }
        }

        public int bob() {
            return this.bob.size();
        }

        public boolean kq(WebView webView) {
            if (webView != null && this.bob.size() < this.oq && !this.bob.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.dgq.csi) {
                        ((com.bytedance.sdk.component.dgq.csi) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.bob.add(webView);
                    return true;
                }
            }
            return false;
        }

        public WebView oq() {
            if (this.bob.isEmpty()) {
                return null;
            }
            return this.bob.remove(0);
        }

        public HashSet<String> kq() {
            return this.kq;
        }
    }

    private static void kq(final com.bytedance.sdk.component.dgq.rhi.bob bobVar, final boolean z9) {
        nb.kq("webview_allocate", new nb.kq() { // from class: com.bytedance.sdk.component.utils.ha.1
            @Override // com.bytedance.sdk.component.utils.nb.kq
            public JSONObject kq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z9 ? 1 : 0);
                    jSONObject.put("scene", bobVar.wki);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void kq(com.bytedance.sdk.component.dgq.rhi rhiVar) {
        WebView webView;
        if (rhiVar == null || (webView = rhiVar.getWebView()) == null) {
            return;
        }
        kq kqVar = kq.get(rhiVar.getScene().wki);
        if (kqVar != null && kqVar.kq(webView)) {
            oq(rhiVar);
        } else {
            kq(webView);
        }
    }

    private static void kq(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static boolean oq(com.bytedance.sdk.component.dgq.rhi.bob bobVar) {
        return (bobVar == null || kq.get(bobVar.wki) == null) ? false : true;
    }

    public static void kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    kq kqVar = new kq(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = kqVar.kq().iterator();
                    while (it.hasNext()) {
                        kq.put(it.next(), kqVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int kq(com.bytedance.sdk.component.dgq.rhi.bob bobVar) {
        kq kqVar;
        if (bobVar == null || (kqVar = kq.get(bobVar.wki)) == null) {
            return 0;
        }
        return kqVar.bob();
    }
}
