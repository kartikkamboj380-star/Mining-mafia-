package K0;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: K0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0749b implements p231x0.a {
    @Override // p231x0.a
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db.D0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
