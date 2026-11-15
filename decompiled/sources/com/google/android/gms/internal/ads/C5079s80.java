package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5079s80 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4198l80 f33112a;

    private C5079s80(C4198l80 c4198l80) {
        this.f33112a = c4198l80;
    }

    public static C5079s80 b(C4198l80 c4198l80) {
        return new C5079s80(c4198l80);
    }

    public static int c(C4198l80 c4198l80) {
        return c4198l80.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.f33112a.j());
    }
}
