package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Y2 extends AbstractC6205f5 implements G5 {
    private static final Y2 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC6259l5 zzi = AbstractC6205f5.y();

    static {
        Y2 y9 = new Y2();
        zzj = y9;
        AbstractC6205f5.s(Y2.class, y9);
    }

    private Y2() {
    }

    public static X2 P() {
        return (X2) zzj.o();
    }

    private final void d0() {
        InterfaceC6259l5 interfaceC6259l5 = this.zzi;
        if (interfaceC6259l5.zza()) {
            return;
        }
        this.zzi = AbstractC6205f5.z(interfaceC6259l5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", Y2.class});
        }
        if (i11 == 3) {
            return new Y2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new X2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final String D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final long H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final float K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final double M() {
        return this.zzh;
    }

    public final List N() {
        return this.zzi;
    }

    public final int O() {
        return this.zzi.size();
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void U() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    final /* synthetic */ void V(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    final /* synthetic */ void W() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    final /* synthetic */ void X(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    final /* synthetic */ void Y() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    final /* synthetic */ void Z(Y2 y9) {
        y9.getClass();
        d0();
        this.zzi.add(y9);
    }

    final /* synthetic */ void a0(Iterable iterable) {
        d0();
        AbstractC6356w4.g(iterable, this.zzi);
    }

    final /* synthetic */ void b0() {
        this.zzi = AbstractC6205f5.y();
    }
}
