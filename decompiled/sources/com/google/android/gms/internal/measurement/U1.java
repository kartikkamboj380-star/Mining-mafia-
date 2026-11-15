package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 extends AbstractC6205f5 implements G5 {
    private static final U1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        U1 u10 = new U1();
        zzg = u10;
        AbstractC6205f5.s(U1.class, u10);
    }

    private U1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", Z1.f36561a, "zze", X1.f36542a, "zzf", C6193e2.f36670a});
        }
        if (i11 == 3) {
            return new U1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new T1(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int D() {
        int iA = AbstractC6166b2.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int E() {
        int iA = Y1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int F() {
        int iA = AbstractC6202f2.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
