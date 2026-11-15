package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class I3 extends AbstractC6205f5 implements G5 {
    private static final I3 zzj;
    private int zzb;
    private int zzd;
    private InterfaceC6259l5 zze = AbstractC6205f5.y();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        I3 i10 = new I3();
        zzj = i10;
        AbstractC6205f5.s(I3.class, i10);
    }

    private I3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", G3.f36277a, "zze", I3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new I3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new F3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List C() {
        return this.zze;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 4) != 0;
    }

    public final String F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzb & 8) != 0;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 16) != 0;
    }

    public final double K() {
        return this.zzi;
    }

    public final int M() {
        int iA = H3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
