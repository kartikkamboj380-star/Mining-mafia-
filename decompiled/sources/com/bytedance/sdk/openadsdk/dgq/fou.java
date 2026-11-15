package com.bytedance.sdk.openadsdk.dgq;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.xn;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fou extends kq {
    public static bob kq;

    public static String kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, String str) {
        bob bobVarKq;
        Map map;
        if (!xn.bob() || (bobVarKq = oq.kq("net")) == null || (map = (Map) bobVarKq.kq(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                bobVar.oq(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
