package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2713Yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E4.l f25696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E4.k f25697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C5280tk f25698c;

    public C2713Yk(E4.l lVar, E4.k kVar) {
        this.f25696a = lVar;
        this.f25697b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized C5280tk e(InterfaceC5154sk interfaceC5154sk) {
        C5280tk c5280tk = this.f25698c;
        if (c5280tk != null) {
            return c5280tk;
        }
        C5280tk c5280tk2 = new C5280tk(interfaceC5154sk);
        this.f25698c = c5280tk2;
        return c5280tk2;
    }

    public final InterfaceC1726Fk a() {
        return new BinderC2661Xk(this, null);
    }

    public final InterfaceC1570Ck b() {
        if (this.f25697b == null) {
            return null;
        }
        return new BinderC2609Wk(this, null);
    }

    final /* synthetic */ E4.l c() {
        return this.f25696a;
    }

    final /* synthetic */ E4.k d() {
        return this.f25697b;
    }
}
