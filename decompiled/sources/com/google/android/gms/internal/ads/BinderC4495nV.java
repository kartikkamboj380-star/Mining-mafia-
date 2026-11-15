package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC4495nV extends AbstractBinderC4161kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC4747pV f31822a;

    protected BinderC4495nV(AbstractC4747pV abstractC4747pV) {
        Objects.requireNonNull(abstractC4747pV);
        this.f31822a = abstractC4747pV;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void D5(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC4747pV abstractC4747pV = this.f31822a;
        abstractC4747pV.f32400a.b(new GV(autoCloseInputStream, abstractC4747pV.f32404e));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void E1(K4.C c10) {
        this.f31822a.f32400a.c(c10.j());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void U2(ParcelFileDescriptor parcelFileDescriptor, C5420ur c5420ur) {
        this.f31822a.f32400a.b(new GV(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c5420ur));
    }
}
