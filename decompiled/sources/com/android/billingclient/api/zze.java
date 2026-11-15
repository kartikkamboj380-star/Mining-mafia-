package com.android.billingclient.api;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12692c;

    /* synthetic */ zze(JSONObject jSONObject, zzd zzdVar) {
        this.f12690a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f12691b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f12692c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.f12690a.equals(zzeVar.f12690a) && this.f12691b.equals(zzeVar.f12691b) && Objects.equals(this.f12692c, zzeVar.f12692c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12690a, this.f12691b, this.f12692c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f12690a, this.f12691b, this.f12692c);
    }
}
