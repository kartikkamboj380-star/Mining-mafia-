package p012b1;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final C a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new C(c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    public static /* synthetic */ C b(String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            str6 = T.f48392c;
        }
        return a(str, str2, str3, str4, str5, str6);
    }

    private static final String c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        if (str2 != null) {
            sb.append("//");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String d(C c10) {
        List listF = f(c10);
        if (listF.isEmpty()) {
            return null;
        }
        String strB = c10.b();
        Intrinsics.c(strB);
        return CollectionsKt.e0(listF, c10.d(), StringsKt.J(strB, c10.d(), false, 2, null) ? c10.d() : "", null, 0, null, null, 60, null);
    }

    private static final int e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static final List f(C c10) {
        String strB = c10.b();
        if (strB == null) {
            return CollectionsKt.i();
        }
        ArrayList arrayList = new ArrayList();
        int iY = -1;
        while (iY < strB.length()) {
            int i10 = iY + 1;
            iY = StringsKt.Y(strB, '/', i10, false, 4, null);
            if (iY == -1) {
                iY = strB.length();
            }
            String strSubstring = strB.substring(i10, iY);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    private static final C g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z9 = true;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        while (i15 < str.length()) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i12 == -1 && i10 == -1) {
                            i12 = i15 + 1;
                        }
                    } else if (z9 && i12 == -1 && i10 == -1) {
                        int i16 = i15 + 2;
                        if (i16 < str2.length() && str2.charAt(i15 + 1) == '/' && str2.charAt(i16) == '/') {
                            i13 = i15 + 3;
                            z9 = false;
                            i14 = i15;
                            i15 = i16;
                        } else if (Intrinsics.b(str, str2)) {
                            i11 = i15 + 1;
                            i14 = i15;
                            i15 = i11;
                            i13 = i15;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i15;
                    z9 = false;
                }
            } else if (i10 == -1) {
                i10 = i15 + 1;
            }
            i15++;
        }
        int i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int iMin = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, str.length());
        int iMin2 = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, iMin);
        if (i13 != -1) {
            strSubstring2 = str.substring(0, i14);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            if (i11 != -1) {
                i17 = i11;
            }
            strSubstring = str.substring(i13, Math.min(i17, iMin2));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i11 != -1) {
            strSubstring3 = str.substring(i11, iMin2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i12 != -1) {
            strSubstring4 = str.substring(i12, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i10 != -1) {
            strSubstring5 = str.substring(i10, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(e(strSubstring2), Math.max(e(strSubstring), Math.max(e(strSubstring3), Math.max(e(strSubstring4), e(strSubstring5))))) - 2)];
        return new C(str, str3, strSubstring2 != null ? h(strSubstring2, bArr) : null, strSubstring != null ? h(strSubstring, bArr) : null, strSubstring3 != null ? h(strSubstring3, bArr) : null, strSubstring4 != null ? h(strSubstring4, bArr) : null, strSubstring5 != null ? h(strSubstring5, bArr) : null);
    }

    private static final String h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i10 = 0;
        int iMax = Math.max(0, length - 2);
        int i11 = 0;
        while (true) {
            if (i10 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i10) == '%') {
                    int i12 = i10 + 3;
                    try {
                        String strSubstring = str.substring(i10 + 1, i12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        bArr2[i11] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
                        i11++;
                        bArr = bArr2;
                        i10 = i12;
                    } catch (NumberFormatException unused) {
                        bArr2[i11] = (byte) str.charAt(i10);
                        i11++;
                        i10++;
                        bArr = bArr2;
                    }
                }
            } else {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    return StringsKt.u(bArr, 0, i11, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
            bArr = bArr2;
        }
    }

    public static final C i(String str, String str2) {
        String str3;
        String str4;
        if (Intrinsics.b(str2, "/")) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = StringsKt.F(str3, str4, "/", false, 4, null);
        }
        return g(str, str3, str4);
    }

    public static /* synthetic */ C j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = T.f48392c;
        }
        return i(str, str2);
    }
}
