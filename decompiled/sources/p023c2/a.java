package p023c2;

import Y1.k;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11808f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f11811a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final h f11812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f11813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Throwable f11814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class f11807e = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g f11809g = new C0196a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f11810h = new b();

    /* JADX INFO: renamed from: c2.a$a, reason: collision with other inner class name */
    class C0196a implements g {
        C0196a() {
        }

        @Override // p023c2.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                Y1.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    class b implements c {
        b() {
        }

        @Override // c2.a.c
        public void a(h hVar, Throwable th) {
            Object objF = hVar.f();
            Z1.a.G(a.f11807e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(hVar)), objF == null ? null : objF.getClass().getName());
        }

        @Override // c2.a.c
        public boolean b() {
            return false;
        }
    }

    public interface c {
        void a(h hVar, Throwable th);

        boolean b();
    }

    protected a(h hVar, c cVar, Throwable th) {
        this.f11812b = (h) k.g(hVar);
        hVar.b();
        this.f11813c = cVar;
        this.f11814d = th;
    }

    public static a I0(Object obj, g gVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return R0(obj, gVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a R0(Object obj, g gVar, c cVar, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i10 = f11808f;
            if (i10 == 1) {
                return new p023c2.c(obj, gVar, cVar, th);
            }
            if (i10 == 2) {
                return new f(obj, gVar, cVar, th);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new p023c2.b(obj, gVar, cVar, th);
    }

    public static boolean V(a aVar) {
        return aVar != null && aVar.R();
    }

    public static a W(Closeable closeable) {
        return a0(closeable, f11809g);
    }

    public static a X(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return R0(closeable, f11809g, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a a0(Object obj, g gVar) {
        return I0(obj, gVar, f11810h);
    }

    public static a w(a aVar) {
        if (aVar != null) {
            return aVar.n();
        }
        return null;
    }

    public static void x(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public synchronized Object G() {
        k.i(!this.f11811a);
        return k.g(this.f11812b.f());
    }

    public int M() {
        if (R()) {
            return System.identityHashCode(this.f11812b.f());
        }
        return 0;
    }

    public synchronized boolean R() {
        return !this.f11811a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f11811a) {
                    return;
                }
                this.f11811a = true;
                this.f11812b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract a clone();

    public synchronized a n() {
        if (!R()) {
            return null;
        }
        return clone();
    }

    protected a(Object obj, g gVar, c cVar, Throwable th, boolean z9) {
        this.f11812b = new h(obj, gVar, z9);
        this.f11813c = cVar;
        this.f11814d = th;
    }
}
