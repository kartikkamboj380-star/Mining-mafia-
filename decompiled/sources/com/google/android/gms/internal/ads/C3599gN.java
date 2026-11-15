package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3599gN implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZM f28630a;

    private C3599gN(ZM zm) {
        this.f28630a = zm;
    }

    public static C3599gN b(ZM zm) {
        return new C3599gN(zm);
    }

    public static OM c(ZM zm) {
        OM omA = zm.a();
        AbstractC4738pQ0.b(omA);
        return omA;
    }

    public final OM a() {
        return c(this.f28630a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f28630a);
    }
}
