package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class JC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19804c;

    private JC(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f19802a = interfaceC4864qQ0;
        this.f19803b = interfaceC4864qQ1;
        this.f19804c = interfaceC4864qQ2;
    }

    public static JC b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new JC(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final HC zzb() {
        return new HC(((DC) this.f19802a).a(), (QR) this.f19803b.zzb(), ((GD) this.f19804c).a());
    }
}
