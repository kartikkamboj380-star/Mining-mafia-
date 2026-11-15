package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4566o30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f31954a;

    C4566o30(Bundle bundle) {
        this.f31954a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.f31954a;
        AF af = (AF) obj;
        if (bundle.isEmpty()) {
            return;
        }
        af.f17275a.putBundle("installed_adapter_data", bundle);
    }
}
