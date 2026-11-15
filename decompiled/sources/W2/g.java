package W2;

import O2.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f6557d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6560c = "SimpleImageTranscoder";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat b(D2.c cVar) {
            if (cVar == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (cVar == D2.b.f440b) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (cVar == D2.b.f441c) {
                return Bitmap.CompressFormat.PNG;
            }
            return D2.b.a(cVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        private a() {
        }
    }

    public g(boolean z9, int i10) {
        this.f6558a = z9;
        this.f6559b = i10;
    }

    private final int e(j jVar, I2.h hVar, I2.g gVar) {
        if (this.f6558a) {
            return W2.a.b(hVar, gVar, jVar, this.f6559b);
        }
        return 1;
    }

    @Override // W2.c
    public String a() {
        return this.f6560c;
    }

    @Override // W2.c
    public boolean b(j encodedImage, I2.h hVar, I2.g gVar) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (hVar == null) {
            hVar = I2.h.f1620c.a();
        }
        return this.f6558a && W2.a.b(hVar, gVar, encodedImage, this.f6559b) > 1;
    }

    @Override // W2.c
    public b c(j encodedImage, OutputStream outputStream, I2.h hVar, I2.g gVar, D2.c cVar, Integer num, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        I2.h hVarA = hVar == null ? I2.h.f1620c.a() : hVar;
        int iE = e(encodedImage, hVarA, gVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iE;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.J(), null, options);
            if (bitmapDecodeStream == null) {
                Z1.a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix matrixG = e.g(encodedImage, hVarA);
            if (matrixG != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    Z1.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar;
                } catch (Throwable th) {
                    th = th;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(f6557d.b(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(iE > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    Z1.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar3 = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e12) {
            Z1.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e12);
            return new b(2);
        }
    }

    @Override // W2.c
    public boolean d(D2.c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == D2.b.f450l || imageFormat == D2.b.f440b;
    }
}
