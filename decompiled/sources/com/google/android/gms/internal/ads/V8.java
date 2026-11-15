package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V8 {
    public static C3821i8 a(C5456v8 c5456v8) {
        long j10;
        boolean z9;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = c5456v8.f34000c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jB = str != null ? b(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z9 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z9 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z9 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jB2 = str3 != null ? b(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        long jB3 = str4 != null ? b(str4) : j10;
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            long j15 = (j12 * 1000) + jCurrentTimeMillis;
            j14 = z9 ? j15 : (j11 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (jB <= j10 || jB2 < jB) ? j10 : (jB2 - jB) + jCurrentTimeMillis;
            j14 = j13;
        }
        C3821i8 c3821i8 = new C3821i8();
        c3821i8.f29280a = c5456v8.f33999b;
        c3821i8.f29281b = str5;
        c3821i8.f29285f = j13;
        c3821i8.f29284e = j14;
        c3821i8.f29282c = jB;
        c3821i8.f29283d = jB3;
        c3821i8.f29286g = map;
        c3821i8.f29287h = c5456v8.f34001d;
        return c3821i8;
    }

    public static long b(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                K8.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            K8.d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String c(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
