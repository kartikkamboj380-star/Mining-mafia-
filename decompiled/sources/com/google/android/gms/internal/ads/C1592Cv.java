package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1592Cv implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18009a = new ArrayList();

    public final boolean a(InterfaceC2265Pu interfaceC2265Pu) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C1540Bv c1540Bv = (C1540Bv) it.next();
            if (c1540Bv.f17738c == interfaceC2265Pu) {
                arrayList.add(c1540Bv);
            }
        }
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((C1540Bv) obj).f17739d.m();
        }
        return true;
    }

    final C1540Bv b(InterfaceC2265Pu interfaceC2265Pu) {
        Iterator it = iterator();
        while (it.hasNext()) {
            C1540Bv c1540Bv = (C1540Bv) it.next();
            if (c1540Bv.f17738c == interfaceC2265Pu) {
                return c1540Bv;
            }
        }
        return null;
    }

    public final void d(C1540Bv c1540Bv) {
        this.f18009a.add(c1540Bv);
    }

    public final void e(C1540Bv c1540Bv) {
        this.f18009a.remove(c1540Bv);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18009a.iterator();
    }
}
