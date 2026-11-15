package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Aq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1479Aq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17413a;

    private C1479Aq0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f17413a = interfaceC4864qQ0;
    }

    public static C1479Aq0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C1479Aq0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f17413a.zzb(), "ocs"), "pcbc");
    }
}
