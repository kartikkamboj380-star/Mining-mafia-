package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4636oc0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32149c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f32147a = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2178Oc0 f32150d = new C2178Oc0();

    public C4636oc0(int i10, int i11) {
        this.f32148b = i10;
        this.f32149c = i11;
    }

    private final void i() {
        while (true) {
            LinkedList linkedList = this.f32147a;
            if (linkedList.isEmpty()) {
                return;
            }
            if (G4.t.o().currentTimeMillis() - ((C6021zc0) linkedList.getFirst()).f35818d < this.f32149c) {
                return;
            }
            this.f32150d.c();
            linkedList.remove();
        }
    }

    public final boolean a(C6021zc0 c6021zc0) {
        this.f32150d.a();
        i();
        LinkedList linkedList = this.f32147a;
        if (linkedList.size() == this.f32148b) {
            return false;
        }
        linkedList.add(c6021zc0);
        return true;
    }

    public final C6021zc0 b() {
        C2178Oc0 c2178Oc0 = this.f32150d;
        c2178Oc0.a();
        i();
        LinkedList linkedList = this.f32147a;
        if (linkedList.isEmpty()) {
            return null;
        }
        C6021zc0 c6021zc0 = (C6021zc0) linkedList.remove();
        if (c6021zc0 != null) {
            c2178Oc0.b();
        }
        return c6021zc0;
    }

    public final int c() {
        i();
        return this.f32147a.size();
    }

    public final long d() {
        return this.f32150d.d();
    }

    public final long e() {
        return this.f32150d.e();
    }

    public final int f() {
        return this.f32150d.f();
    }

    public final String g() {
        return this.f32150d.h();
    }

    public final C2126Nc0 h() {
        return this.f32150d.g();
    }
}
