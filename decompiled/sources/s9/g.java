package s9;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import r9.C7105h;
import r9.c0;
import r9.r;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f49370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c0 delegate, long j10, boolean z9) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f49369b = j10;
        this.f49370c = z9;
    }

    private final void c(C7105h c7105h, long j10) throws EOFException {
        C7105h c7105h2 = new C7105h();
        c7105h2.w0(c7105h);
        c7105h.W0(c7105h2, j10);
        c7105h2.h();
    }

    @Override // r9.r, r9.c0
    public long s(C7105h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f49371d;
        long j12 = this.f49369b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f49370c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jS = super.s(sink, j10);
        if (jS != -1) {
            this.f49371d += jS;
        }
        long j14 = this.f49371d;
        long j15 = this.f49369b;
        if ((j14 >= j15 || jS != -1) && j14 <= j15) {
            return jS;
        }
        if (jS > 0 && j14 > j15) {
            c(sink, sink.size() - (this.f49371d - this.f49369b));
        }
        throw new IOException("expected " + this.f49369b + " bytes but got " + this.f49371d);
    }
}
