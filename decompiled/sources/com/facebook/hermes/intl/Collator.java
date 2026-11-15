package com.facebook.hermes.intl;

import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@p024c3.a
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f13724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f13725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13726c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f13729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B2.b f13730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B2.b f13731h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13727d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f13732i = new h();

    @p024c3.a
    public Collator(List<String> list, Map<String, Object> map) throws B2.f {
        a(list, map);
        this.f13732i.f(this.f13730g).e(this.f13728e).d(this.f13729f).g(this.f13725b).c(this.f13726c);
    }

    private void a(List list, Map map) throws B2.f {
        g.a aVar = g.a.STRING;
        this.f13724a = (a.d) g.d(a.d.class, B2.d.h(g.c(map, "usage", aVar, B2.a.f186e, "sort")));
        Object objQ = B2.d.q();
        B2.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, B2.a.f182a, "best fit"));
        Object objC = g.c(map, "numeric", g.a.BOOLEAN, B2.d.d(), B2.d.d());
        if (!B2.d.n(objC)) {
            objC = B2.d.r(String.valueOf(B2.d.e(objC)));
        }
        B2.d.c(objQ, "kn", objC);
        B2.d.c(objQ, "kf", g.c(map, "caseFirst", aVar, B2.a.f185d, B2.d.d()));
        HashMap mapA = f.a(list, objQ, Arrays.asList("co", "kf", "kn"));
        B2.b bVar = (B2.b) B2.d.g(mapA).get("locale");
        this.f13730g = bVar;
        this.f13731h = bVar.d();
        Object objA = B2.d.a(mapA, "co");
        if (B2.d.j(objA)) {
            objA = B2.d.r(BuildConfig.FLAVOR);
        }
        this.f13727d = B2.d.h(objA);
        Object objA2 = B2.d.a(mapA, "kn");
        int i10 = 0;
        if (B2.d.j(objA2)) {
            this.f13728e = false;
        } else {
            this.f13728e = Boolean.parseBoolean(B2.d.h(objA2));
        }
        Object objA3 = B2.d.a(mapA, "kf");
        if (B2.d.j(objA3)) {
            objA3 = B2.d.r("false");
        }
        this.f13729f = (a.b) g.d(a.b.class, B2.d.h(objA3));
        if (this.f13724a == a.d.SEARCH) {
            ArrayList arrayListB = this.f13730g.b("collation");
            ArrayList arrayList = new ArrayList();
            int size = arrayListB.size();
            while (i10 < size) {
                Object obj = arrayListB.get(i10);
                i10++;
                arrayList.add(B2.j.e((String) obj));
            }
            arrayList.add(B2.j.e("search"));
            this.f13730g.f("co", arrayList);
        }
        Object objC2 = g.c(map, "sensitivity", g.a.STRING, B2.a.f184c, B2.d.d());
        if (!B2.d.n(objC2)) {
            this.f13725b = (a.c) g.d(a.c.class, B2.d.h(objC2));
        } else if (this.f13724a == a.d.SORT) {
            this.f13725b = a.c.VARIANT;
        } else {
            this.f13725b = a.c.LOCALE;
        }
        this.f13726c = B2.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, B2.d.d(), Boolean.FALSE));
    }

    @p024c3.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return B2.d.h(g.c(map, "localeMatcher", g.a.STRING, B2.a.f182a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    @p024c3.a
    public double compare(String str, String str2) {
        return this.f13732i.a(str, str2);
    }

    @p024c3.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f13731h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f13724a.toString());
        a.c cVar = this.f13725b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f13732i.b().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f13726c));
        linkedHashMap.put("collation", this.f13727d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f13728e));
        linkedHashMap.put("caseFirst", this.f13729f.toString());
        return linkedHashMap;
    }
}
