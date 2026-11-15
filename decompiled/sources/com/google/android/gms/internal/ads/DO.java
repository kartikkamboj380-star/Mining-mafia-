package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DO implements InterfaceC1899Is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ DO f18155a = new DO();

    private /* synthetic */ DO() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (BO bo : (List) obj) {
            if (bo != null) {
                arrayList.add(bo);
            }
        }
        return arrayList;
    }
}
