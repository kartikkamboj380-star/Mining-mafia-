package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class R1 extends AbstractC6205f5 implements G5 {
    private static final R1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC6259l5 zzg = AbstractC6205f5.y();

    static {
        R1 r10 = new R1();
        zzh = r10;
        AbstractC6205f5.s(R1.class, r10);
    }

    private R1() {
    }

    public static R1 K() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", P1.f36445a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new R1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new O1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final String E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final List H() {
        return this.zzg;
    }

    public final int I() {
        return this.zzg.size();
    }

    public final int M() {
        int iA = Q1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
