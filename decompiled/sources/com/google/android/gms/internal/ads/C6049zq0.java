package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6049zq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35863a;

    private C6049zq0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f35863a = interfaceC4864qQ0;
    }

    public static C6049zq0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C6049zq0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f35863a.zzb(), "ocs"), "pmtd");
    }
}
