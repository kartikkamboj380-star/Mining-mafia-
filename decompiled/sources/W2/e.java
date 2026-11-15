package W2;

import O2.j;
import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6550a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y1.f f6551b;

    static {
        Y1.f fVarD = Y1.f.d(2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(fVarD, "of(...)");
        f6551b = fVarD;
    }

    private e() {
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(I2.g gVar, int i10, int i11) {
        if (gVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float fMax = Math.max(gVar.f1616a / f10, gVar.f1617b / f11);
        float f12 = f10 * fMax;
        float f13 = gVar.f1618c;
        if (f12 > f13) {
            fMax = f13 / f10;
        }
        return f11 * fMax > f13 ? f13 / f11 : fMax;
    }

    private final int c(j jVar) {
        int iY0 = jVar.y0();
        if (iY0 == 90 || iY0 == 180 || iY0 == 270) {
            return jVar.y0();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(I2.h rotationOptions, j encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iN0 = encodedImage.n0();
        Y1.f fVar = f6551b;
        int iIndexOf = fVar.indexOf(Integer.valueOf(iN0));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e10 = fVar.get((iIndexOf + ((!rotationOptions.h() ? rotationOptions.f() : 0) / 90)) % fVar.size());
        Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int e(I2.h rotationOptions, j encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.g()) {
            return 0;
        }
        int iC = f6550a.c(encodedImage);
        return rotationOptions.h() ? iC : (iC + rotationOptions.f()) % 360;
    }

    public static final int f(I2.h rotationOptions, I2.g gVar, j encodedImage, boolean z9) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!z9 || gVar == null) {
            return 8;
        }
        int iE = e(rotationOptions, encodedImage);
        int iD = f6551b.contains(Integer.valueOf(encodedImage.n0())) ? d(rotationOptions, encodedImage) : 0;
        boolean z10 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(gVar, z10 ? encodedImage.getHeight() : encodedImage.getWidth(), z10 ? encodedImage.getWidth() : encodedImage.getHeight()), gVar.f1619d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static final Matrix g(j encodedImage, I2.h rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (f6551b.contains(Integer.valueOf(encodedImage.n0()))) {
            return f6550a.h(d(rotationOptions, encodedImage));
        }
        int iE = e(rotationOptions, encodedImage);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    private final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8));
    }
}
