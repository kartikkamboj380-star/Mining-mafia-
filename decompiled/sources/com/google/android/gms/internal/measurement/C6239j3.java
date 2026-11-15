package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6239j3 extends AbstractC6205f5 implements G5 {
    private static final C6239j3 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC6259l5 zze = AbstractC6205f5.y();

    static {
        C6239j3 c6239j3 = new C6239j3();
        zzf = c6239j3;
        AbstractC6205f5.s(C6239j3.class, c6239j3);
    }

    private C6239j3() {
    }

    public static C6221h3 C() {
        return (C6221h3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C6230i3.f36709a, "zze", W2.class});
        }
        if (i11 == 3) {
            return new C6239j3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6221h3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void D(W2 w10) {
        w10.getClass();
        InterfaceC6259l5 interfaceC6259l5 = this.zze;
        if (!interfaceC6259l5.zza()) {
            this.zze = AbstractC6205f5.z(interfaceC6259l5);
        }
        this.zze.add(w10);
    }
}
