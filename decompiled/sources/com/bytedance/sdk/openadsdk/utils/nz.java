package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nz {
    private static volatile com.bytedance.sdk.component.syt.bob.rhi bob;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi csi;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi dgq;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi fou;
    private static volatile ThreadPoolExecutor kq;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi nn;
    private static volatile boolean oq;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi rhi;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi rjo;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi syt;
    private static volatile com.bytedance.sdk.component.syt.bob.rhi ubx;

    static {
        com.bytedance.sdk.component.syt.bob.bob.kq(new com.bytedance.sdk.component.syt.bob.kq() { // from class: com.bytedance.sdk.openadsdk.utils.nz.1
            @Override // com.bytedance.sdk.component.syt.bob.kq
            public void kq(com.bytedance.sdk.component.syt.bob.rhi rhiVar, com.bytedance.sdk.component.syt.bob.oq oqVar) {
                oqVar.oq();
                new RuntimeException();
            }
        });
        kq = null;
        oq = false;
    }

    public static ExecutorService bob() {
        return sns();
    }

    public static ExecutorService csi() {
        return dgq();
    }

    public static com.bytedance.sdk.component.syt.bob.rhi dgq() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = rhi;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(rhi)) {
                    try {
                        rhi = kq("cache", rhi);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = rhi;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    public static ExecutorService fou() {
        return wki();
    }

    public static ScheduledExecutorService kq() {
        return com.bytedance.sdk.component.syt.rhi.fou();
    }

    private static com.bytedance.sdk.component.syt.bob.rhi mxq() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = rjo;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(rjo)) {
                    try {
                        rjo = kq("io", rjo);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = rjo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    public static com.bytedance.sdk.component.syt.bob.rhi nn() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = dgq;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(dgq)) {
                    try {
                        dgq = kq("express", dgq);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = dgq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    private static com.bytedance.sdk.component.syt.bob.rhi nze() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = syt;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(syt)) {
                    try {
                        syt = kq("image", syt);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = syt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    public static ExecutorService oq() {
        return nze();
    }

    public static boolean rhi() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean rjo() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    private static com.bytedance.sdk.component.syt.bob.rhi sns() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = ubx;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(ubx)) {
                    try {
                        ubx = kq("imgdisk", ubx);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = ubx;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    private static com.bytedance.sdk.component.syt.bob.rhi suf() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = csi;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(csi)) {
                    try {
                        csi = kq("aidl", csi);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = csi;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    public static ExecutorService syt() {
        return mxq();
    }

    public static com.bytedance.sdk.component.syt.bob.rhi ubx() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = nn;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(nn)) {
                    try {
                        nn = kq("net", nn);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = nn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    private static ThreadPoolExecutor vvw() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = bob;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(bob)) {
                    try {
                        bob = kq("ad", bob);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = bob;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    private static com.bytedance.sdk.component.syt.bob.rhi wki() {
        com.bytedance.sdk.component.syt.bob.rhi rhiVar;
        com.bytedance.sdk.component.syt.bob.rhi rhiVar2 = fou;
        if (!kq(rhiVar2)) {
            return rhiVar2;
        }
        synchronized (nz.class) {
            try {
                if (kq(fou)) {
                    try {
                        fou = kq("log", fou);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                rhiVar = fou;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rhiVar;
    }

    public static void bob(final com.bytedance.sdk.component.syt.syt sytVar) {
        if (sytVar == null || ktb.kq) {
            return;
        }
        wki().execute(new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.5
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        });
    }

    public static void csi(final com.bytedance.sdk.component.syt.syt sytVar) {
        if (ktb.kq) {
            return;
        }
        vvw().execute(new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName(), sytVar) { // from class: com.bytedance.sdk.openadsdk.utils.nz.9
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        });
    }

    public static void fou(final com.bytedance.sdk.component.syt.syt sytVar) {
        if (sytVar == null || ktb.kq) {
            return;
        }
        vvw().execute(new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.7
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        });
    }

    public static void kq(Runnable runnable) {
        if (runnable == null || ktb.kq) {
            return;
        }
        if (rhi()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.suf.bob().post(runnable);
        }
    }

    public static void oq(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.suf.bob().removeCallbacks(runnable);
    }

    public static void oq(final com.bytedance.sdk.component.syt.syt sytVar) {
        if (ktb.kq) {
            return;
        }
        mxq().execute(new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.3
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        });
    }

    public static void bob(final com.bytedance.sdk.component.syt.syt sytVar, int i10) {
        if (sytVar == null || ktb.kq) {
            return;
        }
        suf().execute(new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.8
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        });
    }

    public static void oq(final com.bytedance.sdk.component.syt.syt sytVar, int i10) {
        if (sytVar == null || ktb.kq) {
            return;
        }
        com.bytedance.sdk.component.syt.bob.oq oqVar = new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.6
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        };
        oqVar.kq(i10);
        wki().execute(oqVar);
    }

    public static void kq(final com.bytedance.sdk.component.syt.syt sytVar) {
        if (ktb.kq) {
            return;
        }
        dgq().execute(new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.2
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        });
    }

    public static void kq(final com.bytedance.sdk.component.syt.syt sytVar, int i10) {
        if (sytVar == null || ktb.kq) {
            return;
        }
        com.bytedance.sdk.component.syt.bob.oq oqVar = new com.bytedance.sdk.component.syt.bob.oq(sytVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.nz.4
            @Override // java.lang.Runnable
            public void run() {
                sytVar.run();
            }
        };
        oqVar.kq(i10);
        mxq().execute(oqVar);
    }

    private static com.bytedance.sdk.component.syt.bob.rhi.kq oq(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.syt.bob.rhi.kq kqVar = new com.bytedance.sdk.component.syt.bob.rhi.kq();
        str.getClass();
        switch (str) {
            case "express":
                return kqVar.kq(str).kq(2).oq(4).bob(0).kq(10000L).kq(true).csi(-1).fou(10).oq(false);
            case "ad":
                return kqVar.kq(str).kq(4).oq(4).bob(0).kq(20000L).kq(true).csi(-1).fou(10).oq(false);
            case "io":
                return kqVar.kq(str).kq(4).oq(10).bob(0).kq(20000L).kq(true).csi(-1).fou(10).oq(false);
            case "log":
                return kqVar.kq(str).kq(4).oq(6).bob(2).kq(20000L).kq(true).csi(-1).fou(10).oq(false);
            case "net":
                return kqVar.kq(str).kq(10).oq(10).bob(0).kq(10000L).kq(true).csi(-1).fou(10).oq(false);
            case "aidl":
                return kqVar.kq(str).kq(2).oq(4).bob(0).kq(10000L).kq(true).csi(-1).fou(10).oq(false);
            case "cache":
                return kqVar.kq(str).kq(0).oq(0).bob(0).kq(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT).kq(true).csi(-1).fou(20).oq(false);
            case "image":
                return kqVar.kq(str).kq(3).oq(3).bob(0).kq(20000L).kq(true).csi(-1).fou(10).oq(false);
            case "monitor":
                return kqVar.kq(str).kq(2).oq(2).bob(0).kq(10000L).kq(true).csi(-1).fou(10).oq(false);
            case "imgdisk":
                return kqVar.kq(str).kq(1).oq(2).bob(3).kq(10000L).kq(true).csi(-1).fou(10).oq(false);
            default:
                return kqVar.kq(str).kq(8).oq(16).bob(2).kq(20000L).kq(true).csi(-1).fou(10).oq(false);
        }
    }

    public static void kq(com.bytedance.sdk.component.syt.bob.oq oqVar) {
        ubx().execute(oqVar);
    }

    private static boolean kq(com.bytedance.sdk.component.syt.bob.rhi rhiVar) {
        if (rhiVar != null) {
            return !rhiVar.kq() && com.bytedance.sdk.openadsdk.core.settings.ubx.et();
        }
        return true;
    }

    private static com.bytedance.sdk.component.syt.bob.rhi kq(String str, com.bytedance.sdk.component.syt.bob.rhi rhiVar) {
        com.bytedance.sdk.component.syt.bob.rhi.kq kqVarKq = kq(str);
        if (rhiVar == null) {
            return kqVarKq.kq();
        }
        rhiVar.kq(kqVarKq);
        return rhiVar;
    }

    private static com.bytedance.sdk.component.syt.bob.rhi.kq kq(String str) {
        com.bytedance.sdk.component.syt.bob.rhi.kq kqVarOq = oq(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.ubx.et()) {
                kqVarOq.oq(true);
                JSONObject jSONObjectRul = com.bytedance.sdk.openadsdk.core.settings.ubx.bob().rul();
                JSONObject jSONObjectOptJSONObject = jSONObjectRul != null ? jSONObjectRul.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    kqVarOq.oq(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        kqVarOq.kq(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        kqVarOq.oq(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        kqVarOq.bob(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        kqVarOq.kq(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        kqVarOq.kq(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return kqVarOq;
        } catch (Throwable th) {
            th.getMessage();
            return kqVarOq;
        }
    }
}
