package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2982bS0 {
    void a(C4748pV0 c4748pV0);

    void b(C2856aS0 c2856aS0, A01 a01, InterfaceC3299e[] interfaceC3299eArr);

    default boolean c(C4748pV0 c4748pV0, AbstractC5270tf abstractC5270tf, C5637wZ0 c5637wZ0, long j10) {
        YU.c("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    boolean d(C2856aS0 c2856aS0);

    boolean e(C2856aS0 c2856aS0);

    void f(C4748pV0 c4748pV0);

    void g(C4748pV0 c4748pV0);

    boolean h(C4748pV0 c4748pV0);

    InterfaceC4683p i(C4748pV0 c4748pV0);

    long j(C4748pV0 c4748pV0);
}
