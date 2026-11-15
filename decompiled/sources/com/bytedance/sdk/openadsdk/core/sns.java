package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class sns {
    private static int bob = -1;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context kq;
    private static volatile jhe<com.bytedance.sdk.openadsdk.fou.kq> oq;

    private static class kq {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application kq;

        static {
            try {
                Object objOq = oq();
                kq = (Application) objOq.getClass().getMethod("getApplication", null).invoke(objOq, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.kq("MyApplication", "application get failed", th);
            }
        }

        public static Application kq() {
            return kq;
        }

        private static Object oq() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.kq("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static jhe<com.bytedance.sdk.openadsdk.fou.kq> bob() {
        if (oq == null) {
            synchronized (sns.class) {
                try {
                    if (oq == null) {
                        oq = new uml(kq);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    public static com.bytedance.sdk.openadsdk.mxq.bob.bob csi() {
        return !com.bytedance.sdk.openadsdk.core.settings.rjo.kq() ? com.bytedance.sdk.openadsdk.mxq.bob.fou.kq() : com.bytedance.sdk.openadsdk.fou.kq.oq.kq();
    }

    public static com.bytedance.sdk.openadsdk.core.settings.ubx fou() {
        return com.bytedance.sdk.openadsdk.core.settings.ubx.bob();
    }

    public static Context kq() {
        if (kq == null) {
            oq(null);
        }
        return kq;
    }

    public static void oq(Context context) {
        if (kq == null) {
            synchronized (sns.class) {
                try {
                    if (kq == null) {
                        if (context != null) {
                            kq = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                kq = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationKq = kq.kq();
                            if (applicationKq != null) {
                                kq = applicationKq;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Context kq(Context context) {
        if (context == null) {
            context = kq();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int oq() {
        Context contextKq;
        if (bob < 0 && (contextKq = kq()) != null) {
            bob = ViewConfiguration.get(contextKq).getScaledTouchSlop();
        }
        return bob;
    }
}
