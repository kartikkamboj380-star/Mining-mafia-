package Q0;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f4799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f4801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f4802d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, U0.b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    public final h a() {
        return this.f4799a;
    }

    public final c b() {
        return this.f4800b;
    }

    public final h c() {
        return this.f4801c;
    }

    public final h d() {
        return this.f4802d;
    }

    public n(Context context, U0.b taskExecutor, h batteryChargingTracker, c batteryNotLowTracker, h networkStateTracker, h storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f4799a = batteryChargingTracker;
        this.f4800b = batteryNotLowTracker;
        this.f4801c = networkStateTracker;
        this.f4802d = storageNotLowTracker;
    }

    public /* synthetic */ n(Context context, U0.b bVar, h hVar, c cVar, h hVar2, h hVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        h aVar;
        c cVar2;
        h hVarA;
        h lVar;
        if ((i10 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            aVar = new a(applicationContext, bVar);
        } else {
            aVar = hVar;
        }
        if ((i10 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            cVar2 = new c(applicationContext2, bVar);
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            hVarA = k.a(applicationContext3, bVar);
        } else {
            hVarA = hVar2;
        }
        if ((i10 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            lVar = new l(applicationContext4, bVar);
        } else {
            lVar = hVar3;
        }
        this(context, bVar, aVar, cVar2, hVarA, lVar);
    }
}
