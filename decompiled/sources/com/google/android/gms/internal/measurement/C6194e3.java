package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6194e3 extends AbstractC6205f5 implements G5 {
    private static final C6194e3 zzh;
    private int zzb;
    private InterfaceC6259l5 zzd = AbstractC6205f5.y();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C6194e3 c6194e3 = new C6194e3();
        zzh = c6194e3;
        AbstractC6205f5.s(C6194e3.class, c6194e3);
    }

    private C6194e3() {
    }

    public static C6167b3 K() {
        return (C6167b3) zzh.o();
    }

    public static C6167b3 L(C6194e3 c6194e3) {
        AbstractC6187d5 abstractC6187d5O = zzh.o();
        abstractC6187d5O.q(c6194e3);
        return (C6167b3) abstractC6187d5O;
    }

    private final void V() {
        InterfaceC6259l5 interfaceC6259l5 = this.zzd;
        if (interfaceC6259l5.zza()) {
            return;
        }
        this.zzd = AbstractC6205f5.z(interfaceC6259l5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C6212g3.class, "zze", "zzf", "zzg", C6185d3.f36660a});
        }
        if (i11 == 3) {
            return new C6194e3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6167b3(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final C6212g3 E(int i10) {
        return (C6212g3) this.zzd.get(i10);
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    final /* synthetic */ void M(int i10, C6212g3 c6212g3) {
        c6212g3.getClass();
        V();
        this.zzd.set(i10, c6212g3);
    }

    final /* synthetic */ void N(C6212g3 c6212g3) {
        c6212g3.getClass();
        V();
        this.zzd.add(c6212g3);
    }

    final /* synthetic */ void O(Iterable iterable) {
        V();
        AbstractC6356w4.g(iterable, this.zzd);
    }

    final /* synthetic */ void P() {
        this.zzd = AbstractC6205f5.y();
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
