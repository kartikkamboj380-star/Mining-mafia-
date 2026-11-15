package r9;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 extends Closeable, Flushable {
    void W0(C7105h c7105h, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    d0 i();
}
