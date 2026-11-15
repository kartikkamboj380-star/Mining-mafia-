package r9;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: r9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7108k implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48467d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C7108k f48468e = new C7108k(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f48469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f48470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f48471c;

    /* JADX INFO: renamed from: r9.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C7108k k(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC7102e.c();
            }
            return aVar.j(bArr, i10, i11);
        }

        public final C7108k a(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return d(string);
        }

        public final C7108k b(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return g(string);
        }

        public final C7108k c(ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return h(buffer);
        }

        public final C7108k d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrA = AbstractC7098a.a(str);
            if (bArrA != null) {
                return new C7108k(bArrA);
            }
            return null;
        }

        public final C7108k e(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((s9.b.e(str.charAt(i11)) << 4) + s9.b.e(str.charAt(i11 + 1)));
            }
            return new C7108k(bArr);
        }

        public final C7108k f(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new C7108k(bytes);
        }

        public final C7108k g(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C7108k c7108k = new C7108k(g0.a(str));
            c7108k.B(str);
            return c7108k;
        }

        public final C7108k h(ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C7108k(bArr);
        }

        public final C7108k i(byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new C7108k(bArrCopyOf);
        }

        public final C7108k j(byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iF = AbstractC7102e.f(bArr, i11);
            AbstractC7102e.b(bArr.length, i10, iF);
            return new C7108k(AbstractC7024j.l(bArr, i10, iF + i10));
        }

        private a() {
        }
    }

    public C7108k(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f48469a = data;
    }

    public static /* synthetic */ C7108k H(C7108k c7108k, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = AbstractC7102e.c();
        }
        return c7108k.G(i10, i11);
    }

    public static final C7108k f(String str) {
        return f48467d.e(str);
    }

    public static /* synthetic */ int q(C7108k c7108k, C7108k c7108k2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c7108k.o(c7108k2, i10);
    }

    public static /* synthetic */ int v(C7108k c7108k, C7108k c7108k2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC7102e.c();
        }
        return c7108k.t(c7108k2, i10);
    }

    public static final C7108k x(byte... bArr) {
        return f48467d.i(bArr);
    }

    public final void A(int i10) {
        this.f48470b = i10;
    }

    public final void B(String str) {
        this.f48471c = str;
    }

    public final C7108k C() {
        return g(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final C7108k D() {
        return g("SHA-256");
    }

    public final int E() {
        return l();
    }

    public final boolean F(C7108k prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return y(0, prefix, 0, prefix.E());
    }

    public C7108k G(int i10, int i11) {
        int iE = AbstractC7102e.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iE <= j().length) {
            if (iE - i10 >= 0) {
                return (i10 == 0 && iE == j().length) ? this : new C7108k(AbstractC7024j.l(j(), i10, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
    }

    public C7108k I() {
        for (int i10 = 0; i10 < j().length; i10++) {
            byte b10 = j()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrJ = j();
                byte[] bArrCopyOf = Arrays.copyOf(bArrJ, bArrJ.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C7108k(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] J() {
        byte[] bArrJ = j();
        byte[] bArrCopyOf = Arrays.copyOf(bArrJ, bArrJ.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String K() {
        String strM = m();
        if (strM != null) {
            return strM;
        }
        String strC = g0.c(r());
        B(strC);
        return strC;
    }

    public void L(C7105h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        s9.b.d(this, buffer, i10, i11);
    }

    public final int c() {
        return E();
    }

    public String d() {
        return AbstractC7098a.c(j(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7108k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iE = E();
        int iE2 = other.E();
        int iMin = Math.min(iE, iE2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i(i10) & 255;
            int i12 = other.i(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE < iE2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7108k) {
            C7108k c7108k = (C7108k) obj;
            if (c7108k.E() == j().length && c7108k.z(0, j(), 0, j().length)) {
                return true;
            }
        }
        return false;
    }

    public C7108k g(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f48469a, 0, E());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new C7108k(bArrDigest);
    }

    public final boolean h(C7108k suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return y(E() - suffix.E(), suffix, 0, suffix.E());
    }

    public int hashCode() {
        int iK = k();
        if (iK != 0) {
            return iK;
        }
        int iHashCode = Arrays.hashCode(j());
        A(iHashCode);
        return iHashCode;
    }

    public final byte i(int i10) {
        return s(i10);
    }

    public final byte[] j() {
        return this.f48469a;
    }

    public final int k() {
        return this.f48470b;
    }

    public int l() {
        return j().length;
    }

    public final String m() {
        return this.f48471c;
    }

    public String n() {
        char[] cArr = new char[j().length * 2];
        int i10 = 0;
        for (byte b10 : j()) {
            int i11 = i10 + 1;
            cArr[i10] = s9.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = s9.b.f()[b10 & 15];
        }
        return StringsKt.q(cArr);
    }

    public final int o(C7108k other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return p(other.r(), i10);
    }

    public int p(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = j().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC7102e.a(j(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] r() {
        return j();
    }

    public byte s(int i10) {
        return j()[i10];
    }

    public final int t(C7108k other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u(other.r(), i10);
    }

    public String toString() {
        if (j().length == 0) {
            return "[size=0]";
        }
        int iC = s9.b.c(j(), 64);
        if (iC != -1) {
            String strK = K();
            String strSubstring = strK.substring(0, iC);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strF = StringsKt.F(StringsKt.F(StringsKt.F(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strK.length()) {
                return "[text=" + strF + ']';
            }
            return "[size=" + j().length + " text=" + strF + "…]";
        }
        if (j().length <= 64) {
            return "[hex=" + n() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(j().length);
        sb.append(" hex=");
        int iE = AbstractC7102e.e(this, 64);
        if (iE <= j().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((iE == j().length ? this : new C7108k(AbstractC7024j.l(j(), 0, iE))).n());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
    }

    public int u(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(AbstractC7102e.e(this, i10), j().length - other.length); -1 < iMin; iMin--) {
            if (AbstractC7102e.a(j(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final C7108k w() {
        return g("MD5");
    }

    public boolean y(int i10, C7108k other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.z(i11, j(), i10, i12);
    }

    public boolean z(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= j().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC7102e.a(j(), i10, other, i11, i12);
    }
}
