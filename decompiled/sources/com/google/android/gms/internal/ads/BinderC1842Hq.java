package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC1842Hq extends AbstractBinderC3285dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ T4.b f19404a;

    BinderC1842Hq(C1894Iq c1894Iq, T4.b bVar) {
        this.f19404a = bVar;
        Objects.requireNonNull(c1894Iq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3789ht
    public final void j(String str) {
        this.f19404a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3789ht
    public final void x1(String str, String str2, Bundle bundle) {
        this.f19404a.b(new T4.a(new H4.B1(str, bundle, str2)));
    }
}
