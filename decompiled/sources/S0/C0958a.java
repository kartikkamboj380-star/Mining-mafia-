package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: S0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5355b;

    public C0958a(String workSpecId, String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f5354a = workSpecId;
        this.f5355b = prerequisiteId;
    }

    public final String a() {
        return this.f5355b;
    }

    public final String b() {
        return this.f5354a;
    }
}
