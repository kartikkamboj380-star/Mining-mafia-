package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5711x90 implements InterfaceC1919Jc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V90 f34751a;

    public C5711x90(V90 v90) {
        this.f34751a = v90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1919Jc0
    public final void a(C6021zc0 c6021zc0) {
        c6021zc0.f35815a = ((C5585w90) this.f34751a).b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1919Jc0
    public final com.google.common.util.concurrent.p b(InterfaceC1971Kc0 interfaceC1971Kc0) {
        A90 a90 = (A90) interfaceC1971Kc0;
        return ((C5585w90) this.f34751a).c(a90.f17258b, a90.f17257a, null);
    }
}
