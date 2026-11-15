package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4016jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f30533a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f30534b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f30535c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f30536d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f30537e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f30538f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f30539g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet f30540h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f30541i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30542j;

    public final HashSet a() {
        return this.f30537e;
    }

    public final HashSet b() {
        return this.f30538f;
    }

    public final String c(String str) {
        return (String) this.f30539g.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        String str;
        Activity activity;
        Boolean bool;
        C1719Fg0 c1719Fg0A = C1719Fg0.a();
        if (c1719Fg0A != null) {
            for (C4266lg0 c4266lg0 : c1719Fg0A.f()) {
                View viewI = c4266lg0.i();
                if (c4266lg0.j()) {
                    String strH = c4266lg0.h();
                    if (viewI != null) {
                        Context context = viewI.getContext();
                        while (true) {
                            str = null;
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (zIsInPictureInPictureMode) {
                            this.f30540h.add(strH);
                        }
                        if (viewI.isAttachedToWindow()) {
                            if (viewI.hasWindowFocus()) {
                                this.f30541i.remove(viewI);
                                bool = Boolean.FALSE;
                            } else {
                                Map map = this.f30541i;
                                if (map.containsKey(viewI)) {
                                    bool = (Boolean) map.get(viewI);
                                } else {
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(viewI, bool2);
                                    bool = bool2;
                                }
                            }
                            if (!bool.booleanValue() || zIsInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view = viewI;
                                while (true) {
                                    if (view == null) {
                                        this.f30536d.addAll(hashSet);
                                        break;
                                    }
                                    String strA = AbstractC3766hh0.a(view);
                                    if (strA != null) {
                                        str = strA;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f30537e.add(strH);
                            this.f30533a.put(viewI, strH);
                            for (C1875Ig0 c1875Ig0 : c4266lg0.f()) {
                                View view2 = (View) c1875Ig0.a().get();
                                if (view2 != null) {
                                    HashMap map2 = this.f30534b;
                                    C3891ih0 c3891ih0 = (C3891ih0) map2.get(view2);
                                    if (c3891ih0 != null) {
                                        c3891ih0.a(c4266lg0.h());
                                    } else {
                                        map2.put(view2, new C3891ih0(c1875Ig0, c4266lg0.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f30538f.add(strH);
                            this.f30535c.put(strH, viewI);
                            this.f30539g.put(strH, str);
                        }
                    } else {
                        this.f30538f.add(strH);
                        this.f30539g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final void e() {
        this.f30533a.clear();
        this.f30534b.clear();
        this.f30535c.clear();
        this.f30536d.clear();
        this.f30537e.clear();
        this.f30538f.clear();
        this.f30539g.clear();
        this.f30542j = false;
        this.f30540h.clear();
    }

    public final void f() {
        this.f30542j = true;
    }

    public final String g(View view) {
        HashMap map = this.f30533a;
        if (map.size() == 0) {
            return null;
        }
        String str = (String) map.get(view);
        if (str != null) {
            map.remove(view);
        }
        return str;
    }

    public final View h(String str) {
        return (View) this.f30535c.get(str);
    }

    public final C3891ih0 i(View view) {
        HashMap map = this.f30534b;
        C3891ih0 c3891ih0 = (C3891ih0) map.get(view);
        if (c3891ih0 != null) {
            map.remove(view);
        }
        return c3891ih0;
    }

    public final boolean j(View view) {
        Map map = this.f30541i;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, Boolean.TRUE);
        return false;
    }

    public final boolean k(String str) {
        return this.f30540h.contains(str);
    }

    public final int l(View view) {
        if (this.f30536d.contains(view)) {
            return 1;
        }
        return this.f30542j ? 2 : 3;
    }
}
