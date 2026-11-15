package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class NT extends D4.a.AbstractC0017a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f21257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ZT f21258b;

    NT(ZT zt, String str) {
        this.f21257a = str;
        Objects.requireNonNull(zt);
        this.f21258b = zt;
    }

    @Override // B4.e
    public final void a(B4.k kVar) {
        this.f21258b.g0(ZT.H6(kVar));
    }

    @Override // B4.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f21258b.B6(this.f21257a, (D4.a) obj);
    }
}
