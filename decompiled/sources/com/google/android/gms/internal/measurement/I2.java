package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class I2 extends AbstractC6205f5 implements G5 {
    private static final I2 zzh;
    private int zzb;
    private int zzd;
    private C6257l3 zze;
    private C6257l3 zzf;
    private boolean zzg;

    static {
        I2 i10 = new I2();
        zzh = i10;
        AbstractC6205f5.s(I2.class, i10);
    }

    private I2() {
    }

    public static H2 K() {
        return (H2) zzh.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new I2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new H2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final C6257l3 E() {
        C6257l3 c6257l3 = this.zze;
        return c6257l3 == null ? C6257l3.M() : c6257l3;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final C6257l3 G() {
        C6257l3 c6257l3 = this.zzf;
        return c6257l3 == null ? C6257l3.M() : c6257l3;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final boolean I() {
        return this.zzg;
    }

    final /* synthetic */ void L(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void M(C6257l3 c6257l3) {
        c6257l3.getClass();
        this.zze = c6257l3;
        this.zzb |= 2;
    }

    final /* synthetic */ void N(C6257l3 c6257l3) {
        this.zzf = c6257l3;
        this.zzb |= 4;
    }

    final /* synthetic */ void O(boolean z9) {
        this.zzb |= 8;
        this.zzg = z9;
    }
}
