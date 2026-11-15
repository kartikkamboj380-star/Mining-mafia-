package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6364x3 extends AbstractC6205f5 implements G5 {
    private static final C6364x3 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        C6364x3 c6364x3 = new C6364x3();
        zzj = c6364x3;
        AbstractC6205f5.s(C6364x3.class, c6364x3);
    }

    private C6364x3() {
    }

    public static C6355w3 O() {
        return (C6355w3) zzj.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C6364x3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6355w3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final long D() {
        return this.zzd;
    }

    public final String E() {
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

    public final long I() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final float L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zzb & 32) != 0;
    }

    public final double N() {
        return this.zzi;
    }

    final /* synthetic */ void P(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void U() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    final /* synthetic */ void V(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    final /* synthetic */ void W() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    final /* synthetic */ void X(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    final /* synthetic */ void Y() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
