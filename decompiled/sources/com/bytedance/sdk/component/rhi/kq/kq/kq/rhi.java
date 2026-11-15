package com.bytedance.sdk.component.rhi.kq.kq.kq;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    public static String kq(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 10);
    }

    public static String oq(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str, 10));
    }
}
