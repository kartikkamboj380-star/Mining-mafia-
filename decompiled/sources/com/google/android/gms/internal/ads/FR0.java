package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class FR0 implements InterfaceC3986jS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC5270tf f18756b;

    public FR0(Object obj, C5007rZ0 c5007rZ0) {
        this.f18755a = obj;
        this.f18756b = c5007rZ0.M();
    }

    public final void a(AbstractC5270tf abstractC5270tf) {
        this.f18756b = abstractC5270tf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3986jS0
    public final Object zza() {
        return this.f18755a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3986jS0
    public final AbstractC5270tf zzb() {
        return this.f18756b;
    }
}
