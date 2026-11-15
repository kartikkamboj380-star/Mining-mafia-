package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: K0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0750c extends androidx.room.u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0750c f2472a = new C0750c();

    private C0750c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.u.b
    public void c(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.c(db);
        db.l();
        try {
            db.p(e());
            db.D();
        } finally {
            db.L();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.f2523a;
    }
}
