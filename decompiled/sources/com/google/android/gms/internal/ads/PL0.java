package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class PL0 implements InterfaceC5611wM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PL0 f22096a = new PL0();

    private PL0() {
    }

    public static PL0 a() {
        return f22096a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5611wM0
    public final boolean zzb(Class cls) {
        return UL0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5611wM0
    public final InterfaceC5359uM0 zzc(Class cls) {
        if (!UL0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC5359uM0) UL0.T(cls.asSubclass(UL0.class)).S();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
