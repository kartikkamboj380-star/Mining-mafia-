package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class T1 extends AbstractC6445p0 implements W0 {
    private static final T1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C6399d2 zzh;

    static {
        T1 t10 = new T1();
        zzb = t10;
        AbstractC6445p0.s(T1.class, t10);
    }

    private T1() {
    }

    static /* synthetic */ void A(T1 t10, C6399d2 c6399d2) {
        c6399d2.getClass();
        t10.zzh = c6399d2;
        t10.zzd |= 2;
    }

    static /* synthetic */ void C(T1 t10, C6470v2 c6470v2) {
        c6470v2.getClass();
        t10.zzf = c6470v2;
        t10.zze = 4;
    }

    static /* synthetic */ void D(T1 t10, int i10) {
        t10.zzg = i10 - 1;
        t10.zzd |= 1;
    }

    public static R1 E() {
        return (R1) zzb.g();
    }

    public static T1 z(byte[] bArr, C6401e0 c6401e0) {
        return (T1) AbstractC6445p0.l(zzb, bArr, c6401e0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", U1.f37143a, "zzh", C6470v2.class});
        }
        if (i11 == 3) {
            return new T1();
        }
        Q1 q10 = null;
        if (i11 == 4) {
            return new R1(q10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
