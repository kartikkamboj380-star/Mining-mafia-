package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class X implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U f35985c = new U() { // from class: com.google.android.gms.internal.auth.W
        @Override // com.google.android.gms.internal.auth.U
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile U f35986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f35987b;

    X(U u10) {
        this.f35986a = u10;
    }

    public final String toString() {
        Object obj = this.f35986a;
        if (obj == f35985c) {
            obj = "<supplier that returned " + String.valueOf(this.f35987b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        U u10 = this.f35986a;
        U u11 = f35985c;
        if (u10 != u11) {
            synchronized (this) {
                try {
                    if (this.f35986a != u11) {
                        Object objZza = this.f35986a.zza();
                        this.f35987b = objZza;
                        this.f35986a = u11;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f35987b;
    }
}
