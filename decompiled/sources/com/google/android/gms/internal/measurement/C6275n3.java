package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6275n3 extends AbstractC6205f5 implements G5 {
    private static final C6275n3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC6250k5 zze = AbstractC6205f5.w();

    static {
        C6275n3 c6275n3 = new C6275n3();
        zzf = c6275n3;
        AbstractC6205f5.s(C6275n3.class, c6275n3);
    }

    private C6275n3() {
    }

    public static C6266m3 H() {
        return (C6266m3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C6275n3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6266m3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }

    public final int F() {
        return this.zze.size();
    }

    public final long G(int i10) {
        return this.zze.G(i10);
    }

    final /* synthetic */ void I(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void K(Iterable iterable) {
        InterfaceC6250k5 interfaceC6250k5 = this.zze;
        if (!interfaceC6250k5.zza()) {
            this.zze = AbstractC6205f5.x(interfaceC6250k5);
        }
        AbstractC6356w4.g(iterable, this.zze);
    }
}
