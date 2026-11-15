package O2;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface d extends Closeable, l, p023c2.d, p243y2.a {
    o M0();

    l O0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int f0();

    int getHeight();

    int getWidth();

    boolean i1();

    boolean isClosed();
}
