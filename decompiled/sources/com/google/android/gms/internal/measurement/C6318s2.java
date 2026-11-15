package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6318s2 extends AbstractC6205f5 implements G5 {
    private static final C6318s2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C6318s2 c6318s2 = new C6318s2();
        zzf = c6318s2;
        AbstractC6205f5.s(C6318s2.class, c6318s2);
    }

    private C6318s2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C6318s2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6309r2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
