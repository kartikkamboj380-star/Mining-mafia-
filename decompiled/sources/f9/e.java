package f9;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r9.AbstractC7114q;
import r9.C7105h;
import r9.a0;

/* JADX INFO: loaded from: classes3.dex */
public class e extends AbstractC7114q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f43840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a0 delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f43840b = onException;
    }

    @Override // r9.AbstractC7114q, r9.a0
    public void W0(C7105h source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f43841c) {
            source.skip(j10);
            return;
        }
        try {
            super.W0(source, j10);
        } catch (IOException e10) {
            this.f43841c = true;
            this.f43840b.invoke(e10);
        }
    }

    @Override // r9.AbstractC7114q, r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f43841c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f43841c = true;
            this.f43840b.invoke(e10);
        }
    }

    @Override // r9.AbstractC7114q, r9.a0, java.io.Flushable
    public void flush() {
        if (this.f43841c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f43841c = true;
            this.f43840b.invoke(e10);
        }
    }
}
