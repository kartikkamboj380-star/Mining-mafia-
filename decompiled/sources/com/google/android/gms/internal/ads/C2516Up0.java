package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Up0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2516Up0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24107c;

    private C2516Up0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f24105a = interfaceC4864qQ0;
        this.f24106b = interfaceC4864qQ1;
        this.f24107c = interfaceC4864qQ2;
    }

    public static C2516Up0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C2516Up0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceC4864qQ0 interfaceC4864qQ0 = this.f24107c;
        InterfaceC4864qQ0 interfaceC4864qQ1 = this.f24106b;
        InterfaceC2978bQ0 interfaceC2978bQ0B = C3606gQ0.b(this.f24105a);
        InterfaceC2978bQ0 interfaceC2978bQ0B2 = C3606gQ0.b(interfaceC4864qQ1);
        if (true == ((C1571Ck0) interfaceC4864qQ0.zzb()).A0()) {
            interfaceC2978bQ0B = interfaceC2978bQ0B2;
        }
        InterfaceC1789Gp0 interfaceC1789Gp0 = (InterfaceC1789Gp0) interfaceC2978bQ0B.zzb();
        AbstractC4738pQ0.b(interfaceC1789Gp0);
        return interfaceC1789Gp0;
    }
}
