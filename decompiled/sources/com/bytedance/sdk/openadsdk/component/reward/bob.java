package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.nz;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob extends com.bytedance.sdk.component.syt.syt {
    private final List<? extends com.bytedance.sdk.component.syt.syt> kq;

    public bob(String str, List<? extends com.bytedance.sdk.component.syt.syt> list) {
        super(str);
        this.kq = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.syt.syt> list;
        if (com.bytedance.sdk.component.utils.wcx.bob(com.bytedance.sdk.openadsdk.core.sns.kq()) != 0 && (list = this.kq) != null) {
            Iterator<? extends com.bytedance.sdk.component.syt.syt> it = list.iterator();
            while (it.hasNext()) {
                nz.kq(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.dgq.kq().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
