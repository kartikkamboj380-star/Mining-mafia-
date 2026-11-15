package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class O01 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ O01 f21438a = new O01();

    private /* synthetic */ O01() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return AbstractC4168ku0.f().a((u11) Collections.max(list2, t11.f33301a), (u11) Collections.max(list, o11.f31931a), p11.f32269a).b(list2.size(), list.size()).a((u11) Collections.max(list2, q11.f32547a), (u11) Collections.max(list, r11.f32766a), s11.f33070a).e();
    }
}
