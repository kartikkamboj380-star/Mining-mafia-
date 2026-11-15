package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class W2 extends AbstractC6205f5 implements G5 {
    private static final W2 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        W2 w10 = new W2();
        zzf = w10;
        AbstractC6205f5.s(W2.class, w10);
    }

    private W2() {
    }

    public static V2 C() {
        return (V2) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new W2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new V2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void E(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
