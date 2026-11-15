package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.facebook.hermes.intl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateFormat f13921a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13923b;

        static {
            int[] iArr = new int[com.facebook.hermes.intl.b.k.values().length];
            f13923b = iArr;
            try {
                iArr[com.facebook.hermes.intl.b.k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13923b[com.facebook.hermes.intl.b.k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13923b[com.facebook.hermes.intl.b.k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13923b[com.facebook.hermes.intl.b.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13923b[com.facebook.hermes.intl.b.k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.facebook.hermes.intl.b.EnumC0322b.values().length];
            f13922a = iArr2;
            try {
                iArr2[com.facebook.hermes.intl.b.EnumC0322b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13922a[com.facebook.hermes.intl.b.EnumC0322b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13922a[com.facebook.hermes.intl.b.EnumC0322b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13922a[com.facebook.hermes.intl.b.EnumC0322b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13922a[com.facebook.hermes.intl.b.EnumC0322b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static class b {
        public static String a(String str) {
            StringBuilder sb = new StringBuilder();
            boolean z9 = false;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\'') {
                    z9 = !z9;
                } else if (!z9 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb.append(str.charAt(i10));
                }
            }
            return sb.toString();
        }
    }

    i() {
    }

    private static String i(B2.b bVar, com.facebook.hermes.intl.b.EnumC0322b enumC0322b, com.facebook.hermes.intl.b.k kVar) {
        if (enumC0322b == com.facebook.hermes.intl.b.EnumC0322b.UNDEFINED) {
            return ((SimpleDateFormat) DateFormat.getTimeInstance(m(kVar), (ULocale) bVar.getLocale())).toLocalizedPattern();
        }
        return kVar == com.facebook.hermes.intl.b.k.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(l(enumC0322b), (ULocale) bVar.getLocale())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(l(enumC0322b), m(kVar), (ULocale) bVar.getLocale())).toLocalizedPattern();
    }

    private static String j(B2.b bVar, com.facebook.hermes.intl.b.m mVar, com.facebook.hermes.intl.b.d dVar, com.facebook.hermes.intl.b.n nVar, com.facebook.hermes.intl.b.i iVar, com.facebook.hermes.intl.b.c cVar, com.facebook.hermes.intl.b.f fVar, com.facebook.hermes.intl.b.h hVar, com.facebook.hermes.intl.b.j jVar, com.facebook.hermes.intl.b.l lVar, com.facebook.hermes.intl.b.g gVar, com.facebook.hermes.intl.b.EnumC0322b enumC0322b, com.facebook.hermes.intl.b.k kVar, Object obj) {
        StringBuilder sb = new StringBuilder();
        if (enumC0322b == com.facebook.hermes.intl.b.EnumC0322b.UNDEFINED && kVar == com.facebook.hermes.intl.b.k.UNDEFINED) {
            sb.append(mVar.d());
            sb.append(dVar.d());
            sb.append(nVar.d());
            sb.append(iVar.d());
            sb.append(cVar.d());
            if (gVar == com.facebook.hermes.intl.b.g.H11 || gVar == com.facebook.hermes.intl.b.g.H12) {
                sb.append(fVar.d());
            } else {
                sb.append(fVar.e());
            }
            sb.append(hVar.d());
            sb.append(jVar.d());
            sb.append(lVar.d());
        } else {
            sb.append(i(bVar, enumC0322b, kVar));
            HashMap mapA = bVar.a();
            if (mapA.containsKey("hc")) {
                String str = (String) mapA.get("hc");
                if (str == "h11" || str == "h12") {
                    k(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == "h23" || str == "h24") {
                    k(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (gVar == com.facebook.hermes.intl.b.g.H11 || gVar == com.facebook.hermes.intl.b.g.H12) {
                k(sb, new char[]{'H', 'K', 'k'}, 'h');
            } else if (gVar == com.facebook.hermes.intl.b.g.H23 || gVar == com.facebook.hermes.intl.b.g.H24) {
                k(sb, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!B2.d.n(obj) && !B2.d.j(obj)) {
                if (B2.d.e(obj)) {
                    k(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    k(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb.toString();
    }

    private static void k(StringBuilder sb, char[] cArr, char c10) {
        for (int i10 = 0; i10 < sb.length(); i10++) {
            for (char c11 : cArr) {
                if (sb.charAt(i10) == c11) {
                    sb.setCharAt(i10, c10);
                    break;
                }
            }
        }
    }

    static int l(com.facebook.hermes.intl.b.EnumC0322b enumC0322b) throws B2.f {
        int i10 = a.f13922a[enumC0322b.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new B2.f("Invalid DateStyle: " + enumC0322b.toString());
    }

    static int m(com.facebook.hermes.intl.b.k kVar) throws B2.f {
        int i10 = a.f13923b[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new B2.f("Invalid DateStyle: " + kVar.toString());
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d10) {
        return this.f13921a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(B2.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public String c(double d10) {
        return this.f13921a.format(new Date((long) d10));
    }

    @Override // com.facebook.hermes.intl.b
    public void d(B2.b bVar, String str, String str2, com.facebook.hermes.intl.b.e eVar, com.facebook.hermes.intl.b.m mVar, com.facebook.hermes.intl.b.d dVar, com.facebook.hermes.intl.b.n nVar, com.facebook.hermes.intl.b.i iVar, com.facebook.hermes.intl.b.c cVar, com.facebook.hermes.intl.b.f fVar, com.facebook.hermes.intl.b.h hVar, com.facebook.hermes.intl.b.j jVar, com.facebook.hermes.intl.b.l lVar, com.facebook.hermes.intl.b.g gVar, Object obj, com.facebook.hermes.intl.b.EnumC0322b enumC0322b, com.facebook.hermes.intl.b.k kVar, Object obj2) throws B2.f {
        Calendar calendar;
        B2.b bVar2;
        String strJ = j(bVar, mVar, dVar, nVar, iVar, cVar, fVar, hVar, jVar, lVar, gVar, enumC0322b, kVar, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(B2.d.h(str));
            B2.b bVarD = bVar.d();
            bVarD.f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) bVarD.getLocale());
        }
        if (str2.isEmpty()) {
            bVar2 = bVar;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(B2.d.h(str2)) == null) {
                    throw new B2.f("Invalid numbering system: " + str2);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(B2.d.h(str2));
                bVar2 = bVar;
                bVar2.f("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new B2.f("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f13921a = DateFormat.getPatternInstance(calendar, strJ, (ULocale) bVar2.getLocale());
        } else {
            this.f13921a = DateFormat.getPatternInstance(strJ, (ULocale) bVar2.getLocale());
        }
        if (B2.d.n(obj) || B2.d.j(obj)) {
            return;
        }
        this.f13921a.setTimeZone(TimeZone.getTimeZone(B2.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String e(B2.b bVar) {
        return B2.j.d(DateFormat.getDateInstance(3, (ULocale) bVar.getLocale()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.b
    public com.facebook.hermes.intl.b.g f(B2.b bVar) {
        try {
            String strA = b.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.getLocale())).toPattern());
            if (strA.contains(String.valueOf('h'))) {
                return com.facebook.hermes.intl.b.g.H12;
            }
            if (strA.contains(String.valueOf('K'))) {
                return com.facebook.hermes.intl.b.g.H11;
            }
            return strA.contains(String.valueOf('H')) ? com.facebook.hermes.intl.b.g.H23 : com.facebook.hermes.intl.b.g.H24;
        } catch (ClassCastException unused) {
            return com.facebook.hermes.intl.b.g.H24;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String g(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        }
        if (attribute == DateFormat.Field.MONTH) {
            return "month";
        }
        if (attribute == DateFormat.Field.DAY_OF_MONTH) {
            return "day";
        }
        if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
            return "hour";
        }
        if (attribute == DateFormat.Field.MINUTE) {
            return "minute";
        }
        if (attribute == DateFormat.Field.SECOND) {
            return "second";
        }
        if (attribute == DateFormat.Field.TIME_ZONE) {
            return "timeZoneName";
        }
        if (attribute == DateFormat.Field.AM_PM) {
            return "dayPeriod";
        }
        return attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
    }

    @Override // com.facebook.hermes.intl.b
    public String h(B2.b bVar) {
        return Calendar.getInstance((ULocale) bVar.getLocale()).getTimeZone().getID();
    }
}
