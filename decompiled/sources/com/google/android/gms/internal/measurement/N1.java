package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 extends AbstractC6205f5 implements G5 {
    private static final N1 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private H1 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        N1 n10 = new N1();
        zzj = n10;
        AbstractC6205f5.s(N1.class, n10);
    }

    private N1() {
    }

    public static M1 L() {
        return (M1) zzj.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new N1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new M1(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final String E() {
        return this.zze;
    }

    public final H1 F() {
        H1 h10 = this.zzf;
        return h10 == null ? H1.L() : h10;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 32) != 0;
    }

    public final boolean K() {
        return this.zzi;
    }

    final /* synthetic */ void M(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
