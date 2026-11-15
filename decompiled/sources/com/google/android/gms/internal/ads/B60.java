package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class B60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17497b;

    private B60(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f17496a = interfaceC4864qQ0;
        this.f17497b = interfaceC4864qQ1;
    }

    public static B60 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new B60(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5957z60((String) this.f17496a.zzb(), ((Integer) this.f17497b.zzb()).intValue());
    }
}
