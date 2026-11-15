package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f2482c = new n();

    private n() {
        super(8, 9);
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
