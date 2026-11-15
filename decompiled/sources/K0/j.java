package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f2478c = new j();

    private j() {
        super(3, 4);
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
