package B4;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends C0564a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f249e;

    public k(int i10, String str, String str2, C0564a c0564a, u uVar) {
        super(i10, str, str2, c0564a);
        this.f249e = uVar;
    }

    @Override // B4.C0564a
    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectE = super.e();
        u uVarF = f();
        if (uVarF == null) {
            jSONObjectE.put("Response Info", "null");
            return jSONObjectE;
        }
        jSONObjectE.put("Response Info", uVarF.d());
        return jSONObjectE;
    }

    public u f() {
        return this.f249e;
    }

    @Override // B4.C0564a
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
