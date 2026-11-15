package R2;

/* JADX INFO: loaded from: classes.dex */
public class y implements p013b2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    p023c2.a f5169b;

    public y(p023c2.a aVar, int i10) {
        Y1.k.g(aVar);
        Y1.k.b(Boolean.valueOf(i10 >= 0 && i10 <= ((w) aVar.G()).a()));
        this.f5169b = aVar.clone();
        this.f5168a = i10;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new b2.h.a();
        }
    }

    @Override // p013b2.h
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        a();
        Y1.k.b(Boolean.valueOf(i10 + i12 <= this.f5168a));
        Y1.k.g(this.f5169b);
        return ((w) this.f5169b.G()).b(i10, bArr, i11, i12);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        p023c2.a.x(this.f5169b);
        this.f5169b = null;
    }

    @Override // p013b2.h
    public synchronized boolean isClosed() {
        return !p023c2.a.V(this.f5169b);
    }

    @Override // p013b2.h
    public synchronized byte k(int i10) {
        a();
        Y1.k.b(Boolean.valueOf(i10 >= 0));
        Y1.k.b(Boolean.valueOf(i10 < this.f5168a));
        Y1.k.g(this.f5169b);
        return ((w) this.f5169b.G()).k(i10);
    }

    @Override // p013b2.h
    public synchronized int size() {
        a();
        return this.f5168a;
    }
}
