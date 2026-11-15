package p073h2;

import java.io.UnsupportedEncodingException;
import p070h.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f44749a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f44750b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f44751c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f44752d = a("RIFF");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f44753e = a("WEBP");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f44754f = a("VP8 ");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f44755g = a("VP8L");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f44756h = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f44756h) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, f44756h);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f44756h) && ((bArr[i10 + 20] & 16) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f44755g);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f44754f);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, f44752d) && j(bArr, i10 + 8, f44753e);
    }

    public static a i() {
        if (f44751c) {
            return null;
        }
        try {
            w.a(Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance());
        } catch (Throwable unused) {
        }
        f44751c = true;
        return null;
    }

    private static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
