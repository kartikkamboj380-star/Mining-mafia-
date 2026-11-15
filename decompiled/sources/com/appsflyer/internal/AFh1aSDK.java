package com.appsflyer.internal;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1aSDK {

    @Nullable
    public AFi1zSDK AFAdRevenueData;

    @Nullable
    public final AFh1bSDK getCurrencyIso4217Code;

    @Nullable
    public final AFh1dSDK getMonetizationNetwork;

    public AFh1aSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    private static AFi1zSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objB;
        AFi1zSDK aFi1zSDK;
        List listI;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j10 = mediationNetwork.getLong("ttl");
                int i10 = mediationNetwork.getInt("counter");
                String strOptString = mediationNetwork.optString("app_ver", "");
                String strOptString2 = mediationNetwork.optString("sdk_ver", "");
                float fOptDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = mediationNetwork.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    listI = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = jSONArrayOptJSONArray.getString(i11);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        listI.add(string);
                    }
                } else {
                    listI = CollectionsKt.i();
                }
                List list = listI;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                aFi1zSDK = new AFi1zSDK(j10, fOptDouble, list, i10, strOptString, strOptString2);
            } else {
                aFi1zSDK = null;
            }
            objB = p129m8.m.b(aFi1zSDK);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        return (AFi1zSDK) (p129m8.m.f(objB) ? null : objB);
    }

    private static AFh1dSDK getMediationNetwork(JSONObject jSONObject) {
        Object objB;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            objB = p129m8.m.b(mediationNetwork != null ? new AFh1dSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        return (AFh1dSDK) (p129m8.m.f(objB) ? null : objB);
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object objB;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            objB = p129m8.m.b(mediationNetwork != null ? new AFh1bSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        return (AFh1bSDK) (p129m8.m.f(objB) ? null : objB);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(AFh1aSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        return Intrinsics.b(this.getCurrencyIso4217Code, aFh1aSDK.getCurrencyIso4217Code) && Intrinsics.b(this.getMonetizationNetwork, aFh1aSDK.getMonetizationNetwork) && Intrinsics.b(this.AFAdRevenueData, aFh1aSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0) * 31;
        AFh1dSDK aFh1dSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0)) * 31;
        AFi1zSDK aFi1zSDK = this.AFAdRevenueData;
        return iHashCode2 + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(JsonStorageKeyNames.DATA_KEY)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
