package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1593Cv0 extends AbstractC5425ut0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterator f18010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Set f18011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Set f18012e;

    C1593Cv0(C1645Dv0 c1645Dv0, Set set, Set set2) {
        this.f18011d = set;
        this.f18012e = set2;
        Objects.requireNonNull(c1645Dv0);
        this.f18010c = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5425ut0
    protected final Object a() {
        Set set;
        Object next;
        do {
            Iterator it = this.f18010c;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.f18012e;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
