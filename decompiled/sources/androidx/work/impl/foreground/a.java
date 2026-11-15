package androidx.work.impl.foreground;

import K0.C;
import K0.InterfaceC0752e;
import O0.c;
import O0.d;
import O0.e;
import S0.m;
import S0.u;
import S0.x;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, InterfaceC0752e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f11350k = q.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C f11352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U0.b f11353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f11354d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    m f11355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f11356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f11357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Set f11358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final d f11359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f11360j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0183a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11361a;

        RunnableC0183a(String str) {
            this.f11361a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVarH = a.this.f11352b.s().h(this.f11361a);
            if (uVarH == null || !uVarH.h()) {
                return;
            }
            synchronized (a.this.f11354d) {
                a.this.f11357g.put(x.a(uVarH), uVarH);
                a.this.f11358h.add(uVarH);
                a aVar = a.this;
                aVar.f11359i.a(aVar.f11358h);
            }
        }
    }

    interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    a(Context context) {
        this.f11351a = context;
        C cQ = C.q(context);
        this.f11352b = cQ;
        this.f11353c = cQ.w();
        this.f11355e = null;
        this.f11356f = new LinkedHashMap();
        this.f11358h = new HashSet();
        this.f11357g = new HashMap();
        this.f11359i = new e(this.f11352b.u(), this);
        this.f11352b.s().g(this);
    }

    public static Intent c(Context context, m mVar, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.a());
        intent.putExtra("KEY_NOTIFICATION", iVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent e(Context context, m mVar, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.a());
        intent.putExtra("KEY_NOTIFICATION", iVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        q.e().f(f11350k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f11352b.k(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q.e().a(f11350k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f11360j == null) {
            return;
        }
        this.f11356f.put(mVar, new i(intExtra, notification, intExtra2));
        if (this.f11355e == null) {
            this.f11355e = mVar;
            this.f11360j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f11360j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f11356f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((i) ((Map.Entry) it.next()).getValue()).a();
        }
        i iVar = (i) this.f11356f.get(this.f11355e);
        if (iVar != null) {
            this.f11360j.c(iVar.c(), iA, iVar.b());
        }
    }

    private void j(Intent intent) {
        q.e().f(f11350k, "Started foreground service " + intent);
        this.f11353c.c(new RunnableC0183a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // O0.c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            String str = uVar.f5393a;
            q.e().a(f11350k, "Constraints unmet for WorkSpec " + str);
            this.f11352b.D(x.a(uVar));
        }
    }

    @Override // K0.InterfaceC0752e
    public void d(m mVar, boolean z9) {
        Map.Entry entry;
        synchronized (this.f11354d) {
            try {
                u uVar = (u) this.f11357g.remove(mVar);
                if (uVar != null ? this.f11358h.remove(uVar) : false) {
                    this.f11359i.a(this.f11358h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = (i) this.f11356f.remove(mVar);
        if (mVar.equals(this.f11355e) && this.f11356f.size() > 0) {
            Iterator it = this.f11356f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f11355e = (m) entry.getKey();
            if (this.f11360j != null) {
                i iVar2 = (i) entry.getValue();
                this.f11360j.c(iVar2.c(), iVar2.a(), iVar2.b());
                this.f11360j.d(iVar2.c());
            }
        }
        b bVar = this.f11360j;
        if (iVar == null || bVar == null) {
            return;
        }
        q.e().a(f11350k, "Removing Notification (id: " + iVar.c() + ", workSpecId: " + mVar + ", notificationType: " + iVar.a());
        bVar.d(iVar.c());
    }

    @Override // O0.c
    public void f(List list) {
    }

    void k(Intent intent) {
        q.e().f(f11350k, "Stopping foreground service");
        b bVar = this.f11360j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void l() {
        this.f11360j = null;
        synchronized (this.f11354d) {
            this.f11359i.reset();
        }
        this.f11352b.s().l(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    void n(b bVar) {
        if (this.f11360j != null) {
            q.e().c(f11350k, "A callback already exists.");
        } else {
            this.f11360j = bVar;
        }
    }
}
