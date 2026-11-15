package p097j6;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;
import p087i6.g;
import p107k6.a;
import p107k6.b;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f45558a;

    private static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(MediationMetaData.KEY_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p107k6.b
    public void a(a aVar) {
        this.f45558a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // p097j6.b
    public void b(String str, Bundle bundle) {
        a aVar = this.f45558a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
