package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5116sR implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33163b;

    private C5116sR(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f33162a = interfaceC4864qQ0;
        this.f33163b = interfaceC4864qQ1;
    }

    public static C5116sR b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5116sR(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4990rR zzb() {
        return new C4990rR((C2703Yf) this.f33162a.zzb(), ((C4234lQ0) this.f33163b).zzb());
    }
}
