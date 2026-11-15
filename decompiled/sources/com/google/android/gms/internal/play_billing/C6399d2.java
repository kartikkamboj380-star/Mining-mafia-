package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6399d2 extends AbstractC6445p0 implements W0 {
    private static final C6399d2 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C6399d2 c6399d2 = new C6399d2();
        zzb = c6399d2;
        AbstractC6445p0.s(C6399d2.class, c6399d2);
    }

    private C6399d2() {
    }

    static /* synthetic */ void A(C6399d2 c6399d2, String str) {
        str.getClass();
        c6399d2.zzd |= 2;
        c6399d2.zzf = str;
    }

    static /* synthetic */ void C(C6399d2 c6399d2, String str) {
        c6399d2.zzd |= 8;
        c6399d2.zzh = str;
    }

    static /* synthetic */ void D(C6399d2 c6399d2, int i10) {
        c6399d2.zzg = i10 - 1;
        c6399d2.zzd |= 4;
    }

    public static Z1 E() {
        return (Z1) zzb.g();
    }

    static /* synthetic */ void z(C6399d2 c6399d2, int i10) {
        c6399d2.zzd |= 1;
        c6399d2.zze = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C6391b2.f37196a, "zzh"});
        }
        if (i11 == 3) {
            return new C6399d2();
        }
        Y1 y9 = null;
        if (i11 == 4) {
            return new Z1(y9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
