package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6324t implements Iterable, InterfaceC6289p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36892a;

    public C6324t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f36892a = str;
    }

    final /* synthetic */ String a() {
        return this.f36892a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return new r(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        String str2;
        String str3;
        String str4;
        byte b10;
        int i10;
        int i11;
        int i12;
        boolean z9;
        C6157a2 c6157a3;
        int i13;
        String str5 = "hasOwnProperty";
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str5 = str5;
                str3 = "charAt";
                str4 = "toString";
                b10 = str.equals(str5) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(str4)) {
                    b10 = 14;
                    str5 = str5;
                } else {
                    str5 = str5;
                }
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b10 = 12;
                    str4 = "toString";
                }
                str4 = "toString";
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str5 = str5;
                    str4 = "toString";
                    b10 = 0;
                } else {
                    str4 = "toString";
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str5 = str5;
                    str3 = "charAt";
                    str4 = "toString";
                    b10 = 1;
                } else {
                    str3 = "charAt";
                    str4 = "toString";
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = 13;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b10 = 7;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b10 = 11;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 4;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = 15;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b10 = 16;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 5;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 8;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 9;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 10;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = 6;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str5 = str5;
                    str3 = "charAt";
                    str4 = "toString";
                    b10 = 3;
                } else {
                    str3 = "charAt";
                    str4 = "toString";
                }
                break;
            default:
                str3 = "charAt";
                str4 = "toString";
                break;
        }
        String strZzc = "undefined";
        String str6 = str3;
        switch (b10) {
            case 0:
                B2.c(str6, 1, list);
                int i14 = !list.isEmpty() ? (int) B2.i(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) : 0;
                String str7 = this.f36892a;
                return (i14 < 0 || i14 >= str7.length()) ? InterfaceC6289p.f36807E : new C6324t(String.valueOf(str7.charAt(i14)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.f36892a);
                for (int i15 = 0; i15 < list.size(); i15++) {
                    sb.append(c6157a2.a((InterfaceC6289p) list.get(i15)).zzc());
                }
                return new C6324t(sb.toString());
            case 2:
                B2.a(str5, 1, list);
                String str8 = this.f36892a;
                InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
                if ("length".equals(interfaceC6289pA.zzc())) {
                    return InterfaceC6289p.f36805C;
                }
                double dDoubleValue = interfaceC6289pA.zzd().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str8.length()) ? InterfaceC6289p.f36806D : InterfaceC6289p.f36805C;
            case 3:
                B2.c("indexOf", 2, list);
                return new C6226i(Double.valueOf(this.f36892a.indexOf(list.size() > 0 ? c6157a2.a((InterfaceC6289p) list.get(0)).zzc() : "undefined", (int) B2.i(list.size() >= 2 ? c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue() : 0.0d))));
            case 4:
                B2.c("lastIndexOf", 2, list);
                String str9 = this.f36892a;
                String strZzc2 = list.size() > 0 ? c6157a2.a((InterfaceC6289p) list.get(0)).zzc() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue();
                return new C6226i(Double.valueOf(str9.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : B2.i(dDoubleValue2)))));
            case 5:
                B2.c("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : c6157a2.a((InterfaceC6289p) list.get(0)).zzc()).matcher(this.f36892a);
                return matcher.find() ? new C6199f(Arrays.asList(new C6324t(matcher.group()))) : InterfaceC6289p.f36809y;
            case 6:
                B2.c("replace", 2, list);
                InterfaceC6289p interfaceC6289pC = InterfaceC6289p.f36808x;
                if (!list.isEmpty()) {
                    strZzc = c6157a2.a((InterfaceC6289p) list.get(0)).zzc();
                    if (list.size() > 1) {
                        interfaceC6289pC = c6157a2.a((InterfaceC6289p) list.get(1));
                    }
                }
                String str10 = strZzc;
                String str11 = this.f36892a;
                int iIndexOf = str11.indexOf(str10);
                if (iIndexOf < 0) {
                    return this;
                }
                if (interfaceC6289pC instanceof AbstractC6235j) {
                    i11 = 0;
                    interfaceC6289pC = ((AbstractC6235j) interfaceC6289pC).c(c6157a2, Arrays.asList(new C6324t(str10), new C6226i(Double.valueOf(iIndexOf)), this));
                } else {
                    i11 = 0;
                }
                String strSubstring = str11.substring(i11, iIndexOf);
                String strZzc3 = interfaceC6289pC.zzc();
                String strSubstring2 = str11.substring(iIndexOf + str10.length());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length());
                sb2.append(strSubstring);
                sb2.append(strZzc3);
                sb2.append(strSubstring2);
                return new C6324t(sb2.toString());
            case 7:
                B2.c("search", 1, list);
                Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : c6157a2.a((InterfaceC6289p) list.get(0)).zzc()).matcher(this.f36892a);
                return matcher2.find() ? new C6226i(Double.valueOf(matcher2.start())) : new C6226i(Double.valueOf(-1.0d));
            case 8:
                B2.c("slice", 2, list);
                String str12 = this.f36892a;
                double dI = B2.i(!list.isEmpty() ? c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue() : 0.0d);
                double dMax = dI < 0.0d ? Math.max(((double) str12.length()) + dI, 0.0d) : Math.min(dI, str12.length());
                double dI2 = B2.i(list.size() > 1 ? c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue() : str12.length());
                int i16 = (int) dMax;
                return new C6324t(str12.substring(i16, Math.max(0, ((int) (dI2 < 0.0d ? Math.max(((double) str12.length()) + dI2, 0.0d) : Math.min(dI2, str12.length()))) - i16) + i16));
            case 9:
                B2.c("split", 2, list);
                String str13 = this.f36892a;
                if (str13.length() == 0) {
                    return new C6199f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzc4 = c6157a2.a((InterfaceC6289p) list.get(0)).zzc();
                    long jH = list.size() > 1 ? B2.h(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()) : 2147483647L;
                    if (jH == 0) {
                        return new C6199f();
                    }
                    String[] strArrSplit = str13.split(Pattern.quote(strZzc4), ((int) jH) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc4.isEmpty() || length <= 0) {
                        i12 = length;
                        z9 = false;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i12 = length - 1;
                        if (!strArrSplit[i12].isEmpty()) {
                            i12 = length;
                        }
                        z9 = zIsEmpty;
                    }
                    if (length > jH) {
                        i12--;
                    }
                    for (?? r10 = z9; r10 < i12; r10++) {
                        arrayList.add(new C6324t(strArrSplit[r10]));
                    }
                }
                return new C6199f(arrayList);
            case 10:
                B2.c("substring", 2, list);
                String str14 = this.f36892a;
                if (list.isEmpty()) {
                    c6157a3 = c6157a2;
                    i13 = 0;
                } else {
                    c6157a3 = c6157a2;
                    i13 = (int) B2.i(c6157a3.a((InterfaceC6289p) list.get(0)).zzd().doubleValue());
                }
                int i17 = list.size() > 1 ? (int) B2.i(c6157a3.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()) : str14.length();
                int iMin = Math.min(Math.max(i13, 0), str14.length());
                int iMin2 = Math.min(Math.max(i17, 0), str14.length());
                return new C6324t(str14.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                B2.a("toLocaleUpperCase", 0, list);
                return new C6324t(this.f36892a.toUpperCase());
            case 12:
                B2.a("toLocaleLowerCase", 0, list);
                return new C6324t(this.f36892a.toLowerCase());
            case 13:
                B2.a("toLowerCase", 0, list);
                return new C6324t(this.f36892a.toLowerCase(Locale.ENGLISH));
            case 14:
                B2.a(str4, 0, list);
                return this;
            case 15:
                B2.a("toUpperCase", 0, list);
                return new C6324t(this.f36892a.toUpperCase(Locale.ENGLISH));
            case 16:
                B2.a("toUpperCase", 0, list);
                return new C6324t(this.f36892a.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6324t) {
            return this.f36892a.equals(((C6324t) obj).f36892a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return new C6324t(this.f36892a);
    }

    public final int hashCode() {
        return this.f36892a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6315s(this);
    }

    public final String toString() {
        String str = this.f36892a;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        return this.f36892a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        String str = this.f36892a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        return Boolean.valueOf(!this.f36892a.isEmpty());
    }
}
