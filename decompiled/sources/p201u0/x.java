package p201u0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends F {
    /* JADX WARN: Illegal instructions before constructor call */
    public x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        Intrinsics.checkNotNullExpressionValue(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // p201u0.F
    public GetTopicsRequest c(C7136b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return g.f49762a.a(request);
    }
}
