package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5624wT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3485fT f34579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AQ f34580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f34581c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f34582d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34583e;

    C5624wT(C3485fT c3485fT, AQ aq) {
        this.f34579a = c3485fT;
        this.f34580b = aq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(List list) {
        C5996zQ c5996zQC;
        C5996zQ c5996zQC2;
        C2048Lp c2048Lp;
        synchronized (this.f34581c) {
            try {
                if (this.f34583e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1730Fm c1730Fm = (C1730Fm) it.next();
                    String string = (!((Boolean) H4.B.c().d(AbstractC3892ii.Na)).booleanValue() || (c5996zQC2 = this.f34580b.c(c1730Fm.f18831a)) == null || (c2048Lp = c5996zQC2.f35740c) == null) ? "" : c2048Lp.toString();
                    String str = string;
                    boolean z9 = ((Boolean) H4.B.c().d(AbstractC3892ii.Oa)).booleanValue() && (c5996zQC = this.f34580b.c(c1730Fm.f18831a)) != null && c5996zQC.f35741d;
                    List list2 = this.f34582d;
                    String str2 = c1730Fm.f18831a;
                    list2.add(new C5372uT(str2, str, this.f34580b.d(str2), c1730Fm.f18832b ? 1 : 0, c1730Fm.f18834d, c1730Fm.f18833c, z9));
                }
                this.f34583e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.f34579a.b(new BinderC5246tT(this));
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f34581c) {
            try {
                if (!this.f34583e) {
                    C3485fT c3485fT = this.f34579a;
                    if (!c3485fT.e()) {
                        a();
                        return jSONArray;
                    }
                    c(c3485fT.d());
                }
                Iterator it = this.f34582d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C5372uT) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
