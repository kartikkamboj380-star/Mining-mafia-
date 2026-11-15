package p109k8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f45709b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f45710a;

    private k() {
        try {
            this.f45710a = new JSONObject("{\"android_app_id\":\"ca-app-pub-4778910188433203~5723522006\",\"ios_app_id\":\"ca-app-pub-4778910188433203~7079809970\",\"sk_ad_network_items\":[\"cstr6suwn9.skadnetwork\",\"4fzdc2evr5.skadnetwork\",\"2fnua5tdw4.skadnetwork\",\"ydx93a7ass.skadnetwork\",\"p78axxw29g.skadnetwork\",\"v72qych5uu.skadnetwork\",\"ludvb6z3bs.skadnetwork\",\"cp8zw746q7.skadnetwork\",\"3sh42y64q3.skadnetwork\",\"c6k4g5qg8m.skadnetwork\",\"s39g8k73mm.skadnetwork\",\"wg4vff78zm.skadnetwork\",\"3qy4746246.skadnetwork\",\"f38h382jlk.skadnetwork\",\"hs6bdukanm.skadnetwork\",\"mlmmfzh3r3.skadnetwork\",\"v4nxqhlyqp.skadnetwork\",\"wzmmz9fp6w.skadnetwork\",\"su67r6k2v3.skadnetwork\",\"yclnxrl5pm.skadnetwork\",\"t38b2kh725.skadnetwork\",\"7ug5zh24hu.skadnetwork\",\"gta9lk7p23.skadnetwork\",\"vutu7akeur.skadnetwork\",\"y5ghdn5j9k.skadnetwork\",\"v9wttpbfk9.skadnetwork\",\"n38lu8286q.skadnetwork\",\"47vhws6wlr.skadnetwork\",\"kbd757ywx3.skadnetwork\",\"9t245vhmpl.skadnetwork\",\"a2p9lx4jpn.skadnetwork\",\"22mmun2rn5.skadnetwork\",\"44jx6755aq.skadnetwork\",\"k674qkevps.skadnetwork\",\"4468km3ulz.skadnetwork\",\"2u9pt9hc89.skadnetwork\",\"8s468mfl3y.skadnetwork\",\"klf5c3l5u5.skadnetwork\",\"ppxm28t8ap.skadnetwork\",\"kbmxgpxpgc.skadnetwork\",\"uw77j35x4d.skadnetwork\",\"578prtvx9j.skadnetwork\",\"4dzt52r2t5.skadnetwork\",\"tl55sbb4fm.skadnetwork\",\"c3frkrj4fj.skadnetwork\",\"e5fvkxwrpn.skadnetwork\",\"8c4e2ghe7u.skadnetwork\",\"3rd42ekr43.skadnetwork\",\"97r2b46745.skadnetwork\",\"3qcr597p9d.skadnetwork\"],\"delay_app_measurement_init\":true}");
        } catch (JSONException unused) {
        }
    }

    public static k c() {
        return f45709b;
    }

    public WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONArray jSONArrayNames = this.f45710a.names();
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            try {
                String string = jSONArrayNames.getString(i10);
                n.e(string, this.f45710a.get(string), writableMapCreateMap);
            } catch (JSONException unused) {
            }
        }
        return writableMapCreateMap;
    }

    public int b(String str, int i10) {
        JSONObject jSONObject = this.f45710a;
        return jSONObject == null ? i10 : jSONObject.optInt(str, i10);
    }
}
