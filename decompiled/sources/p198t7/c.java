package p198t7;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p070h.w;
import p158p7.d;
import p158p7.l;
import p178r7.g;
import p208u7.f;

/* JADX INFO: loaded from: classes3.dex */
public class c extends p198t7.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WebView f49734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f49735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f49736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f49737i;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (c.this.r() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                c.this.c(null);
            }
            webView.destroy();
            return true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f49739a;

        b() {
            this.f49739a = c.this.f49734f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f49739a.destroy();
        }
    }

    public c(String str, Map map, String str2) {
        super(str);
        this.f49735g = null;
        this.f49736h = map;
        this.f49737i = str2;
    }

    @Override // p198t7.a
    public void i(l lVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapF = dVar.f();
        Iterator it = mapF.keySet().iterator();
        if (it.hasNext()) {
            w.a(mapF.get((String) it.next()));
            throw null;
        }
        j(lVar, dVar, jSONObject);
    }

    @Override // p198t7.a
    public void l() {
        super.l();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f49735g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f49735g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f49734f = null;
    }

    @Override // p198t7.a
    public void t() {
        super.t();
        v();
    }

    void v() {
        WebView webView = new WebView(p178r7.f.c().a());
        this.f49734f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f49734f.getSettings().setAllowContentAccess(false);
        this.f49734f.getSettings().setAllowFileAccess(false);
        this.f49734f.setWebViewClient(new a());
        c(this.f49734f);
        g.a().n(this.f49734f, this.f49737i);
        Iterator it = this.f49736h.keySet().iterator();
        if (!it.hasNext()) {
            this.f49735g = Long.valueOf(f.b());
        } else {
            w.a(this.f49736h.get((String) it.next()));
            throw null;
        }
    }
}
