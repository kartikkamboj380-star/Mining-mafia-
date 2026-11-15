package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3350eO0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3350eO0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private AbstractC5231tL0 zzb;
    private AbstractC5231tL0 zzc;
    private byte zzd = 2;

    static {
        C3350eO0 c3350eO0 = new C3350eO0();
        zze = c3350eO0;
        UL0.U(C3350eO0.class, c3350eO0);
    }

    private C3350eO0() {
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        this.zzb = abstractC5231tL0;
        this.zzc = abstractC5231tL0;
    }

    public static C3225dO0 d0() {
        return (C3225dO0) zze.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        byte[] bArr = null;
        switch (tl0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return UL0.V(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new C3350eO0();
            case NEW_BUILDER:
                return new C3225dO0(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                FM0 fm0 = zzf;
                if (fm0 != null) {
                    return fm0;
                }
                synchronized (C3350eO0.class) {
                    try {
                        rl0 = zzf;
                        if (rl0 == null) {
                            rl0 = new RL0(zze);
                            zzf = rl0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rl0;
            default:
                throw null;
        }
    }

    final /* synthetic */ void e0(AbstractC5231tL0 abstractC5231tL0) {
        this.zza |= 1;
        this.zzb = abstractC5231tL0;
    }

    final /* synthetic */ void f0(AbstractC5231tL0 abstractC5231tL0) {
        this.zza |= 2;
        this.zzc = abstractC5231tL0;
    }
}
