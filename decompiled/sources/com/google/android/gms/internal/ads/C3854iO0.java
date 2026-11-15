package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3854iO0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3854iO0 zzh;
    private static volatile FM0 zzi;
    private int zza;
    private C3728hO0 zzb;
    private AbstractC5231tL0 zzd;
    private AbstractC5231tL0 zze;
    private int zzf;
    private byte zzg = 2;
    private InterfaceC3221dM0 zzc = UL0.x();

    static {
        C3854iO0 c3854iO0 = new C3854iO0();
        zzh = c3854iO0;
        UL0.U(C3854iO0.class, c3854iO0);
    }

    private C3854iO0() {
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        this.zzd = abstractC5231tL0;
        this.zze = abstractC5231tL0;
    }

    public static C3476fO0 d0() {
        return (C3476fO0) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        byte[] bArr = null;
        switch (tl0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return UL0.V(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", C3350eO0.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new C3854iO0();
            case NEW_BUILDER:
                return new C3476fO0(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                FM0 fm0 = zzi;
                if (fm0 != null) {
                    return fm0;
                }
                synchronized (C3854iO0.class) {
                    try {
                        rl0 = zzi;
                        if (rl0 == null) {
                            rl0 = new RL0(zzh);
                            zzi = rl0;
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

    final /* synthetic */ void e0(C3350eO0 c3350eO0) {
        c3350eO0.getClass();
        InterfaceC3221dM0 interfaceC3221dM0 = this.zzc;
        if (!interfaceC3221dM0.zza()) {
            this.zzc = UL0.y(interfaceC3221dM0);
        }
        this.zzc.add(c3350eO0);
    }
}
