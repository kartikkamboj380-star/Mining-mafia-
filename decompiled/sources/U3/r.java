package U3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f5999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f6000b;

    public r(Integer num, Float f10) {
        this.f5999a = num;
        this.f6000b = f10;
    }

    public final Integer a() {
        return this.f5999a;
    }

    public final Float b() {
        return this.f6000b;
    }

    public final void c(Integer num) {
        this.f5999a = num;
    }

    public /* synthetic */ r(Integer num, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : f10);
    }
}
