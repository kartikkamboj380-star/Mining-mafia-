package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class N2 extends AbstractC6205f5 implements G5 {
    private static final N2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        N2 n10 = new N2();
        zzf = n10;
        AbstractC6205f5.s(N2.class, n10);
    }

    private N2() {
    }

    public static M2 C() {
        return (M2) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", K2.f36318a, "zze", O2.f36433a});
        }
        if (i11 == 3) {
            return new N2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new M2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int E() {
        int iA = L2.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int F() {
        int iA = P2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void G(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void H(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
