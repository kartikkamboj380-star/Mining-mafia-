package com.bytedance.sdk.openadsdk.multipro.fou;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class oq {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> kq;

    static Map<String, ?> bob(Context context, String str) {
        SharedPreferences sharedPreferencesKq = kq(context, str);
        if (sharedPreferencesKq == null) {
            return null;
        }
        return sharedPreferencesKq.getAll();
    }

    public static SharedPreferences kq(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(kq(str), 0);
        } catch (Throwable th) {
            fax.bob("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static void oq(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = kq;
        if (softReference == null || softReference.get() == null || (map = kq.get().get(kq(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String kq(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object kq(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = kq;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(kq(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static Object oq(Context context, String str, String str2, String str3) {
        String strKq = kq(str);
        if (!kq(context, strKq, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return kq.kq(context, strKq, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(kq.kq(context, strKq, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(kq.kq(context, strKq, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(kq.kq(context, strKq, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(kq.kq(context, strKq, str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return kq.kq(context, strKq, str2, (String) null);
        }
        return null;
    }

    private static void kq(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = kq;
        if (softReference == null || softReference.get() == null) {
            kq = new SoftReference<>(new ConcurrentHashMap());
        }
        String strKq = kq(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = kq.get();
        if (concurrentHashMap.get(strKq) == null) {
            concurrentHashMap.put(strKq, new HashMap());
        }
        concurrentHashMap.get(strKq).put(str2, obj);
    }

    static synchronized <T> void kq(Context context, String str, String str2, T t10) {
        String strKq = kq.kq(str, str2);
        if (dgq.rjo(strKq)) {
            com.bytedance.sdk.component.kq kqVarKq = com.bytedance.sdk.component.kq.kq(context, strKq);
            if (t10.equals(kq(strKq, str2))) {
                return;
            }
            com.bytedance.sdk.component.kq.bob bobVarOq = kqVarKq.oq();
            kq(bobVarOq, str2, (Object) t10);
            bobVarOq.apply();
            kq(strKq, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesKq = kq(context, strKq);
        if (sharedPreferencesKq == null) {
            return;
        }
        if (t10.equals(kq(strKq, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesKq.edit();
        kq(editorEdit, str2, t10);
        editorEdit.apply();
        kq(strKq, str2, t10);
    }

    public static void oq(Context context, String str, String str2) {
        try {
            String strKq = kq.kq(str, str2);
            if (dgq.rjo(strKq)) {
                com.bytedance.sdk.component.kq.kq(context, strKq).oq().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesKq = kq(context, strKq);
            if (sharedPreferencesKq == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesKq.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = kq;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = kq.get().get(kq(strKq));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    static void oq(Context context, String str) {
        if (dgq.rjo(str)) {
            com.bytedance.sdk.component.kq.kq(context, str).oq().clear().apply();
            oq(str);
            return;
        }
        SharedPreferences sharedPreferencesKq = kq(context, str);
        if (sharedPreferencesKq == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesKq.edit();
        editorEdit.clear();
        editorEdit.apply();
        oq(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void kq(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void kq(com.bytedance.sdk.component.kq.bob bobVar, String str, T t10) {
        if (t10 instanceof Integer) {
            bobVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            bobVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            bobVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            bobVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            bobVar.putString(str, (String) t10);
        }
    }

    static String kq(Context context, String str, String str2, String str3) {
        Object objKq = kq(str, str2);
        if (objKq != null) {
            return String.valueOf(objKq);
        }
        Object objOq = oq(context, str, str2, str3);
        kq(str, str2, objOq);
        return String.valueOf(objOq);
    }

    static boolean kq(Context context, String str, String str2) {
        String strKq = kq.kq(str, str2);
        if (dgq.rjo(strKq)) {
            return com.bytedance.sdk.component.kq.kq(context, strKq).kq(str2);
        }
        SharedPreferences sharedPreferencesKq = kq(context, strKq);
        return sharedPreferencesKq != null && sharedPreferencesKq.contains(str2);
    }
}
