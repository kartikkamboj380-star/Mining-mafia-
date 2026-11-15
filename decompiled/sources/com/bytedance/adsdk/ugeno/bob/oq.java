package com.bytedance.adsdk.ugeno.bob;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.csi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static String kq(String str, JSONObject jSONObject) {
        kq kqVarBob;
        kq.InterfaceC0223kq interfaceC0223kqKq;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (kqVarBob = csi.kq().bob()) != null && (interfaceC0223kqKq = kqVarBob.kq(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0223kqKq.kq(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
