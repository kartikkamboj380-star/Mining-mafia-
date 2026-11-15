package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wf {
    private static final Map<String, wf> kq = new HashMap();
    private SharedPreferences oq;

    private wf(String str, Context context) {
        if (context != null) {
            this.oq = context.getSharedPreferences(str, 0);
        }
    }

    public static wf kq(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, wf> map = kq;
        wf wfVar = map.get(str);
        if (wfVar != null) {
            return wfVar;
        }
        synchronized (wf.class) {
            if (wfVar == null) {
                try {
                    wfVar = new wf(str, com.bytedance.sdk.openadsdk.core.sns.kq());
                } catch (Throwable th) {
                    throw th;
                }
            }
            map.put(str, wfVar);
        }
        return wfVar;
    }

    public String kq(String str, String str2) {
        try {
            return this.oq.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void kq(String str) {
        try {
            this.oq.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
