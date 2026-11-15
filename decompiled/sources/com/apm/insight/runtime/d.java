package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f13183a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f13184b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f13185c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13186d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f13187e;

    private d(JSONObject jSONObject, String str) {
        this.f13187e = str;
        a(jSONObject);
        f13183a.put(this.f13187e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f13184b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f13186d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static JSONObject b(String str) {
        d dVar = f13183a.get(str);
        if (dVar != null) {
            return dVar.f13184b;
        }
        return null;
    }

    public static d c(String str) {
        return f13183a.get(str);
    }

    public static long d(String str) {
        d dVar = f13183a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f13184b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f13183a.get(str);
        return (dVar == null || (jSONObject = dVar.f13184b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f13183a.get(str);
        return (dVar == null || (jSONObject = dVar.f13184b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f13183a.get(str);
        return (dVar == null || (jSONObject = dVar.f13184b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f13184b == null) {
            return false;
        }
        return this.f13186d;
    }

    public static boolean a(String str) {
        return f13183a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f13183a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
