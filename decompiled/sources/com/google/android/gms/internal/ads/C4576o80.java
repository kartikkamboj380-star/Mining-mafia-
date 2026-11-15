package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4576o80 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4198l80 f31970a;

    private C4576o80(C4198l80 c4198l80) {
        this.f31970a = c4198l80;
    }

    public static C4576o80 b(C4198l80 c4198l80) {
        return new C4576o80(c4198l80);
    }

    public static boolean c(C4198l80 c4198l80) {
        return c4198l80.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.f31970a.h());
    }
}
