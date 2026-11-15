package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5327u60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33735a;

    private C5327u60(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33735a = interfaceC4864qQ0;
    }

    public static C5327u60 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5327u60(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5075s60(((KF) this.f33735a).a());
    }
}
