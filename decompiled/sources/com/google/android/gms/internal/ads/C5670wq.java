package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5670wq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34635c;

    public C5670wq(boolean z9, String str, boolean z10) {
        this.f34633a = z9;
        this.f34634b = str;
        this.f34635c = z10;
    }

    public static C5670wq a(JSONObject jSONObject) {
        return new C5670wq(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
