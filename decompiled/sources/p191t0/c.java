package p191t0;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
        super(measurementManager);
    }
}
