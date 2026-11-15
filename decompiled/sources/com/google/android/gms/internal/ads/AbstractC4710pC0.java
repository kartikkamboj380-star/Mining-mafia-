package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4710pC0 extends AbstractC5859yK0 {
    public static final AbstractC4977rK0 c(XK0 xk0) throws IOException {
        String strX;
        int iQ = xk0.Q();
        AbstractC4977rK0 abstractC4977rK0E = e(xk0, iQ);
        if (abstractC4977rK0E == null) {
            return d(xk0, iQ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (xk0.v()) {
                if (abstractC4977rK0E instanceof C5229tK0) {
                    strX = xk0.x();
                    if (!AbstractC5087sC0.a(strX)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strX = null;
                }
                int iQ2 = xk0.Q();
                AbstractC4977rK0 abstractC4977rK0E2 = e(xk0, iQ2);
                AbstractC4977rK0 abstractC4977rK0D = abstractC4977rK0E2 == null ? d(xk0, iQ2) : abstractC4977rK0E2;
                if (abstractC4977rK0E instanceof C4852qK0) {
                    ((C4852qK0) abstractC4977rK0E).g(abstractC4977rK0D);
                } else {
                    C5229tK0 c5229tK0 = (C5229tK0) abstractC4977rK0E;
                    if (c5229tK0.j(strX)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(strX)));
                    }
                    c5229tK0.g(strX, abstractC4977rK0D);
                }
                if (abstractC4977rK0E2 != null) {
                    arrayDeque.addLast(abstractC4977rK0E);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    abstractC4977rK0E = abstractC4977rK0D;
                } else {
                    continue;
                }
            } else {
                if (abstractC4977rK0E instanceof C4852qK0) {
                    xk0.h();
                } else {
                    xk0.n();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC4977rK0E;
                }
                abstractC4977rK0E = (AbstractC4977rK0) arrayDeque.removeLast();
            }
        }
    }

    private static final AbstractC4977rK0 d(XK0 xk0, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            String strG = xk0.G();
            if (AbstractC5087sC0.a(strG)) {
                return new C5481vK0(strG);
            }
            throw new IOException("illegal characters in string");
        }
        if (i11 == 6) {
            return new C5481vK0(new C4836qC0(xk0.G()));
        }
        if (i11 == 7) {
            return new C5481vK0(Boolean.valueOf(xk0.J()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(YK0.a(i10)));
        }
        xk0.M();
        return C5103sK0.f33140a;
    }

    private static final AbstractC4977rK0 e(XK0 xk0, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            xk0.c();
            return new C4852qK0();
        }
        if (i11 != 2) {
            return null;
        }
        xk0.j();
        return new C5229tK0();
    }
}
