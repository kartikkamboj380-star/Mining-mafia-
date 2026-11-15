package com.google.android.gms.internal.ads;

import H4.C0612k1;
import H4.C0654z;
import H4.InterfaceC0582a1;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5674ws extends V4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3033bs f34651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f34652c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B4.j f34654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private B4.o f34655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f34656g = System.currentTimeMillis();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f34657h = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BinderC5422us f34653d = new BinderC5422us();

    public C5674ws(Context context, String str) {
        this.f34650a = str;
        this.f34652c = context.getApplicationContext();
        this.f34651b = C0654z.b().f(context, str, new BinderC5162so());
    }

    @Override // V4.a
    public final B4.u a() {
        InterfaceC0582a1 interfaceC0582a1E = null;
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            if (interfaceC3033bs != null) {
                interfaceC0582a1E = interfaceC3033bs.e();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
        return B4.u.f(interfaceC0582a1E);
    }

    @Override // V4.a
    public final U4.b b() {
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            InterfaceC2727Yr interfaceC2727YrZzl = interfaceC3033bs != null ? interfaceC3033bs.zzl() : null;
            if (interfaceC2727YrZzl != null) {
                return new C4415ms(interfaceC2727YrZzl);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
        return U4.b.f6028a;
    }

    @Override // V4.a
    public final void e(B4.j jVar) {
        this.f34654e = jVar;
        this.f34653d.y6(jVar);
    }

    @Override // V4.a
    public final void f(boolean z9) {
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            if (interfaceC3033bs != null) {
                interfaceC3033bs.t6(z9);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // V4.a
    public final void g(B4.o oVar) {
        this.f34655f = oVar;
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            if (interfaceC3033bs != null) {
                interfaceC3033bs.v6(new H4.R1(oVar));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // V4.a
    public final void h(U4.e eVar) {
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            if (interfaceC3033bs != null) {
                interfaceC3033bs.c1(new C4919qs(eVar));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // V4.a
    public final void i(Activity activity, B4.p pVar) {
        BinderC5422us binderC5422us = this.f34653d;
        binderC5422us.z6(pVar);
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            if (interfaceC3033bs != null) {
                interfaceC3033bs.C5(binderC5422us);
                interfaceC3033bs.t0(com.google.android.gms.dynamic.b.N0(activity));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void j(C0612k1 c0612k1, V4.b bVar) {
        try {
            InterfaceC3033bs interfaceC3033bs = this.f34651b;
            if (interfaceC3033bs != null) {
                c0612k1.o(this.f34656g);
                interfaceC3033bs.l1(H4.l2.f1364a.a(this.f34652c, c0612k1), new BinderC5548vs(bVar, this));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }
}
