package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2284Qd0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22413a;

    private C2284Qd0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f22413a = interfaceC4864qQ0;
    }

    public static C2284Qd0 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2284Qd0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2076Md0 zzb() {
        return new C2076Md0(((C5241tQ0) this.f22413a).zzb());
    }
}
