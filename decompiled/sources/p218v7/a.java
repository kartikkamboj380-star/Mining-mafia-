package p218v7;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p070h.w;
import p158p7.l;
import p208u7.f;
import p208u7.h;

/* JADX INFO: loaded from: classes3.dex */
public class a implements p188s7.a.InterfaceC0532a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static a f50193i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f50194j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f50195k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f50196l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f50197m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50199b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50205h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f50198a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50200c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f50201d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p218v7.b f50203f = new p218v7.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p188s7.b f50202e = new p188s7.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p218v7.c f50204g = new p218v7.c(new p228w7.c());

    /* JADX INFO: renamed from: v7.a$a, reason: collision with other inner class name */
    class RunnableC0550a implements Runnable {
        RunnableC0550a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f50204g.c();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.p().u();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f50195k != null) {
                a.f50195k.post(a.f50196l);
                a.f50195k.postDelayed(a.f50197m, 200L);
            }
        }
    }

    a() {
    }

    private void d(long j10) {
        if (this.f50198a.size() > 0) {
            Iterator it = this.f50198a.iterator();
            if (it.hasNext()) {
                w.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j10);
                throw null;
            }
        }
    }

    private void e(View view, p188s7.a aVar, JSONObject jSONObject, d dVar, boolean z9) {
        aVar.a(view, jSONObject, this, dVar == d.PARENT_VIEW, z9);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        p188s7.a aVarB = this.f50202e.b();
        String strG = this.f50203f.g(str);
        if (strG != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            p208u7.c.f(jSONObjectA, str);
            p208u7.c.n(jSONObjectA, strG);
            p208u7.c.h(jSONObject, jSONObjectA);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        this.f50203f.j(view);
        return false;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String strK = this.f50203f.k(view);
        if (strK == null) {
            return false;
        }
        p208u7.c.f(jSONObject, strK);
        p208u7.c.e(jSONObject, Boolean.valueOf(this.f50203f.o(view)));
        this.f50203f.l();
        return true;
    }

    private void l() {
        d(f.b() - this.f50205h);
    }

    private void m() {
        this.f50199b = 0;
        this.f50201d.clear();
        this.f50200c = false;
        Iterator it = p178r7.c.e().a().iterator();
        while (it.hasNext()) {
            if (((l) it.next()).l()) {
                this.f50200c = true;
                break;
            }
        }
        this.f50205h = f.b();
    }

    public static a p() {
        return f50193i;
    }

    private void r() {
        if (f50195k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f50195k = handler;
            handler.post(f50196l);
            f50195k.postDelayed(f50197m, 200L);
        }
    }

    private void t() {
        Handler handler = f50195k;
        if (handler != null) {
            handler.removeCallbacks(f50197m);
            f50195k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
    }

    @Override // p188s7.a.InterfaceC0532a
    public void a(View view, p188s7.a aVar, JSONObject jSONObject, boolean z9) {
        d dVarM;
        a aVar2;
        if (h.d(view) && (dVarM = this.f50203f.m(view)) != d.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            p208u7.c.h(jSONObject, jSONObjectA);
            if (j(view, jSONObjectA)) {
                aVar2 = this;
            } else {
                boolean z10 = z9 || g(view, jSONObjectA);
                if (this.f50200c && dVarM == d.OBSTRUCTION_VIEW && !z10) {
                    this.f50201d.add(new p238x7.a(view));
                }
                aVar2 = this;
                aVar2.e(view, aVar, jSONObjectA, dVarM, z10);
            }
            aVar2.f50199b++;
        }
    }

    void n() {
        a aVar;
        this.f50203f.n();
        long jB = f.b();
        p188s7.a aVarA = this.f50202e.a();
        if (this.f50203f.h().size() > 0) {
            for (String str : this.f50203f.h()) {
                JSONObject jSONObjectA = aVarA.a(null);
                f(str, this.f50203f.a(str), jSONObjectA);
                p208u7.c.m(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f50204g.b(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f50203f.i().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            aVar = this;
            aVar.e(null, aVarA, jSONObjectA2, d.PARENT_VIEW, false);
            p208u7.c.m(jSONObjectA2);
            aVar.f50204g.d(jSONObjectA2, aVar.f50203f.i(), jB);
            if (aVar.f50200c) {
                Iterator it = p178r7.c.e().a().iterator();
                while (it.hasNext()) {
                    ((l) it.next()).f(aVar.f50201d);
                }
            }
        } else {
            aVar = this;
            aVar.f50204g.c();
        }
        aVar.f50203f.c();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f50198a.clear();
        f50194j.post(new RunnableC0550a());
    }
}
