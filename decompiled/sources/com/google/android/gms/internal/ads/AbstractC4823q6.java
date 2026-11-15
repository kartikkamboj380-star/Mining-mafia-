package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4823q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f32566a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f32567b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f32568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f32569d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f32568c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f32569d = Collections.unmodifiableMap(map2);
    }

    public static C4067k6 a(P10 p10, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strN = p10.n(charset);
        if (strN != null) {
            Pattern pattern = f32566a;
            Matcher matcher = pattern.matcher(strN);
            if (matcher.matches()) {
                return d(null, matcher, p10, list);
            }
            String strN2 = p10.n(charset);
            if (strN2 != null) {
                Matcher matcher2 = pattern.matcher(strN2);
                if (matcher2.matches()) {
                    return d(strN.trim(), matcher2, p10, list);
                }
            }
        }
        return null;
    }

    static C3955jD b(String str) {
        C4697p6 c4697p6 = new C4697p6();
        e(str, c4697p6);
        return c4697p6.a();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    static SpannedString c(String str, String str2, List list) {
        byte b10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            int length = i10 + 1;
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b10 == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b10 == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b10 != 3) {
                        StringBuilder sb = new StringBuilder(strSubstring.length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(strSubstring);
                        sb.append(";'");
                        YU.c("WebvttCueParser", sb.toString());
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i11 = length - 2;
                boolean z9 = str2.charAt(i11) == '/';
                int i12 = i10 + (cCharAt2 == '/' ? 2 : 1);
                if (!z9) {
                    i11 = length - 1;
                }
                String strSubstring2 = str2.substring(i12, i11);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    AbstractC2418Ss0.a(!strTrim.isEmpty());
                    String str3 = AbstractC4634ob0.f32117a;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    switch (str4) {
                        case "b":
                        case "c":
                        case "i":
                        case "lang":
                        case "ruby":
                        case "rt":
                        case "u":
                        case "v":
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    C4445n6 c4445n6 = (C4445n6) arrayDeque.pop();
                                    f(str, c4445n6, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new C4319m6(c4445n6, spannableStringBuilder.length(), null));
                                    }
                                    if (c4445n6.f31686a.equals(str4)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                if (!z9) {
                                    arrayDeque.push(C4445n6.a(strSubstring2, spannableStringBuilder.length()));
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            i10 = length;
        }
        while (!arrayDeque.isEmpty()) {
            f(str, (C4445n6) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        f(str, C4445n6.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static C4067k6 d(String str, Matcher matcher, P10 p10, List list) {
        C4697p6 c4697p6 = new C4697p6();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            c4697p6.f32290a = AbstractC5074s6.a(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            c4697p6.f32291b = AbstractC5074s6.a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, c4697p6);
            StringBuilder sb = new StringBuilder();
            String strN = p10.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strN.trim());
                strN = p10.n(StandardCharsets.UTF_8);
            }
            c4697p6.f32292c = c(str, sb.toString(), list);
            return new C4067k6(c4697p6.a().r(), c4697p6.f32290a, c4697p6.f32291b);
        } catch (IllegalArgumentException unused) {
            YU.c("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void e(String str, C4697p6 c4697p6) {
        byte b10;
        byte b11;
        byte b12;
        Matcher matcher = f32567b.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i11 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b13 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b13 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b13 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b13 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b13 = 0;
                                }
                                break;
                        }
                        if (b13 == 0) {
                            i11 = 0;
                        } else if (b13 == 1 || b13 == 2) {
                            i11 = 1;
                        } else if (b13 != 3) {
                            YU.c("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i11 = LinearLayoutManager.INVALID_OFFSET;
                        }
                        c4697p6.f32296g = i11;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        c4697p6.f32294e = AbstractC5074s6.b(strGroup2);
                        c4697p6.f32295f = 0;
                    } else {
                        c4697p6.f32294e = Integer.parseInt(strGroup2);
                        c4697p6.f32295f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                            b10 = 2;
                            break;
                        case "middle":
                            b10 = 3;
                            break;
                        case "end":
                            b10 = 4;
                            break;
                        case "left":
                            b10 = 1;
                            break;
                        case "right":
                            b10 = 5;
                            break;
                        case "start":
                            b10 = 0;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 != 0) {
                        if (b10 == 1) {
                            i10 = 4;
                        } else if (b10 == 2 || b10 == 3) {
                            i10 = 2;
                        } else if (b10 == 4) {
                            i10 = 3;
                        } else if (b10 != 5) {
                            YU.c("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i10 = 2;
                        } else {
                            i10 = 5;
                        }
                    }
                    c4697p6.f32293d = i10;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                b12 = 0;
                                break;
                            case "center":
                                b12 = 2;
                                break;
                            case "line-right":
                                b12 = 4;
                                break;
                            case "middle":
                                b12 = 3;
                                break;
                            case "end":
                                b12 = 5;
                                break;
                            case "start":
                                b12 = 1;
                                break;
                            default:
                                b12 = -1;
                                break;
                        }
                        if (b12 == 0 || b12 == 1) {
                            i10 = 0;
                        } else if (b12 != 2 && b12 != 3) {
                            if (b12 == 4 || b12 == 5) {
                                i10 = 2;
                            } else {
                                YU.c("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i10 = LinearLayoutManager.INVALID_OFFSET;
                            }
                        }
                        c4697p6.f32298i = i10;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    c4697p6.f32297h = AbstractC5074s6.b(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c4697p6.f32299j = AbstractC5074s6.b(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b11 = 0;
                        } else {
                            b11 = -1;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    if (b11 != 0) {
                        if (b11 != 1) {
                            YU.c("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i10 = LinearLayoutManager.INVALID_OFFSET;
                        } else {
                            i10 = 2;
                        }
                    }
                    c4697p6.f32300k = i10;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(":");
                    sb.append(strGroup2);
                    YU.c("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                YU.c("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    private static void f(String str, C4445n6 c4445n6, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b10;
        int i10 = c4445n6.f31687b;
        int length = spannableStringBuilder.length();
        String str2 = c4445n6.f31686a;
        int iHashCode = str2.hashCode();
        int i11 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b10 = 5;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b10 = 4;
                            } else {
                                b10 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b10 = 6;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals("i")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("")) {
            b10 = 7;
        } else {
            b10 = -1;
        }
        switch (b10) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 2:
                int iG = g(list2, str, c4445n6);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C4319m6.f31441c);
                int i12 = i10;
                int i13 = 0;
                int length2 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((C4319m6) arrayList.get(i13)).c().f31686a)) {
                        C4319m6 c4319m6 = (C4319m6) arrayList.get(i13);
                        int iG2 = g(list2, str, c4319m6.c());
                        if (iG2 == i11) {
                            iG2 = iG != i11 ? iG : 1;
                        }
                        int i14 = c4319m6.c().f31687b - length2;
                        int iD = c4319m6.d() - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, iD);
                        spannableStringBuilder.delete(i14, iD);
                        spannableStringBuilder.setSpan(new C5346uG(charSequenceSubSequence.toString(), iG2), i12, i14, 33);
                        length2 += charSequenceSubSequence.length();
                        i12 = i14;
                    }
                    i13++;
                    i11 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 4:
                for (String str3 : c4445n6.f31689d) {
                    Map map = f32568c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = f32569d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new XH(c4445n6.f31688c), i10, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listH = h(list2, str, c4445n6);
        for (int i15 = 0; i15 < listH.size(); i15++) {
            C3941j6 c3941j6 = ((C4571o6) listH.get(i15)).f31964b;
            if (c3941j6 != null) {
                if (c3941j6.g() != -1) {
                    VG.a(spannableStringBuilder, new StyleSpan(c3941j6.g()), i10, length, 33);
                }
                if (c3941j6.h()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                }
                if (c3941j6.p()) {
                    VG.a(spannableStringBuilder, new ForegroundColorSpan(c3941j6.n()), i10, length, 33);
                }
                if (c3941j6.s()) {
                    VG.a(spannableStringBuilder, new BackgroundColorSpan(c3941j6.q()), i10, length, 33);
                }
                if (c3941j6.l() != null) {
                    VG.a(spannableStringBuilder, new TypefaceSpan(c3941j6.l()), i10, length, 33);
                }
                int iV = c3941j6.v();
                if (iV == 1) {
                    VG.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c3941j6.w(), true), i10, length, 33);
                } else if (iV == 2) {
                    VG.a(spannableStringBuilder, new RelativeSizeSpan(c3941j6.w()), i10, length, 33);
                } else if (iV == 3) {
                    VG.a(spannableStringBuilder, new RelativeSizeSpan(c3941j6.w() / 100.0f), i10, length, 33);
                }
                if (c3941j6.A()) {
                    spannableStringBuilder.setSpan(new TF(), i10, length, 33);
                }
            }
        }
    }

    private static int g(List list, String str, C4445n6 c4445n6) {
        List listH = h(list, str, c4445n6);
        for (int i10 = 0; i10 < listH.size(); i10++) {
            C3941j6 c3941j6 = ((C4571o6) listH.get(i10)).f31964b;
            if (c3941j6.y() != -1) {
                return c3941j6.y();
            }
        }
        return -1;
    }

    private static List h(List list, String str, C4445n6 c4445n6) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3941j6 c3941j6 = (C3941j6) list.get(i10);
            int iF = c3941j6.f(str, c4445n6.f31686a, c4445n6.f31689d, c4445n6.f31688c);
            if (iF > 0) {
                arrayList.add(new C4571o6(iF, c3941j6));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
