package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC6040zm extends AbstractBinderC5536vm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2575Vt f35836a;

    BinderC6040zm(C1470Am c1470Am, C2575Vt c2575Vt) {
        this.f35836a = c2575Vt;
        Objects.requireNonNull(c1470Am);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5662wm
    public final void T3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f35836a.b(parcelFileDescriptor);
    }
}
