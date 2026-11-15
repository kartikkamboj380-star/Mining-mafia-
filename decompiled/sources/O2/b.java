package O2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class b extends a implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f4465i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p023c2.a f4466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Bitmap f4467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f4468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4470h;

    protected b(Bitmap bitmap, p023c2.g gVar, o oVar, int i10, int i11) {
        this.f4467e = (Bitmap) Y1.k.g(bitmap);
        this.f4466d = p023c2.a.a0(this.f4467e, (p023c2.g) Y1.k.g(gVar));
        this.f4468f = oVar;
        this.f4469g = i10;
        this.f4470h = i11;
    }

    private synchronized p023c2.a T() {
        p023c2.a aVar;
        aVar = this.f4466d;
        this.f4466d = null;
        this.f4467e = null;
        return aVar;
    }

    private static int V(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int W(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean X() {
        return f4465i;
    }

    @Override // O2.a, O2.d
    public o M0() {
        return this.f4468f;
    }

    @Override // O2.c
    public Bitmap Q0() {
        return this.f4467e;
    }

    @Override // O2.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p023c2.a aVarT = T();
        if (aVarT != null) {
            aVarT.close();
        }
    }

    @Override // O2.d
    public int f0() {
        return Z2.d.j(this.f4467e);
    }

    @Override // O2.d, O2.l
    public int getHeight() {
        int i10;
        return (this.f4469g % 180 != 0 || (i10 = this.f4470h) == 5 || i10 == 7) ? W(this.f4467e) : V(this.f4467e);
    }

    @Override // O2.d, O2.l
    public int getWidth() {
        int i10;
        return (this.f4469g % 180 != 0 || (i10 = this.f4470h) == 5 || i10 == 7) ? V(this.f4467e) : W(this.f4467e);
    }

    @Override // O2.d
    public synchronized boolean isClosed() {
        return this.f4466d == null;
    }

    @Override // O2.e
    public int n0() {
        return this.f4470h;
    }

    @Override // O2.e
    public int y0() {
        return this.f4469g;
    }

    protected b(p023c2.a aVar, o oVar, int i10, int i11) {
        p023c2.a aVar2 = (p023c2.a) Y1.k.g(aVar.n());
        this.f4466d = aVar2;
        this.f4467e = (Bitmap) aVar2.G();
        this.f4468f = oVar;
        this.f4469g = i10;
        this.f4470h = i11;
    }
}
