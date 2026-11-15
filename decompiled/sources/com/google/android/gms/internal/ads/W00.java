package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class W00 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24632d;

    private W00(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f24629a = interfaceC4864qQ0;
        this.f24630b = interfaceC4864qQ1;
        this.f24631c = interfaceC4864qQ2;
        this.f24632d = interfaceC4864qQ3;
    }

    public static W00 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new W00(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V00 zzb() {
        return new V00((C2128Nd0) this.f24629a.zzb(), (InterfaceExecutorServiceC1805Gx0) this.f24630b.zzb(), (InterfaceC4627oY) this.f24631c.zzb(), (InterfaceC5130sY) this.f24632d.zzb());
    }
}
