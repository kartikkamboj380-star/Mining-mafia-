package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5443b;

    public y(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f5442a = tag;
        this.f5443b = workSpecId;
    }

    public final String a() {
        return this.f5442a;
    }

    public final String b() {
        return this.f5443b;
    }
}
