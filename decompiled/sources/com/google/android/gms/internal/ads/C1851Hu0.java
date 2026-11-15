package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1851Hu0 extends AbstractC5049ru0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object[] f19412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19413e;

    public C1851Hu0() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5301tu0
    public final /* bridge */ /* synthetic */ AbstractC5301tu0 a(Object obj) {
        g(obj);
        return this;
    }

    public final C1851Hu0 g(Object obj) {
        obj.getClass();
        if (this.f19412d != null) {
            int iR = AbstractC1903Iu0.r(this.f33039b);
            Object[] objArr = this.f19412d;
            if (iR <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = AbstractC4924qu0.a(iHashCode);
                while (true) {
                    int i10 = iA & length;
                    Object[] objArr2 = this.f19412d;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.f19413e += iHashCode;
                        super.c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iA = i10 + 1;
                }
            }
        }
        this.f19412d = null;
        super.c(obj);
        return this;
    }

    public final C1851Hu0 h(Object... objArr) {
        if (this.f19412d == null) {
            d(objArr, 2);
            return this;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            g(objArr[i10]);
        }
        return this;
    }

    public final C1851Hu0 i(Iterable iterable) {
        iterable.getClass();
        if (this.f19412d == null) {
            super.e(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        return this;
    }

    public final AbstractC1903Iu0 j() {
        AbstractC1903Iu0 abstractC1903Iu0A;
        int i10 = this.f33039b;
        if (i10 == 0) {
            return C6059zv0.f35880i;
        }
        if (i10 == 1) {
            Object obj = this.f33038a[0];
            Objects.requireNonNull(obj);
            return new C1957Jv0(obj);
        }
        if (this.f19412d == null || AbstractC1903Iu0.r(i10) != this.f19412d.length) {
            abstractC1903Iu0A = AbstractC1903Iu0.A(this.f33039b, this.f33038a);
            this.f33039b = abstractC1903Iu0A.size();
        } else {
            int i11 = this.f33039b;
            Object[] objArrCopyOf = this.f33038a;
            if (AbstractC1903Iu0.B(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            int i12 = this.f19413e;
            Object[] objArr = this.f19412d;
            abstractC1903Iu0A = new C6059zv0(objArrCopyOf, i12, objArr, objArr.length - 1, this.f33039b);
        }
        this.f33040c = true;
        this.f19412d = null;
        return abstractC1903Iu0A;
    }

    C1851Hu0(int i10, boolean z9) {
        super(i10);
        this.f19412d = new Object[AbstractC1903Iu0.r(i10)];
    }
}
