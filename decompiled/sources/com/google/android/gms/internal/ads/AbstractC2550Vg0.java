package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2550Vg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C5653wh0 f24341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f24342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24343d;

    public AbstractC2550Vg0(String str) {
        p();
        this.f24340a = str;
        this.f24341b = new C5653wh0(null);
    }

    public void a() {
    }

    public void b() {
        this.f24341b.clear();
    }

    final void c(WebView webView) {
        this.f24341b = new C5653wh0(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView d() {
        return (WebView) this.f24341b.get();
    }

    public final boolean e() {
        return this.f24341b.get() != 0;
    }

    public final void f(boolean z9) {
        if (e()) {
            C2082Mg0.a().f(d(), this.f24340a, true != z9 ? "backgrounded" : "foregrounded");
        }
    }

    public final void g(boolean z9) {
        if (e()) {
            C2082Mg0.a().g(d(), this.f24340a, true != z9 ? "unlocked" : "locked");
        }
    }

    public final void h(String str, long j10) {
        if (j10 >= this.f24342c) {
            this.f24343d = 2;
            C2082Mg0.a().e(d(), this.f24340a, str);
        }
    }

    public final void i(String str, long j10) {
        if (j10 < this.f24342c || this.f24343d == 3) {
            return;
        }
        this.f24343d = 3;
        C2082Mg0.a().e(d(), this.f24340a, str);
    }

    public final void j(C3889ig0 c3889ig0) {
        C2082Mg0.a().b(d(), this.f24340a, c3889ig0.b());
    }

    public void k(C4266lg0 c4266lg0, C4014jg0 c4014jg0) {
        l(c4266lg0, c4014jg0, null);
    }

    protected final void l(C4266lg0 c4266lg0, C4014jg0 c4014jg0, JSONObject jSONObject) {
        String strH = c4266lg0.h();
        JSONObject jSONObject2 = new JSONObject();
        AbstractC3137ch0.c(jSONObject2, "environment", "app");
        AbstractC3137ch0.c(jSONObject2, "adSessionType", c4014jg0.i());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        AbstractC3137ch0.c(jSONObject3, "deviceType", sb.toString());
        AbstractC3137ch0.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC3137ch0.c(jSONObject3, "os", "Android");
        AbstractC3137ch0.c(jSONObject2, "deviceInfo", jSONObject3);
        AbstractC3137ch0.c(jSONObject2, "deviceCategory", AbstractC3012bh0.b().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC3137ch0.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        AbstractC3137ch0.c(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, c4014jg0.c().b());
        AbstractC3137ch0.c(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, c4014jg0.c().c());
        AbstractC3137ch0.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        AbstractC3137ch0.c(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        AbstractC3137ch0.c(jSONObject5, "appId", C1979Kg0.a().b().getApplicationContext().getPackageName());
        AbstractC3137ch0.c(jSONObject2, "app", jSONObject5);
        if (c4014jg0.g() != null) {
            AbstractC3137ch0.c(jSONObject2, "contentUrl", c4014jg0.g());
        }
        if (c4014jg0.h() != null) {
            AbstractC3137ch0.c(jSONObject2, "customReferenceData", c4014jg0.h());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = c4014jg0.d().iterator();
        if (it.hasNext()) {
            p070h.w.a(it.next());
            throw null;
        }
        C2082Mg0.a().c(d(), strH, jSONObject2, jSONObject6, jSONObject);
    }

    public final void m() {
        C2082Mg0.a().d(d(), this.f24340a);
    }

    public final void n(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC3137ch0.c(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C2082Mg0.a().i(d(), jSONObject);
    }

    public final void o(float f10) {
        C2082Mg0.a().h(d(), this.f24340a, f10);
    }

    public final void p() {
        this.f24342c = System.nanoTime();
        this.f24343d = 1;
    }
}
