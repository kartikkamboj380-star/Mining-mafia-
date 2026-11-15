package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5694x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f34710a = new LinkedHashMap();

    public final void a(C5568w1 c5568w1) {
        long[] jArr = c5568w1.f34452e;
        if (jArr.length > 0) {
            Map map = this.f34710a;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), c5568w1);
        }
    }

    public final C5568w1 b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C5568w1 c5568w1 : this.f34710a.values()) {
            arrayList.add(c5568w1.f34449b);
            arrayList2.add(c5568w1.f34450c);
            arrayList3.add(c5568w1.f34451d);
            arrayList4.add(c5568w1.f34452e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i10 = (int) length;
        AbstractC2418Ss0.e(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i11, length2);
            i11 += length2;
        }
        return new C5568w1(iArr3, AbstractC5809xw0.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), AbstractC5809xw0.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), AbstractC5809xw0.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
