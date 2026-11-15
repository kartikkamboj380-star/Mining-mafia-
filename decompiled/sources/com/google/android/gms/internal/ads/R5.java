package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f22703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f22704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22710j;

    private R5(String str, int i10, Integer num, Integer num2, float f10, boolean z9, boolean z10, boolean z11, boolean z12, int i11) {
        this.f22701a = str;
        this.f22702b = i10;
        this.f22703c = num;
        this.f22704d = num2;
        this.f22705e = f10;
        this.f22706f = z9;
        this.f22707g = z10;
        this.f22708h = z11;
        this.f22709i = z12;
        this.f22710j = i11;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115 A[Catch: RuntimeException -> 0x00b8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00b8, blocks: (B:33:0x00be, B:35:0x00c4, B:39:0x00d4, B:41:0x00d8, B:45:0x00e7, B:47:0x00eb, B:51:0x00fc, B:53:0x0100, B:57:0x0111, B:59:0x0115, B:60:0x011d, B:68:0x013b, B:66:0x012e, B:28:0x009f, B:23:0x008b), top: B:73:0x0081, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    public static R5 a(String str, P5 p10) {
        float f10;
        int i10;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        int i15;
        String strTrim;
        int i16;
        AbstractC2418Ss0.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i17 = p10.f22025k;
        R5 r10 = null;
        if (length != i17) {
            Object[] objArr = {Integer.valueOf(i17), Integer.valueOf(length), str};
            String str2 = AbstractC4634ob0.f32117a;
            YU.c("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim2 = strArrSplit[p10.f22015a].trim();
            int i18 = p10.f22016b;
            int iD = i18 != -1 ? d(strArrSplit[i18].trim()) : -1;
            int i19 = p10.f22017c;
            Integer numB = i19 != -1 ? b(strArrSplit[i19].trim()) : null;
            int i20 = p10.f22018d;
            Integer numB2 = i20 != -1 ? b(strArrSplit[i20].trim()) : null;
            int i21 = p10.f22019e;
            try {
                if (i21 != -1) {
                    String strTrim3 = strArrSplit[i21].trim();
                    try {
                        f10 = Float.parseFloat(strTrim3);
                        r10 = null;
                    } catch (NumberFormatException e10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                        sb.append("Failed to parse font size: '");
                        sb.append(strTrim3);
                        sb.append("'");
                        YU.d("SsaStyle", sb.toString(), e10);
                        f10 = -3.4028235E38f;
                    }
                    i10 = p10.f22020f;
                    boolean z12 = false;
                    if (i10 == -1 && e(strArrSplit[i10].trim())) {
                        z12 = true;
                    }
                    i11 = p10.f22021g;
                    if (i11 == -1 && e(strArrSplit[i11].trim())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i12 = p10.f22022h;
                    if (i12 == -1 && e(strArrSplit[i12].trim())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i13 = p10.f22023i;
                    if (i13 == -1 && e(strArrSplit[i13].trim())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i14 = p10.f22024j;
                    if (i14 != -1) {
                        strTrim = strArrSplit[i14].trim();
                        try {
                            i16 = Integer.parseInt(strTrim.trim());
                            if (i16 != 1 || i16 == 3) {
                                i15 = i16;
                            } else {
                                YU.c("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim)));
                                i15 = -1;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        i15 = -1;
                    }
                    return new R5(strTrim2, iD, numB, numB2, f10, z12, z9, z10, z11, i15);
                }
                f10 = -3.4028235E38f;
                i10 = p10.f22020f;
                boolean z13 = false;
                if (i10 == -1) {
                }
                i11 = p10.f22021g;
                if (i11 == -1) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                i12 = p10.f22022h;
                if (i12 == -1) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                i13 = p10.f22023i;
                if (i13 == -1) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                i14 = p10.f22024j;
                if (i14 != -1) {
                    strTrim = strArrSplit[i14].trim();
                    i16 = Integer.parseInt(strTrim.trim());
                    if (i16 != 1) {
                    }
                    i15 = i16;
                } else {
                    i15 = -1;
                }
                return new R5(strTrim2, iD, numB, numB2, f10, z13, z9, z10, z11, i15);
            } catch (RuntimeException e11) {
                e = e11;
                StringBuilder sb2 = new StringBuilder(str.length() + 36);
                sb2.append("Skipping malformed 'Style:' line: '");
                sb2.append(str);
                sb2.append("'");
                YU.d("SsaStyle", sb2.toString(), e);
                return r10;
            }
        } catch (RuntimeException e12) {
            e = e12;
            r10 = null;
        }
    }

    public static Integer b(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC2418Ss0.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC5305tw0.a(((j10 >> 24) & 255) ^ 255), AbstractC5305tw0.a(j10 & 255), AbstractC5305tw0.a((j10 >> 8) & 255), AbstractC5305tw0.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            YU.d("SsaStyle", sb.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i10;
                default:
                    YU.c("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean e(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            YU.d("SsaStyle", sb.toString(), e10);
            return false;
        }
    }
}
