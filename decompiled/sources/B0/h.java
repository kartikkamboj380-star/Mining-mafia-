package B0;

import A0.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f181b = delegate;
    }

    @Override // A0.k
    public long l0() {
        return this.f181b.executeInsert();
    }

    @Override // A0.k
    public int r() {
        return this.f181b.executeUpdateDelete();
    }
}
