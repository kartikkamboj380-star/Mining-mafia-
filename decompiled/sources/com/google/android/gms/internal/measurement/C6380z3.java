package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6380z3 extends AbstractC6205f5 implements G5 {
    private static final C6380z3 zzd;
    private InterfaceC6259l5 zzb = AbstractC6205f5.y();

    static {
        C6380z3 c6380z3 = new C6380z3();
        zzd = c6380z3;
        AbstractC6205f5.s(C6380z3.class, c6380z3);
    }

    private C6380z3() {
    }

    public static C6380z3 E() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", B3.class});
        }
        if (i11 == 3) {
            return new C6380z3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6372y3(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }
}
