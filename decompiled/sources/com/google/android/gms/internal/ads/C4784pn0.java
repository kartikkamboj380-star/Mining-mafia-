package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4784pn0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32474d;

    private C4784pn0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f32471a = interfaceC4864qQ0;
        this.f32472b = interfaceC4864qQ1;
        this.f32473c = interfaceC4864qQ2;
        this.f32474d = interfaceC4864qQ3;
    }

    public static C4784pn0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C4784pn0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4658on0((C1966Ka) this.f32471a.zzb(), (InterfaceC2718Ym0) this.f32472b.zzb(), (Context) this.f32473c.zzb(), (C5043rr0) this.f32474d.zzb());
    }
}
