package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6247k2 extends AbstractC6205f5 implements G5 {
    private static final C6247k2 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C6247k2 c6247k2 = new C6247k2();
        zzh = c6247k2;
        AbstractC6205f5.s(C6247k2.class, c6247k2);
    }

    private C6247k2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C6247k2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6238j2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
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

    public final boolean G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final int I() {
        return this.zzg;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
