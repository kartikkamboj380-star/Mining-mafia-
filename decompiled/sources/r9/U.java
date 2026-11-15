package r9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7107j f48394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7105h f48395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X f48396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f48399f;

    public U(InterfaceC7107j upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f48394a = upstream;
        C7105h c7105hG = upstream.g();
        this.f48395b = c7105hG;
        X x10 = c7105hG.f48456a;
        this.f48396c = x10;
        this.f48397d = x10 != null ? x10.f48410b : -1;
    }

    @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48398e = true;
    }

    @Override // r9.c0
    public d0 i() {
        return this.f48394a.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f48410b) goto L15;
     */
    @Override // r9.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s(r9.C7105h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f48398e
            if (r3 != 0) goto L6c
            r9.X r3 = r8.f48396c
            if (r3 == 0) goto L2b
            r9.h r4 = r8.f48395b
            r9.X r4 = r4.f48456a
            if (r3 != r4) goto L23
            int r3 = r8.f48397d
            kotlin.jvm.internal.Intrinsics.c(r4)
            int r4 = r4.f48410b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            r9.j r0 = r8.f48394a
            long r1 = r8.f48399f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.P(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            r9.X r0 = r8.f48396c
            if (r0 != 0) goto L51
            r9.h r0 = r8.f48395b
            r9.X r0 = r0.f48456a
            if (r0 == 0) goto L51
            r8.f48396c = r0
            kotlin.jvm.internal.Intrinsics.c(r0)
            int r0 = r0.f48410b
            r8.f48397d = r0
        L51:
            r9.h r0 = r8.f48395b
            long r0 = r0.size()
            long r2 = r8.f48399f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            r9.h r2 = r8.f48395b
            long r4 = r8.f48399f
            r3 = r9
            r2.G(r3, r4, r6)
            long r9 = r8.f48399f
            long r9 = r9 + r6
            r8.f48399f = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.U.s(r9.h, long):long");
    }
}
