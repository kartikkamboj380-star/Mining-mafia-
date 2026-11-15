package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class PT extends M4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ZT f22114b;

    PT(ZT zt, String str) {
        this.f22113a = str;
        Objects.requireNonNull(zt);
        this.f22114b = zt;
    }

    @Override // B4.e
    public final void a(B4.k kVar) {
        this.f22114b.g0(ZT.H6(kVar));
    }

    @Override // B4.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f22114b.B6(this.f22113a, (M4.a) obj);
    }
}
