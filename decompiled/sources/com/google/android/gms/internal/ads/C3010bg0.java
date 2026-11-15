package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3010bg0 extends AbstractC4798pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f26893a = new LinkedList();

    @Override // java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        C2029Lf0 c2029Lf0 = (C2029Lf0) obj;
        if (c2029Lf0.f() != 3) {
            this.f26893a.add(c2029Lf0);
            return true;
        }
        LinkedList linkedList = this.f26893a;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            C2029Lf0 c2029Lf1 = (C2029Lf0) listIterator.next();
            if (c2029Lf1.f() == 3) {
                double dE = c2029Lf1.e();
                double dE2 = c2029Lf0.e();
                if (dE < dE2 || (dE == dE2 && c2029Lf1.c() > c2029Lf0.c())) {
                    listIterator.set(c2029Lf0);
                    c2029Lf0 = c2029Lf1;
                }
            }
        }
        linkedList.add(c2029Lf0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4672ou0
    public final /* synthetic */ Object g() {
        return this.f26893a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420mu0
    public final /* synthetic */ Collection i() {
        return this.f26893a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4798pu0
    public final Queue j() {
        return this.f26893a;
    }
}
