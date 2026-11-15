package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vvw {
    private static String bob;
    private static boolean fou;
    private static String kq;
    private static String oq;

    @SuppressLint({"HardwareIds"})
    private static void csi(Context context) {
        if (fou || fou(context) == null) {
            return;
        }
        oq = String.valueOf(Build.TIME);
        bob = bob.kq().oq("uuid", (String) null);
        fou = true;
    }

    private static Context fou(Context context) {
        return context == null ? sns.kq() : context;
    }

    public static String kq(Context context) {
        if (!TextUtils.isEmpty(kq)) {
            return kq;
        }
        rhi(context);
        return kq;
    }

    public static String oq(Context context) {
        if (oq == null && !fou) {
            synchronized (vvw.class) {
                try {
                    if (!fou) {
                        csi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    private static void rhi(Context context) {
        if (fou(context) == null) {
            return;
        }
        String strOq = bob.kq().oq("abcd", (String) null);
        if (TextUtils.isEmpty(strOq)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strOq);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strBob = com.bytedance.sdk.component.utils.kq.bob(strOptString);
                if (TextUtils.isEmpty(strBob)) {
                    return;
                }
                kq = new JSONObject(strBob).optString("abcd");
                kq();
            }
        } catch (Throwable unused) {
        }
    }

    public static String bob(Context context) {
        if (TextUtils.isEmpty(bob) && !fou) {
            synchronized (vvw.class) {
                try {
                    if (!fou) {
                        csi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bob;
    }

    public static void kq(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(kq)) {
                kq = str;
            }
            kq();
        }
        if (TextUtils.isEmpty(kq)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.nn.bob.oq(kq);
        ubx.kq(kq);
    }

    public static String oq() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void kq() {
        if (TextUtils.isEmpty(kq)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.nz.oq(new com.bytedance.sdk.component.syt.syt("update_did") { // from class: com.bytedance.sdk.openadsdk.core.vvw.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", vvw.kq);
                    bob.kq().kq("abcd", com.bytedance.sdk.component.utils.kq.kq(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
