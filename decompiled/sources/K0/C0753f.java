package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: K0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753f extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0753f f2474c = new C0753f();

    private C0753f() {
        super(11, 12);
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
