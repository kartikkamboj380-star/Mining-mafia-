package S2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5485b;

    public f(boolean z9, boolean z10) {
        this.f5484a = z9;
        this.f5485b = z10;
    }

    public final boolean a() {
        return this.f5484a;
    }

    public final boolean b() {
        return this.f5485b;
    }

    public /* synthetic */ f(boolean z9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10);
    }
}
