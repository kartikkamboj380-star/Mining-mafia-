package com.bytedance.sdk.component.adexpress.kq.bob;

import android.text.TextUtils;
import android.util.Pair;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private String bob;
    private oq csi;
    private List<C0238kq> fou;
    private String kq;
    private String oq;
    private String rhi;
    private Map<String, kq> rjo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.kq.bob.kq$kq, reason: collision with other inner class name */
    public static class C0238kq {
        private int bob;
        private String kq;
        private String oq;

        public int bob() {
            return this.bob;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0238kq)) {
                return super.equals(obj);
            }
            String str2 = this.kq;
            if (str2 != null) {
                C0238kq c0238kq = (C0238kq) obj;
                if (str2.equals(c0238kq.kq()) && (str = this.oq) != null && str.equals(c0238kq.oq())) {
                    return true;
                }
            }
            return false;
        }

        public String kq() {
            return this.kq;
        }

        public String oq() {
            return this.oq;
        }

        public void kq(String str) {
            this.kq = str;
        }

        public void oq(String str) {
            this.oq = str;
        }

        public void kq(int i10) {
            this.bob = i10;
        }
    }

    public static class oq {
        private List<Pair<String, String>> bob;
        private String kq;
        private String oq;

        public String kq() {
            return this.kq;
        }

        public void oq(String str) {
            this.oq = str;
        }

        public void kq(String str) {
            this.kq = str;
        }

        public List<Pair<String, String>> oq() {
            return this.bob;
        }

        public void kq(List<Pair<String, String>> list) {
            this.bob = list;
        }
    }

    public String bob() {
        return this.oq;
    }

    public oq csi() {
        return this.csi;
    }

    public JSONObject dgq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(MediationMetaData.KEY_NAME, oq());
            jSONObject.putOpt("version", bob());
            jSONObject.putOpt("main", fou());
            if (!TextUtils.isEmpty(this.rhi)) {
                jSONObject.put("template_fetch_url", this.rhi);
            }
            JSONArray jSONArray = new JSONArray();
            if (rhi() != null) {
                for (C0238kq c0238kq : rhi()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0238kq.kq());
                    jSONObject2.putOpt("md5", c0238kq.oq());
                    jSONObject2.putOpt("level", Integer.valueOf(c0238kq.bob()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.rjo.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z9 = false;
                for (String str : this.rjo.keySet()) {
                    kq kqVar = this.rjo.get(str);
                    if (kqVar != null) {
                        jSONObject3.put(str, kqVar.dgq());
                        z9 = true;
                    }
                }
                if (z9) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            oq oqVarCsi = csi();
            if (oqVarCsi != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", oqVarCsi.kq);
                jSONObject4.put("md5", oqVarCsi.oq);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listOq = oqVarCsi.oq();
                if (listOq != null) {
                    for (Pair<String, String> pair : listOq) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String fou() {
        return this.bob;
    }

    public Map<String, kq> kq() {
        return this.rjo;
    }

    public String nn() {
        JSONObject jSONObjectDgq;
        if (!syt() || (jSONObjectDgq = dgq()) == null) {
            return null;
        }
        return jSONObjectDgq.toString();
    }

    public String oq() {
        return this.kq;
    }

    public List<C0238kq> rhi() {
        if (this.fou == null) {
            this.fou = new ArrayList();
        }
        return this.fou;
    }

    public String rjo() {
        return this.rhi;
    }

    public boolean syt() {
        return (TextUtils.isEmpty(fou()) || TextUtils.isEmpty(bob()) || TextUtils.isEmpty(oq())) ? false : true;
    }

    public static kq csi(String str) {
        if (str == null) {
            return null;
        }
        try {
            return kq(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void bob(String str) {
        this.bob = str;
    }

    public void fou(String str) {
        this.rhi = str;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(String str) {
        this.oq = str;
    }

    public void kq(oq oqVar) {
        this.csi = oqVar;
    }

    public void kq(List<C0238kq> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.fou = list;
    }

    public static kq kq(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        kq kqVar = new kq();
        kqVar.kq(jSONObject.optString(MediationMetaData.KEY_NAME));
        kqVar.oq(jSONObject.optString("version"));
        kqVar.bob(jSONObject.optString("main"));
        kqVar.fou(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0238kq c0238kq = new C0238kq();
                c0238kq.kq(jSONObjectOptJSONObject2.optString("url"));
                c0238kq.oq(jSONObjectOptJSONObject2.optString("md5"));
                c0238kq.kq(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0238kq);
            }
        }
        kqVar.kq(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kq kqVarKq = kq(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (kqVarKq != null) {
                        kqVar.kq().put(next, kqVarKq);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            oq oqVar = new oq();
            oqVar.kq(jSONObjectOptJSONObject.optString("url"));
            oqVar.oq(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                oqVar.kq(arrayList2);
            }
            kqVar.kq(oqVar);
        }
        if (kqVar.syt()) {
            return kqVar;
        }
        return null;
    }
}
