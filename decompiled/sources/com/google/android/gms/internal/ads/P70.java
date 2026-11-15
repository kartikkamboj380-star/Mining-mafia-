package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class P70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f22047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f22048b;

    public P70(String str, int i10) {
        this.f22047a = str;
        this.f22048b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        String str = this.f22047a;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i10 = this.f22048b) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectH = K4.S.h(jSONObject, "pii");
            jSONObjectH.put("pvid", str);
            jSONObjectH.put("pvid_s", i10);
        } catch (JSONException e10) {
            AbstractC0786o0.l("Failed putting gms core app set ID info.", e10);
        }
    }
}
