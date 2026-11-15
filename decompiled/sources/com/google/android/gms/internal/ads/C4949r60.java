package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4949r60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32787c;

    private C4949r60(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f32785a = interfaceC4864qQ0;
        this.f32786b = interfaceC4864qQ1;
        this.f32787c = interfaceC4864qQ2;
    }

    public static C4949r60 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C4949r60(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4698p60 zzb() {
        return new C4698p60((ApplicationInfo) this.f32785a.zzb(), (PackageInfo) this.f32786b.zzb(), ((C4049jy) this.f32787c).a());
    }
}
