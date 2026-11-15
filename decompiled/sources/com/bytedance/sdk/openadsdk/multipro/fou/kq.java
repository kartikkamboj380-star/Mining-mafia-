package com.bytedance.sdk.openadsdk.multipro.fou;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.rhi;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.sns;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static HashSet<String> kq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.fou.kq.1
        {
            add("app_id");
            add("tt_gdpr");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static Context bob() {
        return sns.kq();
    }

    private static String fou() {
        return com.bytedance.sdk.openadsdk.multipro.fou.oq + "/t_sp/";
    }

    public static boolean kq() {
        return sns.kq() != null;
    }

    private static rhi oq() {
        try {
            if (kq()) {
                return com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(sns.kq());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void kq(String str, String str2, Boolean bool) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    oq.kq(bob(), str, str2, bool);
                    return;
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    Uri uri = Uri.parse(fou() + "boolean/" + str2 + oq(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    rhiVarOq.kq(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String oq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String oq(String str, String str2, String str3) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    return kq(bob(), str, str2, str3);
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    String strKq = rhiVarOq.kq(Uri.parse(fou() + "string/" + str2 + oq(str)));
                    if (strKq != null && !strKq.equals("null")) {
                        return strKq;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static void oq(String str, String str2) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    oq.oq(bob(), str, str2);
                    return;
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    rhiVarOq.kq(Uri.parse(fou() + "long/" + str2 + oq(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void kq(String str, String str2, String str3) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    oq.kq(bob(), str, str2, str3);
                    return;
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    Uri uri = Uri.parse(fou() + "string/" + str2 + oq(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    rhiVarOq.kq(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void kq(String str, String str2, Integer num) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    oq.kq(bob(), str, str2, num);
                    return;
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    Uri uri = Uri.parse(fou() + "int/" + str2 + oq(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    rhiVarOq.kq(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void kq(String str, String str2, Long l10) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    oq.kq(bob(), str, str2, l10);
                    return;
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    Uri uri = Uri.parse(fou() + "long/" + str2 + oq(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l10);
                    rhiVarOq.kq(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected static String kq(Context context, String str, String str2, String str3) {
        String strKq = kq(str, str2);
        if (dgq.rjo(strKq)) {
            return com.bytedance.sdk.component.kq.kq(context, strKq).kq(str2, str3);
        }
        SharedPreferences sharedPreferencesKq = oq.kq(context, strKq);
        return sharedPreferencesKq == null ? str3 : sharedPreferencesKq.getString(str2, str3);
    }

    public static String kq(String str, String str2) {
        return kq.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int kq(String str, String str2, int i10) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    return kq(bob(), str, str2, i10);
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    String strKq = rhiVarOq.kq(Uri.parse(fou() + "int/" + str2 + oq(str)));
                    if (strKq != null && !strKq.equals("null")) {
                        return Integer.parseInt(strKq);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    protected static int kq(Context context, String str, String str2, int i10) {
        String strKq = kq(str, str2);
        if (dgq.rjo(strKq)) {
            return com.bytedance.sdk.component.kq.kq(context, strKq).kq(str2, i10);
        }
        SharedPreferences sharedPreferencesKq = oq.kq(context, strKq);
        return sharedPreferencesKq == null ? i10 : sharedPreferencesKq.getInt(str2, i10);
    }

    protected static float kq(Context context, String str, String str2, float f10) {
        String strKq = kq(str, str2);
        if (dgq.rjo(strKq)) {
            return com.bytedance.sdk.component.kq.kq(context, strKq).kq(str2, f10);
        }
        SharedPreferences sharedPreferencesKq = oq.kq(context, strKq);
        return sharedPreferencesKq == null ? f10 : sharedPreferencesKq.getFloat(str2, f10);
    }

    public static boolean kq(String str, String str2, boolean z9) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    return kq(bob(), str, str2, z9);
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    String strKq = rhiVarOq.kq(Uri.parse(fou() + "boolean/" + str2 + oq(str)));
                    if (strKq != null && !strKq.equals("null")) {
                        return Boolean.parseBoolean(strKq);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z9;
    }

    protected static boolean kq(Context context, String str, String str2, boolean z9) {
        String strKq = kq(str, str2);
        if (dgq.rjo(strKq)) {
            return com.bytedance.sdk.component.kq.kq(context, strKq).kq(str2, z9);
        }
        SharedPreferences sharedPreferencesKq = oq.kq(context, strKq);
        return sharedPreferencesKq == null ? z9 : sharedPreferencesKq.getBoolean(str2, z9);
    }

    public static long kq(String str, String str2, long j10) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    return kq(bob(), str, str2, j10);
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    String strKq = rhiVarOq.kq(Uri.parse(fou() + "long/" + str2 + oq(str)));
                    if (strKq != null && !strKq.equals("null")) {
                        return Long.parseLong(strKq);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return j10;
    }

    protected static long kq(Context context, String str, String str2, long j10) {
        String strKq = kq(str, str2);
        if (dgq.rjo(strKq)) {
            return com.bytedance.sdk.component.kq.kq(context, strKq).kq(str2, j10);
        }
        SharedPreferences sharedPreferencesKq = oq.kq(context, strKq);
        return sharedPreferencesKq == null ? j10 : sharedPreferencesKq.getLong(str2, j10);
    }

    public static void kq(String str) {
        if (kq()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    oq.oq(bob(), str);
                    return;
                }
                rhi rhiVarOq = oq();
                if (rhiVarOq != null) {
                    rhiVarOq.kq(Uri.parse(fou() + "clean" + oq(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
