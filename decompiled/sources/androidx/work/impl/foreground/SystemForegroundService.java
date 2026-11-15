package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractServiceC1175v;
import androidx.work.q;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC1175v implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f11335f = q.i("SystemFgService");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SystemForegroundService f11336g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f11337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.a f11339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    NotificationManager f11340e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f11342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11343c;

        a(int i10, Notification notification, int i11) {
            this.f11341a = i10;
            this.f11342b = notification;
            this.f11343c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f11341a, this.f11342b, this.f11343c);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f11341a, this.f11342b, this.f11343c);
            } else {
                SystemForegroundService.this.startForeground(this.f11341a, this.f11342b);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f11346b;

        b(int i10, Notification notification) {
            this.f11345a = i10;
            this.f11346b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11340e.notify(this.f11345a, this.f11346b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11348a;

        c(int i10) {
            this.f11348a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11340e.cancel(this.f11348a);
        }
    }

    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                q.e().l(SystemForegroundService.f11335f, "Unable to start foreground service", e10);
            }
        }
    }

    private void f() {
        this.f11337b = new Handler(Looper.getMainLooper());
        this.f11340e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f11339d = aVar;
        aVar.n(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f11337b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        this.f11337b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f11337b.post(new c(i10));
    }

    @Override // androidx.lifecycle.AbstractServiceC1175v, android.app.Service
    public void onCreate() {
        super.onCreate();
        f11336g = this;
        f();
    }

    @Override // androidx.lifecycle.AbstractServiceC1175v, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11339d.l();
    }

    @Override // androidx.lifecycle.AbstractServiceC1175v, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f11338c) {
            q.e().f(f11335f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f11339d.l();
            f();
            this.f11338c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11339d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f11338c = true;
        q.e().a(f11335f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f11336g = null;
        stopSelf();
    }
}
