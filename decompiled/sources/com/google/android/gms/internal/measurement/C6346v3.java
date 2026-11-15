package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6346v3 extends AbstractC6205f5 implements G5 {
    private static final C6346v3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C6346v3 c6346v3 = new C6346v3();
        zzg = c6346v3;
        AbstractC6205f5.s(C6346v3.class, c6346v3);
    }

    private C6346v3() {
    }

    public static C6284o3 D() {
        return (C6284o3) zzg.o();
    }

    public static C6346v3 E() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C6328t3.f36895a, "zze", C6293p3.f36820a, "zzf", C6310r3.f36874a});
        }
        if (i11 == 3) {
            return new C6346v3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6284o3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final EnumC6302q3 C() {
        EnumC6302q3 enumC6302q3C = EnumC6302q3.c(this.zze);
        return enumC6302q3C == null ? EnumC6302q3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC6302q3C;
    }

    final /* synthetic */ void F(EnumC6302q3 enumC6302q3) {
        this.zze = enumC6302q3.zza();
        this.zzb |= 2;
    }

    public final int H() {
        int iA = AbstractC6337u3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int I() {
        int iA = AbstractC6319s3.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void K(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void L(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
