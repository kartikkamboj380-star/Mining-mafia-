package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class ha {
    private static String bob = null;
    private static volatile boolean fou = true;
    private static String kq;
    private static String oq;

    public static class kq extends com.bytedance.sdk.component.syt.syt {
        public static AtomicBoolean kq = new AtomicBoolean(false);
        private static final AtomicLong oq = new AtomicLong(0);

        public kq(String str, int i10) {
            super(str, i10);
        }

        public static void kq() {
            if (kq.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = oq;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            nz.oq((com.bytedance.sdk.component.syt.syt) new kq("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            kq.set(true);
            ha.csi();
            kq.set(false);
        }
    }

    public static String bob() {
        kq.kq();
        return bob;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void csi() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.sns.kq() == null) {
            return;
        }
        fou = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    fou = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                kq = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                oq = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            bob = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String kq() {
        kq.kq();
        return kq;
    }

    public static String oq() {
        try {
            kq.kq();
            if (!fou) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(fou ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.fax.bob("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.sns.kq().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : oq;
            com.bytedance.sdk.component.utils.fax.bob("MCC", "config=" + configuration.mcc + ",sMCC=" + oq);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("SimUtils", th.getMessage());
            return null;
        }
    }
}
