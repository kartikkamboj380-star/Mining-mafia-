package com.bytedance.sdk.component.rhi.kq.oq;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.kq.csi;
import com.bytedance.sdk.component.rhi.kq.syt;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static boolean bob() {
        csi csiVarFou = syt.rjo().fou();
        return (csiVarFou == null || TextUtils.isEmpty(csiVarFou.fou())) ? false : true;
    }

    public static boolean csi() {
        csi csiVarFou = syt.rjo().fou();
        return (csiVarFou == null || TextUtils.isEmpty(csiVarFou.bob())) ? false : true;
    }

    public static boolean fou() {
        csi csiVarFou = syt.rjo().fou();
        return (csiVarFou == null || TextUtils.isEmpty(csiVarFou.csi())) ? false : true;
    }

    public static long kq(int i10, Context context) {
        return oq(i10, context);
    }

    private static long oq(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static boolean rhi() {
        csi csiVarFou = syt.rjo().fou();
        return (csiVarFou == null || TextUtils.isEmpty(csiVarFou.rhi())) ? false : true;
    }

    public static boolean kq() {
        csi csiVarFou = syt.rjo().fou();
        return (csiVarFou == null || TextUtils.isEmpty(csiVarFou.kq())) ? false : true;
    }

    public static boolean oq() {
        csi csiVarFou = syt.rjo().fou();
        return (csiVarFou == null || TextUtils.isEmpty(csiVarFou.oq())) ? false : true;
    }
}
