package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1956Jv implements Releasable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f20020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f20021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WeakReference f20022c;

    public AbstractC1956Jv(InterfaceC2265Pu interfaceC2265Pu) {
        Context context = interfaceC2265Pu.getContext();
        this.f20020a = context;
        this.f20021b = G4.t.g().R(context, interfaceC2265Pu.f().f3097a);
        this.f20022c = new WeakReference(interfaceC2265Pu);
    }

    public abstract boolean a(String str);

    public boolean f(String str, String[] strArr) {
        return a(str);
    }

    public boolean g(String str, String[] strArr, C1540Bv c1540Bv) {
        return a(str);
    }

    protected void i(int i10) {
    }

    protected void j(int i10) {
    }

    protected void k(int i10) {
    }

    protected void l(int i10) {
    }

    public abstract void m();

    public final void p(String str, String str2, long j10, long j11, boolean z9, long j12, long j13, long j14, int i10, int i11) {
        L4.g.f3110b.post(new RunnableC1696Ev(this, str, str2, j10, j11, j12, j13, j14, z9, i10, i11));
    }

    public final void r(String str, String str2, int i10, int i11, long j10, long j11, boolean z9, int i12, int i13) {
        L4.g.f3110b.post(new RunnableC1748Fv(this, str, str2, i10, i11, j10, j11, z9, i12, i13));
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    protected final void s(String str, String str2, int i10) {
        L4.g.f3110b.post(new RunnableC1800Gv(this, str, str2, i10));
    }

    public final void t(String str, String str2, long j10) {
        L4.g.f3110b.post(new RunnableC1852Hv(this, str, str2, j10));
    }

    public final void u(String str, String str2, String str3, String str4) {
        L4.g.f3110b.post(new RunnableC1904Iv(this, str, str2, str3, str4));
    }

    final /* synthetic */ void v(String str, Map map) {
        InterfaceC2265Pu interfaceC2265Pu = (InterfaceC2265Pu) this.f20022c.get();
        if (interfaceC2265Pu != null) {
            interfaceC2265Pu.b("onPrecacheEvent", map);
        }
    }
}
