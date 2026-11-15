package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC4621oV extends AbstractBinderC4161kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2575Vt f32094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5420ur f32095b;

    BinderC4621oV(C2575Vt c2575Vt, C5420ur c5420ur) {
        this.f32094a = c2575Vt;
        this.f32095b = c5420ur;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void D5(ParcelFileDescriptor parcelFileDescriptor) {
        this.f32094a.b(new GV(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f32095b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void E1(K4.C c10) {
        this.f32094a.c(c10.j());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void U2(ParcelFileDescriptor parcelFileDescriptor, C5420ur c5420ur) {
        this.f32094a.b(new GV(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c5420ur));
    }
}
