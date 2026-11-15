package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class U2 extends AbstractC5316u1 {
    public U2(final V1 v10, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(v10);
        InterfaceC4938r1 interfaceC4938r1 = new InterfaceC4938r1() { // from class: com.google.android.gms.internal.ads.S2
            @Override // com.google.android.gms.internal.ads.InterfaceC4938r1
            public final /* synthetic */ long a(long j13) {
                return v10.b(j13);
            }
        };
        T2 t10 = new T2(v10, i10, null);
        long jA = v10.a();
        long j13 = v10.f24166j;
        int i11 = v10.f24160d;
        if (i11 > 0) {
            j12 = ((((long) i11) + ((long) v10.f24159c)) / 2) + 1;
        } else {
            int i12 = v10.f24157a;
            long j14 = 4096;
            if (i12 == v10.f24158b && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * ((long) v10.f24163g)) * ((long) v10.f24164h)) / 8);
        }
        super(interfaceC4938r1, t10, jA, 0L, j13, j10, j11, j12, Math.max(6, v10.f24159c));
    }
}
