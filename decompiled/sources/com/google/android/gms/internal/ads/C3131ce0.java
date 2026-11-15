package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ce0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3131ce0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27162a;

    private C3131ce0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27162a = interfaceC4864qQ0;
    }

    public static C3131ce0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3131ce0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new RunnableC3886ie0((RunnableC4262le0) this.f27162a.zzb());
    }
}
