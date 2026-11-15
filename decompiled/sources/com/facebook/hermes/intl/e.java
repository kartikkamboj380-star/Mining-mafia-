package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public B2.b f13913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f13914b = new HashMap();
    }

    public static String a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static ULocale b(B2.b bVar) {
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) bVar.c()}, ULocale.getAvailableLocales(), zArr);
        if (zArr[0] || uLocaleAcceptLanguage == null) {
            return null;
        }
        return uLocaleAcceptLanguage;
    }

    public static a c(String[] strArr) {
        a aVar = new a();
        for (String str : strArr) {
            B2.b bVarB = B2.g.b(str);
            ULocale uLocaleB = b(bVarB);
            if (uLocaleB != null) {
                aVar.f13913a = B2.h.j(uLocaleB);
                aVar.f13914b = bVarB.a();
                return aVar;
            }
        }
        aVar.f13913a = B2.h.h();
        return aVar;
    }

    public static String[] d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(B2.g.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static a f(String[] strArr) {
        return g(strArr, e());
    }

    public static a g(String[] strArr, String[] strArr2) {
        a aVar = new a();
        for (String str : strArr) {
            B2.b bVarB = B2.g.b(str);
            String strA = a(strArr2, bVarB.e());
            if (!strA.isEmpty()) {
                aVar.f13913a = B2.g.b(strA);
                aVar.f13914b = bVarB.a();
                return aVar;
            }
        }
        aVar.f13913a = B2.g.a();
        return aVar;
    }

    public static String[] h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrE = e();
        for (String str : strArr) {
            String strA = a(strArrE, B2.g.b(str).e());
            if (strA != null && !strA.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
