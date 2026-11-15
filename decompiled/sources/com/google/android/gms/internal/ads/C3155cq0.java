package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3155cq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27230a;

    private C3155cq0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27230a = interfaceC4864qQ0;
    }

    public static C3155cq0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3155cq0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f27230a.zzb(), "drgd"), "pmtd");
    }
}
