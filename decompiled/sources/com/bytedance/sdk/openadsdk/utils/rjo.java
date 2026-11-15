package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private static long bob = 0;
    static int kq = -1;
    static float oq;

    public static class kq {
        public final int kq;
        public final float oq;

        public kq(int i10, float f10) {
            this.kq = i10;
            this.oq = f10;
        }
    }

    private static void kq(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            kq = 1;
        } else {
            kq = 0;
        }
        oq = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static kq kq() {
        if (bob == 0 || SystemClock.elapsedRealtime() - bob > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.sns.kq().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                kq(intentRegisterReceiver);
                bob = SystemClock.elapsedRealtime();
            }
        }
        return new kq(kq, oq);
    }
}
