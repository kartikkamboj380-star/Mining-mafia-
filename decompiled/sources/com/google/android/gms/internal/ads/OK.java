package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class OK implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21506b;

    private OK(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f21505a = interfaceC4864qQ0;
        this.f21506b = interfaceC4864qQ1;
    }

    public static OK a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new OK(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new NK((C5492vQ) this.f21505a.zzb(), ((ID) this.f21506b).a());
    }
}
