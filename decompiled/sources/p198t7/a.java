package p198t7;

import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p070h.w;
import p158p7.d;
import p158p7.l;
import p178r7.g;
import p208u7.c;
import p208u7.f;
import p238x7.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f49726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p158p7.a f49727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0539a f49728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49729e;

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    enum EnumC0539a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a(String str) {
        a();
        this.f49725a = str;
        this.f49726b = new b(null);
    }

    public void a() {
        this.f49729e = f.b();
        this.f49728d = EnumC0539a.AD_STATE_IDLE;
    }

    public void b(float f10) {
        g.a().c(r(), this.f49725a, f10);
    }

    void c(WebView webView) {
        this.f49726b = new b(webView);
    }

    public void d(String str, long j10) {
        if (j10 >= this.f49729e) {
            EnumC0539a enumC0539a = this.f49728d;
            EnumC0539a enumC0539a2 = EnumC0539a.AD_STATE_NOTVISIBLE;
            if (enumC0539a != enumC0539a2) {
                this.f49728d = enumC0539a2;
                g.a().d(r(), this.f49725a, str);
            }
        }
    }

    public void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.g(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        g.a().i(r(), jSONObject);
    }

    public void f(JSONObject jSONObject) {
        g.a().m(r(), this.f49725a, jSONObject);
    }

    public void g(p158p7.a aVar) {
        this.f49727c = aVar;
    }

    public void h(p158p7.c cVar) {
        g.a().e(r(), this.f49725a, cVar.c());
    }

    public void i(l lVar, d dVar) {
        j(lVar, dVar, null);
    }

    protected void j(l lVar, d dVar, JSONObject jSONObject) {
        String strO = lVar.o();
        JSONObject jSONObject2 = new JSONObject();
        c.g(jSONObject2, "environment", "app");
        c.g(jSONObject2, "adSessionType", dVar.c());
        c.g(jSONObject2, "deviceInfo", p208u7.b.d());
        c.g(jSONObject2, "deviceCategory", p208u7.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.g(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.g(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, dVar.h().b());
        c.g(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, dVar.h().c());
        c.g(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.g(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        c.g(jSONObject4, "appId", p178r7.f.c().a().getApplicationContext().getPackageName());
        c.g(jSONObject2, "app", jSONObject4);
        if (dVar.d() != null) {
            c.g(jSONObject2, "contentUrl", dVar.d());
        }
        if (dVar.e() != null) {
            c.g(jSONObject2, "customReferenceData", dVar.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        Iterator it = dVar.i().iterator();
        if (it.hasNext()) {
            w.a(it.next());
            throw null;
        }
        g.a().f(r(), strO, jSONObject2, jSONObject5, jSONObject);
    }

    public void k(boolean z9) {
        if (o()) {
            g.a().l(r(), this.f49725a, z9 ? "foregrounded" : "backgrounded");
        }
    }

    public void l() {
        this.f49726b.clear();
    }

    public void m(String str, long j10) {
        if (j10 >= this.f49729e) {
            this.f49728d = EnumC0539a.AD_STATE_VISIBLE;
            g.a().d(r(), this.f49725a, str);
        }
    }

    public p158p7.a n() {
        return this.f49727c;
    }

    public boolean o() {
        return this.f49726b.get() != 0;
    }

    public void p() {
        g.a().b(r(), this.f49725a);
    }

    public void q() {
        g.a().k(r(), this.f49725a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView r() {
        return (WebView) this.f49726b.get();
    }

    public void s() {
        f(null);
    }

    public void t() {
    }
}
