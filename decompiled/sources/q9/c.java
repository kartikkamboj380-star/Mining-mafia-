package q9;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import r9.C7105h;
import r9.C7117u;
import r9.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7105h f48111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f48112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7117u f48113d;

    public c(boolean z9) {
        this.f48110a = z9;
        C7105h c7105h = new C7105h();
        this.f48111b = c7105h;
        Inflater inflater = new Inflater(true);
        this.f48112c = inflater;
        this.f48113d = new C7117u((c0) c7105h, inflater);
    }

    public final void a(C7105h buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f48111b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f48110a) {
            this.f48112c.reset();
        }
        this.f48111b.w0(buffer);
        this.f48111b.writeInt(65535);
        long bytesRead = this.f48112c.getBytesRead() + this.f48111b.size();
        do {
            this.f48113d.a(buffer, Long.MAX_VALUE);
        } while (this.f48112c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48113d.close();
    }
}
