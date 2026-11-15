package K0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2418c = context;
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        T0.q.c(this.f2418c, db);
        T0.l.c(this.f2418c, db);
    }
}
