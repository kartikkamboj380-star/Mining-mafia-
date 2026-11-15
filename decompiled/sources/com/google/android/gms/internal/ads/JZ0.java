package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class JZ0 extends AbstractC3551g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2495Uf f19943b;

    public JZ0(InterfaceC3299e interfaceC3299e, C2495Uf c2495Uf) {
        super(interfaceC3299e);
        this.f19943b = c2495Uf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final JY0 b(int i10) {
        return this.f19943b.a(a().n(i10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551g
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof JZ0)) {
            return this.f19943b.equals(((JZ0) obj).f19943b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551g
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f19943b.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final C2495Uf zza() {
        return this.f19943b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3299e
    public final JY0 zzc() {
        return this.f19943b.a(a().c());
    }
}
