package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218tF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33374a;

    private C5218tF(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33374a = interfaceC4864qQ0;
    }

    public static C5218tF a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5218tF(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4337mF(((JD) this.f33374a).a());
    }
}
