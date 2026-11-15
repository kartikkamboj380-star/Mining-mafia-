package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class KU implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20205a;

    private KU(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f20205a = interfaceC4864qQ0;
    }

    public static KU b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new KU(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((C4049jy) this.f20205a).a().getPackageName();
        AbstractC4738pQ0.b(packageName);
        return packageName;
    }
}
