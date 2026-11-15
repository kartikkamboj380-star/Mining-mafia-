package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5923yq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35458c;

    private C5923yq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f35456a = interfaceC4864qQ0;
        this.f35457b = interfaceC4864qQ1;
        this.f35458c = interfaceC4864qQ2;
    }

    public static C5923yq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C5923yq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f35456a.zzb();
        C1521Bl0 c1521Bl0 = (C1521Bl0) this.f35457b.zzb();
        final C5043rr0 c5043rr0 = (C5043rr0) this.f35458c.zzb();
        return c1521Bl0.a(file, C2456Tl0.i0(), new Function() { // from class: com.google.android.gms.internal.ads.xq0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                c5043rr0.d(20308, (Throwable) obj);
                return C2456Tl0.i0();
            }
        });
    }
}
