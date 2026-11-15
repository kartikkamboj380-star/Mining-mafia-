package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class S5 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f23119d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f23120e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f23121a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f23122b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f23123c = new P10();

    public static float b(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long c(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = j10 + (Long.parseLong(strGroup2) * 60000);
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = j11 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        P10 p10;
        String str;
        byte b10;
        byte b11;
        int i12;
        KD kdR;
        S5 s10 = this;
        P10 p11 = s10.f23123c;
        p11.A(bArr, i10 + i11);
        p11.G(i10);
        Charset charsetR = p11.r();
        if (charsetR == null) {
            charsetR = StandardCharsets.UTF_8;
        }
        while (true) {
            String strN = p11.n(charsetR);
            if (strN == null) {
                return;
            }
            if (strN.isEmpty()) {
                p10 = p11;
            } else {
                try {
                    Integer.parseInt(strN);
                    P10 p12 = s10.f23123c;
                    String strN2 = p12.n(charsetR);
                    if (strN2 == null) {
                        YU.c("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f23119d.matcher(strN2);
                    if (matcher.matches()) {
                        long jC = c(matcher, 1);
                        long jC2 = c(matcher, 6);
                        StringBuilder sb = s10.f23121a;
                        int i13 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = s10.f23122b;
                        arrayList.clear();
                        String strN3 = p12.n(charsetR);
                        while (!TextUtils.isEmpty(strN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strN3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f23120e.matcher(strTrim);
                            int i14 = i13;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i14;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i14 += length;
                                p11 = p11;
                            }
                            sb.append(sb2.toString());
                            strN3 = p12.n(charsetR);
                            i13 = 0;
                        }
                        p10 = p11;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                str = (String) arrayList.get(i15);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i15++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        C3955jD c3955jD = new C3955jD();
                        c3955jD.a(spannedFromHtml);
                        if (str == null) {
                            kdR = c3955jD.r();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b10 = 0;
                                    break;
                                case "{\an3}":
                                    b10 = 3;
                                    break;
                                case "{\an4}":
                                    b10 = 1;
                                    break;
                                case "{\an6}":
                                    b10 = 4;
                                    break;
                                case "{\an7}":
                                    b10 = 2;
                                    break;
                                case "{\an9}":
                                    b10 = 5;
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0 || b10 == 1 || b10 == 2) {
                                c3955jD.j(0);
                            } else if (b10 == 3 || b10 == 4 || b10 == 5) {
                                c3955jD.j(2);
                            } else {
                                c3955jD.j(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b11 = 0;
                                    break;
                                case "{\an2}":
                                    b11 = 1;
                                    break;
                                case "{\an3}":
                                    b11 = 2;
                                    break;
                                case "{\an7}":
                                    b11 = 3;
                                    break;
                                case "{\an8}":
                                    b11 = 4;
                                    break;
                                case "{\an9}":
                                    b11 = 5;
                                    break;
                                default:
                                    b11 = -1;
                                    break;
                            }
                            if (b11 == 0 || b11 == 1) {
                                i12 = 2;
                            } else {
                                if (b11 == 2) {
                                    i12 = 2;
                                } else if (b11 == 3 || b11 == 4 || b11 == 5) {
                                    c3955jD.g(0);
                                } else {
                                    c3955jD.g(1);
                                }
                                c3955jD.i(b(c3955jD.k()));
                                c3955jD.f(b(c3955jD.h()), 0);
                                kdR = c3955jD.r();
                            }
                            c3955jD.g(i12);
                            c3955jD.i(b(c3955jD.k()));
                            c3955jD.f(b(c3955jD.h()), 0);
                            kdR = c3955jD.r();
                        }
                        interfaceC3977jO.zza(new C4695p5(AbstractC5931yu0.m(kdR), jC, jC2 - jC));
                    } else {
                        p10 = p11;
                        YU.c("SubripParser", "Skipping invalid timing: ".concat(strN2));
                    }
                } catch (NumberFormatException unused) {
                    p10 = p11;
                    YU.c("SubripParser", "Skipping invalid index: ".concat(strN));
                }
            }
            s10 = this;
            p11 = p10;
        }
    }
}
