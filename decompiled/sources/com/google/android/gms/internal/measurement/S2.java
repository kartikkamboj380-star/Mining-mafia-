package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class S2 extends AbstractC6205f5 implements G5 {
    private static final S2 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        S2 s10 = new S2();
        zzf = s10;
        AbstractC6205f5.s(S2.class, s10);
    }

    private S2() {
    }

    public static R2 G() {
        return (R2) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new S2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new R2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final long F() {
        return this.zze;
    }

    final /* synthetic */ void H(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void I(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
