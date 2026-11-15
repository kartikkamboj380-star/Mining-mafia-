package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4450n80 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4198l80 f31716a;

    private C4450n80(C4198l80 c4198l80) {
        this.f31716a = c4198l80;
    }

    public static C4450n80 b(C4198l80 c4198l80) {
        return new C4450n80(c4198l80);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.f31716a.f());
    }
}
