package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VY0 implements InterfaceC5889yZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f24312a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f24313b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GZ0 f24314c = new GZ0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FX0 f24315d = new FX0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f24316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC5270tf f24317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4748pV0 f24318g;

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void a(HZ0 hz0) {
        this.f24314c.c(hz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void b(Handler handler, GX0 gx0) {
        this.f24315d.b(handler, gx0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void c(Handler handler, HZ0 hz0) {
        this.f24314c.b(handler, hz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void e(GX0 gx0) {
        this.f24315d.c(gx0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void h(InterfaceC5763xZ0 interfaceC5763xZ0) {
        HashSet hashSet = this.f24313b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC5763xZ0);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void i(InterfaceC5763xZ0 interfaceC5763xZ0) {
        this.f24316e.getClass();
        HashSet hashSet = this.f24313b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC5763xZ0);
        if (zIsEmpty) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void l(InterfaceC5763xZ0 interfaceC5763xZ0) {
        ArrayList arrayList = this.f24312a;
        arrayList.remove(interfaceC5763xZ0);
        if (!arrayList.isEmpty()) {
            h(interfaceC5763xZ0);
            return;
        }
        this.f24316e = null;
        this.f24317f = null;
        this.f24318g = null;
        this.f24313b.clear();
        q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void m(InterfaceC5763xZ0 interfaceC5763xZ0, GK0 gk0, C4748pV0 c4748pV0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f24316e;
        boolean z9 = true;
        if (looper != null && looper != looperMyLooper) {
            z9 = false;
        }
        AbstractC2418Ss0.a(z9);
        this.f24318g = c4748pV0;
        AbstractC5270tf abstractC5270tf = this.f24317f;
        this.f24312a.add(interfaceC5763xZ0);
        if (this.f24316e == null) {
            this.f24316e = looperMyLooper;
            this.f24313b.add(interfaceC5763xZ0);
            o(gk0);
        } else if (abstractC5270tf != null) {
            i(interfaceC5763xZ0);
            interfaceC5763xZ0.a(this, abstractC5270tf);
        }
    }

    protected void n() {
    }

    protected abstract void o(GK0 gk0);

    protected void p() {
    }

    protected abstract void q();

    protected final void r(AbstractC5270tf abstractC5270tf) {
        this.f24317f = abstractC5270tf;
        ArrayList arrayList = this.f24312a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC5763xZ0) arrayList.get(i10)).a(this, abstractC5270tf);
        }
    }

    protected final GZ0 s(C5637wZ0 c5637wZ0) {
        return this.f24314c.a(0, c5637wZ0);
    }

    protected final GZ0 t(int i10, C5637wZ0 c5637wZ0) {
        return this.f24314c.a(0, c5637wZ0);
    }

    protected final FX0 u(C5637wZ0 c5637wZ0) {
        return this.f24315d.a(0, c5637wZ0);
    }

    protected final FX0 v(int i10, C5637wZ0 c5637wZ0) {
        return this.f24315d.a(0, c5637wZ0);
    }

    protected final boolean x() {
        return !this.f24313b.isEmpty();
    }

    protected final C4748pV0 y() {
        C4748pV0 c4748pV0 = this.f24318g;
        c4748pV0.getClass();
        return c4748pV0;
    }
}
