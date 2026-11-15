package p018b7;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.h;
import p038d7.d;
import p038d7.e;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f11631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f11632b;

    a(f fVar, f fVar2) {
        this.f11631a = fVar;
        this.f11632b = fVar2;
    }

    public static a a(f fVar, f fVar2) {
        return new a(fVar, fVar2);
    }

    private String c(String str) {
        String strD = d(this.f11631a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f11632b, str);
        return strD2 != null ? strD2 : "";
    }

    private static String d(f fVar, String str) {
        g gVarF = fVar.f();
        if (gVarF == null) {
            return null;
        }
        try {
            return gVarF.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    e b(g gVar) throws h {
        JSONArray jSONArrayJ = gVar.j();
        long jK = gVar.k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayJ.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArrayJ.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (JSONException e10) {
                throw new h("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return e.a(hashSet);
    }
}
