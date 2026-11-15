package I3;

import c9.C;
import c9.x;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import r9.AbstractC7100c;
import r9.InterfaceC7106i;
import r9.a0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f1630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f1631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f1632d;

    public g(C requestBody, f progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f1630b = requestBody;
        this.f1631c = progressListener;
    }

    private final a0 i(InterfaceC7106i interfaceC7106i) {
        return AbstractC7100c.a().d(new a(interfaceC7106i.h1()));
    }

    @Override // c9.C
    public long a() {
        if (this.f1632d == 0) {
            this.f1632d = this.f1630b.a();
        }
        return this.f1632d;
    }

    @Override // c9.C
    public x b() {
        return this.f1630b.b();
    }

    @Override // c9.C
    public void g(InterfaceC7106i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InterfaceC7106i interfaceC7106iA = AbstractC7100c.a().a(i(sink));
        a();
        this.f1630b.g(interfaceC7106iA);
        interfaceC7106iA.flush();
    }

    public static final class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1633a;

        a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void a() {
            long j10 = this.f1633a;
            long jA = g.this.a();
            g.this.f1631c.a(j10, jA, j10 == jA);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            super.write(data, i10, i11);
            this.f1633a += (long) i11;
            a();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            super.write(i10);
            this.f1633a++;
            a();
        }
    }
}
