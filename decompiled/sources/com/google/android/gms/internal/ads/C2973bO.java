package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2973bO implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UN f26812a;

    private C2973bO(UN un) {
        this.f26812a = un;
    }

    public static C2973bO b(UN un) {
        return new C2973bO(un);
    }

    public final InterfaceC2097Mo a() {
        return this.f26812a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f26812a.a();
    }
}
