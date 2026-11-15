package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3858iQ0 implements InterfaceC3732hQ0, InterfaceC2978bQ0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3858iQ0 f29397b = new C3858iQ0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f29398a;

    private C3858iQ0(Object obj) {
        this.f29398a = obj;
    }

    public static InterfaceC3732hQ0 a(Object obj) {
        AbstractC4738pQ0.a(obj, "instance cannot be null");
        return new C3858iQ0(obj);
    }

    public static InterfaceC3732hQ0 b(Object obj) {
        return obj == null ? f29397b : new C3858iQ0(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final Object zzb() {
        return this.f29398a;
    }
}
