package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6439n2 extends AbstractC6445p0 implements W0 {
    private static final C6439n2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C6439n2 c6439n2 = new C6439n2();
        zzb = c6439n2;
        AbstractC6445p0.s(C6439n2.class, c6439n2);
    }

    private C6439n2() {
    }

    static /* synthetic */ void A(C6439n2 c6439n2, String str) {
        str.getClass();
        c6439n2.zzd |= 2;
        c6439n2.zzf = str;
    }

    static /* synthetic */ void C(C6439n2 c6439n2, int i10) {
        c6439n2.zzd |= 4;
        c6439n2.zzg = i10;
    }

    public static C6435m2 D() {
        return (C6435m2) zzb.g();
    }

    static /* synthetic */ void z(C6439n2 c6439n2, String str) {
        str.getClass();
        c6439n2.zzd |= 1;
        c6439n2.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C6439n2();
        }
        AbstractC6431l2 abstractC6431l2 = null;
        if (i11 == 4) {
            return new C6435m2(abstractC6431l2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
