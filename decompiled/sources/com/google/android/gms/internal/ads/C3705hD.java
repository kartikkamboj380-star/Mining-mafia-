package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3705hD implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3579gD f28885a;

    private C3705hD(C3579gD c3579gD) {
        this.f28885a = c3579gD;
    }

    public static C3705hD a(C3579gD c3579gD) {
        return new C3705hD(c3579gD);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f28885a.b();
    }
}
