package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3444f80 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f28198a;

    public C3444f80(List list) {
        this.f28198a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f28198a));
        } catch (JSONException unused) {
            AbstractC0786o0.k("Failed putting experiment ids.");
        }
    }
}
