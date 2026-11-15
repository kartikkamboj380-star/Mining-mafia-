package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5367uQ0 implements InterfaceC4864qQ0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33810c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile InterfaceC4864qQ0 f33811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f33812b = f33810c;

    private C5367uQ0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33811a = interfaceC4864qQ0;
    }

    public static InterfaceC4864qQ0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return ((interfaceC4864qQ0 instanceof C5367uQ0) || (interfaceC4864qQ0 instanceof C3606gQ0)) ? interfaceC4864qQ0 : new C5367uQ0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final Object zzb() {
        Object obj = this.f33812b;
        if (obj != f33810c) {
            return obj;
        }
        InterfaceC4864qQ0 interfaceC4864qQ0 = this.f33811a;
        if (interfaceC4864qQ0 == null) {
            return this.f33812b;
        }
        Object objZzb = interfaceC4864qQ0.zzb();
        this.f33812b = objZzb;
        this.f33811a = null;
        return objZzb;
    }
}
