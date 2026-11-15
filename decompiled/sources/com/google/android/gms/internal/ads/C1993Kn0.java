package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1993Kn0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20280e;

    private C1993Kn0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f20276a = interfaceC4864qQ0;
        this.f20277b = interfaceC4864qQ1;
        this.f20278c = interfaceC4864qQ2;
        this.f20279d = interfaceC4864qQ3;
        this.f20280e = interfaceC4864qQ4;
    }

    public static C1993Kn0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C1993Kn0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1941Jn0((C1966Ka) this.f20276a.zzb(), (InterfaceC2718Ym0) this.f20277b.zzb(), (DisplayMetrics) this.f20278c.zzb(), (View) this.f20279d.zzb(), (C5043rr0) this.f20280e.zzb());
    }
}
