package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5377b;

    public n(String name, String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f5376a = name;
        this.f5377b = workSpecId;
    }

    public final String a() {
        return this.f5376a;
    }

    public final String b() {
        return this.f5377b;
    }
}
