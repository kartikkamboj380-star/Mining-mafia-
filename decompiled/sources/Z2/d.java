package Z2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7140a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f7141b = p129m8.g.a(new Function0() { // from class: Z2.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f7143d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7144a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7144a = iArr;
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N.e b() {
        return new N.e(12);
    }

    private final ByteBuffer c() {
        return f7142c ? p013b2.b.f11577a.b() : (ByteBuffer) g().b();
    }

    public static final Pair d(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        d dVar = f7140a;
        ByteBuffer byteBufferK = dVar.k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferK.array();
            Pair pair = null;
            dVar.f(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f7140a.l(byteBufferK);
        }
    }

    public static final f e(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        d dVar = f7140a;
        ByteBuffer byteBufferK = dVar.k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferK.array();
            dVar.f(inputStream, null, options);
            return new f(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
        } finally {
            f7140a.l(byteBufferK);
        }
    }

    private final N.e g() {
        return (N.e) f7141b.getValue();
    }

    public static final int h(Bitmap.Config config) {
        switch (config == null ? -1 : a.f7144a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int i(int i10, int i11, Bitmap.Config config) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i10).toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i11).toString());
        }
        int iH = h(config);
        int i12 = i10 * i11 * iH;
        if (i12 > 0) {
            return i12;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i12 + ", width: " + i10 + ", height: " + i11 + ", pixelSize: " + iH).toString());
    }

    public static final int j(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer k() {
        ByteBuffer byteBufferC = c();
        if (byteBufferC != null) {
            return byteBufferC;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(p013b2.b.e());
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    private final void l(ByteBuffer byteBuffer) {
        if (f7142c) {
            return;
        }
        g().a(byteBuffer);
    }

    public final Bitmap f(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (!f7143d) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
