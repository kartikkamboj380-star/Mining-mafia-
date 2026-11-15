package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3843iJ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3465fJ f29325a;

    private C3843iJ(C3465fJ c3465fJ) {
        this.f29325a = c3465fJ;
    }

    public static C3843iJ a(C3465fJ c3465fJ) {
        return new C3843iJ(c3465fJ);
    }

    public static Set b(C3465fJ c3465fJ) {
        Set set = Collections.EMPTY_SET;
        AbstractC4738pQ0.b(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return b(this.f29325a);
    }
}
