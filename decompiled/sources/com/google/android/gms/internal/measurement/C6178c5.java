package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6178c5 implements D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6178c5 f36645a = new C6178c5();

    private C6178c5() {
    }

    public static C6178c5 a() {
        return f36645a;
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final boolean zzb(Class cls) {
        return AbstractC6205f5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final C5 zzc(Class cls) {
        if (!AbstractC6205f5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C5) AbstractC6205f5.r(cls.asSubclass(AbstractC6205f5.class)).B(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
