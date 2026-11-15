package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1531Bq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17716c;

    private C1531Bq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f17714a = interfaceC4864qQ0;
        this.f17715b = interfaceC4864qQ1;
        this.f17716c = interfaceC4864qQ2;
    }

    public static C1531Bq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C1531Bq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17714a.zzb();
        C1521Bl0 c1521Bl0 = (C1521Bl0) this.f17715b.zzb();
        final C5043rr0 c5043rr0 = (C5043rr0) this.f17716c.zzb();
        return c1521Bl0.b(file, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.vq0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                c5043rr0.d(20310, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
