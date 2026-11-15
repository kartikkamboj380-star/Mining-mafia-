package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2544Vd0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24331b;

    private C2544Vd0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f24330a = interfaceC4864qQ0;
        this.f24331b = interfaceC4864qQ1;
    }

    public static C2544Vd0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C2544Vd0(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2492Ud0(((C4049jy) this.f24330a).a(), (RunnableC3886ie0) this.f24331b.zzb());
    }
}
