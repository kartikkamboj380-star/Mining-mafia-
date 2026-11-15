package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SM extends TM {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f23168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f23170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f23172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f23173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f23174h;

    public SM(C3502fb0 c3502fb0, JSONObject jSONObject) {
        super(c3502fb0);
        this.f23168b = K4.S.i(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f23169c = K4.S.j(false, jSONObject, "allow_pub_owned_ad_view");
        this.f23170d = K4.S.j(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f23171e = K4.S.j(false, jSONObject, "enable_omid");
        this.f23173g = K4.S.k("", jSONObject, "watermark_overlay_png_base64");
        this.f23172f = jSONObject.optJSONObject("overlay") != null;
        this.f23174h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final JSONObject a() {
        JSONObject jSONObject = this.f23168b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f23485a.f28445z);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final boolean b() {
        return this.f23172f;
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final boolean c() {
        return this.f23169c;
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final boolean d() {
        return this.f23171e;
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final boolean e() {
        return this.f23170d;
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final String f() {
        return this.f23173g;
    }

    @Override // com.google.android.gms.internal.ads.TM
    public final C1553Cb0 g() {
        JSONObject jSONObject = this.f23174h;
        return jSONObject != null ? new C1553Cb0(jSONObject) : this.f23485a.f28390V;
    }
}
