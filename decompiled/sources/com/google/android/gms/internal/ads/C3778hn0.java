package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3778hn0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29119e;

    private C3778hn0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f29115a = interfaceC4864qQ0;
        this.f29116b = interfaceC4864qQ1;
        this.f29117c = interfaceC4864qQ2;
        this.f29118d = interfaceC4864qQ3;
        this.f29119e = interfaceC4864qQ4;
    }

    public static C3778hn0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C3778hn0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3652gn0((C1966Ka) this.f29115a.zzb(), (InterfaceC2718Ym0) this.f29116b.zzb(), (View) this.f29117c.zzb(), (Activity) this.f29118d.zzb(), (C5043rr0) this.f29119e.zzb());
    }
}
