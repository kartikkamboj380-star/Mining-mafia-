package com.google.firebase.perf.application;

import S6.f;
import X6.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.j;
import androidx.fragment.app.ComponentCallbacksC1144o;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final R6.a f40368e = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f40369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f40370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f40371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40372d;

    public d(Activity activity) {
        this(activity, new j(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    private g b() {
        if (!this.f40372d) {
            f40368e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f40370b.b();
        if (sparseIntArrayArrB == null) {
            f40368e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return g.e(f.a(sparseIntArrayArrB));
        }
        f40368e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f40372d) {
            f40368e.b("FrameMetricsAggregator is already recording %s", this.f40369a.getClass().getSimpleName());
        } else {
            this.f40370b.a(this.f40369a);
            this.f40372d = true;
        }
    }

    public void d(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (!this.f40372d) {
            f40368e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f40371c.containsKey(componentCallbacksC1144o)) {
            f40368e.b("Cannot start sub-recording because one is already ongoing with the key %s", componentCallbacksC1144o.getClass().getSimpleName());
            return;
        }
        g gVarB = b();
        if (gVarB.d()) {
            this.f40371c.put(componentCallbacksC1144o, (f.a) gVarB.c());
        } else {
            f40368e.b("startFragment(%s): snapshot() failed", componentCallbacksC1144o.getClass().getSimpleName());
        }
    }

    public g e() {
        if (!this.f40372d) {
            f40368e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f40371c.isEmpty()) {
            f40368e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f40371c.clear();
        }
        g gVarB = b();
        try {
            this.f40370b.c(this.f40369a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f40368e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            gVarB = g.a();
        }
        this.f40370b.d();
        this.f40372d = false;
        return gVarB;
    }

    public g f(ComponentCallbacksC1144o componentCallbacksC1144o) {
        if (!this.f40372d) {
            f40368e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f40371c.containsKey(componentCallbacksC1144o)) {
            f40368e.b("Sub-recording associated with key %s was not started or does not exist", componentCallbacksC1144o.getClass().getSimpleName());
            return g.a();
        }
        f.a aVar = (f.a) this.f40371c.remove(componentCallbacksC1144o);
        g gVarB = b();
        if (gVarB.d()) {
            return g.e(((f.a) gVarB.c()).a(aVar));
        }
        f40368e.b("stopFragment(%s): snapshot() failed", componentCallbacksC1144o.getClass().getSimpleName());
        return g.a();
    }

    d(Activity activity, j jVar, Map map) {
        this.f40372d = false;
        this.f40369a = activity;
        this.f40370b = jVar;
        this.f40371c = map;
    }
}
