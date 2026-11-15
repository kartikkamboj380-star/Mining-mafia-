package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class V implements Serializable, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final U f35978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient boolean f35979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object f35980c;

    V(U u10) {
        this.f35978a = u10;
    }

    public final String toString() {
        Object obj;
        if (this.f35979b) {
            obj = "<supplier that returned " + String.valueOf(this.f35980c) + ">";
        } else {
            obj = this.f35978a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        if (!this.f35979b) {
            synchronized (this) {
                try {
                    if (!this.f35979b) {
                        Object objZza = this.f35978a.zza();
                        this.f35980c = objZza;
                        this.f35979b = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f35980c;
    }
}
