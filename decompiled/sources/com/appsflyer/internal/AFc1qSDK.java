package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public final class AFc1qSDK extends ThreadPoolExecutor implements AutoCloseable {

    @NotNull
    private final Queue<Runnable> getMediationNetwork;

    public /* synthetic */ AFc1qSDK(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, timeUnit, blockingQueue, (i12 & 32) != 0 ? new ConcurrentLinkedQueue() : queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    private final void getCurrencyIso4217Code() {
        synchronized (this) {
            try {
                int size = this.getMediationNetwork.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Runnable runnablePoll = this.getMediationNetwork.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    execute(runnablePoll);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(@NotNull Runnable runnable, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(runnable, "");
        super.afterExecute(runnable, th);
        Intrinsics.checkNotNullParameter(runnable, "");
        if (th == null) {
            try {
                getCurrencyIso4217Code();
                return;
            } catch (Throwable th2) {
                AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing rejected tasks", th2, true, true, true, false, 64, null);
                return;
            }
        }
        AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing task: " + runnable, th, true, true, true, false, 64, null);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p131n0.d.a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFc1qSDK(int i10, int i11, long j10, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i10, i11, j10, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.q
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFc1qSDK.AFAdRevenueData(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.getMediationNetwork = queue;
    }
}
