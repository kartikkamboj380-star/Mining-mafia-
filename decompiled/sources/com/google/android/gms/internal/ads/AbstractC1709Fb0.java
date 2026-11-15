package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1709Fb0 {
    public static H4.m2 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3628gb0 c3628gb0 = (C3628gb0) it.next();
            if (c3628gb0.f28692c) {
                arrayList.add(B4.f.f233p);
            } else {
                arrayList.add(new B4.f(c3628gb0.f28690a, c3628gb0.f28691b));
            }
        }
        return new H4.m2(context, (B4.f[]) arrayList.toArray(new B4.f[arrayList.size()]));
    }

    public static C3628gb0 b(H4.m2 m2Var) {
        return m2Var.f1379i ? new C3628gb0(-3, 0, true) : new C3628gb0(m2Var.f1375e, m2Var.f1372b, false);
    }
}
