package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5092sF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33128e;

    static {
        String str = AbstractC4634ob0.f32117a;
        f33124a = Integer.toString(0, 36);
        f33125b = Integer.toString(1, 36);
        f33126c = Integer.toString(2, 36);
        f33127d = Integer.toString(3, 36);
        f33128e = Integer.toString(4, 36);
    }

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C5346uG c5346uG : (C5346uG[]) spanned.getSpans(0, spanned.length(), C5346uG.class)) {
            arrayList.add(b(spanned, c5346uG, 1, c5346uG.a()));
        }
        for (C5600wH c5600wH : (C5600wH[]) spanned.getSpans(0, spanned.length(), C5600wH.class)) {
            arrayList.add(b(spanned, c5600wH, 2, c5600wH.a()));
        }
        for (TF tf : (TF[]) spanned.getSpans(0, spanned.length(), TF.class)) {
            arrayList.add(b(spanned, tf, 3, null));
        }
        for (XH xh : (XH[]) spanned.getSpans(0, spanned.length(), XH.class)) {
            arrayList.add(b(spanned, xh, 4, xh.a()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f33124a, spanned.getSpanStart(obj));
        bundle2.putInt(f33125b, spanned.getSpanEnd(obj));
        bundle2.putInt(f33126c, spanned.getSpanFlags(obj));
        bundle2.putInt(f33127d, i10);
        if (bundle != null) {
            bundle2.putBundle(f33128e, bundle);
        }
        return bundle2;
    }
}
