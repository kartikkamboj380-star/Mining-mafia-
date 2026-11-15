package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.I0;
import com.facebook.react.views.scroll.q;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p136n5.L;

/* JADX INFO: loaded from: classes3.dex */
public class d extends WebView implements LifecycleEventListener {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected List f42107G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    WebChromeClient f42108H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected String f42109I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f42110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f42111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f42112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected I0.i.a f42113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f42114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f42115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f42116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f42117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RNCWebViewMessagingModule f42118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected f f42119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f42120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.facebook.react.views.scroll.d f42121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f42122m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f42123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected C0392d f42124w;

    class a extends ActionMode.Callback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMode.Callback f42125a;

        /* JADX INFO: renamed from: com.reactnativecommunity.webview.d$a$a, reason: collision with other inner class name */
        class C0391a implements ValueCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MenuItem f42127a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WritableMap f42128b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActionMode f42129c;

            C0391a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f42127a = menuItem;
                this.f42128b = writableMap;
                this.f42129c = actionMode;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String string;
                Map map = (Map) d.this.f42107G.get(this.f42127a.getItemId());
                this.f42128b.putString("label", (String) map.get("label"));
                this.f42128b.putString("key", (String) map.get("key"));
                try {
                    string = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                this.f42128b.putString("selectedText", string);
                d dVar = d.this;
                dVar.g(dVar, new D7.b(o.a(d.this), this.f42128b));
                this.f42129c.finish();
            }
        }

        a(ActionMode.Callback callback) {
            this.f42125a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            d.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0391a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i10 = 0; i10 < d.this.f42107G.size(); i10++) {
                menu.add(0, i10, i10, (CharSequence) ((Map) d.this.f42107G.get(i10)).get("label"));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f42125a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    class b implements I0.i.a {
        b() {
        }

        @Override // I0.i.a
        public void onPostMessage(WebView webView, I0.e eVar, Uri uri, boolean z9, I0.a aVar) {
            d.this.j(eVar.b(), uri.toString());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f42132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42134c;

        c(WebView webView, String str, String str2) {
            this.f42132a = webView;
            this.f42133b = str;
            this.f42134c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = d.this.f42119j;
            if (fVar == null) {
                return;
            }
            WritableMap writableMapA = fVar.a(this.f42132a, this.f42133b);
            writableMapA.putString(JsonStorageKeyNames.DATA_KEY, this.f42134c);
            d dVar = d.this;
            if (dVar.f42118i != null) {
                dVar.e(writableMapA);
            } else {
                dVar.g(this.f42132a, new D7.h(o.a(this.f42132a), writableMapA));
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.d$d, reason: collision with other inner class name */
    protected static class C0392d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f42136a = false;

        protected C0392d() {
        }

        public boolean a() {
            return this.f42136a;
        }

        public void b(boolean z9) {
            this.f42136a = z9;
        }
    }

    protected class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42137a = "RNCWebViewBridge";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f42138b;

        e(d dVar) {
            this.f42138b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            d dVar = this.f42138b;
            dVar.j(str, dVar.getUrl());
        }

        @JavascriptInterface
        public void postMessage(final String str) {
            if (this.f42138b.getMessagingEnabled()) {
                this.f42138b.post(new Runnable() { // from class: com.reactnativecommunity.webview.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42140a.b(str);
                    }
                });
            } else {
                Z1.a.I(this.f42137a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public d(E0 e10) {
        super(e10);
        this.f42113d = null;
        this.f42114e = true;
        this.f42115f = true;
        this.f42116g = false;
        this.f42120k = false;
        this.f42122m = false;
        this.f42123v = false;
        this.f42109I = null;
        this.f42118i = (RNCWebViewMessagingModule) ((E0) getContext()).b().getJSModule(RNCWebViewMessagingModule.class);
        this.f42124w = new C0392d();
    }

    private void i() {
        String str;
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            if (this.f42109I == null) {
                str = null;
            } else {
                str = "`" + this.f42109I + "`";
            }
            sb.append(str);
            sb.append("; };\n})();");
            h(sb.toString());
        }
    }

    public void a() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f42110a) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f42110a + ";\n})();");
        i();
    }

    public void b() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f42111b) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f42111b + ";\n})();");
        i();
    }

    protected void c() {
        setWebViewClient(null);
        destroy();
    }

    protected void d(d dVar) {
        if (I0.j.a("WEB_MESSAGE_LISTENER")) {
            if (this.f42113d == null) {
                this.f42113d = new b();
                I0.i.b(dVar, "ReactNativeWebView", L.a(new Object[]{"*"}), this.f42113d);
            }
        } else if (this.f42112c == null) {
            e eVar = new e(dVar);
            this.f42112c = eVar;
            addJavascriptInterface(eVar, "ReactNativeWebView");
        }
        i();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.f42108H;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    protected void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f42117h);
        this.f42118i.onMessage(writableNativeMap);
    }

    protected boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f42117h);
        this.f42118i.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    protected void g(WebView webView, com.facebook.react.uimanager.events.e eVar) {
        I0.c(getThemedReactContext(), o.a(webView)).c(eVar);
    }

    public boolean getMessagingEnabled() {
        return this.f42116g;
    }

    public f getRNCWebViewClient() {
        return this.f42119j;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().b();
    }

    public E0 getThemedReactContext() {
        return (E0) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f42108H;
    }

    protected void h(String str) {
        evaluateJavascript(str, null);
    }

    public void j(String str, String str2) {
        getThemedReactContext();
        if (this.f42119j != null) {
            post(new c(this, str2, str));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(JsonStorageKeyNames.DATA_KEY, str);
        if (this.f42118i != null) {
            e(writableMapCreateMap);
        } else {
            g(this, new D7.h(o.a(this), writableMapCreateMap));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f42122m) {
            if (this.f42121l == null) {
                this.f42121l = new com.facebook.react.views.scroll.d();
            }
            if (this.f42121l.c(i10, i11)) {
                g(this, com.facebook.react.views.scroll.p.e(o.a(this), q.SCROLL, i10, i11, this.f42121l.a(), this.f42121l.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f42120k) {
            g(this, new com.facebook.react.uimanager.events.d(o.a(this), i10, i11));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42123v) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
        this.f42119j.d(aVar);
    }

    public void setHasScrollEvent(boolean z9) {
        this.f42122m = z9;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f42109I = str;
        i();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f42107G = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z9) {
        if (this.f42116g == z9) {
            return;
        }
        this.f42116g = z9;
        if (z9) {
            d(this);
        }
    }

    public void setNestedScrollEnabled(boolean z9) {
        this.f42123v = z9;
    }

    public void setSendContentSizeChangeEvents(boolean z9) {
        this.f42120k = z9;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f42108H = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof com.reactnativecommunity.webview.c) {
            ((com.reactnativecommunity.webview.c) webChromeClient).h(this.f42124w);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof f) {
            f fVar = (f) webViewClient;
            this.f42119j = fVar;
            fVar.e(this.f42124w);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return this.f42107G == null ? super.startActionMode(callback, i10) : super.startActionMode(new a(callback), i10);
    }
}
