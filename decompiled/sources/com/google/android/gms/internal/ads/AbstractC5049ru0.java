package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ru0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5049ru0 extends AbstractC5301tu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f33038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f33039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33040c;

    AbstractC5049ru0(int i10) {
        AbstractC2472Tt0.b(i10, "initialCapacity");
        this.f33038a = new Object[i10];
        this.f33039b = 0;
    }

    private final void f(int i10) {
        int length = this.f33038a.length;
        int iB = AbstractC5301tu0.b(length, this.f33039b + i10);
        if (iB > length || this.f33040c) {
            this.f33038a = Arrays.copyOf(this.f33038a, iB);
            this.f33040c = false;
        }
    }

    public final AbstractC5049ru0 c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f33038a;
        int i10 = this.f33039b;
        this.f33039b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    final void d(Object[] objArr, int i10) {
        AbstractC4926qv0.a(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.f33038a, this.f33039b, 2);
        this.f33039b += 2;
    }

    public final AbstractC5301tu0 e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof AbstractC5427uu0) {
                this.f33039b = ((AbstractC5427uu0) collection).j(this.f33038a, this.f33039b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
