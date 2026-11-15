package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6433m0 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6433m0 f37306a = new C6433m0();

    private C6433m0() {
    }

    public static C6433m0 a() {
        return f37306a;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final R0 zzb(Class cls) {
        if (!AbstractC6445p0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (R0) AbstractC6445p0.i(cls.asSubclass(AbstractC6445p0.class)).w(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean zzc(Class cls) {
        return AbstractC6445p0.class.isAssignableFrom(cls);
    }
}
