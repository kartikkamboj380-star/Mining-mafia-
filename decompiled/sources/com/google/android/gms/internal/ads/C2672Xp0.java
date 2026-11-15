package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2672Xp0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25394a;

    private C2672Xp0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f25394a = interfaceC4864qQ0;
    }

    public static C2672Xp0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2672Xp0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f25394a.zzb(), "drgd"), "pcbc.d");
    }
}
