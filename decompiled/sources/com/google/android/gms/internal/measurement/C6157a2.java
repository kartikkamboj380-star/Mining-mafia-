package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6157a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6157a2 f36619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C6360x f36620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f36621c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f36622d = new HashMap();

    public C6157a2(C6157a2 c6157a2, C6360x c6360x) {
        this.f36619a = c6157a2;
        this.f36620b = c6360x;
    }

    public final InterfaceC6289p a(InterfaceC6289p interfaceC6289p) {
        return this.f36620b.b(this, interfaceC6289p);
    }

    public final InterfaceC6289p b(C6199f c6199f) {
        InterfaceC6289p interfaceC6289pB = InterfaceC6289p.f36808x;
        Iterator itK = c6199f.k();
        while (itK.hasNext()) {
            interfaceC6289pB = this.f36620b.b(this, c6199f.o(((Integer) itK.next()).intValue()));
            if (interfaceC6289pB instanceof C6217h) {
                break;
            }
        }
        return interfaceC6289pB;
    }

    public final C6157a2 c() {
        return new C6157a2(this, this.f36620b);
    }

    public final boolean d(String str) {
        if (this.f36621c.containsKey(str)) {
            return true;
        }
        C6157a2 c6157a2 = this.f36619a;
        if (c6157a2 != null) {
            return c6157a2.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC6289p interfaceC6289p) {
        C6157a2 c6157a2;
        Map map = this.f36621c;
        if (!map.containsKey(str) && (c6157a2 = this.f36619a) != null && c6157a2.d(str)) {
            c6157a2.e(str, interfaceC6289p);
        } else {
            if (this.f36622d.containsKey(str)) {
                return;
            }
            if (interfaceC6289p == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC6289p);
            }
        }
    }

    public final void f(String str, InterfaceC6289p interfaceC6289p) {
        if (this.f36622d.containsKey(str)) {
            return;
        }
        if (interfaceC6289p == null) {
            this.f36621c.remove(str);
        } else {
            this.f36621c.put(str, interfaceC6289p);
        }
    }

    public final void g(String str, InterfaceC6289p interfaceC6289p) {
        f(str, interfaceC6289p);
        this.f36622d.put(str, Boolean.TRUE);
    }

    public final InterfaceC6289p h(String str) {
        Map map = this.f36621c;
        if (map.containsKey(str)) {
            return (InterfaceC6289p) map.get(str);
        }
        C6157a2 c6157a2 = this.f36619a;
        if (c6157a2 != null) {
            return c6157a2.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
