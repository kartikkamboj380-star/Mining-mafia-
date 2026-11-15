package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class ibd {
    private static final Object kq = new Object();
    private static final Map<kq, Object> oq = new ConcurrentHashMap();
    private static AtomicBoolean bob = new AtomicBoolean(false);
    private static volatile int fou = -1;
    private static volatile long csi = 0;
    private static volatile int rhi = 60000;
    private static gm rjo = null;
    private static final AtomicBoolean syt = new AtomicBoolean(false);

    public interface kq {
        void kq(Context context, Intent intent, boolean z9, int i10);
    }

    private static class oq extends BroadcastReceiver {
        private oq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                boolean z9 = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (ibd.oq != null && ibd.oq.size() > 0) {
                    z9 = true;
                }
                ibd.oq(context, intent, z9, booleanExtra);
            } catch (Throwable unused) {
            }
        }
    }

    private static int bob(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        gm gmVar = rjo;
                        return (gmVar == null || !gmVar.kq(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oq(final Context context, final Intent intent, final boolean z9, final boolean z10) {
        if (!z9 && z10) {
            fou = 0;
        } else if (syt.compareAndSet(false, true)) {
            com.bytedance.sdk.component.syt.rhi.oq(new com.bytedance.sdk.component.syt.syt("getNetworkType") { // from class: com.bytedance.sdk.component.utils.ibd.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = ibd.fou = z10 ? 0 : ibd.oq(context);
                    ibd.syt.set(false);
                    if (z9) {
                        ibd.oq(context, intent, ibd.fou, z10);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oq(Context context, Intent intent, int i10, boolean z9) {
        Map<kq, Object> map = oq;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (kq kqVar : map.keySet()) {
            if (kqVar != null) {
                try {
                    kqVar.kq(context, intent, !z9, i10);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int kq(Context context, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (csi + j10 <= jElapsedRealtime) {
            return oq(context);
        }
        if (fou == -1) {
            return oq(context);
        }
        if (jElapsedRealtime - csi >= rhi) {
            oq(context, (Intent) null, false, false);
        }
        return fou;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int oq(Context context) {
        fou = bob(context);
        csi = SystemClock.elapsedRealtime();
        return fou;
    }

    public static void kq(kq kqVar, Context context) {
        if (kqVar == null) {
            return;
        }
        if (!bob.get()) {
            try {
                context.registerReceiver(new oq(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                bob.set(true);
            } catch (Throwable unused) {
            }
        }
        oq.put(kqVar, kq);
    }

    public static void kq(kq kqVar) {
        if (kqVar == null) {
            return;
        }
        oq.remove(kqVar);
    }
}
