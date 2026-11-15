package p201u0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class A extends F {
    /* JADX WARN: Illegal instructions before constructor call */
    public A(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) y.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(z.a(systemService));
    }

    @Override // p201u0.F
    public GetTopicsRequest c(C7136b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return g.f49762a.a(request);
    }

    @Override // p201u0.F
    public h d(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return s.f49765a.b(response);
    }
}
