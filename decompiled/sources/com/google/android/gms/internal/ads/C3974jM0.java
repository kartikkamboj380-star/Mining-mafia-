package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3974jM0 {
    C3974jM0() {
    }

    public static final List a(Object obj, long j10) {
        InterfaceC3221dM0 interfaceC3221dM0 = (InterfaceC3221dM0) AbstractC3726hN0.u(obj, j10);
        if (interfaceC3221dM0.zza()) {
            return interfaceC3221dM0;
        }
        int size = interfaceC3221dM0.size();
        InterfaceC3221dM0 interfaceC3221dM0X = interfaceC3221dM0.x(size == 0 ? 10 : size + size);
        AbstractC3726hN0.v(obj, j10, interfaceC3221dM0X);
        return interfaceC3221dM0X;
    }
}
