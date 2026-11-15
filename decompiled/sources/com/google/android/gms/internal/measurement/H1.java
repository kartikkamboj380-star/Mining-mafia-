package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class H1 extends AbstractC6205f5 implements G5 {
    private static final H1 zzh;
    private int zzb;
    private R1 zzd;
    private L1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        H1 h10 = new H1();
        zzh = h10;
        AbstractC6205f5.s(H1.class, h10);
    }

    private H1() {
    }

    public static H1 L() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new H1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new G1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final R1 D() {
        R1 r10 = this.zzd;
        return r10 == null ? R1.K() : r10;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final L1 F() {
        L1 l10 = this.zze;
        return l10 == null ? L1.M() : l10;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final String K() {
        return this.zzg;
    }

    final /* synthetic */ void M(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
