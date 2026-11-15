package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public class StringsKt__StringsKt extends q {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f46015a;

        public a(CharSequence charSequence) {
            this.f46015a = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new c(this.f46015a);
        }
    }

    public static /* synthetic */ List A0(CharSequence charSequence, char[] cArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return x0(charSequence, cArr, z9, i10);
    }

    public static final boolean B0(CharSequence charSequence, CharSequence prefix, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z9 && (charSequence instanceof String) && (prefix instanceof String)) ? q.J((String) charSequence, (String) prefix, false, 2, null) : r0(charSequence, 0, prefix, 0, prefix.length(), z9);
    }

    public static /* synthetic */ boolean C0(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return B0(charSequence, charSequence2, z9);
    }

    public static final String D0(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.k().intValue(), range.j().intValue() + 1).toString();
    }

    public static String E0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iY = Y(str, c10, 0, false, 6, null);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iY + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String F0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iZ = Z(str, delimiter, 0, false, 6, null);
        if (iZ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iZ + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String G0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return E0(str, c10, str2);
    }

    public static /* synthetic */ String H0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return F0(str, str2, str3);
    }

    public static String I0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = e0(str, c10, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iE0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String J0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF0 = f0(str, delimiter, 0, false, 6, null);
        if (iF0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iF0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String K0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return I0(str, c10, str2);
    }

    public static /* synthetic */ String L0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return J0(str, str2, str3);
    }

    public static final boolean M(CharSequence charSequence, char c10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return Y(charSequence, c10, 0, z9, 2, null) >= 0;
    }

    public static final String M0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iY = Y(str, c10, 0, false, 6, null);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iY);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean N(CharSequence charSequence, CharSequence other, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            return Z(charSequence, (String) other, 0, z9, 2, null) >= 0;
        }
        return X(charSequence, other, 0, charSequence.length(), z9, false, 16, null) >= 0;
    }

    public static final String N0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iZ = Z(str, delimiter, 0, false, 6, null);
        if (iZ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iZ);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return M(charSequence, c10, z9);
    }

    public static /* synthetic */ String O0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return M0(str, c10, str2);
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return N(charSequence, charSequence2, z9);
    }

    public static /* synthetic */ String P0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return N0(str, str2, str3);
    }

    public static final boolean Q(CharSequence charSequence, CharSequence suffix, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z9 && (charSequence instanceof String) && (suffix instanceof String)) ? q.x((String) charSequence, (String) suffix, false, 2, null) : r0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z9);
    }

    public static final String Q0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = e0(str, c10, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iE0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean R(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return Q(charSequence, charSequence2, z9);
    }

    public static final String R0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF0 = f0(str, delimiter, 0, false, 6, null);
        if (iF0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iF0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final Pair S(CharSequence charSequence, Collection collection, int i10, boolean z9, boolean z10) {
        CharSequence charSequence2;
        Object next;
        boolean z11;
        Object next2;
        if (!z9 && collection.size() == 1) {
            String str = (String) CollectionsKt.m0(collection);
            int iZ = !z10 ? Z(charSequence, str, i10, false, 4, null) : f0(charSequence, str, i10, false, 4, null);
            if (iZ < 0) {
                return null;
            }
            return p129m8.q.a(Integer.valueOf(iZ), str);
        }
        CharSequence charSequence3 = charSequence;
        kotlin.ranges.a intRange = !z10 ? new IntRange(kotlin.ranges.b.c(i10, 0), charSequence3.length()) : kotlin.ranges.b.l(kotlin.ranges.b.g(i10, T(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iA = intRange.a();
            int iB = intRange.b();
            int iE = intRange.e();
            if ((iE > 0 && iA <= iB) || (iE < 0 && iB <= iA)) {
                int i11 = iA;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = z9;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z11 = z9;
                        if (q.A(str2, 0, (String) charSequence3, i11, str2.length(), z11)) {
                            break;
                        }
                        z9 = z11;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return p129m8.q.a(Integer.valueOf(i11), str3);
                    }
                    if (i11 != iB) {
                        i11 += iE;
                        z9 = z11;
                    }
                }
            }
        } else {
            boolean z12 = z9;
            int iA2 = intRange.a();
            int iB2 = intRange.b();
            int iE2 = intRange.e();
            if ((iE2 > 0 && iA2 <= iB2) || (iE2 < 0 && iB2 <= iA2)) {
                int i12 = iA2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z13 = z12;
                        charSequence2 = charSequence3;
                        z12 = z13;
                        if (r0(str4, 0, charSequence2, i12, str4.length(), z13)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return p129m8.q.a(Integer.valueOf(i12), str5);
                    }
                    if (i12 != iB2) {
                        i12 += iE2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String S0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c10, str2);
    }

    public static final int T(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return R0(str, str2, str3);
    }

    public static final int U(CharSequence charSequence, char c10, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z9 || !(charSequence instanceof String)) ? a0(charSequence, new char[]{c10}, i10, z9) : ((String) charSequence).indexOf(c10, i10);
    }

    public static CharSequence U0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean zB = CharsKt__CharJVMKt.b(charSequence.charAt(!z9 ? i10 : length));
            if (z9) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int V(CharSequence charSequence, String string, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z9 || !(charSequence instanceof String)) ? X(charSequence, string, i10, charSequence.length(), z9, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static String V0(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean zS = AbstractC7024j.s(chars, str.charAt(!z9 ? i10 : length));
            if (z9) {
                if (!zS) {
                    break;
                }
                length--;
            } else if (zS) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    private static final int W(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10) {
        kotlin.ranges.a intRange = !z10 ? new IntRange(kotlin.ranges.b.c(i10, 0), kotlin.ranges.b.g(i11, charSequence.length())) : kotlin.ranges.b.l(kotlin.ranges.b.g(i10, T(charSequence)), kotlin.ranges.b.c(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA = intRange.a();
            int iB = intRange.b();
            int iE = intRange.e();
            if ((iE <= 0 || iA > iB) && (iE >= 0 || iB > iA)) {
                return -1;
            }
            int i12 = iA;
            while (true) {
                String str = (String) charSequence2;
                boolean z11 = z9;
                if (q.A(str, 0, (String) charSequence, i12, str.length(), z11)) {
                    return i12;
                }
                if (i12 == iB) {
                    return -1;
                }
                i12 += iE;
                z9 = z11;
            }
        } else {
            boolean z12 = z9;
            int iA2 = intRange.a();
            int iB2 = intRange.b();
            int iE2 = intRange.e();
            if ((iE2 <= 0 || iA2 > iB2) && (iE2 >= 0 || iB2 > iA2)) {
                return -1;
            }
            int i13 = iA2;
            while (true) {
                boolean z13 = z12;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z12 = z13;
                if (r0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z13)) {
                    return i13;
                }
                if (i13 == iB2) {
                    return -1;
                }
                i13 += iE2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    static /* synthetic */ int X(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z10 = false;
        }
        return W(charSequence, charSequence2, i10, i11, z9, z10);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, char c10, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return U(charSequence, c10, i10, z9);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return V(charSequence, str, i10, z9);
    }

    public static final int a0(CharSequence charSequence, char[] chars, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z9 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC7024j.S(chars), i10);
        }
        int iC = kotlin.ranges.b.c(i10, 0);
        int iT = T(charSequence);
        if (iC > iT) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iC);
            for (char c10 : chars) {
                if (kotlin.text.a.c(c10, cCharAt, z9)) {
                    return iC;
                }
            }
            if (iC == iT) {
                return -1;
            }
            iC++;
        }
    }

    public static boolean b0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int c0(CharSequence charSequence, char c10, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z9 || !(charSequence instanceof String)) ? g0(charSequence, new char[]{c10}, i10, z9) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int d0(CharSequence charSequence, String string, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z9 || !(charSequence instanceof String)) ? W(charSequence, string, i10, 0, z9, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, char c10, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = T(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return c0(charSequence, c10, i10, z9);
    }

    public static /* synthetic */ int f0(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = T(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return d0(charSequence, str, i10, z9);
    }

    public static final int g0(CharSequence charSequence, char[] chars, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z9 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC7024j.S(chars), i10);
        }
        for (int iG = kotlin.ranges.b.g(i10, T(charSequence)); -1 < iG; iG--) {
            char cCharAt = charSequence.charAt(iG);
            for (char c10 : chars) {
                if (kotlin.text.a.c(c10, cCharAt, z9)) {
                    return iG;
                }
            }
        }
        return -1;
    }

    public static Sequence h0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List i0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return G8.j.D(h0(charSequence));
    }

    public static final CharSequence j0(CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String k0(String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return j0(str, i10, c10).toString();
    }

    private static final Sequence l0(CharSequence charSequence, final char[] cArr, int i10, final boolean z9, int i11) {
        w0(i11);
        return new b(charSequence, i10, i11, new Function2() { // from class: kotlin.text.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.p0(cArr, z9, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final Sequence m0(CharSequence charSequence, String[] strArr, int i10, final boolean z9, int i11) {
        w0(i11);
        final List listD = AbstractC7024j.d(strArr);
        return new b(charSequence, i10, i11, new Function2() { // from class: kotlin.text.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.q0(listD, z9, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ Sequence n0(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return l0(charSequence, cArr, i10, z9, i11);
    }

    static /* synthetic */ Sequence o0(CharSequence charSequence, String[] strArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m0(charSequence, strArr, i10, z9, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair p0(char[] cArr, boolean z9, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iA0 = a0(DelimitedRangesSequence, cArr, i10, z9);
        if (iA0 < 0) {
            return null;
        }
        return p129m8.q.a(Integer.valueOf(iA0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair q0(List list, boolean z9, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairS = S(DelimitedRangesSequence, list, i10, z9, false);
        if (pairS != null) {
            return p129m8.q.a(pairS.c(), Integer.valueOf(((String) pairS.d()).length()));
        }
        return null;
    }

    public static final boolean r0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!kotlin.text.a.c(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z9)) {
                return false;
            }
        }
        return true;
    }

    public static String s0(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!C0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return y0(charSequence, strArr, z9, i10);
    }

    public static String t0(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!R(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String u0(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return v0(str, delimiter, delimiter);
    }

    public static final String v0(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !C0(str, prefix, false, 2, null) || !R(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void w0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List x0(CharSequence charSequence, char[] delimiters, boolean z9, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return z0(charSequence, String.valueOf(delimiters[0]), z9, i10);
        }
        Iterable iterableJ = G8.j.j(n0(charSequence, delimiters, 0, z9, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterableJ, 10));
        Iterator it = iterableJ.iterator();
        while (it.hasNext()) {
            arrayList.add(D0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List y0(CharSequence charSequence, String[] delimiters, boolean z9, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return z0(charSequence, str, z9, i10);
            }
        }
        Iterable iterableJ = G8.j.j(o0(charSequence, delimiters, 0, z9, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterableJ, 10));
        Iterator it = iterableJ.iterator();
        while (it.hasNext()) {
            arrayList.add(D0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List z0(CharSequence charSequence, String str, boolean z9, int i10) {
        w0(i10);
        int length = 0;
        int iV = V(charSequence, str, 0, z9);
        if (iV == -1 || i10 == 1) {
            return CollectionsKt.d(charSequence.toString());
        }
        boolean z10 = i10 > 0;
        ArrayList arrayList = new ArrayList(z10 ? kotlin.ranges.b.g(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iV).toString());
            length = str.length() + iV;
            if (z10 && arrayList.size() == i10 - 1) {
                break;
            }
            iV = V(charSequence, str, length, z9);
        } while (iV != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }
}
