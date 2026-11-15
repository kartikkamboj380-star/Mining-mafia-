package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.e f5382b;

    public q(String workSpecId, androidx.work.e progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f5381a = workSpecId;
        this.f5382b = progress;
    }

    public final androidx.work.e a() {
        return this.f5382b;
    }

    public final String b() {
        return this.f5381a;
    }
}
