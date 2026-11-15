package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3150co implements InterfaceC2783Zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1784Gn f27216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2575Vt f27218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3653go f27219d;

    C3150co(C3653go c3653go, C1784Gn c1784Gn, Object obj, C2575Vt c2575Vt) {
        this.f27216a = c1784Gn;
        this.f27217b = obj;
        this.f27218c = c2575Vt;
        Objects.requireNonNull(c3653go);
        this.f27219d = c3653go;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2783Zt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC0786o0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f27217b;
        C2575Vt c2575Vt = this.f27218c;
        this.f27219d.a(this.f27216a, (InterfaceC2147Nn) obj, obj2, c2575Vt);
    }
}
