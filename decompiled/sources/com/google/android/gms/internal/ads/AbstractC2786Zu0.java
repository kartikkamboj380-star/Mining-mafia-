package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2786Zu0 {
    public static ArrayList a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList b(int i10) {
        AbstractC2472Tt0.b(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List c(List list, InterfaceC1899Is0 interfaceC1899Is0) {
        return list instanceof RandomAccess ? new C2630Wu0(list, interfaceC1899Is0) : new C2734Yu0(list, interfaceC1899Is0);
    }
}
