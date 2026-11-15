package B4;

import H4.Z0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: B4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0564a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0564a f217d;

    public C0564a(int i10, String str, String str2, C0564a c0564a) {
        this.f214a = i10;
        this.f215b = str;
        this.f216c = str2;
        this.f217d = c0564a;
    }

    public int a() {
        return this.f214a;
    }

    public String b() {
        return this.f216c;
    }

    public String c() {
        return this.f215b;
    }

    public final Z0 d() {
        Z0 z9;
        C0564a c0564a = this.f217d;
        if (c0564a == null) {
            z9 = null;
        } else {
            z9 = new Z0(c0564a.f214a, c0564a.f215b, c0564a.f216c, null, null);
        }
        return new Z0(this.f214a, this.f215b, this.f216c, z9, null);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f214a);
        jSONObject.put("Message", this.f215b);
        jSONObject.put("Domain", this.f216c);
        C0564a c0564a = this.f217d;
        if (c0564a == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c0564a.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public C0564a(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }
}
