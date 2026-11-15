package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5610wM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34533a;

    private C5610wM(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f34533a = interfaceC4864qQ0;
    }

    public static C5610wM b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5610wM(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BinderC5484vM zzb() {
        return new BinderC5484vM(((C3599gN) this.f34533a).a());
    }
}
