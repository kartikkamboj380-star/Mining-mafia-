package p137n6;

import androidx.lifecycle.AbstractC1169o;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p117l6.AbstractC7048i;
import p127m6.i;
import p177r6.g;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f46971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f46972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f46974d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f46975e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f46976f = new k(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f46977g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f46978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference f46979b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f46980c;

        public a(boolean z9) {
            this.f46980c = z9;
            this.f46978a = new AtomicMarkableReference(new e(64, z9 ? 8192 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f46979b.set(null);
            aVar.d();
        }

        private void c() {
            Runnable runnable = new Runnable() { // from class: n6.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.a.a(this.f46970a);
                }
            };
            if (AbstractC1169o.a(this.f46979b, null, runnable)) {
                p.this.f46972b.f46429b.d(runnable);
            }
        }

        private void d() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f46978a.isMarked()) {
                        mapA = ((e) this.f46978a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f46978a;
                        atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                p.this.f46971a.r(p.this.f46973c, mapA, this.f46980c);
            }
        }

        public Map b() {
            return ((e) this.f46978a.getReference()).a();
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((e) this.f46978a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f46978a;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public p(String str, g gVar, i iVar) {
        this.f46973c = str;
        this.f46971a = new g(gVar);
        this.f46972b = iVar;
    }

    public static /* synthetic */ void c(p pVar, String str, Map map, List list) throws Throwable {
        if (pVar.j() != null) {
            pVar.f46971a.t(str, pVar.j());
        }
        if (!map.isEmpty()) {
            pVar.f46971a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        pVar.f46971a.s(str, list);
    }

    public static p k(String str, g gVar, i iVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, iVar);
        ((e) pVar.f46974d.f46978a.getReference()).e(gVar2.i(str, false));
        ((e) pVar.f46975e.f46978a.getReference()).e(gVar2.i(str, true));
        pVar.f46977g.set(gVar2.k(str), false);
        pVar.f46976f.c(gVar2.j(str));
        return pVar;
    }

    public static String l(String str, g gVar) {
        return new g(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z9;
        String strJ;
        synchronized (this.f46977g) {
            try {
                z9 = false;
                if (this.f46977g.isMarked()) {
                    strJ = j();
                    this.f46977g.set(strJ, false);
                    z9 = true;
                } else {
                    strJ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            this.f46971a.t(this.f46973c, strJ);
        }
    }

    public Map g(Map map) {
        if (map.isEmpty()) {
            return this.f46974d.b();
        }
        HashMap map2 = new HashMap(this.f46974d.b());
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strC = e.c((String) entry.getKey(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c((String) entry.getValue(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            p087i6.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: " + IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map h() {
        return this.f46975e.b();
    }

    public List i() {
        return this.f46976f.a();
    }

    public String j() {
        return (String) this.f46977g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f46974d.e(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f46975e.e(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f46973c) {
            this.f46973c = str;
            final Map mapB = this.f46974d.b();
            final List listB = this.f46976f.b();
            this.f46972b.f46429b.d(new Runnable() { // from class: n6.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.c(this.f46963a, str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = e.c(str, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        synchronized (this.f46977g) {
            try {
                if (AbstractC7048i.z(strC, (String) this.f46977g.getReference())) {
                    return;
                }
                this.f46977g.set(strC, true);
                this.f46972b.f46429b.d(new Runnable() { // from class: n6.n
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f46969a.m();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r(List list) {
        synchronized (this.f46976f) {
            try {
                if (!this.f46976f.c(list)) {
                    return false;
                }
                final List listB = this.f46976f.b();
                this.f46972b.f46429b.d(new Runnable() { // from class: n6.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        p pVar = this.f46967a;
                        pVar.f46971a.s(pVar.f46973c, listB);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
