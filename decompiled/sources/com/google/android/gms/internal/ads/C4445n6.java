package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4445n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f31689d;

    private C4445n6(String str, int i10, String str2, Set set) {
        this.f31687b = i10;
        this.f31686a = str;
        this.f31688c = str2;
        this.f31689d = set;
    }

    public static C4445n6 a(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        AbstractC2418Ss0.a(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = AbstractC4634ob0.f32117a;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new C4445n6(str4, i10, str2, hashSet);
    }

    public static C4445n6 b() {
        return new C4445n6("", 0, "", Collections.EMPTY_SET);
    }
}
