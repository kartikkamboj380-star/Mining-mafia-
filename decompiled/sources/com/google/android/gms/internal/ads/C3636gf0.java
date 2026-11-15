package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3636gf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f28699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceScheduledExecutorServiceC1857Hx0 f28700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.v f28701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2702Ye0 f28702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RunnableC4262le0 f28703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2583Vx f28704g;

    C3636gf0(Context context, Executor executor, InterfaceScheduledExecutorServiceC1857Hx0 interfaceScheduledExecutorServiceC1857Hx0, L4.v vVar, C2702Ye0 c2702Ye0, RunnableC4262le0 runnableC4262le0, C2583Vx c2583Vx) {
        this.f28698a = context;
        this.f28699b = executor;
        this.f28700c = interfaceScheduledExecutorServiceC1857Hx0;
        this.f28701d = vVar;
        this.f28702e = c2702Ye0;
        this.f28703f = runnableC4262le0;
        this.f28704g = c2583Vx;
    }

    public final void a(List list, L4.w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), wVar, null, null);
        }
    }

    public final void b(final String str, L4.w wVar, RunnableC3886ie0 runnableC3886ie0, C4845qH c4845qH) {
        com.google.common.util.concurrent.p pVarE0;
        InterfaceC2700Yd0 interfaceC2700Yd0F = null;
        if (RunnableC4262le0.a() && ((Boolean) AbstractC3140cj.f27185d.e()).booleanValue()) {
            interfaceC2700Yd0F = InterfaceC2700Yd0.f(this.f28698a, 14);
            interfaceC2700Yd0F.zza();
        }
        if (wVar != null) {
            pVarE0 = new C2650Xe0(wVar.a(), this.f28701d, this.f28700c, this.f28702e, this.f28704g).a(str);
        } else {
            pVarE0 = this.f28700c.e0(new Callable() { // from class: com.google.android.gms.internal.ads.ff0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f28454a.c(str);
                }
            });
        }
        AbstractC5685wx0.r(pVarE0, new C3384ef0(this, interfaceC2700Yd0F, runnableC3886ie0, c4845qH), this.f28699b);
    }

    final /* synthetic */ L4.u c(String str) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.la)).booleanValue() || (!G4.t.g().V(str) && !G4.t.g().W(str))) {
            return this.f28701d.b(str, null);
        }
        String strB = this.f28704g.b();
        HashMap map = new HashMap();
        if (strB != null) {
            map.put((String) H4.B.c().d(AbstractC3892ii.ma), strB);
        }
        return this.f28701d.b(str, map);
    }

    final /* synthetic */ L4.v d() {
        return this.f28701d;
    }

    final /* synthetic */ RunnableC4262le0 e() {
        return this.f28703f;
    }
}
