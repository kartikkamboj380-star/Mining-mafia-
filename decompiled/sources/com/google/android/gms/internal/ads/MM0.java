package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class MM0 {
    static final /* synthetic */ AbstractC5231tL0 a(AbstractC5231tL0 abstractC5231tL0, AbstractC5231tL0 abstractC5231tL1, ArrayDeque arrayDeque) {
        b(abstractC5231tL0, arrayDeque);
        b(abstractC5231tL1, arrayDeque);
        AbstractC5231tL0 om0 = (AbstractC5231tL0) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            om0 = new OM0((AbstractC5231tL0) arrayDeque.pop(), om0, null);
        }
        return om0;
    }

    private static final void b(AbstractC5231tL0 abstractC5231tL0, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!abstractC5231tL0.u()) {
            if (!(abstractC5231tL0 instanceof OM0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC5231tL0.getClass())));
            }
            OM0 om0 = (OM0) abstractC5231tL0;
            b(om0.J(), arrayDeque);
            b(om0.E(), arrayDeque);
            return;
        }
        int iC = c(abstractC5231tL0.j(), arrayDeque);
        int I9 = OM0.I(iC + 1);
        if (arrayDeque.isEmpty() || ((AbstractC5231tL0) arrayDeque.peek()).j() >= I9) {
            arrayDeque.push(abstractC5231tL0);
            return;
        }
        int I10 = OM0.I(iC);
        AbstractC5231tL0 om1 = (AbstractC5231tL0) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((AbstractC5231tL0) arrayDeque.peek()).j() >= I10) {
                break;
            } else {
                om1 = new OM0((AbstractC5231tL0) arrayDeque.pop(), om1, bArr);
            }
        }
        OM0 om2 = new OM0(om1, abstractC5231tL0, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((AbstractC5231tL0) arrayDeque.peek()).j() >= OM0.I(c(om2.j(), arrayDeque) + 1)) {
                break;
            } else {
                om2 = new OM0((AbstractC5231tL0) arrayDeque.pop(), om2, bArr);
            }
        }
        arrayDeque.push(om2);
    }

    private static final int c(int i10, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(OM0.f21538h, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
