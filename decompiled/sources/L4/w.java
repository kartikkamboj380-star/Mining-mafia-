package L4;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f3149a;

    private w(y yVar) {
        this.f3149a = yVar;
    }

    public static w b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new w(jSONObjectOptJSONObject == null ? new o(1, 0, 1.0d, false) : new o(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final y a() {
        return this.f3149a;
    }
}
