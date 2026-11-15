package com.facebook.imagepipeline.memory;

import R2.F;
import R2.G;
import Y1.k;
import Y1.m;
import Y1.p;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p013b2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f13935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p013b2.d f13936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final F f13937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray f13938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f13939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0324a f13941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final C0324a f13942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G f13943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13944j;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    static class C0324a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13946b;

        C0324a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f13946b;
            if (i12 < i10 || (i11 = this.f13945a) <= 0) {
                Z1.a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f13946b), Integer.valueOf(this.f13945a));
            } else {
                this.f13945a = i11 - 1;
                this.f13946b = i12 - i10;
            }
        }

        public void b(int i10) {
            this.f13945a++;
            this.f13946b += i10;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public a(p013b2.d dVar, F f10, G g10) {
        this.f13935a = getClass();
        this.f13936b = (p013b2.d) k.g(dVar);
        F f11 = (F) k.g(f10);
        this.f13937c = f11;
        this.f13943i = (G) k.g(g10);
        this.f13938d = new SparseArray();
        if (f11.f5127f) {
            q();
        } else {
            u(new SparseIntArray(0));
        }
        this.f13939e = m.b();
        this.f13942h = new C0324a();
        this.f13941g = new C0324a();
    }

    private synchronized void h() {
        try {
            k.i(!s() || this.f13942h.f13946b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void i(SparseIntArray sparseIntArray) {
        this.f13938d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            this.f13938d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(o(iKeyAt), sparseIntArray.valueAt(i10), 0, this.f13937c.f5127f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b l(int i10) {
        return (com.facebook.imagepipeline.memory.b) this.f13938d.get(i10);
    }

    private synchronized void q() {
        try {
            SparseIntArray sparseIntArray = this.f13937c.f5124c;
            if (sparseIntArray != null) {
                i(sparseIntArray);
                this.f13940f = false;
            } else {
                this.f13940f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void u(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f13938d.clear();
            SparseIntArray sparseIntArray2 = this.f13937c.f5124c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int iKeyAt = sparseIntArray2.keyAt(i10);
                    this.f13938d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(o(iKeyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(iKeyAt, 0), this.f13937c.f5127f));
                }
                this.f13940f = false;
            } else {
                this.f13940f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void v() {
        if (Z1.a.w(2)) {
            Z1.a.B(this.f13935a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f13941g.f13945a), Integer.valueOf(this.f13941g.f13946b), Integer.valueOf(this.f13942h.f13945a), Integer.valueOf(this.f13942h.f13946b));
        }
    }

    @Override // p013b2.f, p023c2.g
    public void a(Object obj) {
        k.g(obj);
        int iN = n(obj);
        int iO = o(iN);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarL = l(iN);
                if (!this.f13939e.remove(obj)) {
                    Z1.a.k(this.f13935a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    j(obj);
                    this.f13943i.b(iO);
                } else if (bVarL == null || bVarL.f() || s() || !t(obj)) {
                    if (bVarL != null) {
                        bVarL.b();
                    }
                    if (Z1.a.w(2)) {
                        Z1.a.z(this.f13935a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    }
                    j(obj);
                    this.f13941g.a(iO);
                    this.f13943i.b(iO);
                } else {
                    bVarL.h(obj);
                    this.f13942h.b(iO);
                    this.f13941g.a(iO);
                    this.f13943i.c(iO);
                    if (Z1.a.w(2)) {
                        Z1.a.z(this.f13935a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    }
                }
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract Object f(int i10);

    synchronized boolean g(int i10) {
        if (this.f13944j) {
            return true;
        }
        F f10 = this.f13937c;
        int i11 = f10.f5122a;
        int i12 = this.f13941g.f13946b;
        if (i10 > i11 - i12) {
            this.f13943i.g();
            return false;
        }
        int i13 = f10.f5123b;
        if (i10 > i13 - (i12 + this.f13942h.f13946b)) {
            x(i13 - i10);
        }
        if (i10 <= i11 - (this.f13941g.f13946b + this.f13942h.f13946b)) {
            return true;
        }
        this.f13943i.g();
        return false;
    }

    @Override // p013b2.f
    public Object get(int i10) throws Throwable {
        Object objF;
        Object objP;
        h();
        int iM = m(i10);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarK = k(iM);
                if (bVarK != null && (objP = p(bVarK)) != null) {
                    k.i(this.f13939e.add(objP));
                    int iN = n(objP);
                    int iO = o(iN);
                    this.f13941g.b(iO);
                    this.f13942h.a(iO);
                    this.f13943i.e(iO);
                    v();
                    if (Z1.a.w(2)) {
                        Z1.a.z(this.f13935a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objP)), Integer.valueOf(iN));
                    }
                    return objP;
                }
                int iO2 = o(iM);
                if (!g(iO2)) {
                    throw new c(this.f13937c.f5122a, this.f13941g.f13946b, this.f13942h.f13946b, iO2);
                }
                this.f13941g.b(iO2);
                if (bVarK != null) {
                    bVarK.e();
                }
                try {
                    objF = f(iM);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f13941g.a(iO2);
                            com.facebook.imagepipeline.memory.b bVarK2 = k(iM);
                            if (bVarK2 != null) {
                                bVarK2.b();
                            }
                            p.c(th);
                            objF = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        k.i(this.f13939e.add(objF));
                        y();
                        this.f13943i.d(iO2);
                        v();
                        if (Z1.a.w(2)) {
                            Z1.a.z(this.f13935a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objF)), Integer.valueOf(iM));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return objF;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract void j(Object obj);

    synchronized com.facebook.imagepipeline.memory.b k(int i10) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f13938d.get(i10);
            if (bVar == null && this.f13940f) {
                if (Z1.a.w(2)) {
                    Z1.a.y(this.f13935a, "creating new bucket %s", Integer.valueOf(i10));
                }
                com.facebook.imagepipeline.memory.b bVarW = w(i10);
                this.f13938d.put(i10, bVarW);
                return bVarW;
            }
            return bVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract int m(int i10);

    protected abstract int n(Object obj);

    protected abstract int o(int i10);

    protected synchronized Object p(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    protected void r() {
        this.f13936b.a(this);
        this.f13943i.f(this);
    }

    synchronized boolean s() {
        boolean z9;
        z9 = this.f13941g.f13946b + this.f13942h.f13946b > this.f13937c.f5123b;
        if (z9) {
            this.f13943i.a();
        }
        return z9;
    }

    protected boolean t(Object obj) {
        k.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b w(int i10) {
        return new com.facebook.imagepipeline.memory.b(o(i10), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, this.f13937c.f5127f);
    }

    synchronized void x(int i10) {
        try {
            int i11 = this.f13941g.f13946b;
            int i12 = this.f13942h.f13946b;
            int iMin = Math.min((i11 + i12) - i10, i12);
            if (iMin <= 0) {
                return;
            }
            if (Z1.a.w(2)) {
                Z1.a.A(this.f13935a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f13941g.f13946b + this.f13942h.f13946b), Integer.valueOf(iMin));
            }
            v();
            for (int i13 = 0; i13 < this.f13938d.size() && iMin > 0; i13++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) k.g((com.facebook.imagepipeline.memory.b) this.f13938d.valueAt(i13));
                while (iMin > 0) {
                    Object objG = bVar.g();
                    if (objG == null) {
                        break;
                    }
                    j(objG);
                    int i14 = bVar.f13947a;
                    iMin -= i14;
                    this.f13942h.a(i14);
                }
            }
            v();
            if (Z1.a.w(2)) {
                Z1.a.z(this.f13935a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f13941g.f13946b + this.f13942h.f13946b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void y() {
        if (s()) {
            x(this.f13937c.f5123b);
        }
    }

    public a(p013b2.d dVar, F f10, G g10, boolean z9) {
        this(dVar, f10, g10);
        this.f13944j = z9;
    }
}
