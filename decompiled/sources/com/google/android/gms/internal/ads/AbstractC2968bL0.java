package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2968bL0 implements InterfaceC5737xM0 {
    protected static ZM0 l(InterfaceC5863yM0 interfaceC5863yM0) {
        return new ZM0(interfaceC5863yM0);
    }

    protected static void m(Iterable iterable, List list) {
        byte[] bArr = AbstractC3346eM0.f27766b;
        iterable.getClass();
        if (iterable instanceof GM0) {
            list.addAll((Collection) iterable);
        } else {
            n(iterable, list);
        }
    }

    private static void n(Iterable iterable, List list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof IM0) {
                ((IM0) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    o(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                o(list, size2);
            }
            list.add(obj2);
        }
    }

    private static void o(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public AbstractC2968bL0 i(byte[] bArr, HL0 hl0) {
        return k(bArr, 0, bArr.length, hl0);
    }

    public abstract AbstractC2968bL0 k(byte[] bArr, int i10, int i11, HL0 hl0);
}
