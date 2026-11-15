package com.google.firebase.perf.application;

import S6.f;
import W6.k;
import X6.g;
import X6.j;
import X6.l;
import Y6.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1148t;
import androidx.fragment.app.G;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final R6.a f40343I = R6.a.e();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static volatile a f40344J;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f40345G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f40346H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f40347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap f40348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f40349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f40350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f40351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f40352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f40353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f40354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f40355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f40356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final X6.a f40357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f40358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f40359m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private l f40360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Y6.d f40361w;

    /* JADX INFO: renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    public interface InterfaceC0372a {
        void a();
    }

    public interface b {
        void onUpdateAppState(Y6.d dVar);
    }

    a(k kVar, X6.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    public static a b() {
        if (f40344J == null) {
            synchronized (a.class) {
                try {
                    if (f40344J == null) {
                        f40344J = new a(k.k(), new X6.a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f40344J;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f40353g) {
            try {
                for (InterfaceC0372a interfaceC0372a : this.f40353g) {
                    if (interfaceC0372a != null) {
                        interfaceC0372a.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = (Trace) this.f40350d.get(activity);
        if (trace == null) {
            return;
        }
        this.f40350d.remove(activity);
        g gVarE = ((d) this.f40348b.get(activity)).e();
        if (!gVarE.d()) {
            f40343I.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, (f.a) gVarE.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f40356j.K()) {
            m.b bVarK = m.L().s(str).q(lVar.e()).r(lVar.d(lVar2)).k(SessionManager.getInstance().perfSession().a());
            int andSet = this.f40354h.getAndSet(0);
            synchronized (this.f40351e) {
                try {
                    bVarK.m(this.f40351e);
                    if (andSet != 0) {
                        bVarK.o(X6.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f40351e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f40355i.x((m) bVarK.build(), Y6.d.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f40356j.K()) {
            d dVar = new d(activity);
            this.f40348b.put(activity, dVar);
            if (activity instanceof AbstractActivityC1148t) {
                c cVar = new c(this.f40357k, this.f40355i, this, dVar);
                this.f40349c.put(activity, cVar);
                ((AbstractActivityC1148t) activity).C().c1(cVar, true);
            }
        }
    }

    private void q(Y6.d dVar) {
        this.f40361w = dVar;
        synchronized (this.f40352f) {
            try {
                Iterator it = this.f40352f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f40361w);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Y6.d a() {
        return this.f40361w;
    }

    public void d(String str, long j10) {
        synchronized (this.f40351e) {
            try {
                Long l10 = (Long) this.f40351e.get(str);
                if (l10 == null) {
                    this.f40351e.put(str, Long.valueOf(j10));
                } else {
                    this.f40351e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i10) {
        this.f40354h.addAndGet(i10);
    }

    public boolean f() {
        return this.f40346H;
    }

    protected boolean h() {
        return this.f40358l;
    }

    public synchronized void i(Context context) {
        if (this.f40345G) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f40345G = true;
        }
    }

    public void j(InterfaceC0372a interfaceC0372a) {
        synchronized (this.f40353g) {
            this.f40353g.add(interfaceC0372a);
        }
    }

    public void k(WeakReference weakReference) {
        synchronized (this.f40352f) {
            this.f40352f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f40348b.remove(activity);
        if (this.f40349c.containsKey(activity)) {
            ((AbstractActivityC1148t) activity).C().t1((G.k) this.f40349c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f40347a.isEmpty()) {
                this.f40359m = this.f40357k.a();
                this.f40347a.put(activity, Boolean.TRUE);
                if (this.f40346H) {
                    q(Y6.d.FOREGROUND);
                    l();
                    this.f40346H = false;
                } else {
                    n(X6.c.BACKGROUND_TRACE_NAME.toString(), this.f40360v, this.f40359m);
                    q(Y6.d.FOREGROUND);
                }
            } else {
                this.f40347a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.f40356j.K()) {
                if (!this.f40348b.containsKey(activity)) {
                    o(activity);
                }
                ((d) this.f40348b.get(activity)).c();
                Trace trace = new Trace(c(activity), this.f40355i, this.f40357k, this);
                trace.start();
                this.f40350d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f40347a.containsKey(activity)) {
                this.f40347a.remove(activity);
                if (this.f40347a.isEmpty()) {
                    this.f40360v = this.f40357k.a();
                    n(X6.c.FOREGROUND_TRACE_NAME.toString(), this.f40359m, this.f40360v);
                    q(Y6.d.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void p(WeakReference weakReference) {
        synchronized (this.f40352f) {
            this.f40352f.remove(weakReference);
        }
    }

    a(k kVar, X6.a aVar, com.google.firebase.perf.config.a aVar2, boolean z9) {
        this.f40347a = new WeakHashMap();
        this.f40348b = new WeakHashMap();
        this.f40349c = new WeakHashMap();
        this.f40350d = new WeakHashMap();
        this.f40351e = new HashMap();
        this.f40352f = new HashSet();
        this.f40353g = new HashSet();
        this.f40354h = new AtomicInteger(0);
        this.f40361w = Y6.d.BACKGROUND;
        this.f40345G = false;
        this.f40346H = true;
        this.f40355i = kVar;
        this.f40357k = aVar;
        this.f40356j = aVar2;
        this.f40358l = z9;
    }
}
