package p201u0;

import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f49762a = new g();

    private g() {
    }

    public final GetTopicsRequest a(C7136b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC7137c.a().setAdsSdkName(request.a()).setShouldRecordObservation(request.b()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final GetTopicsRequest b(C7136b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC7137c.a().setAdsSdkName(request.a()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}
