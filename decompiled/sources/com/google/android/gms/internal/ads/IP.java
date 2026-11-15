package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class IP implements InterfaceC3397em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HG f19541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2519Ur f19542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19544d;

    public IP(HG hg, C3502fb0 c3502fb0) {
        this.f19541a = hg;
        this.f19542b = c3502fb0.f28417l;
        this.f19543c = c3502fb0.f28413j;
        this.f19544d = c3502fb0.f28415k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397em
    public final void X0(C2519Ur c2519Ur) {
        int i10;
        String str;
        C2519Ur c2519Ur2 = this.f19542b;
        if (c2519Ur2 != null) {
            c2519Ur = c2519Ur2;
        }
        if (c2519Ur != null) {
            str = c2519Ur.f24109a;
            i10 = c2519Ur.f24110b;
        } else {
            i10 = 1;
            str = "";
        }
        this.f19541a.l1(new BinderC1740Fr(str, i10), this.f19543c, this.f19544d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397em
    public final void zza() {
        this.f19541a.k1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397em
    public final void zzc() {
        this.f19541a.b();
    }
}
