package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6470v2 extends AbstractC6445p0 implements W0 {
    private static final C6470v2 zzb;
    private int zzd;
    private int zze;

    static {
        C6470v2 c6470v2 = new C6470v2();
        zzb = c6470v2;
        AbstractC6445p0.s(C6470v2.class, c6470v2);
    }

    private C6470v2() {
    }

    public static C6458s2 A() {
        return (C6458s2) zzb.g();
    }

    static /* synthetic */ void z(C6470v2 c6470v2, int i10) {
        c6470v2.zze = i10 - 1;
        c6470v2.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C6466u2.f37345a});
        }
        if (i11 == 3) {
            return new C6470v2();
        }
        AbstractC6454r2 abstractC6454r2 = null;
        if (i11 == 4) {
            return new C6458s2(abstractC6454r2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
