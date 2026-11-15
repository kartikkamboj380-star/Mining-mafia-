package com.bytedance.adsdk.ugeno.fou;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vvw {
    public static rhi.kq kq(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        rhi.kq kqVar = new rhi.kq();
        String strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(str, jSONObject);
        if (strKq.contains("#")) {
            strKq = strKq.replace("#", "%23");
        }
        Uri uri = Uri.parse(strKq);
        if (uri == null) {
            return null;
        }
        kqVar.bob(strKq);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            kqVar.kq(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        kqVar.oq(authority);
        kqVar.fou(kqVar.kq() + "://" + kqVar.oq());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.bob.oq.kq(uri.getQueryParameter(str2), jSONObject));
            }
        }
        kqVar.kq(map);
        return kqVar;
    }
}
