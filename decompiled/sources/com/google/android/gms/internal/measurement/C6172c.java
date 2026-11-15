package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6172c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C6163b f36639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6163b f36640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f36641c;

    public C6172c() {
        this.f36639a = new C6163b("", 0L, null);
        this.f36640b = new C6163b("", 0L, null);
        this.f36641c = new ArrayList();
    }

    public final C6163b a() {
        return this.f36639a;
    }

    public final void b(C6163b c6163b) {
        this.f36639a = c6163b;
        this.f36640b = c6163b.clone();
        this.f36641c.clear();
    }

    public final C6163b c() {
        return this.f36640b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C6172c c6172c = new C6172c(this.f36639a.clone());
        Iterator it = this.f36641c.iterator();
        while (it.hasNext()) {
            c6172c.f36641c.add(((C6163b) it.next()).clone());
        }
        return c6172c;
    }

    public final void d(C6163b c6163b) {
        this.f36640b = c6163b;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C6163b.h(str2, this.f36639a.e(str2), map.get(str2)));
        }
        this.f36641c.add(new C6163b(str, j10, map2));
    }

    public final List f() {
        return this.f36641c;
    }

    public C6172c(C6163b c6163b) {
        this.f36639a = c6163b;
        this.f36640b = c6163b.clone();
        this.f36641c = new ArrayList();
    }
}
