package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.as0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC2908as0 extends AbstractBinderC5799xr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3788hs0 f26656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3159cs0 f26657b;

    BinderC2908as0(C3159cs0 c3159cs0, InterfaceC3788hs0 interfaceC3788hs0) {
        Objects.requireNonNull(c3159cs0);
        this.f26657b = c3159cs0;
        this.f26656a = interfaceC3788hs0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5925yr0
    public final void f0(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        AbstractC3536fs0 abstractC3536fs0D = AbstractC3662gs0.d();
        abstractC3536fs0D.a(i10);
        if (string != null) {
            abstractC3536fs0D.b(string);
        }
        abstractC3536fs0D.c(i11);
        this.f26656a.a(abstractC3536fs0D.d());
        if (i10 == 8157) {
            this.f26657b.d();
        }
    }
}
