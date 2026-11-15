package T0;

import android.os.Build;
import androidx.work.C1188c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: T0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0963d {
    public static final S0.u a(S0.u workSpec) throws Throwable {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        C1188c c1188c = workSpec.f5402j;
        String str = workSpec.f5395c;
        if (Intrinsics.b(str, ConstraintTrackingWorker.class.getName()) || !(c1188c.f() || c1188c.i())) {
            return workSpec;
        }
        androidx.work.e eVarA = new androidx.work.e.a().c(workSpec.f5397e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        Intrinsics.checkNotNullExpressionValue(eVarA, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return S0.u.e(workSpec, null, null, name, null, eVarA, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048555, null);
    }

    public static final S0.u b(List schedulers, S0.u workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? a(workSpec) : workSpec;
    }
}
