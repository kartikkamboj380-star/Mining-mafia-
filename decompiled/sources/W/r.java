package W;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f6428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable finalException) {
        super(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f6428b = finalException;
    }

    public final Throwable b() {
        return this.f6428b;
    }
}
