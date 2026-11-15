package P8;

import I8.K;
import N8.AbstractC0835l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f4759h = new c();

    private c() {
        super(j.f4771c, j.f4772d, j.f4773e, j.f4769a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // I8.K
    public K o1(int i10, String str) {
        AbstractC0835l.a(i10);
        return i10 >= j.f4771c ? AbstractC0835l.b(this, str) : super.o1(i10, str);
    }

    @Override // I8.K
    public String toString() {
        return "Dispatchers.Default";
    }
}
