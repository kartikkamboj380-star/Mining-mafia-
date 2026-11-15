package p042e1;

import java.nio.ByteBuffer;
import kotlin.ranges.b;
import r9.C7105h;
import r9.c0;
import r9.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final c0 a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f43244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f43245b;

        a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f43244a = byteBufferSlice;
            this.f43245b = byteBufferSlice.capacity();
        }

        @Override // r9.c0
        public d0 i() {
            return d0.f48431e;
        }

        @Override // r9.c0
        public long s(C7105h c7105h, long j10) {
            if (this.f43244a.position() == this.f43245b) {
                return -1L;
            }
            this.f43244a.limit(b.g((int) (((long) this.f43244a.position()) + j10), this.f43245b));
            return c7105h.write(this.f43244a);
        }

        @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
