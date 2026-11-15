package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.suf;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static Boolean kq;

    public static boolean bob() {
        Boolean bool = kq;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!suf.csi()) {
            return false;
        }
        if (kq == null) {
            kq = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.fou.kq.kq("sp_multi_info", "is_support_multi_process", false));
        }
        return kq.booleanValue();
    }

    public static void kq() {
        Boolean bool = Boolean.TRUE;
        kq = bool;
        com.bytedance.sdk.openadsdk.multipro.fou.kq.kq("sp_multi_info", "is_support_multi_process", bool);
    }

    public static void oq() {
        kq = Boolean.FALSE;
        BinderPoolService.kq = true;
    }
}
