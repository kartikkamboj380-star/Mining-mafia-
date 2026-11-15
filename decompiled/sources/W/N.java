package W;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class N extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f6208a;

    public N(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f6208a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f6208a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f6208a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        Intrinsics.checkNotNullParameter(b10, "b");
        this.f6208a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f6208a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
