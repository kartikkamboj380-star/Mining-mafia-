package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3613gU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N7 f28663b;

    C3613gU(Context context) {
        this.f28662a = context;
    }

    public final void a() {
        this.f28663b = M7.a(this.f28662a);
    }

    public final void b(U7 u10) {
        this.f28663b.b(u10);
    }

    public final void c() {
        this.f28663b.c();
    }

    public final V7 d() {
        try {
            N7 n10 = this.f28663b;
            if (n10 != null && n10.a()) {
                return n10.d();
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
