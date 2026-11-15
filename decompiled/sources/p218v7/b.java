package p218v7;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p070h.w;
import p158p7.l;
import p178r7.c;
import p178r7.e;
import p208u7.h;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f50207a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f50208b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f50209c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f50210d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f50211e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f50212f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f50213g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f50214h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50215i;

    public static class a {
        public abstract e a();

        public abstract ArrayList b();
    }

    private String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
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
        this.f50210d.addAll(hashSet);
        return null;
    }

    private void d(l lVar) {
        Iterator it = lVar.j().iterator();
        while (it.hasNext()) {
            w.a(it.next());
            e(null, lVar);
        }
    }

    private void e(e eVar, l lVar) {
        throw null;
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f50214h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f50214h.containsKey(view)) {
            return (Boolean) this.f50214h.get(view);
        }
        Map map = this.f50214h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return (View) this.f50209c.get(str);
    }

    public void c() {
        this.f50207a.clear();
        this.f50208b.clear();
        this.f50209c.clear();
        this.f50210d.clear();
        this.f50211e.clear();
        this.f50212f.clear();
        this.f50213g.clear();
        this.f50215i = false;
    }

    public String g(String str) {
        return (String) this.f50213g.get(str);
    }

    public HashSet h() {
        return this.f50212f;
    }

    public HashSet i() {
        return this.f50211e;
    }

    public a j(View view) {
        return (a) this.f50208b.get(view);
    }

    public String k(View view) {
        if (this.f50207a.size() == 0) {
            return null;
        }
        String str = (String) this.f50207a.get(view);
        if (str != null) {
            this.f50207a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f50215i = true;
    }

    public d m(View view) {
        if (this.f50210d.contains(view)) {
            return d.PARENT_VIEW;
        }
        return this.f50215i ? d.OBSTRUCTION_VIEW : d.UNDERLYING_VIEW;
    }

    public void n() {
        c cVarE = c.e();
        if (cVarE != null) {
            for (l lVar : cVarE.a()) {
                View viewH = lVar.h();
                if (lVar.m()) {
                    String strO = lVar.o();
                    if (viewH != null) {
                        String strB = b(viewH);
                        if (strB == null) {
                            this.f50211e.add(strO);
                            this.f50207a.put(viewH, strO);
                            d(lVar);
                        } else if (strB != "noWindowFocus") {
                            this.f50212f.add(strO);
                            this.f50209c.put(strO, viewH);
                            this.f50213g.put(strO, strB);
                        }
                    } else {
                        this.f50212f.add(strO);
                        this.f50213g.put(strO, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (!this.f50214h.containsKey(view)) {
            return true;
        }
        this.f50214h.put(view, Boolean.TRUE);
        return false;
    }
}
