package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ah0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2886ah0 extends AbstractC2550Vg0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WebView f26598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f26599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f26600g;

    public C2886ah0(String str, Map map, String str2) {
        super(str);
        this.f26599f = null;
        this.f26600g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2550Vg0
    public final void a() {
        WebView webView = new WebView(C1979Kg0.a().b());
        this.f26598e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f26598e.getSettings().setAllowContentAccess(false);
        this.f26598e.getSettings().setAllowFileAccess(false);
        this.f26598e.setWebViewClient(new C2654Xg0(this));
        c(this.f26598e);
        C2082Mg0.k(this.f26598e, null);
        Map map = this.f26600g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            p070h.w.a(map.get((String) it.next()));
            throw null;
        }
        this.f26599f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2550Vg0
    public final void b() {
        super.b();
        new Handler().postDelayed(new RunnableC2758Zg0(this), Math.max(4000 - (this.f26599f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f26599f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f26598e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2550Vg0
    public final void k(C4266lg0 c4266lg0, C4014jg0 c4014jg0) {
        JSONObject jSONObject = new JSONObject();
        Map mapE = c4014jg0.e();
        Iterator it = mapE.keySet().iterator();
        if (it.hasNext()) {
            p070h.w.a(mapE.get((String) it.next()));
            throw null;
        }
        l(c4266lg0, c4014jg0, jSONObject);
    }

    final /* synthetic */ WebView q() {
        return this.f26598e;
    }
}
