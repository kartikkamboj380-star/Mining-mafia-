package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ec0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378ec0 implements InterfaceC3732hQ0 {
    private C3378ec0(C3253dc0 c3253dc0) {
    }

    public static C3378ec0 a(C3253dc0 c3253dc0) {
        return new C3378ec0(c3253dc0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        AbstractC4738pQ0.b(defaultClock);
        return defaultClock;
    }
}
