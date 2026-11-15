package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6356w4 implements F5 {
    protected int zza = 0;

    protected static void g(Iterable iterable, List list) {
        AbstractC6347v4.i(iterable, list);
    }

    public final byte[] a() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            int i10 = P4.f36457d;
            N4 n10 = new N4(bArr, 0, iB);
            c(n10);
            n10.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e10);
        }
    }

    abstract int f(Q5 q10);
}
