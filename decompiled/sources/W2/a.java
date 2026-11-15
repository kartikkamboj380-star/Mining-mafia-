package W2;

import O2.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6548a = new a();

    private a() {
    }

    public static final float a(I2.h rotationOptions, I2.g gVar, j encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!j.W(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (gVar == null || gVar.f1617b <= 0 || gVar.f1616a <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iD = f6548a.d(rotationOptions, encodedImage);
        boolean z9 = iD == 90 || iD == 270;
        int height = z9 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z9 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f10 = gVar.f1616a / height;
        float f11 = gVar.f1617b / width;
        float fB = kotlin.ranges.b.b(f10, f11);
        Z1.a.D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(gVar.f1616a), Integer.valueOf(gVar.f1617b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(fB));
        return fB;
    }

    public static final int b(I2.h rotationOptions, I2.g gVar, j encodedImage, int i10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!j.W(encodedImage)) {
            return 1;
        }
        float fA = a(rotationOptions, gVar, encodedImage);
        int iF = encodedImage.G() == D2.b.f440b ? f(fA) : e(fA);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f10 = gVar != null ? gVar.f1618c : i10;
        while (iMax / iF > f10) {
            iF = encodedImage.G() == D2.b.f440b ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static final int c(j encodedImage, int i10, int i11) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iN = encodedImage.N();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i10) / iN) / iN > i11) {
            iN *= 2;
        }
        return iN;
    }

    private final int d(I2.h hVar, j jVar) {
        if (!hVar.h()) {
            return 0;
        }
        int iY0 = jVar.y0();
        if (iY0 == 0 || iY0 == 90 || iY0 == 180 || iY0 == 270) {
            return iY0;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * ((double) 0.33333334f)) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / ((double) i11);
            if (d10 + (((double) 0.33333334f) * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }
}
