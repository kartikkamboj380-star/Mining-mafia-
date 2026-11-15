package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C30 implements InterfaceC1899Is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C30 f17778a = new C30();

    private /* synthetic */ C30() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new E30(arrayList);
    }
}
