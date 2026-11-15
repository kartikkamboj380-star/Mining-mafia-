package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3909iq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30082c;

    private C3909iq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f30080a = interfaceC4864qQ0;
        this.f30081b = interfaceC4864qQ1;
        this.f30082c = interfaceC4864qQ2;
    }

    public static C3909iq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C3909iq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f30080a.zzb();
        C1521Bl0 c1521Bl0 = (C1521Bl0) this.f30081b.zzb();
        final C5043rr0 c5043rr0 = (C5043rr0) this.f30082c.zzb();
        return c1521Bl0.b(file, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.Rp0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                c5043rr0.d(15309, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
