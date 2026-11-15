package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2904aq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26653c;

    private C2904aq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f26651a = interfaceC4864qQ0;
        this.f26652b = interfaceC4864qQ1;
        this.f26653c = interfaceC4864qQ2;
    }

    public static C2904aq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C2904aq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f26651a.zzb();
        C1521Bl0 c1521Bl0 = (C1521Bl0) this.f26652b.zzb();
        final C5043rr0 c5043rr0 = (C5043rr0) this.f26653c.zzb();
        return c1521Bl0.b(file, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.Sp0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                c5043rr0.d(15309, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
