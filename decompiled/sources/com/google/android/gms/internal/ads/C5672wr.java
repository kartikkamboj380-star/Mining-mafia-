package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5672wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f34640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f34641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f34643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f34644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f34645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f34646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f34647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f34648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f34649m;

    public C5672wr(JSONObject jSONObject) {
        this.f34642f = jSONObject.optString("url");
        this.f34638b = jSONObject.optString("base_uri");
        this.f34639c = jSONObject.optString("post_parameters");
        this.f34640d = n(jSONObject.optString("drt_include"));
        this.f34649m = jSONObject.optString("content_type");
        this.f34648l = n(jSONObject.optString("use_compression"));
        this.f34641e = n(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        String strOptString = jSONObject.optString("errors");
        this.f34637a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f34643g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f34644h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f34645i = jSONObject.optString("pool_key");
        this.f34646j = o(jSONObject.optString("start_time")).longValue();
        this.f34647k = o(jSONObject.optString("end_time")).longValue();
    }

    private static boolean n(String str) {
        if (str != null) {
            return str.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) || str.equals("true");
        }
        return false;
    }

    private static Long o(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final int a() {
        return this.f34643g;
    }

    public final List b() {
        return this.f34637a;
    }

    public final String c() {
        return this.f34638b;
    }

    public final String d() {
        return this.f34639c;
    }

    public final String e() {
        return this.f34642f;
    }

    public final boolean f() {
        return this.f34640d;
    }

    public final boolean g() {
        return this.f34641e;
    }

    public final JSONObject h() {
        return this.f34644h;
    }

    public final String i() {
        return this.f34645i;
    }

    public final long j() {
        return this.f34646j;
    }

    public final long k() {
        return this.f34647k;
    }

    public final String l() {
        return this.f34649m;
    }

    public final boolean m() {
        return this.f34648l;
    }
}
