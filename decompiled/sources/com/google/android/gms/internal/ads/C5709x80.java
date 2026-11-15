package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5709x80 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34749a;

    public C5709x80(String str) {
        this.f34749a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.f34749a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            K4.S.h(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed putting trustless token.", e10);
        }
    }
}
