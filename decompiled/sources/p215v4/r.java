package p215v4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p145o4.h;
import p145o4.i;
import p145o4.p;
import p155p4.e;
import p155p4.f;
import p155p4.g;
import p155p4.m;
import p175r4.c;
import p225w4.AbstractC7151k;
import p225w4.InterfaceC7143c;
import p225w4.InterfaceC7144d;
import p235x4.b;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f50165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7144d f50166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f50167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f50168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f50169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f50170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f50171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC7143c f50172i;

    public r(Context context, e eVar, InterfaceC7144d interfaceC7144d, x xVar, Executor executor, b bVar, a aVar, a aVar2, InterfaceC7143c interfaceC7143c) {
        this.f50164a = context;
        this.f50165b = eVar;
        this.f50166c = interfaceC7144d;
        this.f50167d = xVar;
        this.f50168e = executor;
        this.f50169f = bVar;
        this.f50170g = aVar;
        this.f50171h = aVar2;
        this.f50172i = interfaceC7143c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, p pVar, long j10) {
        rVar.f50166c.g0(iterable);
        rVar.f50166c.b1(pVar, rVar.f50170g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f50172i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f50166c.m(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, p pVar, int i10) {
        rVar.f50167d.b(pVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, p pVar, long j10) {
        rVar.f50166c.b1(pVar, rVar.f50170g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f50172i.h(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final p pVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            b bVar = rVar.f50169f;
            final InterfaceC7144d interfaceC7144d = rVar.f50166c;
            Objects.requireNonNull(interfaceC7144d);
            bVar.c(new b.a() { // from class: v4.i
                @Override // x4.b.a
                public final Object a() {
                    return Integer.valueOf(interfaceC7144d.e());
                }
            });
            if (rVar.k()) {
                rVar.l(pVar, i10);
            } else {
                rVar.f50169f.c(new b.a() { // from class: v4.j
                    @Override // x4.b.a
                    public final Object a() {
                        return r.f(this.f50145a, pVar, i10);
                    }
                });
            }
        } catch (p235x4.a unused) {
            rVar.f50167d.b(pVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    public i j(m mVar) {
        b bVar = this.f50169f;
        final InterfaceC7143c interfaceC7143c = this.f50172i;
        Objects.requireNonNull(interfaceC7143c);
        return mVar.a(i.a().i(this.f50170g.a()).o(this.f50171h.a()).n("GDT_CLIENT_METRICS").h(new h(p125m4.c.b("proto"), ((p175r4.a) bVar.c(new b.a() { // from class: v4.h
            @Override // x4.b.a
            public final Object a() {
                return interfaceC7143c.j();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f50164a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g l(final p pVar, int i10) {
        g gVarB;
        m mVar = this.f50165b.get(pVar.b());
        g gVarE = g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f50169f.c(new b.a() { // from class: v4.k
            @Override // x4.b.a
            public final Object a() {
                return Boolean.valueOf(this.f50148a.f50166c.A0(pVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f50169f.c(new b.a() { // from class: v4.l
                @Override // x4.b.a
                public final Object a() {
                    return this.f50150a.f50166c.c1(pVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVar == null) {
                p185s4.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                gVarB = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC7151k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(mVar));
                }
                gVarB = mVar.b(f.a().b(arrayList).c(pVar.c()).a());
            }
            gVarE = gVarB;
            if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                final p pVar2 = pVar;
                this.f50169f.c(new b.a() { // from class: v4.m
                    @Override // x4.b.a
                    public final Object a() {
                        return r.b(this.f50152a, iterable, pVar2, j10);
                    }
                });
                this.f50167d.a(pVar2, i10 + 1, true);
                return gVarE;
            }
            p pVar3 = pVar;
            this.f50169f.c(new b.a() { // from class: v4.n
                @Override // x4.b.a
                public final Object a() {
                    return r.e(this.f50156a, iterable);
                }
            });
            if (gVarE.c() == g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (pVar3.e()) {
                    this.f50169f.c(new b.a() { // from class: v4.o
                        @Override // x4.b.a
                        public final Object a() {
                            return r.c(this.f50158a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((AbstractC7151k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                this.f50169f.c(new b.a() { // from class: v4.p
                    @Override // x4.b.a
                    public final Object a() {
                        return r.h(this.f50159a, map);
                    }
                });
            }
            pVar = pVar3;
        }
        final p pVar4 = pVar;
        this.f50169f.c(new b.a() { // from class: v4.q
            @Override // x4.b.a
            public final Object a() {
                return r.g(this.f50161a, pVar4, j10);
            }
        });
        return gVarE;
    }

    public void m(final p pVar, final int i10, final Runnable runnable) {
        this.f50168e.execute(new Runnable() { // from class: v4.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f50139a, pVar, i10, runnable);
            }
        });
    }
}
