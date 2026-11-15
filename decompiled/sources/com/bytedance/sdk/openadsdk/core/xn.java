package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class xn {
    private static int bob(View view, int i10) {
        if (i10 == 3) {
            return bss.csi(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean kq(View view, int i10) {
        float fKq = kq(view);
        return fKq > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fKq >= ((float) i10) / 100.0f;
    }

    private static boolean oq(View view) {
        return view != null && view.isShown();
    }

    public static float kq(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int oq(View view, int i10) {
        if (i10 == 3) {
            return (int) (((double) bss.bob(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static int oq(View view, int i10, int i11, boolean z9) {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!oq(view)) {
            return 1;
        }
        if (kq(view, i11, z9)) {
            return !kq(view, i10) ? 3 : 0;
        }
        return 6;
    }

    private static boolean kq(View view, int i10, boolean z9) {
        int iOq = oq(view, i10);
        int iBob = bob(view, i10);
        if (i10 == 1 && z9) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iOq && view.getHeight() >= iBob;
    }

    public static boolean kq(View view, int i10, int i11, boolean z9) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.dgq.fax) || (view instanceof com.bytedance.sdk.openadsdk.core.fou.fou)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z9) {
                i10 = 0;
            }
        }
        return oq(view, i10, i11, z9) == 0;
    }
}
