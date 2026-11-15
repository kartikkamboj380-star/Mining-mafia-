package T0;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f5589a;

    public k(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f5589a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Integer.valueOf(l.d(this$0.f5589a, "next_alarm_manager_id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(k this$0, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iD = l.d(this$0.f5589a, "next_job_scheduler_id");
        if (i10 > iD || iD > i11) {
            l.e(this$0.f5589a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = iD;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object objRunInTransaction = this.f5589a.runInTransaction((Callable<Object>) new Callable() { // from class: T0.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.d(this.f5585a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object objRunInTransaction = this.f5589a.runInTransaction((Callable<Object>) new Callable() { // from class: T0.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.f(this.f5586a, i10, i11);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objRunInTransaction).intValue();
    }
}
