package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class W1 extends AbstractC6205f5 implements G5 {
    private static final W1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        W1 w10 = new W1();
        zzf = w10;
        AbstractC6205f5.s(W1.class, w10);
    }

    private W1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC6232i5 interfaceC6232i5 = Z1.f36561a;
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", interfaceC6232i5, "zze", interfaceC6232i5});
        }
        if (i11 == 3) {
            return new W1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new V1(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int D() {
        int iA = AbstractC6166b2.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int E() {
        int iA = AbstractC6166b2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
