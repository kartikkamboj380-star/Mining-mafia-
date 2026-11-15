package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: K0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754g extends p231x0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0754g f2475c = new C0754g();

    private C0754g() {
        super(12, 13);
    }

    @Override // p231x0.b
    public void a(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.p("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db.p("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
