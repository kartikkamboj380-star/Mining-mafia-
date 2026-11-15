package B0;

import A0.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f180a;

    public g(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f180a = delegate;
    }

    @Override // A0.i
    public void B0(int i10, long j10) {
        this.f180a.bindLong(i10, j10);
    }

    @Override // A0.i
    public void F0(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f180a.bindBlob(i10, value);
    }

    @Override // A0.i
    public void S0(int i10) {
        this.f180a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f180a.close();
    }

    @Override // A0.i
    public void r0(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f180a.bindString(i10, value);
    }

    @Override // A0.i
    public void t(int i10, double d10) {
        this.f180a.bindDouble(i10, d10);
    }
}
