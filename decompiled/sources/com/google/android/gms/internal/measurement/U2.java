package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class U2 extends AbstractC6205f5 implements G5 {
    private static final U2 zzj;
    private int zzb;
    private InterfaceC6259l5 zzd = AbstractC6205f5.y();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        U2 u10 = new U2();
        zzj = u10;
        AbstractC6205f5.s(U2.class, u10);
    }

    private U2() {
    }

    public static T2 N() {
        return (T2) zzj.o();
    }

    private final void a0() {
        InterfaceC6259l5 interfaceC6259l5 = this.zzd;
        if (interfaceC6259l5.zza()) {
            return;
        }
        this.zzd = AbstractC6205f5.z(interfaceC6259l5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", Y2.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new U2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new T2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final Y2 E(int i10) {
        return (Y2) this.zzd.get(i10);
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final long H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final long K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final int M() {
        return this.zzh;
    }

    final /* synthetic */ void O(int i10, Y2 y9) {
        y9.getClass();
        a0();
        this.zzd.set(i10, y9);
    }

    final /* synthetic */ void P(Y2 y9) {
        y9.getClass();
        a0();
        this.zzd.add(y9);
    }

    final /* synthetic */ void Q(Iterable iterable) {
        a0();
        AbstractC6356w4.g(iterable, this.zzd);
    }

    final /* synthetic */ void R() {
        this.zzd = AbstractC6205f5.y();
    }

    final /* synthetic */ void U(int i10) {
        a0();
        this.zzd.remove(i10);
    }

    final /* synthetic */ void V(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void W(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    final /* synthetic */ void X(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    final /* synthetic */ void Y(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }
}
