package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class F1 extends AbstractC6205f5 implements G5 {
    private static final F1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC6259l5 zzf = AbstractC6205f5.y();
    private boolean zzg;
    private L1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        F1 f10 = new F1();
        zzl = f10;
        AbstractC6205f5.s(F1.class, f10);
    }

    private F1() {
    }

    public static E1 P() {
        return (E1) zzl.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", H1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new F1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new E1(bArr);
        }
        if (i11 == 5) {
            return zzl;
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

    public final List F() {
        return this.zzf;
    }

    public final int G() {
        return this.zzf.size();
    }

    public final H1 H(int i10) {
        return (H1) this.zzf.get(i10);
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final L1 K() {
        L1 l10 = this.zzh;
        return l10 == null ? L1.M() : l10;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zzb & 64) != 0;
    }

    public final boolean O() {
        return this.zzk;
    }

    final /* synthetic */ void Q(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void R(int i10, H1 h10) {
        h10.getClass();
        InterfaceC6259l5 interfaceC6259l5 = this.zzf;
        if (!interfaceC6259l5.zza()) {
            this.zzf = AbstractC6205f5.z(interfaceC6259l5);
        }
        this.zzf.set(i10, h10);
    }
}
