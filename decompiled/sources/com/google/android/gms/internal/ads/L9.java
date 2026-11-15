package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class L9 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        M9 m10 = (M9) obj;
        M9 m11 = (M9) obj2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = m10.f20778a.length;
            if (i10 >= length || i11 >= m11.f20778a.length) {
                break;
            }
            int iCompare = Integer.compare(M9.g(m10.b(i10)), M9.g(m11.b(i11)));
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
            i11++;
        }
        return Integer.compare(length, m11.f20778a.length);
    }
}
