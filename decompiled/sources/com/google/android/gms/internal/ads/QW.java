package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class QW implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22385b;

    private QW(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f22384a = interfaceC4864qQ0;
        this.f22385b = interfaceC4864qQ1;
    }

    public static QW b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new QW(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PW zzb() {
        return new PW(((MW) this.f22384a).zzb(), (InterfaceExecutorServiceC1805Gx0) this.f22385b.zzb());
    }
}
