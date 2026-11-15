package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class L1 extends AbstractC6205f5 implements G5 {
    private static final L1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        L1 l10 = new L1();
        zzi = l10;
        AbstractC6205f5.s(L1.class, l10);
    }

    private L1() {
    }

    public static L1 M() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", J1.f36309a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new L1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new I1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final String L() {
        return this.zzh;
    }

    public final int O() {
        int iA = K1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
