package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.us0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5423us0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4166kt0 f33925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f33926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5549vs0 f33927c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Intent f33931g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ServiceConnection f33933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IInterface f33934j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f33929e = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33928d = "OverlayDisplayService";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IBinder.DeathRecipient f33932h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.ps0
        @Override // android.os.IBinder.DeathRecipient
        public final /* synthetic */ void binderDied() {
            this.f32492a.d();
        }
    };

    C5423us0(Context context, C5549vs0 c5549vs0, String str, Intent intent, InterfaceC4164ks0 interfaceC4164ks0) {
        this.f33926b = context;
        this.f33927c = c5549vs0;
        final String str2 = "OverlayDisplayService";
        this.f33931g = intent;
        this.f33925a = AbstractC4670ot0.a(new InterfaceC4166kt0(str2) { // from class: com.google.android.gms.internal.ads.ts0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void h(final Runnable runnable) {
        ((Handler) this.f33925a.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.ss0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33245a.g(runnable);
            }
        });
    }

    public final void a(final Runnable runnable) {
        h(new Runnable() { // from class: com.google.android.gms.internal.ads.qs0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32740a.e(runnable);
            }
        });
    }

    public final void b() {
        h(new Runnable() { // from class: com.google.android.gms.internal.ads.rs0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33037a.f();
            }
        });
    }

    public final IInterface c() {
        return this.f33934j;
    }

    final /* synthetic */ void d() {
        this.f33927c.a("%s : Binder has died.", this.f33928d);
        List list = this.f33929e;
        synchronized (list) {
            list.clear();
        }
    }

    final /* synthetic */ void e(Runnable runnable) {
        if (this.f33934j != null || this.f33930f) {
            if (!this.f33930f) {
                runnable.run();
                return;
            }
            this.f33927c.a("Waiting to bind to the service.", new Object[0]);
            List list = this.f33929e;
            synchronized (list) {
                list.add(runnable);
            }
            return;
        }
        this.f33927c.a("Initiate binding to the service.", new Object[0]);
        List list2 = this.f33929e;
        synchronized (list2) {
            list2.add(runnable);
        }
        ServiceConnectionC4542ns0 serviceConnectionC4542ns0 = new ServiceConnectionC4542ns0(this, null);
        this.f33933i = serviceConnectionC4542ns0;
        this.f33930f = true;
        if (this.f33926b.bindService(this.f33931g, serviceConnectionC4542ns0, 1)) {
            return;
        }
        this.f33927c.a("Failed to bind to the service.", new Object[0]);
        this.f33930f = false;
        List list3 = this.f33929e;
        synchronized (list3) {
            list3.clear();
        }
    }

    final /* synthetic */ void f() {
        if (this.f33934j != null) {
            this.f33927c.a("Unbind from service.", new Object[0]);
            Context context = this.f33926b;
            ServiceConnection serviceConnection = this.f33933i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.f33930f = false;
            this.f33934j = null;
            this.f33933i = null;
            List list = this.f33929e;
            synchronized (list) {
                list.clear();
            }
        }
    }

    final /* synthetic */ void g(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            this.f33927c.c("error caused by ", e10);
        }
    }

    final /* synthetic */ C5549vs0 i() {
        return this.f33927c;
    }

    final /* synthetic */ List j() {
        return this.f33929e;
    }

    final /* synthetic */ void k(boolean z9) {
        this.f33930f = false;
    }

    final /* synthetic */ IBinder.DeathRecipient l() {
        return this.f33932h;
    }

    final /* synthetic */ IInterface m() {
        return this.f33934j;
    }

    final /* synthetic */ void n(IInterface iInterface) {
        this.f33934j = iInterface;
    }
}
