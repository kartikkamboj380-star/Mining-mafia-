package com.bytedance.sdk.openadsdk.multipro.fou;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.sns;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private static boolean kq() {
        return sns.kq() == null;
    }

    private static String oq(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void kq(String str, String str2, Boolean bool) {
        if (kq()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            kq.kq(oq(str), str2, bool);
        } else {
            kq(oq(str), str2, bool);
        }
    }

    public static String oq(String str, String str2, String str3) {
        if (kq()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            return kq.oq(oq(str), str2, str3);
        }
        return kq.kq(sns.kq(), oq(str), str2, str3);
    }

    public static void kq(String str, String str2, Long l10) {
        if (kq()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            kq.kq(oq(str), str2, l10);
        } else {
            kq(oq(str), str2, l10);
        }
    }

    public static void kq(String str, String str2, String str3) {
        if (kq()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            kq.kq(oq(str), str2, str3);
        } else {
            kq(oq(str), str2, str3);
        }
    }

    public static void kq(String str, String str2, Integer num) {
        if (kq()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            kq.kq(oq(str), str2, num);
        } else {
            kq(oq(str), str2, num);
        }
    }

    public static int kq(String str, String str2, int i10) {
        if (kq()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            return kq.kq(oq(str), str2, i10);
        }
        return kq.kq(sns.kq(), oq(str), str2, i10);
    }

    public static boolean kq(String str, String str2, boolean z9) {
        if (kq()) {
            return z9;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            return kq.kq(oq(str), str2, z9);
        }
        return kq.kq(sns.kq(), oq(str), str2, z9);
    }

    public static long kq(String str, String str2, long j10) {
        if (kq()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            return kq.kq(oq(str), str2, j10);
        }
        return kq.kq(sns.kq(), oq(str), str2, j10);
    }

    public static void kq(String str, String str2) {
        if (kq()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                kq.oq(oq(str), str2);
            } else {
                oq.oq(sns.kq(), oq(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void kq(String str) {
        if (kq()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            kq.kq(oq(str));
        } else {
            oq.oq(sns.kq(), oq(str));
        }
    }

    private static <T> void kq(String str, String str2, T t10) {
        String strKq = kq.kq(str, str2);
        if (dgq.rjo(strKq)) {
            com.bytedance.sdk.component.kq.bob bobVarOq = com.bytedance.sdk.component.kq.kq(sns.kq(), oq(strKq)).oq();
            oq.kq(bobVarOq, str2, (Object) t10);
            bobVarOq.apply();
        } else {
            SharedPreferences sharedPreferencesKq = oq.kq(sns.kq(), oq(strKq));
            if (sharedPreferencesKq == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesKq.edit();
            oq.kq(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}
