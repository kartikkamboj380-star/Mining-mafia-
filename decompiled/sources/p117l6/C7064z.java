package p117l6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007a6.f;
import p087i6.l;
import p097j6.a;
import p107k6.b;
import p127m6.i;
import p137n6.p;
import p177r6.g;
import p197t6.j;
import p207u6.c;

/* JADX INFO: renamed from: l6.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7064z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f46246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f46247c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f46250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private A f46251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C7055p f46253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final K f46254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f46255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f46256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f46257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C7052m f46258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p087i6.a f46259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l f46260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f46261q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f46249e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P f46248d = new P();

    public C7064z(f fVar, K k10, p087i6.a aVar, F f10, b bVar, a aVar2, g gVar, C7052m c7052m, l lVar, i iVar) {
        this.f46246b = fVar;
        this.f46247c = f10;
        this.f46245a = fVar.m();
        this.f46254j = k10;
        this.f46259o = aVar;
        this.f46256l = bVar;
        this.f46257m = aVar2;
        this.f46255k = gVar;
        this.f46258n = c7052m;
        this.f46260p = lVar;
        this.f46261q = iVar;
    }

    private void i() {
        try {
            this.f46252h = Boolean.TRUE.equals((Boolean) this.f46261q.f46428a.c().submit(new Callable() { // from class: l6.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f46235a.f46253i.t());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f46252h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(j jVar) {
        i.c();
        w();
        try {
            try {
                this.f46256l.a(new p107k6.a() { // from class: l6.x
                    @Override // p107k6.a
                    public final void a(String str) {
                        this.f46241a.t(str);
                    }
                });
                this.f46253i.S();
                if (!jVar.b().f49687b.f49694a) {
                    p087i6.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f46253i.A(jVar)) {
                    p087i6.g.f().k("Previous sessions could not be finalized.");
                }
                this.f46253i.X(jVar.a());
                v();
            } catch (Exception e10) {
                p087i6.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                v();
            }
        } catch (Throwable th) {
            v();
            throw th;
        }
    }

    private void p(final j jVar) {
        Future<?> futureSubmit = this.f46261q.f46428a.c().submit(new Runnable() { // from class: l6.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f46239a.n(jVar);
            }
        });
        p087i6.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            p087i6.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            p087i6.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            p087i6.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String q() {
        return "20.0.4";
    }

    static boolean r(String str, boolean z9) {
        if (!z9) {
            p087i6.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public void A(final String str, final String str2) {
        this.f46261q.f46428a.d(new Runnable() { // from class: l6.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f46229a.f46253i.U(str, str2);
            }
        });
    }

    public void B(final String str) {
        this.f46261q.f46428a.d(new Runnable() { // from class: l6.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f46227a.f46253i.W(str);
            }
        });
    }

    public Task j() {
        return this.f46253i.n();
    }

    public Task k() {
        return this.f46253i.s();
    }

    public boolean l() {
        return this.f46252h;
    }

    boolean m() {
        return this.f46250f.c();
    }

    public Task o(final j jVar) {
        return this.f46261q.f46428a.d(new Runnable() { // from class: l6.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f46225a.n(jVar);
            }
        });
    }

    public boolean s() {
        return this.f46247c.d();
    }

    public void t(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f46249e;
        this.f46261q.f46428a.d(new Runnable() { // from class: l6.v
            @Override // java.lang.Runnable
            public final void run() {
                C7064z c7064z = this.f46236a;
                c7064z.f46261q.f46429b.d(new Runnable() { // from class: l6.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        c7064z.f46253i.b0(j, str);
                    }
                });
            }
        });
    }

    public void u(final Throwable th, final Map map) {
        this.f46261q.f46428a.d(new Runnable() { // from class: l6.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f46232a.f46253i.a0(Thread.currentThread(), th, map);
            }
        });
    }

    void v() {
        i.c();
        try {
            if (this.f46250f.d()) {
                return;
            }
            p087i6.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            p087i6.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void w() {
        i.c();
        this.f46250f.a();
        p087i6.g.f().i("Initialization marker file was created.");
    }

    public boolean x(C7040a c7040a, j jVar) {
        if (!r(c7040a.f46134b, AbstractC7048i.i(this.f46245a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C7047h().c();
        try {
            this.f46251g = new A("crash_marker", this.f46255k);
            this.f46250f = new A("initialization_marker", this.f46255k);
            p pVar = new p(strC, this.f46255k, this.f46261q);
            p137n6.f fVar = new p137n6.f(this.f46255k);
            p207u6.a aVar = new p207u6.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, new c(10));
            this.f46260p.b(pVar);
            this.f46253i = new C7055p(this.f46245a, this.f46254j, this.f46247c, this.f46255k, this.f46251g, c7040a, pVar, fVar, b0.j(this.f46245a, this.f46254j, this.f46255k, c7040a, fVar, pVar, aVar, jVar, this.f46248d, this.f46258n, this.f46261q), this.f46259o, this.f46257m, this.f46258n, this.f46261q);
            boolean zM = m();
            i();
            this.f46253i.y(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zM || !AbstractC7048i.d(this.f46245a)) {
                p087i6.g.f().b("Successfully configured exception handler.");
                return true;
            }
            p087i6.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            p(jVar);
            return false;
        } catch (Exception e10) {
            p087i6.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f46253i = null;
            return false;
        }
    }

    public Task y() {
        return this.f46253i.T();
    }

    public void z(Boolean bool) {
        this.f46247c.h(bool);
    }
}
