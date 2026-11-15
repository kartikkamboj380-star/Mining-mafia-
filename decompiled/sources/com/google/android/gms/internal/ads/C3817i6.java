package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3817i6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f29260c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f29261d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f29262a = new P10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f29263b = new StringBuilder();

    static void b(P10 p10) {
        while (true) {
            for (boolean z9 = true; p10.C() > 0 && z9; z9 = false) {
                char c10 = (char) p10.H()[p10.F()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    p10.J(1);
                } else {
                    int iF = p10.F();
                    int iD = p10.D();
                    byte[] bArrH = p10.H();
                    if (iF + 2 <= iD) {
                        int i10 = iF + 1;
                        if (bArrH[iF] == 47) {
                            int i11 = iF + 2;
                            if (bArrH[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iD) {
                                        break;
                                    }
                                    if (((char) bArrH[i11]) == '*' && ((char) bArrH[i12]) == '/') {
                                        iD = i11 + 2;
                                        i11 = iD;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                p10.J(iD - p10.F());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static String c(P10 p10, StringBuilder sb) {
        b(p10);
        if (p10.C() == 0) {
            return null;
        }
        String strD = d(p10, sb);
        if (!strD.isEmpty()) {
            return strD;
        }
        char cR = (char) p10.R();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cR).length());
        sb2.append(cR);
        return sb2.toString();
    }

    private static String d(P10 p10, StringBuilder sb) {
        char c10;
        sb.setLength(0);
        int iF = p10.F();
        int iD = p10.D();
        loop0: while (true) {
            boolean z9 = false;
            while (true) {
                if (iF < iD && !z9) {
                    c10 = (char) p10.H()[iF];
                    if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                        break;
                    }
                    z9 = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c10);
            iF++;
        }
        p10.J(iF - p10.F());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x020e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0226  */
    /* JADX WARN: Code duplicated, block: B:121:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0233  */
    /* JADX WARN: Code duplicated, block: B:124:0x0238  */
    /* JADX WARN: Code duplicated, block: B:126:0x0240  */
    /* JADX WARN: Code duplicated, block: B:128:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x024d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0262  */
    /* JADX WARN: Code duplicated, block: B:136:0x026a  */
    /* JADX WARN: Code duplicated, block: B:138:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x029c  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x02af  */
    /* JADX WARN: Code duplicated, block: B:149:0x02be  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public final List a(P10 p10) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b10;
        boolean z9;
        StringBuilder sb = this.f29263b;
        int i10 = 0;
        sb.setLength(0);
        int iF = p10.F();
        while (!TextUtils.isEmpty(p10.n(StandardCharsets.UTF_8))) {
        }
        P10 p11 = this.f29262a;
        p11.A(p10.H(), p10.F());
        p11.G(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            b(p11);
            if (p11.C() >= 5 && "::cue".equals(p11.k(5, StandardCharsets.UTF_8))) {
                int iF2 = p11.F();
                String strC = c(p11, sb);
                if (strC == null) {
                    strTrim = null;
                } else if ("{".equals(strC)) {
                    p11.G(iF2);
                    strTrim = "";
                } else {
                    if ("(".equals(strC)) {
                        int iF3 = p11.F();
                        int iD = p11.D();
                        int i11 = i10;
                        while (iF3 < iD && i11 == 0) {
                            int i12 = iF3 + 1;
                            i11 = ((char) p11.H()[iF3]) == ')' ? 1 : i10;
                            iF3 = i12;
                        }
                        strTrim = p11.k((iF3 - 1) - p11.F(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(c(p11, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(c(p11, sb))) {
                break;
            }
            C3941j6 c3941j6 = new C3941j6();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = f29260c.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        c3941j6.e(strGroup2);
                    }
                    strTrim = strTrim.substring(i10, iIndexOf);
                }
                String str = AbstractC4634ob0.f32117a;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str2 = strArrSplit[i10];
                int iIndexOf2 = str2.indexOf(35);
                if (iIndexOf2 != -1) {
                    c3941j6.c(str2.substring(i10, iIndexOf2));
                    c3941j6.b(str2.substring(iIndexOf2 + 1));
                } else {
                    c3941j6.c(str2);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    c3941j6.d((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i13 = i10;
            String strC2 = null;
            while (i13 == 0) {
                int iF4 = p11.F();
                strC2 = c(p11, sb);
                int i14 = (strC2 == null || "}".equals(strC2)) ? 1 : i10;
                if (i14 == 0) {
                    p11.G(iF4);
                    b(p11);
                    String strD = d(p11, sb);
                    if (!strD.isEmpty() && ":".equals(c(p11, sb))) {
                        b(p11);
                        StringBuilder sb2 = new StringBuilder();
                        int i15 = i10;
                        while (true) {
                            if (i15 != 0) {
                                string = sb2.toString();
                                break;
                            }
                            int iF5 = p11.F();
                            String strC3 = c(p11, sb);
                            if (strC3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strC3) || ";".equals(strC3)) {
                                p11.G(iF5);
                                i15 = 1;
                            } else {
                                sb2.append(strC3);
                            }
                        }
                        if (string != null && !string.isEmpty()) {
                            int iF6 = p11.F();
                            String strC4 = c(p11, sb);
                            if (";".equals(strC4)) {
                                if ("color".equals(strD)) {
                                    c3941j6.o(AbstractC3725hN.b(string));
                                } else if ("background-color".equals(strD)) {
                                    c3941j6.r(AbstractC3725hN.b(string));
                                } else if ("ruby-position".equals(strD)) {
                                    if ("over".equals(string)) {
                                        c3941j6.x(1);
                                    } else if ("under".equals(string)) {
                                        c3941j6.x(2);
                                    }
                                } else if ("text-combine-upright".equals(strD)) {
                                    if ("all".equals(string)) {
                                        z9 = true;
                                    } else {
                                        z9 = true;
                                    }
                                    c3941j6.z(z9);
                                } else if ("text-decoration".equals(strD)) {
                                    if ("underline".equals(string)) {
                                        c3941j6.i(true);
                                    }
                                } else if ("font-family".equals(strD)) {
                                    c3941j6.m(string);
                                } else if ("font-weight".equals(strD)) {
                                    if ("bold".equals(string)) {
                                        c3941j6.j(true);
                                    }
                                } else if ("font-style".equals(strD)) {
                                    if ("italic".equals(string)) {
                                        c3941j6.k(true);
                                    }
                                } else if ("font-size".equals(strD)) {
                                    matcher = f29261d.matcher(AbstractC1483As0.a(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b10 = -1;
                                                } else {
                                                    b10 = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                        if (b10 != 0) {
                                            c3941j6.u(1);
                                        } else if (b10 != 1) {
                                            c3941j6.u(2);
                                        } else {
                                            if (b10 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            c3941j6.u(3);
                                        }
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        c3941j6.t(Float.parseFloat(strGroup3));
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(string.length() + 22);
                                        sb3.append("Invalid font-size: '");
                                        sb3.append(string);
                                        sb3.append("'.");
                                        YU.c("WebvttCssParser", sb3.toString());
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strC4)) {
                                p11.G(iF6);
                                if ("color".equals(strD)) {
                                    c3941j6.o(AbstractC3725hN.b(string));
                                } else if ("background-color".equals(strD)) {
                                    c3941j6.r(AbstractC3725hN.b(string));
                                } else if ("ruby-position".equals(strD)) {
                                    if ("over".equals(string)) {
                                        c3941j6.x(1);
                                    } else if ("under".equals(string)) {
                                        c3941j6.x(2);
                                    }
                                } else if ("text-combine-upright".equals(strD)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    c3941j6.z(z9);
                                } else if ("text-decoration".equals(strD)) {
                                    if ("underline".equals(string)) {
                                        c3941j6.i(true);
                                    }
                                } else if ("font-family".equals(strD)) {
                                    c3941j6.m(string);
                                } else if ("font-weight".equals(strD)) {
                                    if ("bold".equals(string)) {
                                        c3941j6.j(true);
                                    }
                                } else if ("font-style".equals(strD)) {
                                    if ("italic".equals(string)) {
                                        c3941j6.k(true);
                                    }
                                } else if ("font-size".equals(strD)) {
                                    matcher = f29261d.matcher(AbstractC1483As0.a(string));
                                    if (matcher.matches()) {
                                        StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                        sb4.append("Invalid font-size: '");
                                        sb4.append(string);
                                        sb4.append("'.");
                                        YU.c("WebvttCssParser", sb4.toString());
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b10 = 0;
                                                } else {
                                                    b10 = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                        if (b10 != 0) {
                                            c3941j6.u(1);
                                        } else if (b10 != 1) {
                                            c3941j6.u(2);
                                        } else {
                                            if (b10 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            c3941j6.u(3);
                                        }
                                        String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        c3941j6.t(Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i13 = i14;
                i10 = 0;
            }
            if ("}".equals(strC2)) {
                arrayList.add(c3941j6);
            }
            i10 = 0;
        }
        return arrayList;
    }
}
