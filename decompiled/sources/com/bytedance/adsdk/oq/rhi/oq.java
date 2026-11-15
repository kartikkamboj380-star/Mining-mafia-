package com.bytedance.adsdk.oq.rhi;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static float kq(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float oq(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int kq(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fOq = oq(((i10 >> 16) & 255) / 255.0f);
        float fOq2 = oq(((i10 >> 8) & 255) / 255.0f);
        float fOq3 = oq((i10 & 255) / 255.0f);
        float fOq4 = oq(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fOq5 = fOq2 + ((oq(((i11 >> 8) & 255) / 255.0f) - fOq2) * f10);
        float fOq6 = fOq3 + (f10 * (oq((i11 & 255) / 255.0f) - fOq3));
        return (Math.round(kq(fOq + ((fOq4 - fOq) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(kq(fOq5) * 255.0f) << 8) | Math.round(kq(fOq6) * 255.0f);
    }
}
