package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class W3 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5568w1 f24653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f24654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24656d;

    public W3(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        int i11;
        this.f24654b = sparseArray;
        this.f24655c = j10;
        this.f24656d = i10;
        List list = (List) sparseArray.get(i10);
        C5568w1 c5568w1 = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                V3 v10 = (V3) list.get(i13);
                jArrCopyOf3[i13] = v10.c();
                jArrCopyOf[i13] = v10.d();
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j10) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j11 + j12) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j10 - jArrCopyOf3[i15];
            if (i15 < i11) {
                YU.c("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            c5568w1 = new C5568w1(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f24653a = c5568w1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        C5568w1 c5568w1 = this.f24653a;
        if (c5568w1 != null) {
            return c5568w1.a(j10);
        }
        C4437n2 c4437n2 = C4437n2.f31650c;
        return new C4059k2(c4437n2, c4437n2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f24655c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        List list = (List) this.f24654b.get(this.f24656d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
