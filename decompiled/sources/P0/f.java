package P0;

import S0.u;
import androidx.work.q;
import androidx.work.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4652f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f4653g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String strI = q.i("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f4653g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Q0.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // P0.c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f5402j.d() == r.NOT_ROAMING;
    }

    @Override // P0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(O0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a() && value.c()) ? false : true;
    }
}
