package p032d1;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import r9.C7105h;
import r9.a0;
import r9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f42916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f42917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42918c;

    public d(a0 a0Var, Function1 function1) {
        this.f42916a = a0Var;
        this.f42917b = function1;
    }

    @Override // r9.a0
    public void W0(C7105h c7105h, long j10) throws EOFException {
        if (this.f42918c) {
            c7105h.skip(j10);
            return;
        }
        try {
            this.f42916a.W0(c7105h, j10);
        } catch (IOException e10) {
            this.f42918c = true;
            this.f42917b.invoke(e10);
        }
    }

    @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f42916a.close();
        } catch (IOException e10) {
            this.f42918c = true;
            this.f42917b.invoke(e10);
        }
    }

    @Override // r9.a0, java.io.Flushable
    public void flush() {
        try {
            this.f42916a.flush();
        } catch (IOException e10) {
            this.f42918c = true;
            this.f42917b.invoke(e10);
        }
    }

    @Override // r9.a0
    public d0 i() {
        return this.f42916a.i();
    }
}
