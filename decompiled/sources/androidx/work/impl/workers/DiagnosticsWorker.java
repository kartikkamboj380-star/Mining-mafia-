package androidx.work.impl.workers;

import K0.C;
import S0.j;
import S0.o;
import S0.v;
import S0.z;
import V0.d;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.q;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
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
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public p.a doWork() {
        C cQ = C.q(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(cQ, "getInstance(applicationContext)");
        WorkDatabase workDatabaseV = cQ.v();
        Intrinsics.checkNotNullExpressionValue(workDatabaseV, "workManager.workDatabase");
        v vVarJ = workDatabaseV.j();
        o oVarH = workDatabaseV.h();
        z zVarK = workDatabaseV.k();
        j jVarG = workDatabaseV.g();
        List listD = vVarJ.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listU = vVarJ.u();
        List listN = vVarJ.n(TTAdConstant.MATE_VALID);
        if (!listD.isEmpty()) {
            q.e().f(d.f6073a, "Recently completed work:\n\n");
            q.e().f(d.f6073a, d.d(oVarH, zVarK, jVarG, listD));
        }
        if (!listU.isEmpty()) {
            q.e().f(d.f6073a, "Running work:\n\n");
            q.e().f(d.f6073a, d.d(oVarH, zVarK, jVarG, listU));
        }
        if (!listN.isEmpty()) {
            q.e().f(d.f6073a, "Enqueued work:\n\n");
            q.e().f(d.f6073a, d.d(oVarH, zVarK, jVarG, listN));
        }
        p.a aVarC = p.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success()");
        return aVarC;
    }
}
