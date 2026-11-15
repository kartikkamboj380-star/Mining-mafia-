package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C01 extends AbstractC3247dZ0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final InterfaceC5889yZ0 f17768k;

    protected C01(InterfaceC5889yZ0 interfaceC5889yZ0) {
        this.f17768k = interfaceC5889yZ0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3247dZ0
    protected final /* bridge */ /* synthetic */ int B(Object obj, int i10) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3247dZ0
    protected final /* synthetic */ C5637wZ0 C(Object obj, C5637wZ0 c5637wZ0) {
        return I(c5637wZ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final boolean D() {
        this.f17768k.D();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3247dZ0
    protected final /* synthetic */ long E(Object obj, long j10, C5637wZ0 c5637wZ0) {
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final C4819q4 F() {
        return this.f17768k.F();
    }

    protected abstract void G();

    protected abstract void H(AbstractC5270tf abstractC5270tf);

    protected abstract C5637wZ0 I(C5637wZ0 c5637wZ0);

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public abstract void j(InterfaceC5385uZ0 interfaceC5385uZ0);

    @Override // com.google.android.gms.internal.ads.AbstractC3247dZ0, com.google.android.gms.internal.ads.VY0
    protected final void o(GK0 gk0) {
        super.o(gk0);
        G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final AbstractC5270tf w() {
        this.f17768k.w();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3247dZ0
    protected final /* synthetic */ void z(Object obj, InterfaceC5889yZ0 interfaceC5889yZ0, AbstractC5270tf abstractC5270tf) {
        H(abstractC5270tf);
    }
}
