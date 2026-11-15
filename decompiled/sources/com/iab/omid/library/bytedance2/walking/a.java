package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f41836a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0387a> f41837b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f41838c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f41839d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f41840e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f41841f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f41842g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f41843h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41844i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0387a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f41845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f41846b = new ArrayList<>();

        public C0387a(e eVar, String str) {
            this.f41845a = eVar;
            a(str);
        }

        public e a() {
            return this.f41845a;
        }

        public ArrayList<String> b() {
            return this.f41846b;
        }

        public void a(String str) {
            this.f41846b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f41843h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f41843h.containsKey(view)) {
            return this.f41843h.get(view);
        }
        Map<View, Boolean> map = this.f41843h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f41838c.get(str);
    }

    public C0387a c(View view) {
        C0387a c0387a = this.f41837b.get(view);
        if (c0387a != null) {
            this.f41837b.remove(view);
        }
        return c0387a;
    }

    public String d(View view) {
        if (this.f41836a.size() == 0) {
            return null;
        }
        String str = this.f41836a.get(view);
        if (str != null) {
            this.f41836a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.f41839d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f41844i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f41843h.containsKey(view)) {
            return true;
        }
        this.f41843h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f41839d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f41842g.get(str);
    }

    public HashSet<String> c() {
        return this.f41840e;
    }

    public void d() {
        this.f41844i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f41840e.add(adSessionId);
                            this.f41836a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f41841f.add(adSessionId);
                            this.f41838c.put(adSessionId, viewC);
                            this.f41842g.put(adSessionId, strA);
                        }
                    } else {
                        this.f41841f.add(adSessionId);
                        this.f41842g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f41836a.clear();
        this.f41837b.clear();
        this.f41838c.clear();
        this.f41839d.clear();
        this.f41840e.clear();
        this.f41841f.clear();
        this.f41842g.clear();
        this.f41844i = false;
    }

    public HashSet<String> b() {
        return this.f41841f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0387a c0387a = this.f41837b.get(view);
        if (c0387a != null) {
            c0387a.a(aVar.getAdSessionId());
        } else {
            this.f41837b.put(view, new C0387a(eVar, aVar.getAdSessionId()));
        }
    }
}
