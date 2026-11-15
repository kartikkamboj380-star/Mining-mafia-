package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1716Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledFuture f18805a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f18806b = new RunnableC1508Bf(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18807c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1872If f18808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f18809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2028Lf f18810f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void f() {
        synchronized (this.f18807c) {
            try {
                if (this.f18809e != null && this.f18808d == null) {
                    C1872If c1872IfE = e(new C1612Df(this), new C1664Ef(this));
                    this.f18808d = c1872IfE;
                    c1872IfE.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f18807c) {
            try {
                if (this.f18809e != null) {
                    return;
                }
                this.f18809e = context.getApplicationContext();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29820f5)).booleanValue()) {
                    f();
                } else {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f29809e5)).booleanValue()) {
                        G4.t.k().b(new C1560Cf(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29831g5)).booleanValue()) {
            synchronized (this.f18807c) {
                try {
                    f();
                    ScheduledFuture scheduledFuture = this.f18805a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f18805a = AbstractC2315Qt.f22476d.schedule(this.f18806b, ((Long) H4.B.c().d(AbstractC3892ii.f29842h5)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C1768Gf c(C1924Jf c1924Jf) {
        synchronized (this.f18807c) {
            if (this.f18810f == null) {
                return new C1768Gf();
            }
            try {
                if (this.f18808d.c()) {
                    return this.f18810f.Z1(c1924Jf);
                }
                return this.f18810f.H1(c1924Jf);
            } catch (RemoteException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Unable to call into cache service.", e10);
                return new C1768Gf();
            }
        }
    }

    public final long d(C1924Jf c1924Jf) {
        synchronized (this.f18807c) {
            try {
                if (this.f18810f == null) {
                    return -2L;
                }
                if (this.f18808d.c()) {
                    try {
                        return this.f18810f.i2(c1924Jf);
                    } catch (RemoteException e10) {
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.d("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final synchronized C1872If e(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new C1872If(this.f18809e, G4.t.w().a(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void g() {
        synchronized (this.f18807c) {
            try {
                C1872If c1872If = this.f18808d;
                if (c1872If == null) {
                    return;
                }
                if (c1872If.isConnected() || this.f18808d.isConnecting()) {
                    this.f18808d.disconnect();
                }
                this.f18808d = null;
                this.f18810f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object h() {
        return this.f18807c;
    }

    final /* synthetic */ C1872If i() {
        return this.f18808d;
    }

    final /* synthetic */ void j(C1872If c1872If) {
        this.f18808d = null;
    }

    final /* synthetic */ void k(C2028Lf c2028Lf) {
        this.f18810f = c2028Lf;
    }
}
