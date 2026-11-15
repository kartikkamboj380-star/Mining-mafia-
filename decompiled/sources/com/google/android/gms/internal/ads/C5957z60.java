package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5957z60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35645b;

    C5957z60(String str, int i10) {
        this.f35644a = str;
        this.f35645b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(new A60(this.f35644a, this.f35645b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 31;
    }
}
