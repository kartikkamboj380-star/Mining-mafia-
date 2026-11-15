package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1598Cy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3170cy f18019a;

    private C1598Cy(C3170cy c3170cy) {
        this.f18019a = c3170cy;
    }

    public static C1598Cy a(C3170cy c3170cy) {
        return new C1598Cy(c3170cy);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.f18019a.i());
    }
}
