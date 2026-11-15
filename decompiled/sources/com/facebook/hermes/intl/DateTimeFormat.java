package com.facebook.hermes.intl;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
@p024c3.a
public class DateTimeFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f13737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f13739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f13740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b.g f13741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b.e f13742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.m f13743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b.d f13744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.n f13745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.i f13746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b.c f13747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b.f f13748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.h f13749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b.j f13750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b.l f13751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b.EnumC0322b f13752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.k f13753u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B2.b f13734b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B2.b f13735c = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f13754v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f13733a = new i();

    @p024c3.a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws B2.f {
        c(list, map);
        this.f13733a.d(this.f13734b, this.f13736d ? "" : this.f13737e, this.f13738f ? "" : this.f13739g, this.f13742j, this.f13743k, this.f13744l, this.f13745m, this.f13746n, this.f13747o, this.f13748p, this.f13749q, this.f13750r, this.f13751s, this.f13741i, this.f13754v, this.f13752t, this.f13753u, this.f13740h);
    }

    private Object a() {
        return this.f13733a.h(this.f13734b);
    }

    private Object b(Object obj, String str, String str2) throws B2.f {
        if (!B2.d.l(obj)) {
            throw new B2.f("Invalid options object !");
        }
        boolean z9 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i10 = 0; i10 < 4; i10++) {
                if (!B2.d.n(B2.d.a(obj, strArr[i10]))) {
                    z9 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (!B2.d.n(B2.d.a(obj, strArr2[i11]))) {
                    z9 = false;
                }
            }
        }
        if (!B2.d.n(B2.d.a(obj, "dateStyle")) || !B2.d.n(B2.d.a(obj, "timeStyle"))) {
            z9 = false;
        }
        if (z9 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i12 = 0; i12 < 3; i12++) {
                B2.d.c(obj, strArr3[i12], "numeric");
            }
        }
        if (z9 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i13 = 0; i13 < 3; i13++) {
                B2.d.c(obj, strArr4[i13], "numeric");
            }
        }
        return obj;
    }

    private void c(List list, Map map) throws B2.f {
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objB = b(map, "any", "date");
        Object objQ = B2.d.q();
        g.a aVar = g.a.STRING;
        B2.d.c(objQ, "localeMatcher", g.c(objB, "localeMatcher", aVar, B2.a.f182a, "best fit"));
        Object objC = g.c(objB, "calendar", aVar, B2.d.d(), B2.d.d());
        if (!B2.d.n(objC) && !d(B2.d.h(objC))) {
            throw new B2.f("Invalid calendar option !");
        }
        B2.d.c(objQ, "ca", objC);
        Object objC2 = g.c(objB, "numberingSystem", aVar, B2.d.d(), B2.d.d());
        if (!B2.d.n(objC2) && !d(B2.d.h(objC2))) {
            throw new B2.f("Invalid numbering system !");
        }
        B2.d.c(objQ, "nu", objC2);
        Object objC3 = g.c(objB, "hour12", g.a.BOOLEAN, B2.d.d(), B2.d.d());
        Object objC4 = g.c(objB, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, B2.d.d());
        if (!B2.d.n(objC3)) {
            objC4 = B2.d.b();
        }
        B2.d.c(objQ, "hc", objC4);
        HashMap mapA = f.a(list, objQ, listAsList);
        B2.b bVar = (B2.b) B2.d.g(mapA).get("locale");
        this.f13734b = bVar;
        this.f13735c = bVar.d();
        Object objA = B2.d.a(mapA, "ca");
        if (B2.d.j(objA)) {
            this.f13736d = true;
            this.f13737e = this.f13733a.e(this.f13734b);
        } else {
            this.f13736d = false;
            this.f13737e = B2.d.h(objA);
        }
        Object objA2 = B2.d.a(mapA, "nu");
        if (B2.d.j(objA2)) {
            this.f13738f = true;
            this.f13739g = this.f13733a.b(this.f13734b);
        } else {
            this.f13738f = false;
            this.f13739g = B2.d.h(objA2);
        }
        Object objA3 = B2.d.a(mapA, "hc");
        Object objA4 = B2.d.a(objB, "timeZone");
        this.f13754v = B2.d.n(objA4) ? a() : e(objA4.toString());
        this.f13742j = (b.e) g.d(b.e.class, B2.d.h(g.c(objB, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f13743k = (b.m) g.d(b.m.class, g.c(objB, "weekday", aVar, new String[]{"long", "short", "narrow"}, B2.d.d()));
        this.f13744l = (b.d) g.d(b.d.class, g.c(objB, "era", aVar, new String[]{"long", "short", "narrow"}, B2.d.d()));
        this.f13745m = (b.n) g.d(b.n.class, g.c(objB, "year", aVar, new String[]{"numeric", "2-digit"}, B2.d.d()));
        this.f13746n = (b.i) g.d(b.i.class, g.c(objB, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, B2.d.d()));
        this.f13747o = (b.c) g.d(b.c.class, g.c(objB, "day", aVar, new String[]{"numeric", "2-digit"}, B2.d.d()));
        Object objC5 = g.c(objB, "hour", aVar, new String[]{"numeric", "2-digit"}, B2.d.d());
        this.f13748p = (b.f) g.d(b.f.class, objC5);
        this.f13749q = (b.h) g.d(b.h.class, g.c(objB, "minute", aVar, new String[]{"numeric", "2-digit"}, B2.d.d()));
        this.f13750r = (b.j) g.d(b.j.class, g.c(objB, "second", aVar, new String[]{"numeric", "2-digit"}, B2.d.d()));
        this.f13751s = (b.l) g.d(b.l.class, g.c(objB, "timeZoneName", aVar, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, B2.d.d()));
        this.f13752t = (b.EnumC0322b) g.d(b.EnumC0322b.class, g.c(objB, "dateStyle", aVar, new String[]{"full", "long", "medium", "short"}, B2.d.d()));
        Object objC6 = g.c(objB, "timeStyle", aVar, new String[]{"full", "long", "medium", "short"}, B2.d.d());
        this.f13753u = (b.k) g.d(b.k.class, objC6);
        if (B2.d.n(objC5) && B2.d.n(objC6)) {
            this.f13741i = b.g.UNDEFINED;
        } else {
            b.g gVarF = this.f13733a.f(this.f13734b);
            b.g gVar = B2.d.j(objA3) ? gVarF : (b.g) g.d(b.g.class, objA3);
            if (!B2.d.n(objC3)) {
                if (B2.d.e(objC3)) {
                    gVar = b.g.H11;
                    if (gVarF != gVar && gVarF != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (gVarF == b.g.H11 || gVarF == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
            this.f13741i = gVar;
        }
        this.f13740h = objC3;
    }

    private boolean d(String str) {
        return B2.c.e(str, 0, str.length() - 1);
    }

    @p024c3.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = B2.d.h(g.c(map, "localeMatcher", g.a.STRING, B2.a.f182a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) throws B2.f {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new B2.f("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt + ' '));
            }
        }
        return sb.toString();
    }

    @p024c3.a
    public String format(double d10) {
        return this.f13733a.c(d10);
    }

    @p024c3.a
    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f13733a.a(d10);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strG = it.hasNext() ? this.f13733a.g(it.next(), sb.toString()) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, strG);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @p024c3.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f13735c.g());
        linkedHashMap.put("numberingSystem", this.f13739g);
        linkedHashMap.put("calendar", this.f13737e);
        linkedHashMap.put("timeZone", this.f13754v);
        b.g gVar = this.f13741i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f13741i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f13743k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f13744l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f13745m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f13746n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f13747o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f13748p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f13749q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f13750r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f13751s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0322b enumC0322b = this.f13752t;
        if (enumC0322b != b.EnumC0322b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0322b.toString());
        }
        b.k kVar = this.f13753u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
