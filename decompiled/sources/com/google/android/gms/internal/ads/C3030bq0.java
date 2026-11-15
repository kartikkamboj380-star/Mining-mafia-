package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3030bq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26945c;

    private C3030bq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f26943a = interfaceC4864qQ0;
        this.f26944b = interfaceC4864qQ1;
        this.f26945c = interfaceC4864qQ2;
    }

    public static C3030bq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C3030bq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f26943a.zzb();
        C1521Bl0 c1521Bl0 = (C1521Bl0) this.f26944b.zzb();
        final C5043rr0 c5043rr0 = (C5043rr0) this.f26945c.zzb();
        return c1521Bl0.a(file, C2456Tl0.i0(), new Function() { // from class: com.google.android.gms.internal.ads.Tp0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                c5043rr0.d(15308, (Throwable) obj);
                return C2456Tl0.i0();
            }
        });
    }
}
