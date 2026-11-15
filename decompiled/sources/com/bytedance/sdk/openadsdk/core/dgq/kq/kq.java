package com.bytedance.sdk.openadsdk.core.dgq.kq;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    @NonNull
    public static Pair<Float, Float> kq(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArrKq = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrKq[0] = bss.bob(window.getContext(), fArrKq[0]);
        float fBob = bss.bob(window.getContext(), fArrKq[1]);
        fArrKq[1] = fBob;
        if (fArrKq[0] < 10.0f || fBob < 10.0f) {
            fArrKq = kq(window.getContext(), bss.bob(window.getContext(), bss.kq()), i10);
        }
        float fMax = Math.max(fArrKq[0], fArrKq[1]);
        float fMin = Math.min(fArrKq[0], fArrKq[1]);
        if (i10 == 1) {
            fArrKq[0] = fMin;
            fArrKq[1] = fMax;
        } else {
            fArrKq[0] = fMax;
            fArrKq[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrKq[0]), Float.valueOf(fArrKq[1]));
    }

    public static float oq(Context context) {
        return bss.bob(context, bss.wki(context));
    }

    private static float[] kq(Context context, int i10, int i11) {
        float fKq = kq(context);
        float fOq = oq(context);
        if ((i11 == 1) != (fKq > fOq)) {
            float f10 = fKq + fOq;
            fOq = f10 - fOq;
            fKq = f10 - fOq;
        }
        if (i11 == 1) {
            fKq -= i10;
        } else {
            fOq -= i10;
        }
        return new float[]{fOq, fKq};
    }

    public static float kq(Context context) {
        return bss.bob(context, bss.vvw(context));
    }
}
