package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6283o2 extends AbstractC6205f5 implements G5 {
    private static final C6283o2 zzd;
    private InterfaceC6259l5 zzb = AbstractC6205f5.y();

    static {
        C6283o2 c6283o2 = new C6283o2();
        zzd = c6283o2;
        AbstractC6205f5.s(C6283o2.class, c6283o2);
    }

    private C6283o2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C6283o2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6274n2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
