package androidx.work.impl.workers;

import K0.C;
import O0.c;
import O0.e;
import Q0.n;
import S0.u;
import S0.v;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.p;
import androidx.work.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ConstraintTrackingWorker extends p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkerParameters f11399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f11401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f11402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f11403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f11399a = workerParameters;
        this.f11400b = new Object();
        this.f11402d = androidx.work.impl.utils.futures.c.t();
    }

    private final void d() {
        if (this.f11402d.isCancelled()) {
            return;
        }
        String strM = getInputData().m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        q qVarE = q.e();
        Intrinsics.checkNotNullExpressionValue(qVarE, "get()");
        if (strM == null || strM.length() == 0) {
            qVarE.c(V0.c.f6072a, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c future = this.f11402d;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            V0.c.d(future);
            return;
        }
        p pVarB = getWorkerFactory().b(getApplicationContext(), strM, this.f11399a);
        this.f11403e = pVarB;
        if (pVarB == null) {
            qVarE.a(V0.c.f6072a, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c future2 = this.f11402d;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            V0.c.d(future2);
            return;
        }
        C cQ = C.q(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(cQ, "getInstance(applicationContext)");
        v vVarJ = cQ.v().j();
        String string = getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        u uVarJ = vVarJ.j(string);
        if (uVarJ == null) {
            androidx.work.impl.utils.futures.c future3 = this.f11402d;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            V0.c.d(future3);
            return;
        }
        n nVarU = cQ.u();
        Intrinsics.checkNotNullExpressionValue(nVarU, "workManagerImpl.trackers");
        e eVar = new e(nVarU, this);
        eVar.a(CollectionsKt.d(uVarJ));
        String string2 = getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
        if (!eVar.d(string2)) {
            qVarE.a(V0.c.f6072a, "Constraints not met for delegate " + strM + ". Requesting retry.");
            androidx.work.impl.utils.futures.c future4 = this.f11402d;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            V0.c.e(future4);
            return;
        }
        qVarE.a(V0.c.f6072a, "Constraints met for delegate " + strM);
        try {
            p pVar = this.f11403e;
            Intrinsics.c(pVar);
            final com.google.common.util.concurrent.p pVarStartWork = pVar.startWork();
            Intrinsics.checkNotNullExpressionValue(pVarStartWork, "delegate!!.startWork()");
            pVarStartWork.e(new Runnable() { // from class: V0.b
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.e(this.f6070a, pVarStartWork);
                }
            }, getBackgroundExecutor());
        } catch (Throwable th) {
            qVarE.b(V0.c.f6072a, "Delegated worker " + strM + " threw exception in startWork.", th);
            synchronized (this.f11400b) {
                try {
                    if (!this.f11401c) {
                        androidx.work.impl.utils.futures.c future5 = this.f11402d;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        V0.c.d(future5);
                    } else {
                        qVarE.a(V0.c.f6072a, "Constraints were unmet, Retrying.");
                        androidx.work.impl.utils.futures.c future6 = this.f11402d;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        V0.c.e(future6);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ConstraintTrackingWorker this$0, com.google.common.util.concurrent.p innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.f11400b) {
            try {
                if (this$0.f11401c) {
                    androidx.work.impl.utils.futures.c future = this$0.f11402d;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    V0.c.e(future);
                } else {
                    this$0.f11402d.r(innerFuture);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d();
    }

    @Override // O0.c
    public void b(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        q.e().a(V0.c.f6072a, "Constraints changed for " + workSpecs);
        synchronized (this.f11400b) {
            this.f11401c = true;
            Unit unit = Unit.f45918a;
        }
    }

    @Override // O0.c
    public void f(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // androidx.work.p
    public void onStopped() {
        super.onStopped();
        p pVar = this.f11403e;
        if (pVar == null || pVar.isStopped()) {
            return;
        }
        pVar.stop();
    }

    @Override // androidx.work.p
    public com.google.common.util.concurrent.p startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: V0.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.g(this.f6069a);
            }
        });
        androidx.work.impl.utils.futures.c future = this.f11402d;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
