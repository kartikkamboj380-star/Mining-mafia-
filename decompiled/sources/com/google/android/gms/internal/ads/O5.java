package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class O5 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f21457g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N5 f21459b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f21461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21462e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f21463f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f21460c = new P10();

    public O5(List list) {
        if (list == null || list.isEmpty()) {
            this.f21458a = false;
            this.f21459b = null;
            return;
        }
        this.f21458a = true;
        String strE = AbstractC4634ob0.E((byte[]) list.get(0));
        AbstractC2418Ss0.a(strE.startsWith("Format:"));
        N5 n5A = N5.a(strE);
        n5A.getClass();
        this.f21459b = n5A;
        b(new P10((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void b(P10 p10, Charset charset) {
        while (true) {
            String strN = p10.n(charset);
            if (strN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = p10.n(charset);
                    if (strN2 == null || (p10.C() != 0 && p10.O(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b10 = 0;
                        String strA = AbstractC1483As0.a(strArrSplit[0].trim());
                        switch (strA.hashCode()) {
                            case 1879649548:
                                if (!strA.equals("playresx")) {
                                    b10 = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strA.equals("playresy")) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            this.f21462e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b10 == 1) {
                            try {
                                this.f21463f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                P5 p5A = null;
                while (true) {
                    String strN3 = p10.n(charset);
                    if (strN3 != null && (p10.C() == 0 || p10.O(charset) != 91)) {
                        if (strN3.startsWith("Format:")) {
                            p5A = P5.a(strN3);
                        } else if (strN3.startsWith("Style:")) {
                            if (p5A == null) {
                                YU.c("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                            } else {
                                R5 r5A = R5.a(strN3, p5A);
                                if (r5A != null) {
                                    linkedHashMap.put(r5A.f22701a, r5A);
                                }
                            }
                        }
                    }
                }
                this.f21461d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                YU.b("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    private static long c(String str) {
        Matcher matcher = f21457g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = AbstractC4634ob0.f32117a;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float d(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int e(long j10, List list, List list2) {
        int i10;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:141:0x030f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        N5 n5A;
        N5 n10;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        int i15;
        Integer num;
        int i16;
        O5 o10 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        P10 p10 = o10.f21460c;
        p10.A(bArr, i10 + i11);
        p10.G(i10);
        Charset charsetR = p10.r();
        if (charsetR == null) {
            charsetR = StandardCharsets.UTF_8;
        }
        if (o10.f21458a) {
            n5A = o10.f21459b;
        } else {
            o10.b(p10, charsetR);
            n5A = null;
        }
        while (true) {
            String strN = p10.n(charsetR);
            if (strN == null) {
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    List list = (List) arrayList.get(i17);
                    if (!list.isEmpty()) {
                        if (i17 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i17)).longValue();
                        interfaceC3977jO.zza(new C4695p5(list, jLongValue, ((Long) arrayList2.get(i17 + 1)).longValue() - jLongValue));
                    } else if (i17 == 0) {
                        i17 = 0;
                        if (i17 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i17)).longValue();
                        interfaceC3977jO.zza(new C4695p5(list, jLongValue2, ((Long) arrayList2.get(i17 + 1)).longValue() - jLongValue2));
                    }
                    i17++;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                n5A = N5.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (n5A == null) {
                        YU.c("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        AbstractC2418Ss0.a(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i18 = n5A.f21056f;
                        String[] strArrSplit = strSubstring.split(",", i18);
                        if (strArrSplit.length != i18) {
                            YU.c("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            int i19 = n5A.f21051a;
                            if (i19 != -1) {
                                try {
                                    i12 = Integer.parseInt(strArrSplit[i19].trim());
                                } catch (RuntimeException unused) {
                                    YU.c("SsaParser", "Fail to parse layer: ".concat(String.valueOf(strArrSplit[n5A.f21051a])));
                                    i12 = 0;
                                }
                            } else {
                                i12 = 0;
                            }
                            long jC = c(strArrSplit[n5A.f21052b]);
                            if (jC == -9223372036854775807L) {
                                YU.c("SsaParser", "Skipping invalid timing: ".concat(strN));
                            } else {
                                long jC2 = c(strArrSplit[n5A.f21053c]);
                                if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                    n10 = n5A;
                                    p10 = p10;
                                    YU.c("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    Map map = o10.f21461d;
                                    R5 r10 = (map == null || (i16 = n5A.f21054d) == -1) ? null : (R5) map.get(strArrSplit[i16].trim());
                                    String str = strArrSplit[n5A.f21055e];
                                    Q5 q5A = Q5.a(str);
                                    String strReplace = Q5.b(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = o10.f21462e;
                                    float f11 = o10.f21463f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    C3955jD c3955jD = new C3955jD();
                                    c3955jD.a(spannableString);
                                    c3955jD.q(i12);
                                    if (r10 != null) {
                                        Integer num2 = r10.f22703c;
                                        n10 = n5A;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (r10.f22710j == 3 && (num = r10.f22704d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = r10.f22705e;
                                        if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                            c3955jD.l(f12 / f11, 1);
                                        }
                                        if (!r10.f22706f) {
                                            i14 = 0;
                                            i15 = 33;
                                            if (r10.f22707g) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (r10.f22707g) {
                                            i14 = 0;
                                            i15 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i14 = 0;
                                            i15 = 33;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (r10.f22708h) {
                                            spannableString.setSpan(new UnderlineSpan(), i14, spannableString.length(), i15);
                                        }
                                        if (r10.f22709i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i14, spannableString.length(), i15);
                                        }
                                    } else {
                                        n10 = n5A;
                                        p10 = p10;
                                        f10 = f10;
                                    }
                                    int i20 = q5A.f22291a;
                                    if (i20 == -1) {
                                        i20 = r10 != null ? r10.f22702b : -1;
                                    }
                                    switch (i20) {
                                        case 0:
                                        default:
                                            StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 19);
                                            sb.append("Unknown alignment: ");
                                            sb.append(i20);
                                            YU.c("SsaParser", sb.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    c3955jD.d(alignment);
                                    int i21 = LinearLayoutManager.INVALID_OFFSET;
                                    switch (i20) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 19);
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i20);
                                            YU.c("SsaParser", sb2.toString());
                                        case -1:
                                            i13 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i13 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i13 = 2;
                                            break;
                                    }
                                    c3955jD.j(i13);
                                    switch (i20) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i20).length() + 19);
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i20);
                                            YU.c("SsaParser", sb3.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i21 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i21 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i21 = 0;
                                            break;
                                    }
                                    c3955jD.g(i21);
                                    PointF pointF = q5A.f22292b;
                                    if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                        c3955jD.i(d(c3955jD.k()));
                                        c3955jD.f(d(c3955jD.h()), 0);
                                    } else {
                                        c3955jD.i(pointF.x / f10);
                                        c3955jD.f(pointF.y / f11, 0);
                                    }
                                    KD kdR = c3955jD.r();
                                    int iE = e(jC2, arrayList2, arrayList);
                                    for (int iE2 = e(jC, arrayList2, arrayList); iE2 < iE; iE2++) {
                                        ((List) arrayList.get(iE2)).add(kdR);
                                    }
                                }
                            }
                        }
                    }
                    n10 = n5A;
                    p10 = p10;
                } else {
                    n10 = n5A;
                    p10 = p10;
                }
                o10 = this;
                charsetR = charsetR;
                n5A = n10;
                p10 = p10;
            }
        }
    }
}
