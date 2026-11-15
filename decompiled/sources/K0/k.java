package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f2479c = new k();

    private k() {
        super(4, 5);
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db.p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
