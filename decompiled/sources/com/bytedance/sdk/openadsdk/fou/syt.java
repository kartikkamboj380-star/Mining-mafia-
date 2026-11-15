package com.bytedance.sdk.openadsdk.fou;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.fax;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private static Method bob = null;
    private static boolean csi = false;
    private static Method fou;
    private static Method kq;
    private static Class<?> oq;

    static {
        oq();
    }

    private static boolean bob() {
        return com.bytedance.sdk.openadsdk.jhe.kq.kq("s_i_e", 0) == 1;
    }

    public static JSONObject kq() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i10 = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i10 >= 35 && bob()) {
            oq();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = kq) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i10 >= 36 && obj != null && (method3 = bob) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = fou) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    fax.bob(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return jSONObject;
    }

    private static void oq() {
        int i10;
        if (csi || (i10 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (bob()) {
                kq = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                oq = cls;
                fou = cls.getMethod("getReason", null);
                if (i10 >= 36) {
                    bob = oq.getMethod("getStartComponent", null);
                }
                csi = true;
            }
        } catch (Throwable th) {
            fax.bob(th.getMessage(), new Object[0]);
        }
    }
}
