package P5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f4670o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f4672b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f4678h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f4682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f4683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O5.q f4684n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4674d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f4675e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f4676f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f4680j = new IBinder.DeathRecipient() { // from class: P5.s
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            A.j(this.f4705a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f4681k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4673c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f4679i = new WeakReference(null);

    public A(Context context, p pVar, String str, Intent intent, O5.q qVar, v vVar) {
        this.f4671a = context;
        this.f4672b = pVar;
        this.f4678h = intent;
        this.f4684n = qVar;
    }

    public static /* synthetic */ void j(A a10) {
        a10.f4672b.c("reportBinderDeath", new Object[0]);
        p070h.w.a(a10.f4679i.get());
        a10.f4672b.c("%s : Binder has died.", a10.f4673c);
        Iterator it = a10.f4674d.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c(a10.v());
        }
        a10.f4674d.clear();
        synchronized (a10.f4676f) {
            a10.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final A a10, final C7094k c7094k) {
        a10.f4675e.add(c7094k);
        c7094k.a().addOnCompleteListener(new OnCompleteListener() { // from class: P5.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f4703a.t(c7094k, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(A a10, q qVar) {
        if (a10.f4683m != null || a10.f4677g) {
            if (!a10.f4677g) {
                qVar.run();
                return;
            } else {
                a10.f4672b.c("Waiting to bind to the service.", new Object[0]);
                a10.f4674d.add(qVar);
                return;
            }
        }
        a10.f4672b.c("Initiate binding to the service.", new Object[0]);
        a10.f4674d.add(qVar);
        z zVar = new z(a10, null);
        a10.f4682l = zVar;
        a10.f4677g = true;
        if (a10.f4671a.bindService(a10.f4678h, zVar, 1)) {
            return;
        }
        a10.f4672b.c("Failed to bind to the service.", new Object[0]);
        a10.f4677g = false;
        Iterator it = a10.f4674d.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c(new B());
        }
        a10.f4674d.clear();
    }

    static /* bridge */ /* synthetic */ void q(A a10) {
        a10.f4672b.c("linkToDeath", new Object[0]);
        try {
            a10.f4683m.asBinder().linkToDeath(a10.f4680j, 0);
        } catch (RemoteException e10) {
            a10.f4672b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(A a10) {
        a10.f4672b.c("unlinkToDeath", new Object[0]);
        a10.f4683m.asBinder().unlinkToDeath(a10.f4680j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f4673c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f4675e.iterator();
        while (it.hasNext()) {
            ((C7094k) it.next()).d(v());
        }
        this.f4675e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f4670o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f4673c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f4673c, 10);
                    handlerThread.start();
                    map.put(this.f4673c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f4673c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f4683m;
    }

    public final void s(q qVar, C7094k c7094k) {
        c().post(new t(this, qVar.b(), c7094k, qVar));
    }

    final /* synthetic */ void t(C7094k c7094k, Task task) {
        synchronized (this.f4676f) {
            this.f4675e.remove(c7094k);
        }
    }

    public final void u(C7094k c7094k) {
        synchronized (this.f4676f) {
            this.f4675e.remove(c7094k);
        }
        c().post(new u(this));
    }
}
