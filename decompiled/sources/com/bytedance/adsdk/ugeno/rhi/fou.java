package com.bytedance.adsdk.ugeno.rhi;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static int kq(boolean z9, int i10, int i11) {
        if (i11 == 0 || !z9) {
            return i10;
        }
        int i12 = i10 - 512;
        int iAbs = Math.abs(i12) % i11;
        return (i12 >= 0 || iAbs == 0) ? iAbs : i11 - iAbs;
    }

    public static boolean kq(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
