package P0;

import S0.u;
import android.os.Build;
import androidx.work.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Q0.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // P0.c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        r rVarD = workSpec.f5402j.d();
        if (rVarD != r.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && rVarD == r.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // P0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(O0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return !value.a() || value.b();
    }
}
