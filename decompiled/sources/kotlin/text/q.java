package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.collections.AbstractC7018d;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class q extends StringsKt__StringNumberConversionsKt {
    public static boolean A(String str, int i10, String other, int i11, int i12, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z9 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z9, i10, other, i11, i12);
    }

    public static String B(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        Intrinsics.c(string);
        return string;
    }

    public static final String C(String str, char c10, char c11, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z9) {
            String strReplace = str.replace(c10, c11);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (a.c(cCharAt, c10, z9)) {
                cCharAt = c11;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final String D(String str, String oldValue, String newValue, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int iV = StringsKt__StringsKt.V(str, oldValue, 0, z9);
        if (iV < 0) {
            return str;
        }
        int length = oldValue.length();
        int iC = kotlin.ranges.b.c(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i10, iV);
            sb.append(newValue);
            i10 = iV + length;
            if (iV >= str.length()) {
                break;
            }
            iV = StringsKt__StringsKt.V(str, oldValue, iV + iC, z9);
        } while (iV > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String E(String str, char c10, char c11, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return C(str, c10, c11, z9);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return D(str, str2, str3, z9);
    }

    public static boolean G(String str, String prefix, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z9 ? str.startsWith(prefix, i10) : A(str, i10, prefix, 0, prefix.length(), z9);
    }

    public static boolean H(String str, String prefix, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z9 ? str.startsWith(prefix) : A(str, 0, prefix, 0, prefix.length(), z9);
    }

    public static /* synthetic */ boolean I(String str, String str2, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return G(str, str2, i10, z9);
    }

    public static /* synthetic */ boolean J(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return H(str, str2, z9);
    }

    public static String q(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String r(char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractC7018d.f45933a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static String s(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final String t(byte[] bArr, int i10, int i11, boolean z9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractC7018d.f45933a.a(i10, i11, bArr.length);
        if (!z9) {
            return new String(bArr, i10, i11 - i10, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String u(byte[] bArr, int i10, int i11, boolean z9, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        return t(bArr, i10, i11, z9);
    }

    public static byte[] v(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean w(String str, String suffix, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z9 ? str.endsWith(suffix) : A(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean x(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return w(str, str2, z9);
    }

    public static boolean y(String str, String str2, boolean z9) {
        if (str == null) {
            return str2 == null;
        }
        return !z9 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator z(H h10) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }
}
