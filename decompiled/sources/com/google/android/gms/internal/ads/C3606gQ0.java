package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3606gQ0 implements InterfaceC4864qQ0, InterfaceC2978bQ0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f28639c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile InterfaceC4864qQ0 f28640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f28641b = f28639c;

    private C3606gQ0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f28640a = interfaceC4864qQ0;
    }

    public static InterfaceC4864qQ0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return interfaceC4864qQ0 instanceof C3606gQ0 ? interfaceC4864qQ0 : new C3606gQ0(interfaceC4864qQ0);
    }

    public static InterfaceC2978bQ0 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        if (interfaceC4864qQ0 instanceof InterfaceC2978bQ0) {
            return (InterfaceC2978bQ0) interfaceC4864qQ0;
        }
        interfaceC4864qQ0.getClass();
        return new C3606gQ0(interfaceC4864qQ0);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f28641b;
            Object obj2 = f28639c;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.f28640a.zzb();
            Object obj3 = this.f28641b;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.f28641b = objZzb;
            this.f28640a = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final Object zzb() {
        Object obj = this.f28641b;
        return obj == f28639c ? c() : obj;
    }
}
