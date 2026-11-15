package com.bytedance.sdk.openadsdk.core.vvw;

import android.text.TextUtils;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    private final String bob;
    private final String fou;
    private final String kq;
    private final URL oq;

    private nn(String str, String str2, String str3, String str4) {
        this.kq = str2;
        this.oq = new URL(str);
        this.bob = str3;
        this.fou = str4;
    }

    public URL bob() {
        return this.oq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        if (kq(this.kq, nnVar.kq) && kq(this.oq, nnVar.oq) && kq(this.bob, nnVar.bob)) {
            return kq(this.fou, nnVar.fou);
        }
        return false;
    }

    public JSONObject fou() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.oq.toString());
            if (!TextUtils.isEmpty(this.kq)) {
                jSONObject.put("vendorKey", this.kq);
            }
            if (!TextUtils.isEmpty(this.bob)) {
                jSONObject.put("verificationParameters", this.bob);
            }
            if (!TextUtils.isEmpty(this.fou)) {
                jSONObject.put("verificationNotExecuted", this.fou);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int hashCode() {
        String str = this.kq;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.oq.hashCode()) * 31;
        String str2 = this.bob;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fou;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String kq() {
        return this.kq;
    }

    public String oq() {
        return this.bob;
    }

    private boolean kq(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static nn kq(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new nn(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static nn kq(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new nn(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<nn> kq(JSONArray jSONArray) {
        HashSet<nn> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(kq(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
