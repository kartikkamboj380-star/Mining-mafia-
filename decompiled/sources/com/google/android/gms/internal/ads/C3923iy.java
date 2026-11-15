package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3923iy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30126a;

    private C3923iy(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f30126a = interfaceC4864qQ0;
    }

    public static C3923iy a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3923iy(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((C4049jy) this.f30126a).a().getApplicationInfo();
        AbstractC4738pQ0.b(applicationInfo);
        return applicationInfo;
    }
}
