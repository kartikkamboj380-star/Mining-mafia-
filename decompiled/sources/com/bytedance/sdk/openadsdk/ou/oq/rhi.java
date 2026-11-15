package com.bytedance.sdk.openadsdk.ou.oq;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.xn;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    public static boolean kq(View view, int i10) {
        return kq(view, false, i10);
    }

    public static boolean kq(View view, boolean z9, int i10) {
        if (view == null) {
            return false;
        }
        return xn.kq(view, z9 ? 30 : 50, i10, false);
    }
}
