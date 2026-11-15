package B4;

import H4.Z0;
import H4.q2;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q2 f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0564a f248b;

    private i(q2 q2Var) {
        this.f247a = q2Var;
        Z0 z9 = q2Var.f1420c;
        this.f248b = z9 == null ? null : z9.a();
    }

    public static i e(q2 q2Var) {
        if (q2Var != null) {
            return new i(q2Var);
        }
        return null;
    }

    public String a() {
        return this.f247a.f1423f;
    }

    public String b() {
        return this.f247a.f1425h;
    }

    public String c() {
        return this.f247a.f1424g;
    }

    public String d() {
        return this.f247a.f1422e;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        q2 q2Var = this.f247a;
        jSONObject.put("Adapter", q2Var.f1418a);
        jSONObject.put("Latency", q2Var.f1419b);
        String strD = d();
        if (strD == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strD);
        }
        String strA = a();
        if (strA == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strA);
        }
        String strC = c();
        if (strC == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strC);
        }
        String strB = b();
        if (strB == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strB);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = q2Var.f1421d;
        for (String str : bundle.keySet()) {
            jSONObject2.put(str, bundle.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C0564a c0564a = this.f248b;
        if (c0564a == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c0564a.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
