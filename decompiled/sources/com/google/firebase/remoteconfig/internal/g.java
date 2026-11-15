package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Date f40572h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f40573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f40574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f40575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONArray f40576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f40577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f40579g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f40580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f40581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f40582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f40583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f40584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JSONArray f40585f;

        public g a() {
            return new g(this.f40580a, this.f40581b, this.f40582c, this.f40583d, this.f40584e, this.f40585f);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f40580a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f40582c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f40581b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f40583d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b f(JSONArray jSONArray) {
            try {
                this.f40585f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j10) {
            this.f40584e = j10;
            return this;
        }

        private b() {
            this.f40580a = new JSONObject();
            this.f40581b = g.f40572h;
            this.f40582c = new JSONArray();
            this.f40583d = new JSONObject();
            this.f40584e = 0L;
            this.f40585f = new JSONArray();
        }
    }

    static g b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map c() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static g d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f40576d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f40573a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public Set f(g gVar) throws JSONException {
        JSONObject jSONObjectG = d(gVar.f40573a).g();
        Map mapC = c();
        Map mapC2 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!gVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(gVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !gVar.i().has(next)) || (!i().has(next) && gVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f40574b;
    }

    public Date h() {
        return this.f40575c;
    }

    public int hashCode() {
        return this.f40573a.hashCode();
    }

    public JSONObject i() {
        return this.f40577e;
    }

    public JSONArray j() {
        return this.f40579g;
    }

    public long k() {
        return this.f40578f;
    }

    public String toString() {
        return this.f40573a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f40574b = jSONObject;
        this.f40575c = date;
        this.f40576d = jSONArray;
        this.f40577e = jSONObject2;
        this.f40578f = j10;
        this.f40579g = jSONArray2;
        this.f40573a = jSONObject3;
    }
}
