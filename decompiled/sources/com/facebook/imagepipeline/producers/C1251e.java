package com.facebook.imagepipeline.producers;

import J2.InterfaceC0736v;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1251e implements e0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set f14135v = Y1.h.b("id", "uri_source");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f14136w = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U2.b f14137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f14140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f14141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U2.b.c f14142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f14143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I2.f f14145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f14148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0736v f14149m;

    public C1251e(U2.b bVar, String str, g0 g0Var, Object obj, U2.b.c cVar, boolean z9, boolean z10, I2.f fVar, InterfaceC0736v interfaceC0736v) {
        this(bVar, str, null, null, g0Var, obj, cVar, z9, z10, fVar, interfaceC0736v);
    }

    public static void b(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    public static void d(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public static void e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public static void f(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean G() {
        return this.f14146j;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized I2.f J() {
        return this.f14145i;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public U2.b M() {
        return this.f14137a;
    }

    @Override // p243y2.a
    public void N(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            v((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean Q() {
        return this.f14144h;
    }

    @Override // p243y2.a
    public Object R(String str) {
        return this.f14143g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public U2.b.c S() {
        return this.f14142f;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public Object a() {
        return this.f14141e;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void c(f0 f0Var) {
        boolean z9;
        synchronized (this) {
            this.f14148l.add(f0Var);
            z9 = this.f14147k;
        }
        if (z9) {
            f0Var.b();
        }
    }

    public void g() {
        b(i());
    }

    @Override // p243y2.a
    public Map getExtras() {
        return this.f14143g;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String getId() {
        return this.f14138b;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public InterfaceC0736v h() {
        return this.f14149m;
    }

    public synchronized List i() {
        if (this.f14147k) {
            return null;
        }
        this.f14147k = true;
        return new ArrayList(this.f14148l);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void j(String str, String str2) {
        this.f14143g.put("origin", str);
        this.f14143g.put("origin_sub", str2);
    }

    public synchronized List k(boolean z9) {
        if (z9 == this.f14146j) {
            return null;
        }
        this.f14146j = z9;
        return new ArrayList(this.f14148l);
    }

    public synchronized List l(boolean z9) {
        if (z9 == this.f14144h) {
            return null;
        }
        this.f14144h = z9;
        return new ArrayList(this.f14148l);
    }

    public synchronized List m(I2.f fVar) {
        if (fVar == this.f14145i) {
            return null;
        }
        this.f14145i = fVar;
        return new ArrayList(this.f14148l);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String n() {
        return this.f14139c;
    }

    @Override // p243y2.a
    public void v(String str, Object obj) {
        if (f14135v.contains(str)) {
            return;
        }
        this.f14143g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void w(String str) {
        j(str, BuildConfig.FLAVOR);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public g0 x() {
        return this.f14140d;
    }

    public C1251e(U2.b bVar, String str, String str2, Map map, g0 g0Var, Object obj, U2.b.c cVar, boolean z9, boolean z10, I2.f fVar, InterfaceC0736v interfaceC0736v) {
        this.f14137a = bVar;
        this.f14138b = str;
        HashMap map2 = new HashMap();
        this.f14143g = map2;
        map2.put("id", str);
        map2.put("uri_source", bVar == null ? "null-request" : bVar.v());
        N(map);
        this.f14139c = str2;
        this.f14140d = g0Var;
        this.f14141e = obj == null ? f14136w : obj;
        this.f14142f = cVar;
        this.f14144h = z9;
        this.f14145i = fVar;
        this.f14146j = z10;
        this.f14147k = false;
        this.f14148l = new ArrayList();
        this.f14149m = interfaceC0736v;
    }
}
