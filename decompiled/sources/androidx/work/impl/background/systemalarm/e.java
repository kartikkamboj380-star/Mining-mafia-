package androidx.work.impl.background.systemalarm;

import K0.C;
import K0.InterfaceC0752e;
import K0.r;
import K0.w;
import S0.m;
import T0.D;
import T0.x;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC0752e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f11314k = q.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f11315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final U0.b f11316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f11317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f11318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C f11319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f11320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final List f11321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Intent f11322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f11323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w f11324j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            d dVar;
            synchronized (e.this.f11321g) {
                e eVar = e.this;
                eVar.f11322h = (Intent) eVar.f11321g.get(0);
            }
            Intent intent = e.this.f11322h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f11322h.getIntExtra("KEY_START_ID", 0);
                q qVarE = q.e();
                String str = e.f11314k;
                qVarE.a(str, "Processing command " + e.this.f11322h + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = x.b(e.this.f11315a, action + " (" + intExtra + ")");
                try {
                    q.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    e eVar2 = e.this;
                    eVar2.f11320f.o(eVar2.f11322h, intExtra, eVar2);
                    q.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = e.this.f11316b.a();
                    dVar = new d(e.this);
                } catch (Throwable th) {
                    try {
                        q qVarE2 = q.e();
                        String str2 = e.f11314k;
                        qVarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        q.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = e.this.f11316b.a();
                        dVar = new d(e.this);
                    } catch (Throwable th2) {
                        q.e().a(e.f11314k, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        e.this.f11316b.a().execute(new d(e.this));
                        throw th2;
                    }
                }
                executorA.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f11326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f11327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11328c;

        b(e eVar, Intent intent, int i10) {
            this.f11326a = eVar;
            this.f11327b = intent;
            this.f11328c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11326a.a(this.f11327b, this.f11328c);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f11329a;

        d(e eVar) {
            this.f11329a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11329a.c();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f11321g) {
            try {
                Iterator it = this.f11321g.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock wakeLockB = x.b(this.f11315a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f11319e.w().c(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        q qVarE = q.e();
        String str = f11314k;
        qVarE.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f11321g) {
            try {
                boolean zIsEmpty = this.f11321g.isEmpty();
                this.f11321g.add(intent);
                if (zIsEmpty) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void c() {
        q qVarE = q.e();
        String str = f11314k;
        qVarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f11321g) {
            try {
                if (this.f11322h != null) {
                    q.e().a(str, "Removing command " + this.f11322h);
                    if (!((Intent) this.f11321g.remove(0)).equals(this.f11322h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f11322h = null;
                }
                U0.a aVarB = this.f11316b.b();
                if (!this.f11320f.n() && this.f11321g.isEmpty() && !aVarB.I0()) {
                    q.e().a(str, "No more commands & intents.");
                    c cVar = this.f11323i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f11321g.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.InterfaceC0752e
    public void d(m mVar, boolean z9) {
        this.f11316b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f11315a, mVar, z9), 0));
    }

    r e() {
        return this.f11318d;
    }

    U0.b f() {
        return this.f11316b;
    }

    C g() {
        return this.f11319e;
    }

    D h() {
        return this.f11317c;
    }

    void j() {
        q.e().a(f11314k, "Destroying SystemAlarmDispatcher");
        this.f11318d.l(this);
        this.f11323i = null;
    }

    void l(c cVar) {
        if (this.f11323i != null) {
            q.e().c(f11314k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f11323i = cVar;
        }
    }

    e(Context context, r rVar, C c10) {
        Context applicationContext = context.getApplicationContext();
        this.f11315a = applicationContext;
        this.f11324j = new w();
        this.f11320f = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f11324j);
        c10 = c10 == null ? C.q(context) : c10;
        this.f11319e = c10;
        this.f11317c = new D(c10.o().k());
        rVar = rVar == null ? c10.s() : rVar;
        this.f11318d = rVar;
        this.f11316b = c10.w();
        rVar.g(this);
        this.f11321g = new ArrayList();
        this.f11322h = null;
    }
}
