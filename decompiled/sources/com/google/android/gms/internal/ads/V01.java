package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class V01 extends n11 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24156f;

    public V01(int i10, C2495Uf c2495Uf, int i11, Y01 y01, int i12) {
        super(i10, c2495Uf, i11);
        this.f24155e = GS0.b(i12, y01.f25449U) ? 1 : 0;
        this.f24156f = this.f31649d.c();
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final /* bridge */ /* synthetic */ boolean c(n11 n11Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(V01 v01) {
        return Integer.compare(this.f24156f, v01.f24156f);
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final int zza() {
        return this.f24155e;
    }
}
