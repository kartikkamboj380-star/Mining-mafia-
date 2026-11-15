package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3247dZ0 extends VY0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f27470h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f27471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GK0 f27472j;

    protected AbstractC3247dZ0() {
    }

    protected final void A(final Object obj, InterfaceC5889yZ0 interfaceC5889yZ0) {
        HashMap map = this.f27470h;
        AbstractC2418Ss0.a(!map.containsKey(obj));
        InterfaceC5763xZ0 interfaceC5763xZ0 = new InterfaceC5763xZ0() { // from class: com.google.android.gms.internal.ads.aZ0
            @Override // com.google.android.gms.internal.ads.InterfaceC5763xZ0
            public final /* synthetic */ void a(InterfaceC5889yZ0 interfaceC5889yZ1, AbstractC5270tf abstractC5270tf) {
                this.f26560a.z(obj, interfaceC5889yZ1, abstractC5270tf);
            }
        };
        C2996bZ0 c2996bZ0 = new C2996bZ0(this, obj);
        map.put(obj, new C3121cZ0(interfaceC5889yZ0, interfaceC5763xZ0, c2996bZ0));
        Handler handler = this.f27471i;
        handler.getClass();
        interfaceC5889yZ0.c(handler, c2996bZ0);
        Handler handler2 = this.f27471i;
        handler2.getClass();
        interfaceC5889yZ0.b(handler2, c2996bZ0);
        interfaceC5889yZ0.m(interfaceC5763xZ0, this.f27472j, y());
        if (x()) {
            return;
        }
        interfaceC5889yZ0.h(interfaceC5763xZ0);
    }

    protected int B(Object obj, int i10) {
        return 0;
    }

    protected abstract C5637wZ0 C(Object obj, C5637wZ0 c5637wZ0);

    protected long E(Object obj, long j10, C5637wZ0 c5637wZ0) {
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public void g() {
        Iterator it = this.f27470h.values().iterator();
        while (it.hasNext()) {
            ((C3121cZ0) it.next()).f27146a.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.VY0
    protected final void n() {
        for (C3121cZ0 c3121cZ0 : this.f27470h.values()) {
            c3121cZ0.f27146a.i(c3121cZ0.f27147b);
        }
    }

    @Override // com.google.android.gms.internal.ads.VY0
    protected void o(GK0 gk0) {
        this.f27472j = gk0;
        this.f27471i = AbstractC4634ob0.y(null);
    }

    @Override // com.google.android.gms.internal.ads.VY0
    protected final void p() {
        for (C3121cZ0 c3121cZ0 : this.f27470h.values()) {
            c3121cZ0.f27146a.h(c3121cZ0.f27147b);
        }
    }

    @Override // com.google.android.gms.internal.ads.VY0
    protected void q() {
        HashMap map = this.f27470h;
        for (C3121cZ0 c3121cZ0 : map.values()) {
            InterfaceC5889yZ0 interfaceC5889yZ0 = c3121cZ0.f27146a;
            interfaceC5889yZ0.l(c3121cZ0.f27147b);
            C2996bZ0 c2996bZ0 = c3121cZ0.f27148c;
            interfaceC5889yZ0.a(c2996bZ0);
            interfaceC5889yZ0.e(c2996bZ0);
        }
        map.clear();
    }

    protected abstract void z(Object obj, InterfaceC5889yZ0 interfaceC5889yZ0, AbstractC5270tf abstractC5270tf);
}
