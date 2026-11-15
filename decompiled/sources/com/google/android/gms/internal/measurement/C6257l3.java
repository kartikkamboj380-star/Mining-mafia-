package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6257l3 extends AbstractC6205f5 implements G5 {
    private static final C6257l3 zzg;
    private InterfaceC6250k5 zzb = AbstractC6205f5.w();
    private InterfaceC6250k5 zzd = AbstractC6205f5.w();
    private InterfaceC6259l5 zze = AbstractC6205f5.y();
    private InterfaceC6259l5 zzf = AbstractC6205f5.y();

    static {
        C6257l3 c6257l3 = new C6257l3();
        zzg = c6257l3;
        AbstractC6205f5.s(C6257l3.class, c6257l3);
    }

    private C6257l3() {
    }

    public static C6248k3 L() {
        return (C6248k3) zzg.o();
    }

    public static C6257l3 M() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", S2.class, "zzf", C6275n3.class});
        }
        if (i11 == 3) {
            return new C6257l3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6248k3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }

    public final List E() {
        return this.zzd;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final List G() {
        return this.zze;
    }

    public final int H() {
        return this.zze.size();
    }

    public final List I() {
        return this.zzf;
    }

    public final int K() {
        return this.zzf.size();
    }

    final /* synthetic */ void N(Iterable iterable) {
        InterfaceC6250k5 interfaceC6250k5 = this.zzb;
        if (!interfaceC6250k5.zza()) {
            this.zzb = AbstractC6205f5.x(interfaceC6250k5);
        }
        AbstractC6356w4.g(iterable, this.zzb);
    }

    final /* synthetic */ void O() {
        this.zzb = AbstractC6205f5.w();
    }

    final /* synthetic */ void P(Iterable iterable) {
        InterfaceC6250k5 interfaceC6250k5 = this.zzd;
        if (!interfaceC6250k5.zza()) {
            this.zzd = AbstractC6205f5.x(interfaceC6250k5);
        }
        AbstractC6356w4.g(iterable, this.zzd);
    }

    final /* synthetic */ void Q() {
        this.zzd = AbstractC6205f5.w();
    }

    final /* synthetic */ void R(Iterable iterable) {
        InterfaceC6259l5 interfaceC6259l5 = this.zze;
        if (!interfaceC6259l5.zza()) {
            this.zze = AbstractC6205f5.z(interfaceC6259l5);
        }
        AbstractC6356w4.g(iterable, this.zze);
    }

    final /* synthetic */ void U() {
        this.zze = AbstractC6205f5.y();
    }

    final /* synthetic */ void V(Iterable iterable) {
        InterfaceC6259l5 interfaceC6259l5 = this.zzf;
        if (!interfaceC6259l5.zza()) {
            this.zzf = AbstractC6205f5.z(interfaceC6259l5);
        }
        AbstractC6356w4.g(iterable, this.zzf);
    }

    final /* synthetic */ void W() {
        this.zzf = AbstractC6205f5.y();
    }
}
