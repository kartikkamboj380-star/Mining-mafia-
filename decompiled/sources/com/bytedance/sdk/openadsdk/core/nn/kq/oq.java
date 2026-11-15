package com.bytedance.sdk.openadsdk.core.nn.kq;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import com.unity3d.services.core.di.ServiceProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static volatile oq kq;
    private final ArrayList<String> oq = new ArrayList<>();
    private final AtomicBoolean bob = new AtomicBoolean(false);
    private long fou = System.currentTimeMillis();
    private long csi = 0;
    private long rhi = 0;
    private String rjo = "";
    private String syt = "";
    private String dgq = "";
    private boolean nn = false;
    private boolean ubx = false;

    public static oq kq(Application application) {
        if (kq == null) {
            synchronized (oq.class) {
                try {
                    if (kq == null) {
                        oq oqVar = new oq();
                        kq = oqVar;
                        oqVar.nn = kq((Context) application);
                        kq.ubx = kq(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        kq.kq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public void oq(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.oq.contains(localClassName)) {
            this.oq.remove(localClassName);
        }
        if (this.oq.size() == 0) {
            this.fou = System.currentTimeMillis();
            this.bob.set(true);
            this.syt = localClassName;
        }
    }

    private static int kq(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean kq(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void kq(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.oq.size() == 0) {
            this.rjo = localClassName;
            this.csi = System.currentTimeMillis();
            this.rhi = System.currentTimeMillis() - this.fou;
            this.bob.set(false);
        }
        if (!this.oq.contains(localClassName)) {
            this.oq.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.dgq = localClassName;
    }

    private void kq() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z9 = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objValueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.oq.contains(localClassName)) {
                            this.oq.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.bob;
                if (this.oq.size() > 0) {
                    z9 = false;
                }
                atomicBoolean.set(z9);
            }
        } catch (Throwable unused) {
        }
    }

    public String kq(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.csi;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.bob.get() && this.ubx) {
            i11 |= 2;
        }
        if (!this.bob.get() && this.rhi >= ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT && j11 < 1000) {
            i11 = this.syt.equals(this.dgq) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.rhi).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.bob).put("alert", this.ubx).put("sys", this.nn).put("actsize", this.oq.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.oq.bob()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.rjo = "";
        this.rhi = 0L;
        this.csi = 0L;
        this.fou = System.currentTimeMillis();
        return string;
    }
}
