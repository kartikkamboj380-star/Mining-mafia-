package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class E3 extends AbstractC6205f5 implements G5 {
    private static final E3 zzf;
    private int zzb;
    private InterfaceC6259l5 zzd = AbstractC6205f5.y();
    private C6380z3 zze;

    static {
        E3 e10 = new E3();
        zzf = e10;
        AbstractC6205f5.s(E3.class, e10);
    }

    private E3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", I3.class, "zze"});
        }
        if (i11 == 3) {
            return new E3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final C6380z3 D() {
        C6380z3 c6380z3 = this.zze;
        return c6380z3 == null ? C6380z3.E() : c6380z3;
    }
}
