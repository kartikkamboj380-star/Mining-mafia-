package V5;

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

/* JADX INFO: renamed from: V5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0969f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f6104o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f6106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6107c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f6112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final L f6113i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServiceConnection f6117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IInterface f6118n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6108d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f6109e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f6110f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f6115k = new IBinder.DeathRecipient() { // from class: V5.G
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C0969f.k(this.f6091a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f6116l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f6114j = new WeakReference(null);

    public C0969f(Context context, E e10, String str, Intent intent, L l10, K k10) {
        this.f6105a = context;
        this.f6106b = e10;
        this.f6107c = str;
        this.f6112h = intent;
        this.f6113i = l10;
    }

    public static /* synthetic */ void k(C0969f c0969f) {
        c0969f.f6106b.c("reportBinderDeath", new Object[0]);
        p070h.w.a(c0969f.f6114j.get());
        c0969f.f6106b.c("%s : Binder has died.", c0969f.f6107c);
        Iterator it = c0969f.f6108d.iterator();
        while (it.hasNext()) {
            ((F) it.next()).a(c0969f.w());
        }
        c0969f.f6108d.clear();
        synchronized (c0969f.f6110f) {
            c0969f.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final C0969f c0969f, final C7094k c7094k) {
        c0969f.f6109e.add(c7094k);
        c7094k.a().addOnCompleteListener(new OnCompleteListener() { // from class: V5.H
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f6092a.u(c7094k, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(C0969f c0969f, F f10) {
        if (c0969f.f6118n != null || c0969f.f6111g) {
            if (!c0969f.f6111g) {
                f10.run();
                return;
            } else {
                c0969f.f6106b.c("Waiting to bind to the service.", new Object[0]);
                c0969f.f6108d.add(f10);
                return;
            }
        }
        c0969f.f6106b.c("Initiate binding to the service.", new Object[0]);
        c0969f.f6108d.add(f10);
        ServiceConnectionC0968e serviceConnectionC0968e = new ServiceConnectionC0968e(c0969f, null);
        c0969f.f6117m = serviceConnectionC0968e;
        c0969f.f6111g = true;
        if (c0969f.f6105a.bindService(c0969f.f6112h, serviceConnectionC0968e, 1)) {
            return;
        }
        c0969f.f6106b.c("Failed to bind to the service.", new Object[0]);
        c0969f.f6111g = false;
        Iterator it = c0969f.f6108d.iterator();
        while (it.hasNext()) {
            ((F) it.next()).a(new C0970g());
        }
        c0969f.f6108d.clear();
    }

    static /* bridge */ /* synthetic */ void r(C0969f c0969f) {
        c0969f.f6106b.c("linkToDeath", new Object[0]);
        try {
            c0969f.f6118n.asBinder().linkToDeath(c0969f.f6115k, 0);
        } catch (RemoteException e10) {
            c0969f.f6106b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(C0969f c0969f) {
        c0969f.f6106b.c("unlinkToDeath", new Object[0]);
        c0969f.f6118n.asBinder().unlinkToDeath(c0969f.f6115k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f6107c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f6109e.iterator();
        while (it.hasNext()) {
            ((C7094k) it.next()).d(w());
        }
        this.f6109e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f6104o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f6107c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f6107c, 10);
                    handlerThread.start();
                    map.put(this.f6107c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f6107c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f6118n;
    }

    public final void t(F f10, C7094k c7094k) {
        c().post(new I(this, f10.c(), c7094k, f10));
    }

    final /* synthetic */ void u(C7094k c7094k, Task task) {
        synchronized (this.f6110f) {
            this.f6109e.remove(c7094k);
        }
    }

    public final void v(C7094k c7094k) {
        synchronized (this.f6110f) {
            this.f6109e.remove(c7094k);
        }
        c().post(new J(this));
    }
}
