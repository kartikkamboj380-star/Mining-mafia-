package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1503Bc0 implements InterfaceC1451Ac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f17665a;

    public C1503Bc0(H4.h2 h2Var, String str, int i10, String str2, H4.s2 s2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(h2Var.f1292b));
        }
        if (hashSet.contains(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            arrayList.add(a(h2Var.f1293c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(h2Var.f1293c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(h2Var.f1294d));
        }
        if (hashSet.contains("keywords")) {
            List list = h2Var.f1295e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(h2Var.f1296f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(h2Var.f1297g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(h2Var.f1298h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(h2Var.f1299i);
        }
        if (hashSet.contains("location")) {
            Location location = h2Var.f1301k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(h2Var.f1302l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(h2Var.f1303m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(h2Var.f1304v));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = h2Var.f1305w;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(h2Var.f1278G);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(h2Var.f1279H);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(h2Var.f1280I));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(h2Var.f1282K));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(h2Var.f1283L);
        }
        if (hashSet.contains(AdUnitActivity.EXTRA_ORIENTATION)) {
            if (s2Var != null) {
                arrayList.add(Integer.valueOf(s2Var.f1431a));
            } else {
                arrayList.add(null);
            }
        }
        this.f17665a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        String strA;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strA = "null";
            } else {
                strA = obj instanceof Bundle ? a((Bundle) obj) : obj.toString();
            }
            sb.append(strA);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1503Bc0) {
            return Arrays.equals(this.f17665a, ((C1503Bc0) obj).f17665a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17665a);
    }

    public final String toString() {
        Object[] objArr = this.f17665a;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
