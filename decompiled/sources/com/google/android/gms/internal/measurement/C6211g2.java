package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6211g2 extends AbstractC6205f5 implements G5 {
    private static final C6211g2 zzi;
    private int zzb;
    private boolean zzg;
    private InterfaceC6259l5 zzd = AbstractC6205f5.y();
    private InterfaceC6259l5 zze = AbstractC6205f5.y();
    private InterfaceC6259l5 zzf = AbstractC6205f5.y();
    private InterfaceC6259l5 zzh = AbstractC6205f5.y();

    static {
        C6211g2 c6211g2 = new C6211g2();
        zzi = c6211g2;
        AbstractC6205f5.s(C6211g2.class, c6211g2);
    }

    private C6211g2() {
    }

    public static C6211g2 I() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", U1.class, "zze", W1.class, "zzf", C6184d2.class, "zzg", "zzh", U1.class});
        }
        if (i11 == 3) {
            return new C6211g2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new S1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }

    public final List E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final List H() {
        return this.zzh;
    }
}
