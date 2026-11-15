package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4150kl0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30878c;

    private C4150kl0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f30876a = interfaceC4864qQ0;
        this.f30877b = interfaceC4864qQ1;
        this.f30878c = interfaceC4864qQ2;
    }

    public static C4150kl0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C4150kl0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceC4024jl0 interfaceC4024jl0 = ((C1571Ck0) this.f30878c.zzb()).B0() ? (InterfaceC4024jl0) C3606gQ0.b(this.f30876a).zzb() : (InterfaceC4024jl0) C3606gQ0.b(this.f30877b).zzb();
        AbstractC4738pQ0.b(interfaceC4024jl0);
        return interfaceC4024jl0;
    }
}
