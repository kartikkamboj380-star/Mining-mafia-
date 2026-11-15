package p013b2;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int b(int i10, byte[] bArr, int i11, int i12);

    boolean isClosed();

    byte k(int i10);

    int size();
}
