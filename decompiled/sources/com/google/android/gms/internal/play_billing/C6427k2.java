package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6427k2 extends AbstractC6445p0 implements W0 {
    private static final InterfaceC6468v0 zzb = new C6403e2();
    private static final C6427k2 zzd;
    private int zze;
    private int zzg;
    private C6399d2 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC6464u0 zzh = AbstractC6445p0.m();
    private InterfaceC6472w0 zzi = AbstractC6445p0.n();

    static {
        C6427k2 c6427k2 = new C6427k2();
        zzd = c6427k2;
        AbstractC6445p0.s(C6427k2.class, c6427k2);
    }

    private C6427k2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C6423j2.f37240a, "zzh", C6411g2.f37216a, "zzi", B2.class, "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new C6427k2();
        }
        C6403e2 c6403e2 = null;
        if (i11 == 4) {
            return new C6419i2(c6403e2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
