package D2;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.C;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f465a = new f();

    private f() {
    }

    public static final byte[] a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static final boolean b(byte[] byteArray, byte[] pattern, int i10) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (pattern.length + i10 > byteArray.length) {
            return false;
        }
        Iterable iterableY = AbstractC7024j.y(pattern);
        if ((iterableY instanceof Collection) && ((Collection) iterableY).isEmpty()) {
            return true;
        }
        Iterator it = iterableY.iterator();
        while (it.hasNext()) {
            int iNextInt = ((C) it).nextInt();
            if (byteArray[i10 + iNextInt] != pattern[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return b(byteArray, pattern, 0);
    }
}
