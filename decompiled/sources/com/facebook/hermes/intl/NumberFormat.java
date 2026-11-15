package com.facebook.hermes.intl;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@p024c3.a
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String[] f13755v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.h f13756a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.i f13761f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c.f f13768m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13771p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c.b f13774s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13757b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.EnumC0323c f13758c = c.EnumC0323c.SYMBOL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.d f13759d = c.d.STANDARD;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f13760e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13762g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13763h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13764i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13765j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13766k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13767l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c.g f13769n = c.g.AUTO;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f13772q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c.e f13773r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private B2.b f13775t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private B2.b f13776u = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f13770o = new j();

    @p024c3.a
    public NumberFormat(List<String> list, Map<String, Object> map) throws B2.f {
        a(list, map);
        this.f13770o.l(this.f13775t, this.f13771p ? "" : this.f13772q, this.f13756a, this.f13759d, this.f13773r, this.f13774s).d(this.f13757b, this.f13758c).g(this.f13762g).f(this.f13763h).e(this.f13768m, this.f13766k, this.f13767l).h(this.f13768m, this.f13764i, this.f13765j).j(this.f13769n).i(this.f13760e, this.f13761f);
    }

    private void a(List list, Map map) throws B2.f {
        Object objP;
        Object objP2;
        Object objQ = B2.d.q();
        g.a aVar = g.a.STRING;
        B2.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, B2.a.f182a, "best fit"));
        Object objC = g.c(map, "numberingSystem", aVar, B2.d.d(), B2.d.d());
        if (!B2.d.n(objC) && !b(B2.d.h(objC))) {
            throw new B2.f("Invalid numbering system !");
        }
        B2.d.c(objQ, "nu", objC);
        HashMap mapA = f.a(list, objQ, Collections.singletonList("nu"));
        B2.b bVar = (B2.b) B2.d.g(mapA).get("locale");
        this.f13775t = bVar;
        this.f13776u = bVar.d();
        Object objA = B2.d.a(mapA, "nu");
        if (B2.d.j(objA)) {
            this.f13771p = true;
            this.f13772q = this.f13770o.b(this.f13775t);
        } else {
            this.f13771p = false;
            this.f13772q = B2.d.h(objA);
        }
        h(map);
        if (this.f13756a == c.h.CURRENCY) {
            double dN = j.n(this.f13757b);
            objP = B2.d.p(dN);
            objP2 = B2.d.p(dN);
        } else {
            objP = B2.d.p(0.0d);
            objP2 = this.f13756a == c.h.PERCENT ? B2.d.p(0.0d) : B2.d.p(3.0d);
        }
        this.f13773r = (c.e) g.d(c.e.class, B2.d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, objP, objP2);
        Object objC2 = g.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f13773r == c.e.COMPACT) {
            this.f13774s = (c.b) g.d(c.b.class, B2.d.h(objC2));
        }
        this.f13762g = B2.d.e(g.c(map, "useGrouping", g.a.BOOLEAN, B2.d.d(), B2.d.o(true)));
        this.f13769n = (c.g) g.d(c.g.class, B2.d.h(g.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return B2.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f13755v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        return iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && c(str.substring(0, iIndexOf)) && c(str.substring(iIndexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt - ' '));
            }
        }
        return sb.toString();
    }

    private void g(Map map, Object obj, Object obj2) throws B2.f {
        Object objB = g.b(map, "minimumIntegerDigits", B2.d.p(1.0d), B2.d.p(21.0d), B2.d.p(1.0d));
        Object objA = B2.d.a(map, "minimumFractionDigits");
        Object objA2 = B2.d.a(map, "maximumFractionDigits");
        Object objA3 = B2.d.a(map, "minimumSignificantDigits");
        Object objA4 = B2.d.a(map, "maximumSignificantDigits");
        this.f13763h = (int) Math.floor(B2.d.f(objB));
        if (!B2.d.n(objA3) || !B2.d.n(objA4)) {
            this.f13768m = c.f.SIGNIFICANT_DIGITS;
            Object objA5 = g.a("minimumSignificantDigits", objA3, B2.d.p(1.0d), B2.d.p(21.0d), B2.d.p(1.0d));
            Object objA6 = g.a("maximumSignificantDigits", objA4, objA5, B2.d.p(21.0d), B2.d.p(21.0d));
            this.f13766k = (int) Math.floor(B2.d.f(objA5));
            this.f13767l = (int) Math.floor(B2.d.f(objA6));
            return;
        }
        if (B2.d.n(objA) && B2.d.n(objA2)) {
            c.e eVar = this.f13773r;
            if (eVar == c.e.COMPACT) {
                this.f13768m = c.f.COMPACT_ROUNDING;
                return;
            }
            if (eVar == c.e.ENGINEERING) {
                this.f13768m = c.f.FRACTION_DIGITS;
                this.f13765j = 5;
                return;
            } else {
                this.f13768m = c.f.FRACTION_DIGITS;
                this.f13764i = (int) Math.floor(B2.d.f(obj));
                this.f13765j = (int) Math.floor(B2.d.f(obj2));
                return;
            }
        }
        this.f13768m = c.f.FRACTION_DIGITS;
        Object objA7 = g.a("minimumFractionDigits", objA, B2.d.p(0.0d), B2.d.p(20.0d), B2.d.d());
        Object objA8 = g.a("maximumFractionDigits", objA2, B2.d.p(0.0d), B2.d.p(20.0d), B2.d.d());
        if (B2.d.n(objA7)) {
            objA7 = B2.d.p(Math.min(B2.d.f(obj), B2.d.f(objA8)));
        } else if (B2.d.n(objA8)) {
            objA8 = B2.d.p(Math.max(B2.d.f(obj2), B2.d.f(objA7)));
        } else if (B2.d.f(objA7) > B2.d.f(objA8)) {
            throw new B2.f("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.f13764i = (int) Math.floor(B2.d.f(objA7));
        this.f13765j = (int) Math.floor(B2.d.f(objA8));
    }

    private void h(Map map) throws B2.f {
        g.a aVar = g.a.STRING;
        this.f13756a = (c.h) g.d(c.h.class, B2.d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object objC = g.c(map, "currency", aVar, B2.d.d(), B2.d.d());
        if (B2.d.n(objC)) {
            if (this.f13756a == c.h.CURRENCY) {
                throw new B2.f("Expected currency style !");
            }
        } else if (!d(B2.d.h(objC))) {
            throw new B2.f("Malformed currency code !");
        }
        Object objC2 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", MediationMetaData.KEY_NAME}, "symbol");
        Object objC3 = g.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object objC4 = g.c(map, "unit", aVar, B2.d.d(), B2.d.d());
        if (B2.d.n(objC4)) {
            if (this.f13756a == c.h.UNIT) {
                throw new B2.f("Expected unit !");
            }
        } else if (!e(B2.d.h(objC4))) {
            throw new B2.f("Malformed unit identifier !");
        }
        Object objC5 = g.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        c.h hVar = this.f13756a;
        if (hVar == c.h.CURRENCY) {
            this.f13757b = f(B2.d.h(objC));
            this.f13758c = (c.EnumC0323c) g.d(c.EnumC0323c.class, B2.d.h(objC2));
            this.f13759d = (c.d) g.d(c.d.class, B2.d.h(objC3));
        } else if (hVar == c.h.UNIT) {
            this.f13760e = B2.d.h(objC4);
            this.f13761f = (c.i) g.d(c.i.class, B2.d.h(objC5));
        }
    }

    @p024c3.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = B2.d.h(g.c(map, "localeMatcher", g.a.STRING, B2.a.f182a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    @p024c3.a
    public String format(double d10) {
        return this.f13770o.c(d10);
    }

    @p024c3.a
    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f13770o.a(d10);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strK = it.hasNext() ? this.f13770o.k(it.next(), d10) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, strK);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @p024c3.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f13776u.g());
        linkedHashMap.put("numberingSystem", this.f13772q);
        linkedHashMap.put("style", this.f13756a.toString());
        c.h hVar = this.f13756a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put("currency", this.f13757b);
            linkedHashMap.put("currencyDisplay", this.f13758c.toString());
            linkedHashMap.put("currencySign", this.f13759d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f13760e);
            linkedHashMap.put("unitDisplay", this.f13761f.toString());
        }
        int i10 = this.f13763h;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        c.f fVar = this.f13768m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i11 = this.f13767l;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.f13766k;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i13 = this.f13764i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.f13765j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f13762g));
        linkedHashMap.put("notation", this.f13773r.toString());
        if (this.f13773r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f13774s.toString());
        }
        linkedHashMap.put("signDisplay", this.f13769n.toString());
        return linkedHashMap;
    }
}
