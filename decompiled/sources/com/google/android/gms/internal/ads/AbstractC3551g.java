package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3551g implements InterfaceC3299e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3299e f28526a;

    public AbstractC3551g(InterfaceC3299e interfaceC3299e) {
        this.f28526a = interfaceC3299e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final int X(int i10) {
        return this.f28526a.X(i10);
    }

    public final InterfaceC3299e a() {
        return this.f28526a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3299e
    public final int c() {
        return this.f28526a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC3551g) {
            return this.f28526a.equals(((AbstractC3551g) obj).f28526a);
        }
        return false;
    }

    public int hashCode() {
        return this.f28526a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final int n(int i10) {
        return this.f28526a.n(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final int zze() {
        return this.f28526a.zze();
    }
}
