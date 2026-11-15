package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import K4.InterfaceC0790q0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1588Ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17970a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K4.t0 f17971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1796Gt f17972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f17974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L4.a f17975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f17976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4521ni f17977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private QR f17978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f17979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f17980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f17981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1536Bt f17982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f17983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.common.util.concurrent.p f17984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f17985p;

    public C1588Ct() {
        K4.t0 t0Var = new K4.t0();
        this.f17971b = t0Var;
        this.f17972c = new C1796Gt(C0654z.f(), t0Var);
        this.f17973d = false;
        this.f17977h = null;
        this.f17978i = null;
        this.f17979j = null;
        this.f17980k = new AtomicInteger(0);
        this.f17981l = new AtomicInteger(0);
        this.f17982m = new C1536Bt(null);
        this.f17983n = new Object();
        this.f17985p = new AtomicBoolean();
    }

    final /* synthetic */ ArrayList A() {
        Context contextA = AbstractC1792Gr.a(this.f17974e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextA).getPackageInfo(contextA.getApplicationInfo().packageName, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    final /* synthetic */ Object B() {
        return this.f17970a;
    }

    final /* synthetic */ Context C() {
        return this.f17974e;
    }

    final /* synthetic */ L4.a a() {
        return this.f17975f;
    }

    final /* synthetic */ C4521ni b() {
        return this.f17977h;
    }

    final /* synthetic */ AtomicBoolean c() {
        return this.f17985p;
    }

    public final C4521ni d() {
        C4521ni c4521ni;
        synchronized (this.f17970a) {
            c4521ni = this.f17977h;
        }
        return c4521ni;
    }

    public final void e(Boolean bool) {
        synchronized (this.f17970a) {
            this.f17979j = bool;
        }
    }

    public final Boolean f() {
        Boolean bool;
        synchronized (this.f17970a) {
            bool = this.f17979j;
        }
        return bool;
    }

    public final void g() {
        this.f17982m.a();
    }

    public final void h(Context context, L4.a aVar, QR qr) {
        C4521ni c4521ni;
        synchronized (this.f17970a) {
            try {
                if (!this.f17973d) {
                    this.f17974e = context.getApplicationContext();
                    this.f17975f = aVar;
                    G4.t.k().b(this.f17972c);
                    this.f17971b.P(this.f17974e);
                    C2205Oq.d(this.f17974e, this.f17975f);
                    this.f17978i = qr;
                    G4.t.q();
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f29532D2)).booleanValue()) {
                        c4521ni = new C4521ni();
                    } else {
                        AbstractC0786o0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c4521ni = null;
                    }
                    this.f17977h = c4521ni;
                    if (c4521ni != null) {
                        AbstractC2471Tt.a(new C5928yt(this).b(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f17974e;
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.K9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new C6054zt(this));
                            } catch (RuntimeException e10) {
                                int i10 = AbstractC0786o0.f2696b;
                                L4.p.g("Failed to register network callback", e10);
                                this.f17985p.set(true);
                            }
                        }
                    }
                    this.f17973d = true;
                    t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.tf)).booleanValue()) {
            return;
        }
        G4.t.g().R(context, aVar.f3097a);
    }

    public final Resources i() {
        if (this.f17975f.f3100d) {
            return this.f17974e.getResources();
        }
        try {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.rc)).booleanValue()) {
                return L4.t.b(this.f17974e).getResources();
            }
            L4.t.b(this.f17974e).getResources();
            return null;
        } catch (L4.s e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final void j(Throwable th, String str) {
        C2205Oq.d(this.f17974e, this.f17975f).b(th, str);
    }

    public final void k(Throwable th, String str) {
        C2205Oq.d(this.f17974e, this.f17975f).a(th, str, ((Double) AbstractC5278tj.f33466f.e()).floatValue());
    }

    public final void l(Throwable th, String str) {
        C2205Oq.f(this.f17974e, this.f17975f).b(th, str);
    }

    public final void m() {
        this.f17980k.incrementAndGet();
    }

    public final void n() {
        this.f17980k.decrementAndGet();
    }

    public final int o() {
        return this.f17980k.get();
    }

    public final void p() {
        this.f17981l.incrementAndGet();
    }

    public final int q() {
        return this.f17981l.get();
    }

    public final InterfaceC0790q0 r() {
        K4.t0 t0Var;
        synchronized (this.f17970a) {
            t0Var = this.f17971b;
        }
        return t0Var;
    }

    public final Context s() {
        return this.f17974e;
    }

    public final com.google.common.util.concurrent.p t() {
        if (this.f17974e != null) {
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29593J3)).booleanValue()) {
                synchronized (this.f17983n) {
                    try {
                        com.google.common.util.concurrent.p pVar = this.f17984o;
                        if (pVar != null) {
                            return pVar;
                        }
                        com.google.common.util.concurrent.p pVarE0 = AbstractC2315Qt.f22473a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.At
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.f17423a.A();
                            }
                        });
                        this.f17984o = pVarE0;
                        return pVarE0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return AbstractC5685wx0.a(new ArrayList());
    }

    public final C1796Gt u() {
        return this.f17972c;
    }

    public final boolean v(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.K9)).booleanValue()) {
                return this.f17985p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void w(String str) {
        this.f17976g = str;
    }

    public final String x() {
        return this.f17976g;
    }

    public final QR y() {
        return this.f17978i;
    }

    public final ActivityManager.MemoryInfo z() {
        return L4.g.n(this.f17974e);
    }
}
