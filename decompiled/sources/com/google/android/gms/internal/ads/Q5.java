package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class Q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f22287c = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f22288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f22289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f22290f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f22292b;

    static {
        String str = AbstractC4634ob0.f32117a;
        Locale locale = Locale.US;
        f22288d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f22289e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f22290f = Pattern.compile("\\\\an(\\d+)");
    }

    private Q5(int i10, PointF pointF) {
        this.f22291a = i10;
        this.f22292b = pointF;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:23:0x0085, B:25:0x0091, B:27:0x0097, B:28:0x009c), top: B:37:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x000a A[SYNTHETIC] */
    public static Q5 a(String str) {
        Matcher matcher;
        int iD;
        String strGroup;
        PointF pointF;
        String strGroup2;
        String strGroup3;
        Matcher matcher2 = f22287c.matcher(str);
        PointF pointF2 = null;
        int i10 = -1;
        while (matcher2.find()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            try {
                Matcher matcher3 = f22288d.matcher(strGroup4);
                Matcher matcher4 = f22289e.matcher(strGroup4);
                boolean zFind = matcher3.find();
                boolean zFind2 = matcher4.find();
                if (zFind) {
                    if (zFind2) {
                        StringBuilder sb = new StringBuilder(strGroup4.length() + 82);
                        sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                        sb.append(strGroup4);
                        sb.append("'");
                        YU.b("SsaStyle.Overrides", sb.toString());
                    }
                    strGroup2 = matcher3.group(1);
                    strGroup3 = matcher3.group(2);
                } else {
                    if (zFind2) {
                        strGroup2 = matcher4.group(1);
                        strGroup3 = matcher4.group(2);
                    } else {
                        pointF = null;
                    }
                    if (pointF != null) {
                        pointF2 = pointF;
                    }
                    try {
                        matcher = f22290f.matcher(strGroup4);
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                            if (strGroup != null) {
                                throw null;
                            }
                            iD = R5.d(strGroup);
                        } else {
                            iD = -1;
                        }
                        if (iD != -1) {
                            i10 = iD;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                if (strGroup2 == null) {
                    throw null;
                }
                float f10 = Float.parseFloat(strGroup2.trim());
                if (strGroup3 == null) {
                    throw null;
                }
                pointF = new PointF(f10, Float.parseFloat(strGroup3.trim()));
                if (pointF != null) {
                    pointF2 = pointF;
                }
                matcher = f22290f.matcher(strGroup4);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                    if (strGroup != null) {
                        throw null;
                    }
                    iD = R5.d(strGroup);
                } else {
                    iD = -1;
                }
                if (iD != -1) {
                    i10 = iD;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new Q5(i10, pointF2);
    }

    public static String b(String str) {
        return f22287c.matcher(str).replaceAll("");
    }
}
