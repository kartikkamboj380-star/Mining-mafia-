package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3189d60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27338c;

    private C3189d60(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f27336a = interfaceC4864qQ1;
        this.f27337b = interfaceC4864qQ2;
        this.f27338c = interfaceC4864qQ3;
    }

    public static C3189d60 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C3189d60(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2938b60(C3129cd0.b(), ((PF) this.f27336a).a(), (PackageInfo) this.f27337b.zzb(), ((C3295dy) this.f27338c).zzb());
    }
}
