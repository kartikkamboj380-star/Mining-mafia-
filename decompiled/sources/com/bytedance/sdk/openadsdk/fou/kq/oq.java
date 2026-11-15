package com.bytedance.sdk.openadsdk.fou.kq;

import android.content.Context;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.vvw;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static AtomicInteger kq = new AtomicInteger(0);
    public static final AtomicBoolean oq = new AtomicBoolean(false);

    public static void bob() {
        try {
            com.bytedance.sdk.component.rhi.kq.oq.fou();
            com.bytedance.sdk.component.rhi.kq.oq.csi();
        } catch (Throwable th) {
            fax.bob("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void kq(Context context, boolean z9) {
        try {
            if (oq.compareAndSet(false, true)) {
                com.bytedance.sdk.component.rhi.kq.oq.kq(new com.bytedance.sdk.component.rhi.kq.kq.C0251kq().kq(new rjo()).oq(com.bytedance.sdk.component.rhi.kq.fou.oq.kq.bob()).bob(com.bytedance.sdk.component.rhi.kq.fou.oq.kq.csi()).kq(com.bytedance.sdk.component.rhi.kq.fou.oq.kq.fou()).kq(z9).kq(new syt()).kq(csi.kq).oq(sns.fou().nze()).kq(sns.fou().mxq()).kq(sns.fou().mz()).kq(), context);
                oq();
            }
        } catch (Throwable unused) {
            oq.set(false);
        }
    }

    public static void oq() {
        com.bytedance.sdk.component.rhi.kq.oq.bob();
    }

    public static void kq(com.bytedance.sdk.openadsdk.fou.kq kqVar) {
        com.bytedance.sdk.component.rhi.kq.fou.kq.kq kqVar2 = new com.bytedance.sdk.component.rhi.kq.fou.kq.kq(kqVar.fou(), kqVar);
        kqVar2.oq(kqVar.csi() ? (byte) 1 : (byte) 2);
        kqVar2.kq((byte) 0);
        if (com.bytedance.sdk.component.rhi.kq.oq.oq()) {
            kq(sns.kq(), com.bytedance.sdk.openadsdk.multipro.oq.bob());
        }
        com.bytedance.sdk.component.rhi.kq.oq.kq(kqVar2);
    }

    public static com.bytedance.sdk.openadsdk.mxq.bob.bob kq() {
        return dgq.kq;
    }

    public static void kq(final List<String> list, final int i10, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.kq(new com.bytedance.sdk.component.syt.syt("track") { // from class: com.bytedance.sdk.openadsdk.fou.kq.oq.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.rhi.kq.oq.oq()) {
                    oq.kq(sns.kq(), com.bytedance.sdk.openadsdk.multipro.oq.bob());
                }
                com.bytedance.sdk.component.rhi.kq.oq.kq(vvw.kq(sns.kq()), list, true, i10, str);
            }
        });
    }

    public static void kq(String str) {
        kq(str, false);
    }

    public static void kq(String str, boolean z9) {
        if (com.bytedance.sdk.component.rhi.kq.oq.oq()) {
            kq(sns.kq(), com.bytedance.sdk.openadsdk.multipro.oq.bob());
        }
        com.bytedance.sdk.component.rhi.kq.oq.kq(str, z9);
    }
}
