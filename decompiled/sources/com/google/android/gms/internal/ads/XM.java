package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class XM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC6036zk f25198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InterfaceC5658wk f25199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    InterfaceC2141Nk f25200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC1986Kk f25201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceC3023bn f25202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p190t.k f25203f = new p190t.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p190t.k f25204g = new p190t.k();

    public final XM a(InterfaceC6036zk interfaceC6036zk) {
        this.f25198a = interfaceC6036zk;
        return this;
    }

    public final XM b(InterfaceC5658wk interfaceC5658wk) {
        this.f25199b = interfaceC5658wk;
        return this;
    }

    public final XM c(InterfaceC2141Nk interfaceC2141Nk) {
        this.f25200c = interfaceC2141Nk;
        return this;
    }

    public final XM d(InterfaceC1986Kk interfaceC1986Kk) {
        this.f25201d = interfaceC1986Kk;
        return this;
    }

    public final XM e(InterfaceC3023bn interfaceC3023bn) {
        this.f25202e = interfaceC3023bn;
        return this;
    }

    public final XM f(String str, InterfaceC1726Fk interfaceC1726Fk, InterfaceC1570Ck interfaceC1570Ck) {
        this.f25203f.put(str, interfaceC1726Fk);
        if (interfaceC1570Ck != null) {
            this.f25204g.put(str, interfaceC1570Ck);
        }
        return this;
    }

    public final YM g() {
        return new YM(this, null);
    }
}
