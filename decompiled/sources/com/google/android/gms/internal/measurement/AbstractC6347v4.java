package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6347v4 implements E5 {
    private static void f(List list, int i10) {
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

    protected static void i(Iterable iterable, List list) {
        byte[] bArr = AbstractC6268m5.f36752b;
        iterable.getClass();
        if (iterable instanceof M5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof O5) {
                ((O5) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f(list, size2);
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
                f(list, size2);
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final /* synthetic */ E5 J(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final /* synthetic */ E5 S(byte[] bArr, T4 t10) {
        return h(bArr, 0, bArr.length, t10);
    }

    public abstract AbstractC6347v4 g(byte[] bArr, int i10, int i11);

    public abstract AbstractC6347v4 h(byte[] bArr, int i10, int i11, T4 t10);
}
