package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4532nn0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31887c;

    private C4532nn0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f31885a = interfaceC4864qQ0;
        this.f31886b = interfaceC4864qQ1;
        this.f31887c = interfaceC4864qQ2;
    }

    public static C4532nn0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C4532nn0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4406mn0((C1966Ka) this.f31885a.zzb(), (InterfaceC2718Ym0) this.f31886b.zzb(), (C5043rr0) this.f31887c.zzb());
    }
}
