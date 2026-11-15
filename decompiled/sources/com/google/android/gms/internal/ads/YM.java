package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class YM {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final YM f25591h = new YM(new XM());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6036zk f25592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5658wk f25593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2141Nk f25594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1986Kk f25595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3023bn f25596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p190t.k f25597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p190t.k f25598g;

    /* synthetic */ YM(XM xm, byte[] bArr) {
        this(xm);
    }

    public final InterfaceC6036zk a() {
        return this.f25592a;
    }

    public final InterfaceC5658wk b() {
        return this.f25593b;
    }

    public final InterfaceC2141Nk c() {
        return this.f25594c;
    }

    public final InterfaceC1986Kk d() {
        return this.f25595d;
    }

    public final InterfaceC3023bn e() {
        return this.f25596e;
    }

    public final InterfaceC1726Fk f(String str) {
        if (str == null) {
            return null;
        }
        return (InterfaceC1726Fk) this.f25597f.get(str);
    }

    public final InterfaceC1570Ck g(String str) {
        return (InterfaceC1570Ck) this.f25598g.get(str);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        if (this.f25594c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f25592a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f25593b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f25597f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f25596e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList i() {
        p190t.k kVar = this.f25597f;
        ArrayList arrayList = new ArrayList(kVar.size());
        for (int i10 = 0; i10 < kVar.size(); i10++) {
            arrayList.add((String) kVar.g(i10));
        }
        return arrayList;
    }

    private YM(XM xm) {
        this.f25592a = xm.f25198a;
        this.f25593b = xm.f25199b;
        this.f25594c = xm.f25200c;
        this.f25597f = new p190t.k(xm.f25203f);
        this.f25598g = new p190t.k(xm.f25204g);
        this.f25595d = xm.f25201d;
        this.f25596e = xm.f25202e;
    }
}
