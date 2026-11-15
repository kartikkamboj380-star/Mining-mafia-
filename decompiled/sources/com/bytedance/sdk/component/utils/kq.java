package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.kq$kq, reason: collision with other inner class name */
    static class C0258kq {
        static final Random kq = kq.bob();
    }

    public static String bob(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strKq = kq(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strKq == null) ? str : com.bytedance.sdk.component.fou.kq.oq(str.substring(49), strSubstring, strKq);
    }

    public static JSONObject kq(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : kq(jSONObject.toString());
    }

    public static String oq(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strKq = kq();
        String strKq2 = kq(strKq, 32);
        String strOq = oq();
        return 3 + strKq + strOq + ((strKq2 == null || strOq == null) ? null : com.bytedance.sdk.component.fou.kq.kq(str, strOq, strKq2));
    }

    public static JSONObject kq(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strOq = oq(str);
                    if (!TextUtils.isEmpty(strOq)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strOq);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static Random bob() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String oq() {
        String strKq = kq(8);
        if (strKq == null || strKq.length() != 16) {
            return null;
        }
        return strKq;
    }

    public static String kq() {
        String strKq = kq(16);
        if (strKq == null || strKq.length() != 32) {
            return null;
        }
        return strKq;
    }

    public static String kq(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String kq(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0258kq.kq.nextBytes(bArr);
            return csi.kq(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
