package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class UG extends AbstractC3214dJ implements InterfaceC3019bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f23974b;

    UG(Set set) {
        super(set);
        this.f23974b = new Bundle();
    }

    public final synchronized Bundle j1() {
        return new Bundle(this.f23974b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3019bl
    public final synchronized void v(String str, Bundle bundle) {
        this.f23974b.putAll(bundle);
        g1(TG.f23465a);
    }
}
