package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5452v6 implements InterfaceC5198t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f33989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f33990c;

    public C5452v6(List list) {
        this.f33988a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f33989b = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4067k6 c4067k6 = (C4067k6) list.get(i10);
            long[] jArr = this.f33989b;
            int i11 = i10 + i10;
            jArr[i11] = c4067k6.f30694b;
            jArr[i11 + 1] = c4067k6.f30695c;
        }
        long[] jArr2 = this.f33989b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f33990c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5198t5
    public final List a(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f33988a;
            if (i10 >= list.size()) {
                break;
            }
            long[] jArr = this.f33989b;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C4067k6 c4067k6 = (C4067k6) list.get(i10);
                KD kd = c4067k6.f30693a;
                if (kd.f20144e == -3.4028235E38f) {
                    arrayList2.add(c4067k6);
                } else {
                    arrayList.add(kd);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, C5200t6.f33321a);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            C3955jD c3955jDA = ((C4067k6) arrayList2.get(i12)).f30693a.a();
            c3955jDA.f((-1) - i12, 1);
            arrayList.add(c3955jDA.r());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5198t5
    public final long b(int i10) {
        AbstractC2418Ss0.a(i10 >= 0);
        long[] jArr = this.f33990c;
        AbstractC2418Ss0.a(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5198t5
    public final int zza() {
        return this.f33990c.length;
    }
}
