package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f41807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f41808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f41809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f41810j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0386b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f41812a;

        RunnableC0386b() {
            this.f41812a = b.this.f41807g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41812a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f41808h = null;
        this.f41809i = map;
        this.f41810j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0386b(), Math.max(4000 - (this.f41808h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f41808h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f41807g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f41807g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f41807g.getSettings().setAllowContentAccess(false);
        this.f41807g.getSettings().setAllowFileAccess(false);
        this.f41807g.setWebViewClient(new a());
        a(this.f41807g);
        h.a().c(this.f41807g, this.f41810j);
        for (String str : this.f41809i.keySet()) {
            h.a().c(this.f41807g, this.f41809i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f41808h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
