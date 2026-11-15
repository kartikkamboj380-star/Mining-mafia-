package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class E70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdvertisingIdClient.Info f18418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3269dk0 f18420c;

    public E70(AdvertisingIdClient.Info info, String str, C3269dk0 c3269dk0) {
        this.f18418a = info;
        this.f18419b = str;
        this.f18420c = c3269dk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectH = K4.S.h((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f18418a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f18419b;
                if (str != null) {
                    jSONObjectH.put("pdid", str);
                    jSONObjectH.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectH.put("rdid", info.getId());
            jSONObjectH.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectH.put("idtype", "adid");
            C3269dk0 c3269dk0 = this.f18420c;
            if (c3269dk0.c()) {
                jSONObjectH.put("paidv1_id_android_3p", c3269dk0.a());
                jSONObjectH.put("paidv1_creation_time_android_3p", c3269dk0.b());
            }
        } catch (JSONException e10) {
            AbstractC0786o0.l("Failed putting Ad ID.", e10);
        }
    }
}
