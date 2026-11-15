package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Do0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1631Do0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18284c;

    private C1631Do0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f18282a = interfaceC4864qQ0;
        this.f18283b = interfaceC4864qQ1;
        this.f18284c = interfaceC4864qQ2;
    }

    public static C1631Do0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C1631Do0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1943Jo0((File) this.f18282a.zzb(), (C1461Ah0) this.f18283b.zzb(), (C5043rr0) this.f18284c.zzb());
    }
}
