package p137n6;

import com.google.protobuf.CodedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f46935g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f46936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f46937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f46939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f46940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f46941f = new byte[16];

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f46942a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f46943b;

        a(StringBuilder sb) {
            this.f46943b = sb;
        }

        @Override // n6.h.d
        public void a(InputStream inputStream, int i10) {
            if (this.f46942a) {
                this.f46942a = false;
            } else {
                this.f46943b.append(", ");
            }
            this.f46943b.append(i10);
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f46945c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f46946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f46947b;

        b(int i10, int i11) {
            this.f46946a = i10;
            this.f46947b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f46946a + ", length = " + this.f46947b + "]";
        }
    }

    private final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46949b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.N(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f46949b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.X(this.f46948a, bArr, i10, i11);
            this.f46948a = h.this.V0(this.f46948a + i11);
            this.f46949b -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f46948a = h.this.V0(bVar.f46946a + 4);
            this.f46949b = bVar.f46947b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f46949b == 0) {
                return -1;
            }
            h.this.f46936a.seek(this.f46948a);
            int i10 = h.this.f46936a.read();
            this.f46948a = h.this.V0(this.f46948a + 1);
            this.f46949b--;
            return i10;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            J(file);
        }
        this.f46936a = Q(file);
        S();
    }

    private void I0(int i10) throws IOException {
        this.f46936a.setLength(i10);
        this.f46936a.getChannel().force(true);
    }

    private static void J(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileQ = Q(file2);
        try {
            randomAccessFileQ.setLength(4096L);
            randomAccessFileQ.seek(0L);
            byte[] bArr = new byte[16];
            m1(bArr, CodedOutputStream.DEFAULT_BUFFER_SIZE, 0, 0, 0);
            randomAccessFileQ.write(bArr);
            randomAccessFileQ.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileQ.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object N(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile Q(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b R(int i10) throws IOException {
        if (i10 == 0) {
            return b.f46945c;
        }
        this.f46936a.seek(i10);
        return new b(i10, this.f46936a.readInt());
    }

    private void S() throws IOException {
        this.f46936a.seek(0L);
        this.f46936a.readFully(this.f46941f);
        int iT = T(this.f46941f, 0);
        this.f46937b = iT;
        if (iT <= this.f46936a.length()) {
            this.f46938c = T(this.f46941f, 4);
            int iT2 = T(this.f46941f, 8);
            int iT3 = T(this.f46941f, 12);
            this.f46939d = R(iT2);
            this.f46940e = R(iT3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f46937b + ", Actual length: " + this.f46936a.length());
    }

    private static int T(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int V() {
        return this.f46937b - R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int V0(int i10) {
        int i11 = this.f46937b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iV0 = V0(i10);
        int i13 = iV0 + i12;
        int i14 = this.f46937b;
        if (i13 <= i14) {
            this.f46936a.seek(iV0);
            this.f46936a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iV0;
        this.f46936a.seek(iV0);
        this.f46936a.readFully(bArr, i11, i15);
        this.f46936a.seek(16L);
        this.f46936a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void a0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iV0 = V0(i10);
        int i13 = iV0 + i12;
        int i14 = this.f46937b;
        if (i13 <= i14) {
            this.f46936a.seek(iV0);
            this.f46936a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iV0;
        this.f46936a.seek(iV0);
        this.f46936a.write(bArr, i11, i15);
        this.f46936a.seek(16L);
        this.f46936a.write(bArr, i11 + i15, i12 - i15);
    }

    private void g1(int i10, int i11, int i12, int i13) throws IOException {
        m1(this.f46941f, i10, i11, i12, i13);
        this.f46936a.seek(0L);
        this.f46936a.write(this.f46941f);
    }

    private static void l1(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void m1(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            l1(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void x(int i10) throws IOException {
        int i11 = i10 + 4;
        int iV = V();
        if (iV >= i11) {
            return;
        }
        int i12 = this.f46937b;
        do {
            iV += i12;
            i12 <<= 1;
        } while (iV < i11);
        I0(i12);
        b bVar = this.f46940e;
        int iV0 = V0(bVar.f46946a + 4 + bVar.f46947b);
        if (iV0 < this.f46939d.f46946a) {
            FileChannel channel = this.f46936a.getChannel();
            channel.position(this.f46937b);
            long j10 = iV0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f46940e.f46946a;
        int i14 = this.f46939d.f46946a;
        if (i13 < i14) {
            int i15 = (this.f46937b + i13) - 16;
            g1(i12, this.f46938c, i14, i15);
            this.f46940e = new b(i15, this.f46940e.f46947b);
        } else {
            g1(i12, this.f46938c, i14, i13);
        }
        this.f46937b = i12;
    }

    public synchronized void G(d dVar) {
        int iV0 = this.f46939d.f46946a;
        for (int i10 = 0; i10 < this.f46938c; i10++) {
            b bVarR = R(iV0);
            dVar.a(new c(this, bVarR, null), bVarR.f46947b);
            iV0 = V0(bVarR.f46946a + 4 + bVarR.f46947b);
        }
    }

    public synchronized boolean M() {
        return this.f46938c == 0;
    }

    public int R0() {
        if (this.f46938c == 0) {
            return 16;
        }
        b bVar = this.f46940e;
        int i10 = bVar.f46946a;
        int i11 = this.f46939d.f46946a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f46947b + 16 : (((i10 + 4) + bVar.f46947b) + this.f46937b) - i11;
    }

    public synchronized void W() {
        try {
            if (M()) {
                throw new NoSuchElementException();
            }
            if (this.f46938c == 1) {
                w();
            } else {
                b bVar = this.f46939d;
                int iV0 = V0(bVar.f46946a + 4 + bVar.f46947b);
                X(iV0, this.f46941f, 0, 4);
                int iT = T(this.f46941f, 0);
                g1(this.f46937b, this.f46938c - 1, iV0, this.f46940e.f46946a);
                this.f46938c--;
                this.f46939d = new b(iV0, iT);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f46936a.close();
    }

    public void n(byte[] bArr) {
        v(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f46937b);
        sb.append(", size=");
        sb.append(this.f46938c);
        sb.append(", first=");
        sb.append(this.f46939d);
        sb.append(", last=");
        sb.append(this.f46940e);
        sb.append(", element lengths=[");
        try {
            G(new a(sb));
        } catch (IOException e10) {
            f46935g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void v(byte[] bArr, int i10, int i11) {
        int iV0;
        try {
            N(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            x(i11);
            boolean zM = M();
            if (zM) {
                iV0 = 16;
            } else {
                b bVar = this.f46940e;
                iV0 = V0(bVar.f46946a + 4 + bVar.f46947b);
            }
            b bVar2 = new b(iV0, i11);
            l1(this.f46941f, 0, i11);
            a0(bVar2.f46946a, this.f46941f, 0, 4);
            a0(bVar2.f46946a + 4, bArr, i10, i11);
            g1(this.f46937b, this.f46938c + 1, zM ? bVar2.f46946a : this.f46939d.f46946a, bVar2.f46946a);
            this.f46940e = bVar2;
            this.f46938c++;
            if (zM) {
                this.f46939d = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void w() {
        try {
            g1(CodedOutputStream.DEFAULT_BUFFER_SIZE, 0, 0, 0);
            this.f46938c = 0;
            b bVar = b.f46945c;
            this.f46939d = bVar;
            this.f46940e = bVar;
            if (this.f46937b > 4096) {
                I0(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            }
            this.f46937b = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        } catch (Throwable th) {
            throw th;
        }
    }
}
