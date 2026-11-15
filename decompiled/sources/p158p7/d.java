package p158p7;

import android.webkit.WebView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p070h.w;
import p208u7.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f47912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f47913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f47914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f47915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f47917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f47919h;

    private d(k kVar, WebView webView, String str, List list, String str2, String str3, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f47914c = arrayList;
        this.f47915d = new HashMap();
        this.f47912a = kVar;
        this.f47913b = webView;
        this.f47916e = str;
        this.f47919h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w.a(it.next());
                this.f47915d.put(UUID.randomUUID().toString(), null);
            }
        }
        this.f47918g = str2;
        this.f47917f = str3;
    }

    public static d a(k kVar, WebView webView, String str, String str2) {
        g.b(kVar, "Partner is null");
        g.b(webView, "WebView is null");
        if (str2 != null) {
            g.c(str2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, "CustomReferenceData is greater than 256 characters");
        }
        return new d(kVar, webView, null, null, str, str2, e.HTML);
    }

    public static d b(k kVar, WebView webView, String str, String str2) {
        g.b(kVar, "Partner is null");
        g.b(webView, "WebView is null");
        if (str2 != null) {
            g.c(str2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, "CustomReferenceData is greater than 256 characters");
        }
        return new d(kVar, webView, null, null, str, str2, e.JAVASCRIPT);
    }

    public e c() {
        return this.f47919h;
    }

    public String d() {
        return this.f47918g;
    }

    public String e() {
        return this.f47917f;
    }

    public Map f() {
        return Collections.unmodifiableMap(this.f47915d);
    }

    public String g() {
        return this.f47916e;
    }

    public k h() {
        return this.f47912a;
    }

    public List i() {
        return Collections.unmodifiableList(this.f47914c);
    }

    public WebView j() {
        return this.f47913b;
    }
}
