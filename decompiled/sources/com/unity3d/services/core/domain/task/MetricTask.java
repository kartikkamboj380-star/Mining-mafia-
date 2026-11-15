package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;
import p169q8.b;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;

    @NotNull
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        this.taskStatus = m.g(obj) ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        Intrinsics.checkNotNullExpressionValue(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", F.b(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m98invokegIAlus$suspendImpl(MetricTask<? super P, R> metricTask, P p10, b bVar) {
        MetricTask$invoke$1 metricTask$invoke$1;
        long jNanoTime;
        MetricTask<? super P, R> metricTask2;
        E e10;
        TimeUnit timeUnit;
        Object objI;
        E e11;
        if (bVar instanceof MetricTask$invoke$1) {
            metricTask$invoke$1 = (MetricTask$invoke$1) bVar;
            int i10 = metricTask$invoke$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                metricTask$invoke$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, bVar);
            }
        } else {
            metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, bVar);
        }
        Object obj = metricTask$invoke$1.result;
        Object objE = p179r8.b.e();
        int i11 = metricTask$invoke$1.label;
        if (i11 == 0) {
            n.b(obj);
            E e12 = new E();
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jNanoTime = System.nanoTime();
            metricTask$invoke$1.L$0 = metricTask;
            metricTask$invoke$1.L$1 = e12;
            metricTask$invoke$1.L$2 = e12;
            metricTask$invoke$1.L$3 = metricTask;
            metricTask$invoke$1.L$4 = timeUnit2;
            metricTask$invoke$1.J$0 = jNanoTime;
            metricTask$invoke$1.label = 1;
            Object objM82invokegIAlus = BaseTask.DefaultImpls.m82invokegIAlus(metricTask, p10, metricTask$invoke$1);
            if (objM82invokegIAlus == objE) {
                return objE;
            }
            metricTask2 = metricTask;
            e10 = e12;
            timeUnit = timeUnit2;
            objI = objM82invokegIAlus;
            e11 = e10;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = metricTask$invoke$1.J$0;
            timeUnit = (TimeUnit) metricTask$invoke$1.L$4;
            MetricTask<? super P, R> metricTask3 = (MetricTask) metricTask$invoke$1.L$3;
            e10 = (E) metricTask$invoke$1.L$2;
            E e13 = (E) metricTask$invoke$1.L$1;
            metricTask2 = (MetricTask) metricTask$invoke$1.L$0;
            n.b(obj);
            objI = ((m) obj).i();
            e11 = e13;
            jNanoTime = j10;
            metricTask = metricTask3;
        }
        e10.f45973a = objI;
        Unit unit = Unit.f45918a;
        ((MetricTask) metricTask).duration = timeUnit.toMillis(System.nanoTime() - jNanoTime);
        metricTask2.captureMetric(e11.f45973a);
        return e11.f45973a;
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public String getMetricName() {
        return null;
    }

    @NotNull
    public final String getMetricNameForInitializeTask(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "native_" + name + "_task_" + this.taskStatus + "_time";
    }

    @Nullable
    public final String getMetricNameForTask(@NotNull Object task) {
        Intrinsics.checkNotNullParameter(task, "task");
        String className = task.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        if (className.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(className, "className");
        String strSubstring = className.substring(getStatePrefixLength());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        StringBuilder sb = new StringBuilder(lowerCase.length() + 13);
        sb.append("native_");
        sb.append(lowerCase);
        sb.append("_state");
        return sb.toString();
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: invoke-gIAlu-s */
    public Object mo81invokegIAlus(@NotNull P p10, @NotNull b bVar) {
        return m98invokegIAlus$suspendImpl(this, p10, bVar);
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setTaskStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskStatus = str;
    }
}
