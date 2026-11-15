package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1124u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f9682a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f9683b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f9684c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f9686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1111g f9687f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        boolean isInRange(int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        b mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f9685d = bArr;
        f9686e = ByteBuffer.wrap(bArr);
        f9687f = AbstractC1111g.i(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int iG = g(i11, bArr, i10, i11);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
