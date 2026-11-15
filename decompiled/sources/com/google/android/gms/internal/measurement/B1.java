package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile B1 f36245j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36246a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Clock f36247b = DefaultClock.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ExecutorService f36248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p126m5.a f36249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f36250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile InterfaceC6334u0 f36254i;

    protected B1(Context context, Bundle bundle) {
        AbstractC6290p0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6228i1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f36248c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f36249d = new p126m5.a(this);
        this.f36250e = new ArrayList();
        try {
            if (p136n5.H.a(context, "google_app_id", p136n5.o.a(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, B1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f36253h = null;
                    this.f36252g = true;
                    Log.w(this.f36246a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f36253h = "fa";
        j(new V0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f36246a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new A1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(AbstractRunnableC6300q1 abstractRunnableC6300q1) {
        this.f36248c.execute(abstractRunnableC6300q1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void k(Exception exc, boolean z9, boolean z10) {
        B1 b10;
        Exception exc2;
        this.f36252g |= z9;
        if (z9) {
            Log.w(this.f36246a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            b10 = this;
            exc2 = exc;
            b10.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            b10 = this;
            exc2 = exc;
        }
        Log.w(b10.f36246a, "Error with data collection. Data lost.", exc2);
    }

    private final void r(String str, String str2, Bundle bundle, boolean z9, boolean z10, Long l10) {
        j(new C6291p1(this, l10, str, str2, bundle, z9, z10));
    }

    public static B1 s(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f36245j == null) {
            synchronized (B1.class) {
                try {
                    if (f36245j == null) {
                        f36245j = new B1(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36245j;
    }

    public final void A(String str, String str2, Bundle bundle) {
        j(new N0(this, str, str2, bundle));
    }

    public final List B(String str, String str2) {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new O0(this, str, str2, binderC6307r0));
        List list = (List) BinderC6307r0.H1(binderC6307r0.t1(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void C(String str) {
        j(new P0(this, str));
    }

    public final void D(J0 j10, String str, String str2) {
        j(new Q0(this, j10, str, str2));
    }

    public final void E(Boolean bool) {
        j(new R0(this, bool));
    }

    public final void F(Bundle bundle) {
        j(new S0(this, bundle));
    }

    public final void G() {
        j(new T0(this));
    }

    public final void H(long j10) {
        j(new U0(this, j10));
    }

    public final void I(String str) {
        j(new W0(this, str));
    }

    public final void J(String str) {
        j(new X0(this, str));
    }

    public final void K(Runnable runnable) {
        j(new Z0(this, runnable));
    }

    public final String L() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6156a1(this, binderC6307r0));
        return binderC6307r0.h0(500L);
    }

    public final String M() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6165b1(this, binderC6307r0));
        return binderC6307r0.h0(50L);
    }

    public final long N() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6174c1(this, binderC6307r0));
        Long lN0 = binderC6307r0.N0(500L);
        if (lN0 != null) {
            return lN0.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f36247b.currentTimeMillis()).nextLong();
        int i10 = this.f36251f + 1;
        this.f36251f = i10;
        return jNextLong + ((long) i10);
    }

    public final String a() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6183d1(this, binderC6307r0));
        return binderC6307r0.h0(500L);
    }

    public final String b() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6201f1(this, binderC6307r0));
        return binderC6307r0.h0(500L);
    }

    public final Map c(String str, String str2, boolean z9) {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6210g1(this, str, str2, z9, binderC6307r0));
        Bundle bundleT1 = binderC6307r0.t1(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        if (bundleT1 == null || bundleT1.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleT1.size());
        for (String str3 : bundleT1.keySet()) {
            Object obj = bundleT1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        j(new C6219h1(this, false, 5, str, obj, null, null));
    }

    public final int e(String str) {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6237j1(this, str, binderC6307r0));
        Integer num = (Integer) BinderC6307r0.H1(binderC6307r0.t1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String f() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6246k1(this, binderC6307r0));
        return binderC6307r0.h0(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final Long g() {
        BinderC6307r0 binderC6307r0 = new BinderC6307r0();
        j(new C6255l1(this, binderC6307r0));
        return binderC6307r0.N0(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final void h(boolean z9) {
        j(new C6264m1(this, z9));
    }

    public final void i(Bundle bundle) {
        j(new C6273n1(this, bundle));
    }

    final /* synthetic */ String l() {
        return this.f36246a;
    }

    final /* synthetic */ boolean m() {
        return this.f36252g;
    }

    final /* synthetic */ InterfaceC6334u0 n() {
        return this.f36254i;
    }

    final /* synthetic */ void o(InterfaceC6334u0 interfaceC6334u0) {
        this.f36254i = interfaceC6334u0;
    }

    public final p126m5.a t() {
        return this.f36249d;
    }

    protected final InterfaceC6334u0 u(Context context, boolean z9) {
        try {
            return AbstractBinderC6325t0.asInterface(DynamiteModule.e(context, z9 ? DynamiteModule.f17198e : DynamiteModule.f17196c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            k(e10, true, false);
            return null;
        }
    }

    public final void v(p136n5.A a10) {
        Preconditions.checkNotNull(a10);
        List list = this.f36250e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (a10.equals(((Pair) list.get(i10)).first)) {
                        Log.w(this.f36246a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC6308r1 binderC6308r1 = new BinderC6308r1(a10);
            list.add(new Pair(a10, binderC6308r1));
            if (this.f36254i != null) {
                try {
                    this.f36254i.registerOnMeasurementEventListener(binderC6308r1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f36246a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            j(new C6282o1(this, binderC6308r1));
        }
    }

    public final void w(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void x(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void y(String str, String str2, Object obj, boolean z9) {
        j(new L0(this, str, str2, obj, z9));
    }

    public final void z(Bundle bundle) {
        j(new M0(this, bundle));
    }
}
