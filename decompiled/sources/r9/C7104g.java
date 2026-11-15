package r9;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7104g implements a0 {
    @Override // r9.a0
    public void W0(C7105h source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // r9.a0
    public d0 i() {
        return d0.f48431e;
    }

    @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // r9.a0, java.io.Flushable
    public void flush() {
    }
}
