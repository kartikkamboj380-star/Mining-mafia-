package P0;

import S0.u;
import android.os.Build;
import androidx.work.q;
import androidx.work.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4650f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f4651g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String strI = q.i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f4651g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Q0.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // P0.c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f5402j.d() == r.METERED;
    }

    @Override // P0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(O0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.a() && value.b()) ? false : true;
        }
        q.e().a(f4651g, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.a();
    }
}
