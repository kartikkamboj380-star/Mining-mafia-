package q9;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import r9.C7105h;
import r9.C7108k;
import r9.C7109l;
import r9.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7105h f48106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deflater f48107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7109l f48108d;

    public a(boolean z9) {
        this.f48105a = z9;
        C7105h c7105h = new C7105h();
        this.f48106b = c7105h;
        Deflater deflater = new Deflater(-1, true);
        this.f48107c = deflater;
        this.f48108d = new C7109l((a0) c7105h, deflater);
    }

    private final boolean c(C7105h c7105h, C7108k c7108k) {
        return c7105h.m0(c7105h.size() - ((long) c7108k.E()), c7108k);
    }

    public final void a(C7105h buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f48106b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f48105a) {
            this.f48107c.reset();
        }
        this.f48108d.W0(buffer, buffer.size());
        this.f48108d.flush();
        if (c(this.f48106b, b.f48109a)) {
            long size = this.f48106b.size() - ((long) 4);
            C7105h.a aVarG1 = C7105h.g1(this.f48106b, null, 1, null);
            try {
                aVarG1.h(size);
                p229w8.c.a(aVarG1, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p229w8.c.a(aVarG1, th);
                    throw th2;
                }
            }
        } else {
            this.f48106b.writeByte(0);
        }
        C7105h c7105h = this.f48106b;
        buffer.W0(c7105h, c7105h.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f48108d.close();
    }
}
