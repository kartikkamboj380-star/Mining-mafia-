package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class TL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QL f23476a;

    private TL(QL ql) {
        this.f23476a = ql;
    }

    public static TL b(QL ql) {
        return new TL(ql);
    }

    public static YM c(QL ql) {
        YM ymA = ql.a();
        AbstractC4738pQ0.b(ymA);
        return ymA;
    }

    public final YM a() {
        return c(this.f23476a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f23476a);
    }
}
