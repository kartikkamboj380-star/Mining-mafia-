package p197t6;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p087i6.g;
import p117l6.C7064z;
import p127m6.i;
import p167q6.a;
import p167q6.b;

/* JADX INFO: loaded from: classes3.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f49684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f49685c;

    public c(String str, b bVar) {
        this(str, bVar, g.f());
    }

    private a b(a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f49716a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C7064z.q());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f49717b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f49718c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f49719d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f49720e.a().c());
        return aVar;
    }

    private void c(a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f49685c.l("Failed to parse settings JSON from " + this.f49683a, e10);
            this.f49685c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f49723h);
        map.put("display_version", kVar.f49722g);
        map.put("source", Integer.toString(kVar.f49724i));
        String str = kVar.f49721f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // p197t6.l
    public JSONObject a(k kVar, boolean z9) {
        i.d();
        if (!z9) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(kVar);
            a aVarB = b(d(mapF), kVar);
            this.f49685c.b("Requesting settings from " + this.f49683a);
            this.f49685c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e10) {
            this.f49685c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected a d(Map map) {
        return this.f49684b.a(this.f49683a, map).d("User-Agent", "Crashlytics Android SDK/" + C7064z.q()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(p167q6.c cVar) {
        int iB = cVar.b();
        this.f49685c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f49685c.d("Settings request failed; (status: " + iB + ") from " + this.f49683a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, b bVar, g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f49685c = gVar;
        this.f49684b = bVar;
        this.f49683a = str;
    }
}
