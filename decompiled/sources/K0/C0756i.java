package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: K0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0756i extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0756i f2477c = new C0756i();

    private C0756i() {
        super(1, 2);
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db.p("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db.p("DROP TABLE IF EXISTS alarmInfo");
        db.p("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
