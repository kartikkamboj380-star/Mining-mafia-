package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class D1 extends AbstractC6205f5 implements G5 {
    private static final D1 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC6259l5 zze = AbstractC6205f5.y();
    private InterfaceC6259l5 zzf = AbstractC6205f5.y();
    private boolean zzg;
    private boolean zzh;

    static {
        D1 d10 = new D1();
        zzi = d10;
        AbstractC6205f5.s(D1.class, d10);
    }

    private D1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", N1.class, "zzf", F1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new D1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }

    public final int F() {
        return this.zze.size();
    }

    public final N1 G(int i10) {
        return (N1) this.zze.get(i10);
    }

    public final List H() {
        return this.zzf;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final F1 K(int i10) {
        return (F1) this.zzf.get(i10);
    }

    final /* synthetic */ void L(int i10, N1 n10) {
        n10.getClass();
        InterfaceC6259l5 interfaceC6259l5 = this.zze;
        if (!interfaceC6259l5.zza()) {
            this.zze = AbstractC6205f5.z(interfaceC6259l5);
        }
        this.zze.set(i10, n10);
    }

    final /* synthetic */ void M(int i10, F1 f10) {
        f10.getClass();
        InterfaceC6259l5 interfaceC6259l5 = this.zzf;
        if (!interfaceC6259l5.zza()) {
            this.zzf = AbstractC6205f5.z(interfaceC6259l5);
        }
        this.zzf.set(i10, f10);
    }
}
