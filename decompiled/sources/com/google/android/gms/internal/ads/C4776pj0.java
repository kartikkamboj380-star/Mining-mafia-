package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4776pj0 extends QL0 implements InterfaceC5989zM0 {
    /* synthetic */ C4776pj0(byte[] bArr) {
        super(C5027rj0.zzb);
    }

    public final C4776pj0 A(String str) {
        str.getClass();
        r();
        ((C5027rj0) this.f22353b).h0().remove(str);
        return this;
    }

    public final Map B() {
        return Collections.unmodifiableMap(((C5027rj0) this.f22353b).e0());
    }

    public final C4776pj0 C(String str, C4524nj0 c4524nj0) {
        str.getClass();
        c4524nj0.getClass();
        r();
        ((C5027rj0) this.f22353b).h0().put(str, c4524nj0);
        return this;
    }
}
