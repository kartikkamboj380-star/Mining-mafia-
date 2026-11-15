package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4017ji {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C2449Ti.d("gad:dynamite_module:experiment_id", ""));
        c(arrayList, AbstractC3769hj.f29046a);
        c(arrayList, AbstractC3769hj.f29047b);
        c(arrayList, AbstractC3769hj.f29048c);
        c(arrayList, AbstractC3769hj.f29049d);
        c(arrayList, AbstractC3769hj.f29050e);
        c(arrayList, AbstractC3769hj.f29066u);
        c(arrayList, AbstractC3769hj.f29051f);
        c(arrayList, AbstractC3769hj.f29058m);
        c(arrayList, AbstractC3769hj.f29059n);
        c(arrayList, AbstractC3769hj.f29060o);
        c(arrayList, AbstractC3769hj.f29061p);
        c(arrayList, AbstractC3769hj.f29062q);
        c(arrayList, AbstractC3769hj.f29063r);
        c(arrayList, AbstractC3769hj.f29064s);
        c(arrayList, AbstractC3769hj.f29065t);
        c(arrayList, AbstractC3769hj.f29052g);
        c(arrayList, AbstractC3769hj.f29053h);
        c(arrayList, AbstractC3769hj.f29054i);
        c(arrayList, AbstractC3769hj.f29055j);
        c(arrayList, AbstractC3769hj.f29056k);
        c(arrayList, AbstractC3769hj.f29057l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, AbstractC5656wj.f34612a);
        return arrayList;
    }

    private static void c(List list, C2449Ti c2449Ti) {
        String str = (String) c2449Ti.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
