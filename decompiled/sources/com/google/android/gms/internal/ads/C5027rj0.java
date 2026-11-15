package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5027rj0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5027rj0 zzb;
    private static volatile FM0 zzc;
    private C4981rM0 zza = C4981rM0.b();

    static {
        C5027rj0 c5027rj0 = new C5027rj0();
        zzb = c5027rj0;
        UL0.U(C5027rj0.class, c5027rj0);
    }

    private C5027rj0() {
    }

    public static C5027rj0 f0(InputStream inputStream) {
        return (C5027rj0) UL0.E(zzb, inputStream);
    }

    public static C5027rj0 g0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", AbstractC4902qj0.f32719a});
        }
        if (iOrdinal == 3) {
            return new C5027rj0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4776pj0(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzc;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5027rj0.class) {
            try {
                rl0 = zzc;
                if (rl0 == null) {
                    rl0 = new RL0(zzb);
                    zzc = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final int d0() {
        return this.zza.size();
    }

    public final Map e0() {
        return Collections.unmodifiableMap(this.zza);
    }

    final /* synthetic */ Map h0() {
        if (!this.zza.g()) {
            this.zza = this.zza.e();
        }
        return this.zza;
    }
}
