package c9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f12192j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f12193k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f12194l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f12195m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f12196n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12205i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12207b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f12209d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12211f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f12212g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f12213h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f12214i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f12208c = 253402300799999L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f12210e = "/";

        private final a c(String str, boolean z9) {
            String strE = d9.a.e(str);
            if (strE != null) {
                this.f12209d = strE;
                this.f12214i = z9;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f12206a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f12207b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f12208c;
            String str3 = this.f12209d;
            if (str3 != null) {
                return new m(str, str2, j10, str3, this.f12210e, this.f12211f, this.f12212g, this.f12213h, this.f12214i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a b(String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return c(domain, false);
        }

        public final a d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.b(StringsKt.U0(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f12206a = name;
            return this;
        }

        public final a e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.b(StringsKt.U0(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f12207b = value;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z9) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z9)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (Intrinsics.b(str, str2)) {
                return true;
            }
            return StringsKt.x(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !d9.e.i(str);
        }

        private final String f(String str) {
            if (StringsKt.x(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = d9.a.e(StringsKt.s0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f12196n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iZ = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f12196n).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f12195m).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iZ == -1 && matcher.usePattern(m.f12194l).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f12194l.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iZ = StringsKt.Z(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f12193k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iZ == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(d9.e.f43191f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iZ - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").b(str)) {
                    return StringsKt.J(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j10, u url, String setCookie) {
            long j11;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iR = d9.e.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = d9.e.r(setCookie, '=', 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strA0 = d9.e.a0(setCookie, 0, iR2, 1, null);
            if (strA0.length() == 0 || d9.e.y(strA0) != -1) {
                return null;
            }
            String strZ = d9.e.Z(setCookie, iR2 + 1, iR);
            if (d9.e.y(strZ) != -1) {
                return null;
            }
            int i10 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iP = d9.e.p(setCookie, ';', i10, length);
                int iP2 = d9.e.p(setCookie, '=', i10, iP);
                String strZ2 = d9.e.Z(setCookie, i10, iP2);
                String strZ3 = iP2 < iP ? d9.e.Z(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (StringsKt.y(strZ2, "expires", true)) {
                    try {
                        jG = g(strZ3, 0, strZ3.length());
                        z10 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.y(strZ2, "max-age", true)) {
                    jH = h(strZ3);
                    z10 = true;
                } else if (StringsKt.y(strZ2, "domain", true)) {
                    strF = f(strZ3);
                    z12 = false;
                } else if (StringsKt.y(strZ2, "path", true)) {
                    str = strZ3;
                } else if (StringsKt.y(strZ2, "secure", true)) {
                    z11 = true;
                } else if (StringsKt.y(strZ2, "httponly", true)) {
                    z9 = true;
                }
                i10 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                strF = strH;
            } else if (!b(strH, strF)) {
                return mVar3;
            }
            if (strH.length() != strF.length() && PublicSuffixDatabase.f47702e.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.J(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iE0 = StringsKt.e0(strD, '/', 0, false, 6, null);
                if (iE0 != 0) {
                    strSubstring = strD.substring(0, iE0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strA0, strZ, j11, strF, str, z11, z9, z10, z12, null);
        }

        public final List e(u url, t headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listL = headers.l("Set-Cookie");
            int size = listL.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarC = c(url, (String) listL.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.i();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private b() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z9, z10, z11, z12);
    }

    public final String a() {
        return this.f12197a;
    }

    public final String b() {
        return this.f12198b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.b(mVar.f12197a, this.f12197a) && Intrinsics.b(mVar.f12198b, this.f12198b) && mVar.f12199c == this.f12199c && Intrinsics.b(mVar.f12200d, this.f12200d) && Intrinsics.b(mVar.f12201e, this.f12201e) && mVar.f12202f == this.f12202f && mVar.f12203g == this.f12203g && mVar.f12204h == this.f12204h && mVar.f12205i == this.f12205i;
    }

    public final String g() {
        return this.f12197a;
    }

    public final String h(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12197a);
        sb.append('=');
        sb.append(this.f12198b);
        if (this.f12204h) {
            if (this.f12199c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(i9.c.b(new Date(this.f12199c)));
            }
        }
        if (!this.f12205i) {
            sb.append("; domain=");
            if (z9) {
                sb.append(".");
            }
            sb.append(this.f12200d);
        }
        sb.append("; path=");
        sb.append(this.f12201e);
        if (this.f12202f) {
            sb.append("; secure");
        }
        if (this.f12203g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f12197a.hashCode()) * 31) + this.f12198b.hashCode()) * 31) + Long.hashCode(this.f12199c)) * 31) + this.f12200d.hashCode()) * 31) + this.f12201e.hashCode()) * 31) + Boolean.hashCode(this.f12202f)) * 31) + Boolean.hashCode(this.f12203g)) * 31) + Boolean.hashCode(this.f12204h)) * 31) + Boolean.hashCode(this.f12205i);
    }

    public final String i() {
        return this.f12198b;
    }

    public String toString() {
        return h(false);
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f12197a = str;
        this.f12198b = str2;
        this.f12199c = j10;
        this.f12200d = str3;
        this.f12201e = str4;
        this.f12202f = z9;
        this.f12203g = z10;
        this.f12204h = z11;
        this.f12205i = z12;
    }
}
