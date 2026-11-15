package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6301q2 extends AbstractC6205f5 implements G5 {
    private static final C6301q2 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        C6301q2 c6301q2 = new C6301q2();
        zzi = c6301q2;
        AbstractC6205f5.s(C6301q2.class, c6301q2);
    }

    private C6301q2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C6301q2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6292p2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }
}
