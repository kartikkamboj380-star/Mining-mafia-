package H2;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class w implements n, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f1181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f1182b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f1184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x.a f1185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y1.n f1186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected y f1187g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f1189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f1190j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f1183c = new WeakHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1188h = SystemClock.uptimeMillis();

    class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f1191a;

        a(D d10) {
            this.f1191a = d10;
        }

        @Override // H2.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f1189i ? aVar.f1171f : this.f1191a.a(aVar.f1167b.G());
        }
    }

    class b implements p023c2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f1193a;

        b(n.a aVar) {
            this.f1193a = aVar;
        }

        @Override // p023c2.g
        public void a(Object obj) {
            w.this.y(this.f1193a);
        }
    }

    public w(D d10, x.a aVar, Y1.n nVar, n.b bVar, boolean z9, boolean z10) {
        this.f1184d = d10;
        this.f1181a = new m(A(d10));
        this.f1182b = new m(A(d10));
        this.f1185e = aVar;
        this.f1186f = nVar;
        this.f1187g = (y) Y1.k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f1189i = z9;
        this.f1190j = z10;
    }

    private D A(D d10) {
        return new a(d10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    private synchronized boolean i(int i10) {
        boolean z9;
        if (i10 <= this.f1187g.f1199e) {
            z9 = k() <= this.f1187g.f1196b - 1 && l() <= this.f1187g.f1195a - i10;
        }
        return z9;
    }

    private synchronized void j(n.a aVar) {
        Y1.k.g(aVar);
        Y1.k.i(aVar.f1168c > 0);
        aVar.f1168c--;
    }

    private synchronized void m(n.a aVar) {
        Y1.k.g(aVar);
        Y1.k.i(!aVar.f1169d);
        aVar.f1168c++;
    }

    private synchronized void n(n.a aVar) {
        Y1.k.g(aVar);
        Y1.k.i(!aVar.f1169d);
        aVar.f1169d = true;
    }

    private synchronized void o(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n((n.a) obj);
            }
        }
    }

    private synchronized boolean p(n.a aVar) {
        if (aVar.f1169d || aVar.f1168c != 0) {
            return false;
        }
        this.f1181a.g(aVar.f1166a, aVar);
        return true;
    }

    private void q(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p023c2.a.x(x((n.a) obj));
            }
        }
    }

    private void u(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                t((n.a) obj);
            }
        }
    }

    private synchronized void v() {
        if (this.f1188h + this.f1187g.f1200f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f1188h = SystemClock.uptimeMillis();
        this.f1187g = (y) Y1.k.h((y) this.f1186f.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized p023c2.a w(n.a aVar) {
        m(aVar);
        return p023c2.a.a0(aVar.f1167b.G(), new b(aVar));
    }

    private synchronized p023c2.a x(n.a aVar) {
        Y1.k.g(aVar);
        return (aVar.f1169d && aVar.f1168c == 0) ? aVar.f1167b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(n.a aVar) {
        boolean zP;
        p023c2.a aVarX;
        Y1.k.g(aVar);
        synchronized (this) {
            j(aVar);
            zP = p(aVar);
            aVarX = x(aVar);
        }
        p023c2.a.x(aVarX);
        if (!zP) {
            aVar = null;
        }
        s(aVar);
        v();
        r();
    }

    private synchronized ArrayList z(int i10, int i11) {
        int iMax = Math.max(i10, 0);
        int iMax2 = Math.max(i11, 0);
        if (this.f1181a.b() <= iMax && this.f1181a.e() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f1181a.b() <= iMax && this.f1181a.e() <= iMax2) {
                break;
            }
            Object objC = this.f1181a.c();
            if (objC == null) {
                if (!this.f1190j) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f1181a.b()), Integer.valueOf(this.f1181a.e())));
                }
                this.f1181a.j();
                break;
            }
            this.f1181a.h(objC);
            arrayList.add((n.a) this.f1182b.h(objC));
        }
        return arrayList;
    }

    @Override // H2.x
    public synchronized boolean b(Y1.l lVar) {
        return !this.f1182b.d(lVar).isEmpty();
    }

    @Override // H2.x
    public void c(Object obj) {
        Y1.k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f1181a.h(obj);
                if (aVar != null) {
                    this.f1181a.g(obj, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H2.x
    public int d(Y1.l lVar) {
        ArrayList arrayListI;
        ArrayList arrayListI2;
        synchronized (this) {
            arrayListI = this.f1181a.i(lVar);
            arrayListI2 = this.f1182b.i(lVar);
            o(arrayListI2);
        }
        q(arrayListI2);
        u(arrayListI);
        v();
        r();
        return arrayListI2.size();
    }

    @Override // H2.x
    public p023c2.a e(Object obj, p023c2.a aVar) {
        return h(obj, aVar, null);
    }

    @Override // H2.x
    public p023c2.a get(Object obj) {
        n.a aVar;
        p023c2.a aVarW;
        Y1.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f1181a.h(obj);
                n.a aVar2 = (n.a) this.f1182b.a(obj);
                aVarW = aVar2 != null ? w(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        t(aVar);
        v();
        r();
        return aVarW;
    }

    public p023c2.a h(Object obj, p023c2.a aVar, n.b bVar) {
        n.a aVar2;
        p023c2.a aVarW;
        p023c2.a aVarX;
        Y1.k.g(obj);
        Y1.k.g(aVar);
        v();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f1181a.h(obj);
                n.a aVar3 = (n.a) this.f1182b.h(obj);
                aVarW = null;
                if (aVar3 != null) {
                    n(aVar3);
                    aVarX = x(aVar3);
                } else {
                    aVarX = null;
                }
                int iA = this.f1184d.a(aVar.G());
                if (i(iA)) {
                    n.a aVarA = this.f1189i ? n.a.a(obj, aVar, iA, bVar) : n.a.b(obj, aVar, bVar);
                    this.f1182b.g(obj, aVarA);
                    aVarW = w(aVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p023c2.a.x(aVarX);
        t(aVar2);
        r();
        return aVarW;
    }

    public synchronized int k() {
        return this.f1182b.b() - this.f1181a.b();
    }

    public synchronized int l() {
        return this.f1182b.e() - this.f1181a.e();
    }

    public void r() {
        ArrayList arrayListZ;
        synchronized (this) {
            y yVar = this.f1187g;
            int iMin = Math.min(yVar.f1198d, yVar.f1196b - k());
            y yVar2 = this.f1187g;
            arrayListZ = z(iMin, Math.min(yVar2.f1197c, yVar2.f1195a - l()));
            o(arrayListZ);
        }
        q(arrayListZ);
        u(arrayListZ);
    }

    private static void s(n.a aVar) {
    }

    private static void t(n.a aVar) {
    }
}
