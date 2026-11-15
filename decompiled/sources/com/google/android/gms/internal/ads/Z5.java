package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class Z5 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f26106b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f26107c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f26108d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f26109e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f26110f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f26111g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f26112h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X5 f26113i = new X5(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f26114a;

    public Z5() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f26114a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] c(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = AbstractC4634ob0.f32117a;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Code duplicated, block: B:194:0x034e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static C3062c6 d(XmlPullParser xmlPullParser, C3062c6 c3062c6) {
        ?? r10;
        Matcher matcher;
        byte b10;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z9 = false;
        C3062c6 c3062c6E = c3062c6;
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
            ?? r13 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r14 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r10 = !attributeName.equals("fontStyle") ? -1 : 6;
                    break;
                case -1289044182:
                    r10 = !attributeName.equals("extent") ? -1 : 16;
                    break;
                case -1224696685:
                    r10 = !attributeName.equals("fontFamily") ? -1 : 3;
                    break;
                case -1065511464:
                    r10 = !attributeName.equals("textAlign") ? -1 : 7;
                    break;
                case -1008619738:
                    r10 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r10 = !attributeName.equals("textDecoration") ? -1 : 12;
                    break;
                case -734428249:
                    r10 = !attributeName.equals("fontWeight") ? -1 : 5;
                    break;
                case 3355:
                    r10 = !attributeName.equals("id") ? -1 : z9;
                    break;
                case 3511770:
                    r10 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r10 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r10 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r10 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r10 = !attributeName.equals("fontSize") ? -1 : 4;
                    break;
                case 921125321:
                    r10 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r10 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r10 = !attributeName.equals("backgroundColor") ? -1 : 1;
                    break;
                case 1754920356:
                    r10 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r10 = -1;
                    break;
            }
            switch (r10) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.G(attributeValue);
                    }
                    break;
                case 1:
                    c3062c6E = e(c3062c6E);
                    try {
                        c3062c6E.B(AbstractC3725hN.a(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        YU.c("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 2:
                    c3062c6E = e(c3062c6E);
                    try {
                        c3062c6E.y(AbstractC3725hN.a(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        YU.c("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 3:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.w(attributeValue);
                    break;
                case 4:
                    try {
                        c3062c6E = e(c3062c6E);
                        String str = AbstractC4634ob0.f32117a;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = f26108d.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new C5324u5(sb.toString());
                            }
                            matcher = f26108d.matcher(strArrSplit[1]);
                            YU.c("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new C5324u5(sb2.toString());
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
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
                        if (b10 == 0) {
                            c3062c6E.h(1);
                        } else if (b10 == 1) {
                            c3062c6E.h(2);
                        } else {
                            if (b10 != 2) {
                                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(strGroup);
                                sb3.append("'.");
                                throw new C5324u5(sb3.toString());
                            }
                            c3062c6E.h(3);
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        c3062c6E.g(Float.parseFloat(strGroup2));
                    } catch (C5324u5 unused3) {
                        YU.c("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 5:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.t("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.u("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.N(f(attributeValue));
                    break;
                case 8:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.b(f(attributeValue));
                    break;
                case 9:
                    String strA = AbstractC1483As0.a(attributeValue);
                    int iHashCode2 = strA.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strA.equals("none")) {
                            r11 = z9;
                        }
                    } else if (strA.equals("all")) {
                        r11 = 1;
                    }
                    if (r11 == 0) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.d(z9);
                    } else if (r11 == 1) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.d(true);
                    }
                    break;
                case 10:
                    String strA2 = AbstractC1483As0.a(attributeValue);
                    switch (strA2.hashCode()) {
                        case -618561360:
                            if (strA2.equals("baseContainer")) {
                                r14 = 2;
                            }
                            break;
                        case -410956671:
                            if (strA2.equals("container")) {
                                r14 = z9;
                            }
                            break;
                        case -250518009:
                            if (strA2.equals("delimiter")) {
                                r14 = 5;
                            }
                            break;
                        case -136074796:
                            if (strA2.equals("textContainer")) {
                                r14 = 4;
                            }
                            break;
                        case 3016401:
                            if (strA2.equals("base")) {
                                r14 = 1;
                            }
                            break;
                        case 3556653:
                            if (strA2.equals("text")) {
                                r14 = 3;
                            }
                            break;
                    }
                    if (r14 == 0) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.I(1);
                    } else if (r14 == 1 || r14 == 2) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.I(2);
                    } else if (r14 == 3 || r14 == 4) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.I(3);
                    } else if (r14 == 5) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.I(4);
                    }
                    break;
                case 11:
                    String strA3 = AbstractC1483As0.a(attributeValue);
                    int iHashCode3 = strA3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strA3.equals("after")) {
                            r13 = 1;
                        }
                    } else if (strA3.equals("before")) {
                        r13 = z9;
                    }
                    if (r13 == 0) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.K(1);
                    } else if (r13 == 1) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.K(2);
                    }
                    break;
                case 12:
                    String strA4 = AbstractC1483As0.a(attributeValue);
                    switch (strA4.hashCode()) {
                        case -1461280213:
                            if (strA4.equals("nounderline")) {
                                r12 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strA4.equals("underline")) {
                                r12 = 2;
                            }
                            break;
                        case 913457136:
                            if (strA4.equals("nolinethrough")) {
                                r12 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strA4.equals("linethrough")) {
                                r12 = z9;
                            }
                            break;
                    }
                    if (r12 == 0) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.q(true);
                    } else if (r12 == 1) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.q(z9);
                    } else if (r12 == 2) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.s(true);
                    } else if (r12 == 3) {
                        c3062c6E = e(c3062c6E);
                        c3062c6E.s(z9);
                    }
                    break;
                case 13:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.f(V5.a(attributeValue));
                    break;
                case 14:
                    C3062c6 c3062c6E2 = e(c3062c6E);
                    Matcher matcher2 = f26109e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e10) {
                            YU.d("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e10);
                        }
                    } else {
                        YU.c("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    c3062c6E2.D(fMin);
                    c3062c6E = c3062c6E2;
                    break;
                case 15:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.k(attributeValue);
                    break;
                case 16:
                    c3062c6E = e(c3062c6E);
                    c3062c6E.m(attributeValue);
                    break;
            }
            i10++;
            z9 = false;
        }
        return c3062c6E;
    }

    private static C3062c6 e(C3062c6 c3062c6) {
        return c3062c6 == null ? new C3062c6() : c3062c6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static Layout.Alignment f(String str) {
        byte b10;
        switch (AbstractC1483As0.a(str)) {
            case "center":
                b10 = 4;
                break;
            case "end":
                b10 = 3;
                break;
            case "left":
                b10 = 0;
                break;
            case "right":
                b10 = 2;
                break;
            case "start":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b10 == 2 || b10 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b10 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    private static long g(String str, X5 x10) throws C5324u5 {
        double d10;
        double d11;
        Matcher matcher = f26106b.matcher(str);
        byte b10 = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j11 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j10 + j11;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = 0.0d;
            double d15 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d16 = d12 + d13;
            String strGroup5 = matcher.group(5);
            double d17 = strGroup5 != null ? Long.parseLong(strGroup5) / x10.f25141a : 0.0d;
            double d18 = d16 + d15;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d14 = (Long.parseLong(strGroup6) / ((double) x10.f25142b)) / ((double) x10.f25141a);
            }
            return (long) ((d18 + d17 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f26107c.matcher(str);
        if (!matcher2.matches()) {
            throw new C5324u5("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d19 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b10 = 5;
                            } else {
                                b10 = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b10 = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strGroup8.equals("h")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (strGroup8.equals("f")) {
            b10 = 4;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 == 3) {
                    d11 = 1000.0d;
                } else if (b10 == 4) {
                    d11 = x10.f25141a;
                } else if (b10 == 5) {
                    d11 = x10.f25143c;
                }
                d19 /= d11;
            } else {
                d10 = 60.0d;
            }
            return (long) (d19 * 1000000.0d);
        }
        d10 = 3600.0d;
        d19 *= d10;
        return (long) (d19 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        AbstractC4946r5.a(b(bArr, i10, i11), c5702x5, interfaceC3977jO);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0311 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0327  */
    /* JADX WARN: Code duplicated, block: B:155:0x0330 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0348, TryCatch #0 {NumberFormatException -> 0x0348, blocks: (B:153:0x032a, B:155:0x0330, B:157:0x033d, B:158:0x0346, B:159:0x0347), top: B:424:0x032a, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x033d A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x0348, TryCatch #0 {NumberFormatException -> 0x0348, blocks: (B:153:0x032a, B:155:0x0330, B:157:0x033d, B:158:0x0346, B:159:0x0347), top: B:424:0x032a, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0353 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x035b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x035d A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0365  */
    /* JADX WARN: Code duplicated, block: B:170:0x036c A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x038b, TryCatch #13 {NumberFormatException -> 0x038b, blocks: (B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a), top: B:441:0x0366, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0377 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x038b, TryCatch #13 {NumberFormatException -> 0x038b, blocks: (B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a), top: B:441:0x0366, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0393 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x039b  */
    /* JADX WARN: Code duplicated, block: B:186:0x03bf A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d8 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x03f2, TryCatch #10 {NumberFormatException -> 0x03f2, blocks: (B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:194:0x03f0, B:195:0x03f1), top: B:437:0x03d2, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03e5 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x03f2, TryCatch #10 {NumberFormatException -> 0x03f2, blocks: (B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:194:0x03f0, B:195:0x03f1), top: B:437:0x03d2, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x03ff A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0405 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x0407 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0414  */
    /* JADX WARN: Code duplicated, block: B:205:0x041b A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x043c, TryCatch #7 {NumberFormatException -> 0x043c, blocks: (B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b), top: B:432:0x0415, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0426 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, NumberFormatException -> 0x043c, TryCatch #7 {NumberFormatException -> 0x043c, blocks: (B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b), top: B:432:0x0415, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0449 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0456  */
    /* JADX WARN: Code duplicated, block: B:215:0x0462 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x046f  */
    /* JADX WARN: Code duplicated, block: B:224:0x047f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0487  */
    /* JADX WARN: Code duplicated, block: B:227:0x048a  */
    /* JADX WARN: Code duplicated, block: B:229:0x048d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0490  */
    /* JADX WARN: Code duplicated, block: B:232:0x0495  */
    /* JADX WARN: Code duplicated, block: B:233:0x049c  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #7, #10, #11, #13 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x04be  */
    /* JADX WARN: Code duplicated, block: B:242:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:250:0x04db  */
    /* JADX WARN: Code duplicated, block: B:251:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:260:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:284:0x0562 A[LOOP:1: B:120:0x0276->B:284:0x0562, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:323:0x0601  */
    /* JADX WARN: Code duplicated, block: B:452:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x043a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x055c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.google.android.gms.internal.ads.a6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.google.android.gms.internal.ads.Y5] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r49v1, types: [com.google.android.gms.internal.ads.c6, java.lang.Throwable] */
    public final InterfaceC5198t5 b(byte[] bArr, int i10, int i11) {
        String str;
        String str2;
        HashMap map;
        C3188d6 c3188d6;
        ArrayDeque arrayDeque;
        ?? r17;
        ?? r18;
        ?? y9;
        X5 x10;
        int i12;
        W5 w10;
        W5 w11;
        long j10;
        Object obj;
        byte b10;
        String str3;
        String str4;
        String strC;
        String str5;
        String strL;
        String str6;
        HashMap map2;
        String str7;
        float f10;
        float f11;
        ?? c2811a6;
        String strC2;
        float f12;
        float f13;
        String strC3;
        int i13;
        float f14;
        String strC4;
        int i14;
        String strA;
        int iHashCode;
        byte b11;
        String strA2;
        int iHashCode2;
        byte b12;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i15;
        String strGroup2;
        String strGroup3;
        float f15;
        String strGroup4;
        String strC5;
        C3062c6 c3062c6;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i16;
        String strGroup6;
        String strGroup7;
        float f16;
        String strGroup8;
        C3062c6 c3062c7;
        String str8;
        float f17;
        boolean z9;
        String str9 = "";
        String str10 = "http://www.w3.org/ns/ttml#parameter";
        String str11 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f26114a.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new C2811a6("", -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            X5 x11 = f26113i;
            C3188d6 c3188d7 = null;
            ?? r19 = 0;
            X5 x12 = x11;
            int i17 = 0;
            int i18 = 15;
            while (eventType != 1) {
                W5 w12 = (W5) arrayDeque2.peek();
                ?? r49 = obj2;
                if (i17 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str9;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRate");
                            int i19 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            c3188d6 = c3188d7;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str12 = AbstractC4634ob0.f32117a;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                AbstractC2418Ss0.b(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f17 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f17 = 1.0f;
                            }
                            int i20 = x11.f25142b;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str10, "subFrameRate");
                            if (attributeValue3 != null) {
                                i20 = Integer.parseInt(attributeValue3);
                            }
                            int i21 = x11.f25143c;
                            float f18 = f17;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str10, "tickRate");
                            if (attributeValue4 != null) {
                                i21 = Integer.parseInt(attributeValue4);
                            }
                            X5 x13 = new X5(i19 * f18, i20, i21);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str10, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str10;
                                x12 = x13;
                                x11 = x11;
                                i18 = 15;
                            } else {
                                Matcher matcher5 = f26112h.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    str2 = str10;
                                    try {
                                        String strGroup9 = matcher5.group(1);
                                        if (strGroup9 == null) {
                                            throw r49;
                                        }
                                        int i22 = Integer.parseInt(strGroup9);
                                        x12 = x13;
                                        try {
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r49;
                                            }
                                            int i23 = Integer.parseInt(strGroup10);
                                            try {
                                                if (i22 != 0) {
                                                    if (i23 != 0) {
                                                        z9 = true;
                                                    } else {
                                                        i23 = 0;
                                                        z9 = false;
                                                    }
                                                    AbstractC2418Ss0.g(z9, "Invalid cell resolution %s %s", i22, i23);
                                                    i18 = i23;
                                                } else {
                                                    z9 = false;
                                                }
                                                AbstractC2418Ss0.g(z9, "Invalid cell resolution %s %s", i22, i23);
                                                i18 = i23;
                                            } catch (NumberFormatException unused) {
                                                YU.c("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i18 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            x11 = x11;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        x12 = x13;
                                    }
                                    x11 = x11;
                                    YU.c("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i18 = 15;
                                } else {
                                    YU.c("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str10;
                                    x12 = x13;
                                    x11 = x11;
                                    i18 = 15;
                                }
                            }
                            String strC6 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "extent");
                            if (strC6 == null) {
                                y9 = r49;
                            } else {
                                Matcher matcher6 = f26111g.matcher(strC6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r49;
                                        }
                                        int i24 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r49;
                                        }
                                        y9 = new Y5(i24, Integer.parseInt(strGroup12));
                                    } catch (NumberFormatException unused4) {
                                        YU.c("TtmlParser", "Ignoring malformed tts extent: ".concat(strC6));
                                        y9 = r49;
                                    }
                                } else {
                                    YU.c("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strC6));
                                }
                                y9 = r49;
                            }
                        } else {
                            str2 = str10;
                            arrayDeque2 = arrayDeque2;
                            x11 = x11;
                            c3188d6 = c3188d7;
                            i17 = i17;
                            y9 = r19;
                        }
                        ?? r10 = y9;
                        int i25 = i18;
                        String str13 = "image";
                        String str14 = "metadata";
                        String str15 = "region";
                        String str16 = "head";
                        x12 = x12;
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals(JsonStorageKeyNames.DATA_KEY) || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (AbstractC2546Ve0.b(xmlPullParserNewPullParser, "style")) {
                                        String strC7 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "style");
                                        C3062c6 c3062c6D = d(xmlPullParserNewPullParser, new C3062c6());
                                        if (strC7 != null) {
                                            String[] strArrC = c(strC7);
                                            int i26 = 0;
                                            for (int length = strArrC.length; i26 < length; length = length) {
                                                c3062c6D.F((C3062c6) map3.get(strArrC[i26]));
                                                i26++;
                                            }
                                        }
                                        String strH = c3062c6D.H();
                                        if (strH != null) {
                                            map3.put(strH, c3062c6D);
                                        }
                                        map = map5;
                                        str3 = str14;
                                        str4 = str15;
                                    } else {
                                        str11 = str11;
                                        str16 = str16;
                                        if (AbstractC2546Ve0.b(xmlPullParserNewPullParser, str15)) {
                                            str4 = str15;
                                            HashMap map6 = map5;
                                            String strC8 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "id");
                                            if (strC8 == null) {
                                                c2811a6 = r49;
                                                str6 = str13;
                                                map2 = map4;
                                                str7 = str14;
                                            } else {
                                                String strC9 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "origin");
                                                if (strC9 == null) {
                                                    str5 = strC9;
                                                    String strC10 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "style");
                                                    if (strC10 != null && (c3062c7 = (C3062c6) map3.get(strC10)) != null) {
                                                        strL = c3062c7.l();
                                                    }
                                                    if (strL != null) {
                                                        str6 = str13;
                                                        matcher3 = f26110f.matcher(strL);
                                                        str7 = str14;
                                                        matcher4 = f26111g.matcher(strL);
                                                        if (matcher3.matches()) {
                                                            map2 = map4;
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r49;
                                                                }
                                                                f16 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r49;
                                                                }
                                                                f10 = Float.parseFloat(strGroup8) / 100.0f;
                                                                f11 = f16;
                                                            } catch (NumberFormatException unused5) {
                                                                YU.c("TtmlParser", "Ignoring region with malformed origin: ".concat(strL));
                                                            }
                                                        } else {
                                                            map2 = map4;
                                                            if (matcher4.matches()) {
                                                                YU.c("TtmlParser", "Ignoring region with unsupported origin: ".concat(strL));
                                                            } else if (r10 == 0) {
                                                                YU.c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strL));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r49;
                                                                    }
                                                                    i16 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r49;
                                                                    }
                                                                    int i27 = Integer.parseInt(strGroup6);
                                                                    float f19 = i16 / r10.f25534a;
                                                                    f10 = i27 / r10.f25535b;
                                                                    f11 = f19;
                                                                } catch (NumberFormatException unused6) {
                                                                    YU.c("TtmlParser", "Ignoring region with malformed origin: ".concat(strL));
                                                                }
                                                            }
                                                            c2811a6 = r49;
                                                        }
                                                    } else {
                                                        str6 = str13;
                                                        map2 = map4;
                                                        str7 = str14;
                                                        f10 = 0.0f;
                                                        f11 = 0.0f;
                                                    }
                                                    strC2 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "extent");
                                                    if (strC2 == null && (strC5 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "style")) != null && (c3062c6 = (C3062c6) map3.get(strC5)) != null) {
                                                        strC2 = c3062c6.n();
                                                    }
                                                    if (strC2 != null) {
                                                        matcher = f26110f.matcher(strC2);
                                                        matcher2 = f26111g.matcher(strC2);
                                                        if (matcher.matches()) {
                                                            try {
                                                                strGroup3 = matcher.group(1);
                                                                if (strGroup3 != null) {
                                                                    throw r49;
                                                                }
                                                                f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                                strGroup4 = matcher.group(2);
                                                                if (strGroup4 != null) {
                                                                    throw r49;
                                                                }
                                                                f12 = f15;
                                                                f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                            } catch (NumberFormatException unused7) {
                                                                YU.c("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strL)));
                                                                c2811a6 = r49;
                                                            }
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                YU.c("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strL)));
                                                            } else if (r10 == 0) {
                                                                YU.c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strL)));
                                                            } else {
                                                                try {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r49;
                                                                    }
                                                                    i15 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r49;
                                                                    }
                                                                    int i28 = Integer.parseInt(strGroup2);
                                                                    float f20 = i15 / r10.f25534a;
                                                                    f13 = i28 / r10.f25535b;
                                                                    f12 = f20;
                                                                } catch (NumberFormatException unused8) {
                                                                    YU.c("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strL)));
                                                                    c2811a6 = r49;
                                                                }
                                                            }
                                                            c2811a6 = r49;
                                                        }
                                                    } else {
                                                        f12 = 1.0f;
                                                        f13 = 1.0f;
                                                    }
                                                    strC3 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "displayAlign");
                                                    if (strC3 != null) {
                                                        strA2 = AbstractC1483As0.a(strC3);
                                                        iHashCode2 = strA2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940 && strA2.equals("after")) {
                                                                b12 = 1;
                                                            } else {
                                                                b12 = -1;
                                                            }
                                                        } else if (strA2.equals("center")) {
                                                            b12 = 0;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        if (b12 != 0) {
                                                            f14 = f10 + (f13 / 2.0f);
                                                            i13 = 1;
                                                        } else if (b12 != 1) {
                                                            i13 = 0;
                                                            f14 = f10;
                                                        } else {
                                                            f14 = f10 + f13;
                                                            i13 = 2;
                                                        }
                                                    } else {
                                                        i13 = 0;
                                                        f14 = f10;
                                                    }
                                                    float f21 = 1.0f / i25;
                                                    strC4 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "writingMode");
                                                    if (strC4 != null) {
                                                        strA = AbstractC1483As0.a(strC4);
                                                        iHashCode = strA.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode != 3553576 && strA.equals("tbrl")) {
                                                                    b11 = 2;
                                                                } else {
                                                                    b11 = -1;
                                                                }
                                                            } else if (strA.equals("tblr")) {
                                                                b11 = 1;
                                                            } else {
                                                                b11 = -1;
                                                            }
                                                        } else if (strA.equals("tb")) {
                                                            b11 = 0;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        if (b11 != 0 || b11 == 1) {
                                                            i14 = 2;
                                                        } else if (b11 != 2) {
                                                            i14 = Integer.MIN_VALUE;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                    } else {
                                                        i14 = Integer.MIN_VALUE;
                                                    }
                                                    c2811a6 = new C2811a6(strC8, f11, f14, 0, i13, f12, f13, 1, f21, i14);
                                                } else {
                                                    str5 = strC9;
                                                }
                                                strL = str5;
                                                if (strL != null) {
                                                    str6 = str13;
                                                    matcher3 = f26110f.matcher(strL);
                                                    str7 = str14;
                                                    matcher4 = f26111g.matcher(strL);
                                                    if (matcher3.matches()) {
                                                        map2 = map4;
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r49;
                                                        }
                                                        f16 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r49;
                                                        }
                                                        f10 = Float.parseFloat(strGroup8) / 100.0f;
                                                        f11 = f16;
                                                    } else {
                                                        map2 = map4;
                                                        if (matcher4.matches()) {
                                                            YU.c("TtmlParser", "Ignoring region with unsupported origin: ".concat(strL));
                                                        } else if (r10 == 0) {
                                                            YU.c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strL));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r49;
                                                            }
                                                            i16 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r49;
                                                            }
                                                            int i29 = Integer.parseInt(strGroup6);
                                                            float f110 = i16 / r10.f25534a;
                                                            f10 = i29 / r10.f25535b;
                                                            f11 = f110;
                                                        }
                                                        c2811a6 = r49;
                                                    }
                                                } else {
                                                    str6 = str13;
                                                    map2 = map4;
                                                    str7 = str14;
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                strC2 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "extent");
                                                if (strC2 == null) {
                                                    strC2 = c3062c6.n();
                                                }
                                                if (strC2 != null) {
                                                    matcher = f26110f.matcher(strC2);
                                                    matcher2 = f26111g.matcher(strC2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r49;
                                                        }
                                                        f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r49;
                                                        }
                                                        f12 = f15;
                                                        f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            YU.c("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strL)));
                                                        } else if (r10 == 0) {
                                                            YU.c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strL)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r49;
                                                            }
                                                            i15 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r49;
                                                            }
                                                            int i210 = Integer.parseInt(strGroup2);
                                                            float f22 = i15 / r10.f25534a;
                                                            f13 = i210 / r10.f25535b;
                                                            f12 = f22;
                                                        }
                                                        c2811a6 = r49;
                                                    }
                                                } else {
                                                    f12 = 1.0f;
                                                    f13 = 1.0f;
                                                }
                                                strC3 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "displayAlign");
                                                if (strC3 != null) {
                                                    strA2 = AbstractC1483As0.a(strC3);
                                                    iHashCode2 = strA2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            b12 = -1;
                                                        } else {
                                                            b12 = 1;
                                                        }
                                                    } else if (strA2.equals("center")) {
                                                        b12 = 0;
                                                    } else {
                                                        b12 = -1;
                                                    }
                                                    if (b12 != 0) {
                                                        f14 = f10 + (f13 / 2.0f);
                                                        i13 = 1;
                                                    } else if (b12 != 1) {
                                                        i13 = 0;
                                                        f14 = f10;
                                                    } else {
                                                        f14 = f10 + f13;
                                                        i13 = 2;
                                                    }
                                                } else {
                                                    i13 = 0;
                                                    f14 = f10;
                                                }
                                                float f23 = 1.0f / i25;
                                                strC4 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "writingMode");
                                                if (strC4 != null) {
                                                    strA = AbstractC1483As0.a(strC4);
                                                    iHashCode = strA.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode != 3553576) {
                                                                b11 = -1;
                                                            } else {
                                                                b11 = 2;
                                                            }
                                                        } else if (strA.equals("tblr")) {
                                                            b11 = 1;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                    } else if (strA.equals("tb")) {
                                                        b11 = 0;
                                                    } else {
                                                        b11 = -1;
                                                    }
                                                    if (b11 != 0) {
                                                        i14 = 2;
                                                    } else {
                                                        i14 = 2;
                                                    }
                                                } else {
                                                    i14 = Integer.MIN_VALUE;
                                                }
                                                c2811a6 = new C2811a6(strC8, f11, f14, 0, i13, f12, f13, 1, f23, i14);
                                            }
                                            if (c2811a6 != 0) {
                                                map4 = map2;
                                                map4.put(c2811a6.f26415a, c2811a6);
                                            } else {
                                                map4 = map2;
                                            }
                                            str8 = str16;
                                            map = map6;
                                            str13 = str6;
                                            str3 = str7;
                                        } else {
                                            String str17 = str13;
                                            HashMap map7 = map5;
                                            str3 = str14;
                                            str4 = str15;
                                            if (AbstractC2546Ve0.b(xmlPullParserNewPullParser, str3)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str13 = str17;
                                                    if (!AbstractC2546Ve0.b(xmlPullParserNewPullParser, str13) || (strC = AbstractC2546Ve0.c(xmlPullParserNewPullParser, "id")) == null) {
                                                        map = map7;
                                                    } else {
                                                        map = map7;
                                                        map.put(strC, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!AbstractC2546Ve0.a(xmlPullParserNewPullParser, str3)) {
                                                        str17 = str13;
                                                        map7 = map;
                                                    }
                                                }
                                            } else {
                                                map = map7;
                                                str13 = str17;
                                            }
                                        }
                                        if (AbstractC2546Ve0.a(xmlPullParserNewPullParser, str8)) {
                                            x10 = x12;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            str14 = str3;
                                            map5 = map;
                                            str15 = str4;
                                            str16 = str8;
                                            str11 = str11;
                                        }
                                    }
                                    str8 = str16;
                                    if (AbstractC2546Ve0.a(xmlPullParserNewPullParser, str8)) {
                                        x10 = x12;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        str14 = str3;
                                        map5 = map;
                                        str15 = str4;
                                        str16 = str8;
                                        str11 = str11;
                                    }
                                }
                            } else {
                                str11 = str11;
                                map = map5;
                                Object obj3 = "region";
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    C3062c6 c3062c6D2 = d(xmlPullParserNewPullParser, r49);
                                    int i30 = 0;
                                    String str18 = str;
                                    long jG = -9223372036854775807L;
                                    long jG2 = -9223372036854775807L;
                                    long jG3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i30 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i30);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i30);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj3;
                                                    b10 = attributeName.equals(obj) ? (byte) 4 : (byte) -1;
                                                    break;
                                                case 99841:
                                                    if (attributeName.equals("dur")) {
                                                        obj = obj3;
                                                        b10 = 2;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (attributeName.equals("end")) {
                                                        obj = obj3;
                                                        b10 = 1;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (attributeName.equals("begin")) {
                                                        b10 = 0;
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (attributeName.equals("style")) {
                                                        obj = obj3;
                                                        b10 = 3;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (attributeName.equals("backgroundImage")) {
                                                        obj = obj3;
                                                        b10 = 5;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                default:
                                                    obj = obj3;
                                                    break;
                                            }
                                            if (b10 != 0) {
                                                i12 = 1;
                                                if (b10 == 1) {
                                                    x10 = x12;
                                                    jG = g(attributeValue6, x10);
                                                } else if (b10 != 2) {
                                                    if (b10 == 3) {
                                                        i12 = 1;
                                                        String[] strArrC2 = c(attributeValue6);
                                                        if (strArrC2.length > 0) {
                                                            strArr = strArrC2;
                                                        }
                                                    } else if (b10 == 4) {
                                                        i12 = 1;
                                                        if (map4.containsKey(attributeValue6)) {
                                                            str18 = attributeValue6;
                                                        }
                                                    } else if (b10 != 5) {
                                                        i12 = 1;
                                                    } else {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                i12 = 1;
                                                                try {
                                                                    strSubstring = attributeValue6.substring(1);
                                                                } catch (C5324u5 e10) {
                                                                    e = e10;
                                                                    x10 = x12;
                                                                    arrayDeque = arrayDeque2;
                                                                    YU.d("TtmlParser", "Suppressing parser error", e);
                                                                    x12 = x10;
                                                                    i17 = i12;
                                                                    r17 = r10;
                                                                    i18 = i25;
                                                                    c3188d7 = c3188d6;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    arrayDeque2 = arrayDeque;
                                                                    map5 = map;
                                                                    str9 = str;
                                                                    str10 = str2;
                                                                    x11 = x11;
                                                                    str11 = str11;
                                                                    obj2 = null;
                                                                    r19 = r17;
                                                                }
                                                            } else {
                                                                i12 = 1;
                                                            }
                                                        } catch (C5324u5 e11) {
                                                            e = e11;
                                                            i12 = 1;
                                                        }
                                                    }
                                                    x10 = x12;
                                                } else {
                                                    x10 = x12;
                                                    i12 = 1;
                                                    jG3 = g(attributeValue6, x10);
                                                }
                                            } else {
                                                x10 = x12;
                                                i12 = 1;
                                                jG2 = g(attributeValue6, x10);
                                            }
                                            try {
                                                i30++;
                                                x12 = x10;
                                                obj3 = obj;
                                            } catch (C5324u5 e12) {
                                                e = e12;
                                                arrayDeque = arrayDeque2;
                                                YU.d("TtmlParser", "Suppressing parser error", e);
                                                x12 = x10;
                                                i17 = i12;
                                                r17 = r10;
                                                i18 = i25;
                                                c3188d7 = c3188d6;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                arrayDeque2 = arrayDeque;
                                                map5 = map;
                                                str9 = str;
                                                str10 = str2;
                                                x11 = x11;
                                                str11 = str11;
                                                obj2 = null;
                                                r19 = r17;
                                            }
                                        } catch (C5324u5 e13) {
                                            e = e13;
                                            x10 = x12;
                                            i12 = 1;
                                        }
                                    }
                                    x10 = x12;
                                    i12 = 1;
                                    if (w12 != null) {
                                        w10 = w12;
                                        long j11 = w10.f24679d;
                                        if (j11 == -9223372036854775807L) {
                                            w11 = w10;
                                        } else {
                                            jG2 = jG2 != -9223372036854775807L ? jG2 + j11 : -9223372036854775807L;
                                            if (jG != -9223372036854775807L) {
                                                jG += j11;
                                                w11 = w10;
                                            } else {
                                                w11 = w10;
                                                jG = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        w10 = w12;
                                        w11 = null;
                                    }
                                    if (jG != -9223372036854775807L) {
                                        j10 = jG;
                                    } else {
                                        if (jG3 != -9223372036854775807L) {
                                            jG = jG2 + jG3;
                                        } else {
                                            if (w11 != null) {
                                                jG = w11.f24680e;
                                                if (jG != -9223372036854775807L) {
                                                }
                                            }
                                            j10 = -9223372036854775807L;
                                        }
                                        j10 = jG;
                                    }
                                    W5 w5B = W5.b(xmlPullParserNewPullParser.getName(), jG2, j10, c3062c6D2, strArr, str18, strSubstring, w11);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(w5B);
                                        if (w10 != null) {
                                            w10.d(w5B);
                                        }
                                    } catch (C5324u5 e14) {
                                        e = e14;
                                        YU.d("TtmlParser", "Suppressing parser error", e);
                                        x12 = x10;
                                        i17 = i12;
                                        r17 = r10;
                                        i18 = i25;
                                        c3188d7 = c3188d6;
                                    }
                                } catch (C5324u5 e15) {
                                    e = e15;
                                    x10 = x12;
                                    arrayDeque = arrayDeque2;
                                    i12 = 1;
                                }
                            }
                            x12 = x10;
                            r18 = r10;
                            i18 = i25;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str11);
                            sb.append(name2);
                            YU.b("TtmlParser", sb.toString());
                            str11 = str11;
                            map = map5;
                            r17 = r10;
                            i18 = i25;
                            c3188d7 = c3188d6;
                            arrayDeque = arrayDeque2;
                            i17 = 1;
                        }
                    } else {
                        str2 = str10;
                        str11 = str11;
                        arrayDeque = arrayDeque2;
                        x11 = x11;
                        c3188d6 = c3188d7;
                        i17 = i17;
                        map = map5;
                        if (eventType != 4) {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    W5 w13 = (W5) arrayDeque.peek();
                                    if (w13 == null) {
                                        r18 = r19;
                                        throw null;
                                    }
                                    r18 = r19;
                                    c3188d7 = new C3188d6(w13, map3, map4, map);
                                } else {
                                    r18 = r19;
                                    c3188d7 = c3188d6;
                                }
                                arrayDeque.pop();
                                r17 = r19;
                            }
                            i17 = i17;
                        } else {
                            if (w12 == null) {
                                throw null;
                            }
                            w12.d(W5.a(xmlPullParserNewPullParser.getText()));
                            r18 = r19;
                        }
                    }
                    r18 = r19;
                    r18 = r19;
                    c3188d7 = c3188d6;
                    r17 = r18;
                    i17 = i17;
                } else {
                    str = str9;
                    str2 = str10;
                    str11 = str11;
                    map = map5;
                    x11 = x11;
                    c3188d6 = c3188d7;
                    i17 = i17;
                    arrayDeque = arrayDeque2;
                    if (eventType == 2) {
                        i17++;
                        r17 = r19;
                    } else {
                        if (eventType == 3) {
                            r18 = r19;
                            i17--;
                            r17 = r19;
                        }
                        r18 = r19;
                        r18 = r19;
                        c3188d7 = c3188d6;
                        r17 = r18;
                        i17 = i17;
                    }
                    c3188d7 = c3188d6;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                map5 = map;
                str9 = str;
                str10 = str2;
                x11 = x11;
                str11 = str11;
                obj2 = null;
                r19 = r17;
            }
            C3188d6 c3188d8 = c3188d7;
            if (c3188d8 != null) {
                return c3188d8;
            }
            throw null;
        } catch (IOException e16) {
            throw new IllegalStateException("Unexpected error when reading input.", e16);
        } catch (XmlPullParserException e17) {
            throw new IllegalStateException("Unable to decode source", e17);
        }
    }
}
