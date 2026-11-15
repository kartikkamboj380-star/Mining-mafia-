package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ot0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4670ot0 {
    public static InterfaceC4166kt0 a(InterfaceC4166kt0 interfaceC4166kt0) {
        if ((interfaceC4166kt0 instanceof C4544nt0) || (interfaceC4166kt0 instanceof C4292lt0)) {
            return interfaceC4166kt0;
        }
        return interfaceC4166kt0 instanceof Serializable ? new C4292lt0(interfaceC4166kt0) : new C4544nt0(interfaceC4166kt0);
    }
}
