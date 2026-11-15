package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    public static String kq(String str) {
        if (!com.bytedance.sdk.component.utils.nze.fou() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.nn nnVar = new com.bytedance.sdk.openadsdk.core.model.nn(com.bytedance.sdk.openadsdk.core.dgq.oq().wki());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = nnVar.oq().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(nnVar.kq());
                } else {
                    sb.append("?");
                    sb.append(nnVar.kq());
                }
            }
        }
        return sb.toString();
    }
}
