package com.facebook.react.views.text;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16335a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16335a = iArr;
        }
    }

    public static final String a(String str, y yVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = yVar == null ? -1 : a.f16335a[yVar.ordinal()];
        if (i10 == 1) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i10 == 2) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i10 != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i11 = next;
            int i12 = iFirst;
            iFirst = i11;
            if (iFirst == -1) {
                String string = sb.toString();
                Intrinsics.c(string);
                return string;
            }
            String strSubstring = str.substring(i12, iFirst);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                char upperCase2 = Character.toUpperCase(strSubstring.charAt(0));
                String strSubstring2 = strSubstring.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strSubstring = upperCase2 + strSubstring2;
            }
            sb.append(strSubstring);
            next = wordInstance.next();
        }
    }
}
