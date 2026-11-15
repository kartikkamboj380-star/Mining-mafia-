package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3940j50 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30299c;

    private C3940j50(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f30297a = interfaceC4864qQ0;
        this.f30298b = interfaceC4864qQ1;
        this.f30299c = interfaceC4864qQ2;
    }

    public static C3940j50 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C3940j50(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((C4949r60) this.f30297a).zzb();
        C4190l40 c4190l40 = (C4190l40) this.f30298b.zzb();
        if (true == ((List) this.f30299c.zzb()).contains("29")) {
            objZzb = c4190l40;
        }
        AbstractC4738pQ0.b(objZzb);
        return objZzb;
    }
}
