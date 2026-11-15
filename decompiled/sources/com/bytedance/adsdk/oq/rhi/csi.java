package com.bytedance.adsdk.oq.rhi;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.oq.bob.oq.suf;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static final PointF kq = new PointF();

    public static boolean bob(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static float kq(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    private static int oq(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int kq(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static PointF kq(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float oq(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void kq(suf sufVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFKq = sufVar.kq();
        path.moveTo(pointFKq.x, pointFKq.y);
        kq.set(pointFKq.x, pointFKq.y);
        int i10 = 0;
        while (i10 < sufVar.bob().size()) {
            com.bytedance.adsdk.oq.bob.kq kqVar = sufVar.bob().get(i10);
            PointF pointFKq2 = kqVar.kq();
            PointF pointFOq = kqVar.oq();
            PointF pointFBob = kqVar.bob();
            PointF pointF = kq;
            if (pointFKq2.equals(pointF) && pointFOq.equals(pointFBob)) {
                path.lineTo(pointFBob.x, pointFBob.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFKq2.x, pointFKq2.y, pointFOq.x, pointFOq.y, pointFBob.x, pointFBob.y);
            }
            pointF.set(pointFBob.x, pointFBob.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (sufVar.oq()) {
            path3.close();
        }
    }

    static int kq(float f10, float f11) {
        return kq((int) f10, (int) f11);
    }

    private static int kq(int i10, int i11) {
        return i10 - (i11 * oq(i10, i11));
    }

    public static int kq(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
