package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3480fQ0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4864qQ0 f28279a;

    public static void a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        C3480fQ0 c3480fQ0 = (C3480fQ0) interfaceC4864qQ0;
        if (c3480fQ0.f28279a != null) {
            throw new IllegalStateException();
        }
        c3480fQ0.f28279a = interfaceC4864qQ1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final Object zzb() {
        InterfaceC4864qQ0 interfaceC4864qQ0 = this.f28279a;
        if (interfaceC4864qQ0 != null) {
            return interfaceC4864qQ0.zzb();
        }
        throw new IllegalStateException();
    }
}
