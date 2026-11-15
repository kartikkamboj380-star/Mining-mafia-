package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class B3 extends AbstractC6205f5 implements G5 {
    private static final B3 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC6259l5 zze = AbstractC6205f5.y();

    static {
        B3 b10 = new B3();
        zzf = b10;
        AbstractC6205f5.s(B3.class, b10);
    }

    private B3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", I3.class});
        }
        if (i11 == 3) {
            return new B3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new A3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }
}
