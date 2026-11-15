package com.bytedance.adsdk.oq;

import android.content.Context;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static boolean bob = true;
    private static String[] csi = null;
    private static com.bytedance.adsdk.oq.fou.rhi dgq = null;
    private static boolean fou = true;
    public static boolean kq = false;
    private static com.bytedance.adsdk.oq.fou.csi nn = null;
    private static boolean oq = false;
    private static long[] rhi;
    private static int rjo;
    private static int syt;
    private static volatile com.bytedance.adsdk.oq.fou.syt ubx;
    private static volatile com.bytedance.adsdk.oq.fou.rjo vvw;

    public static void kq(String str) {
        if (oq) {
            int i10 = rjo;
            if (i10 == 20) {
                syt++;
                return;
            }
            csi[i10] = str;
            rhi[i10] = System.nanoTime();
            Trace.beginSection(str);
            rjo++;
        }
    }

    public static float oq(String str) {
        int i10 = syt;
        if (i10 > 0) {
            syt = i10 - 1;
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (!oq) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i11 = rjo - 1;
        rjo = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(csi[i11])) {
            Trace.endSection();
            return (System.nanoTime() - rhi[rjo]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + csi[rjo] + ".");
    }

    public static com.bytedance.adsdk.oq.fou.syt kq(Context context) {
        com.bytedance.adsdk.oq.fou.syt sytVar;
        com.bytedance.adsdk.oq.fou.syt sytVar2 = ubx;
        if (sytVar2 != null) {
            return sytVar2;
        }
        synchronized (com.bytedance.adsdk.oq.fou.syt.class) {
            try {
                sytVar = ubx;
                if (sytVar == null) {
                    com.bytedance.adsdk.oq.fou.rjo rjoVarOq = oq(context);
                    com.bytedance.adsdk.oq.fou.rhi oqVar = dgq;
                    if (oqVar == null) {
                        oqVar = new com.bytedance.adsdk.oq.fou.oq();
                    }
                    sytVar = new com.bytedance.adsdk.oq.fou.syt(rjoVarOq, oqVar);
                    ubx = sytVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sytVar;
    }

    public static com.bytedance.adsdk.oq.fou.rjo oq(Context context) {
        com.bytedance.adsdk.oq.fou.rjo rjoVar;
        if (!bob) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.oq.fou.rjo rjoVar2 = vvw;
        if (rjoVar2 != null) {
            return rjoVar2;
        }
        synchronized (com.bytedance.adsdk.oq.fou.rjo.class) {
            try {
                rjoVar = vvw;
                if (rjoVar == null) {
                    com.bytedance.adsdk.oq.fou.csi csiVar = nn;
                    if (csiVar == null) {
                        csiVar = new com.bytedance.adsdk.oq.fou.csi() { // from class: com.bytedance.adsdk.oq.csi.1
                            @Override // com.bytedance.adsdk.oq.fou.csi
                            public File kq() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    rjoVar = new com.bytedance.adsdk.oq.fou.rjo(csiVar);
                    vvw = rjoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rjoVar;
    }

    public static boolean kq() {
        return fou;
    }
}
