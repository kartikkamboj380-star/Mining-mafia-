package M2;

import O2.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f3457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, j encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f3457a = encodedImage;
    }

    public final j a() {
        return this.f3457a;
    }
}
