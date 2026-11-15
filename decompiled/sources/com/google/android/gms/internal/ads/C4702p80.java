package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4702p80 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4198l80 f32318a;

    private C4702p80(C4198l80 c4198l80) {
        this.f32318a = c4198l80;
    }

    public static C4702p80 b(C4198l80 c4198l80) {
        return new C4702p80(c4198l80);
    }

    public static boolean c(C4198l80 c4198l80) {
        return c4198l80.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.f32318a.g());
    }
}
