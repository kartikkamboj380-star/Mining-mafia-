package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4088kG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4088kG0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private InterfaceC3221dM0 zzb = UL0.x();

    static {
        C4088kG0 c4088kG0 = new C4088kG0();
        zzc = c4088kG0;
        UL0.U(C4088kG0.class, c4088kG0);
    }

    private C4088kG0() {
    }

    public static C4088kG0 h0(byte[] bArr, HL0 hl0) {
        return (C4088kG0) UL0.D(zzc, bArr, hl0);
    }

    public static C4088kG0 i0(InputStream inputStream, HL0 hl0) {
        return (C4088kG0) UL0.F(zzc, inputStream, hl0);
    }

    public static C3712hG0 j0() {
        return (C3712hG0) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C3962jG0.class});
        }
        if (iOrdinal == 3) {
            return new C4088kG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3712hG0(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzd;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C4088kG0.class) {
            try {
                rl0 = zzd;
                if (rl0 == null) {
                    rl0 = new RL0(zzc);
                    zzd = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final int d0() {
        return this.zza;
    }

    public final List e0() {
        return this.zzb;
    }

    public final int f0() {
        return this.zzb.size();
    }

    public final C3962jG0 g0(int i10) {
        return (C3962jG0) this.zzb.get(i10);
    }

    final /* synthetic */ void k0(int i10) {
        this.zza = i10;
    }

    final /* synthetic */ void l0(C3962jG0 c3962jG0) {
        c3962jG0.getClass();
        InterfaceC3221dM0 interfaceC3221dM0 = this.zzb;
        if (!interfaceC3221dM0.zza()) {
            this.zzb = UL0.y(interfaceC3221dM0);
        }
        this.zzb.add(c3962jG0);
    }
}
