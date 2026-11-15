package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.k;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class MessageQueueThreadImpl implements MessageQueueThread {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String assertionErrorMessage;

    @NotNull
    private final MessageQueueThreadHandler handler;
    private volatile boolean isFinished;

    @NotNull
    private final Looper looper;

    @NotNull
    private final String name;

    @Nullable
    private final MessageQueueThreadPerfStats stats;

    @Metadata
    public static final class Companion {

        @Metadata
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assignToPerfStats(MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j10, long j11) {
            if (messageQueueThreadPerfStats != null) {
                messageQueueThreadPerfStats.wallTime = j10;
                messageQueueThreadPerfStats.cpuTime = j11;
            }
        }

        private final MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
            return new MessageQueueThreadImpl(str, mainLooper, queueThreadExceptionHandler, null, 8, null);
        }

        private final MessageQueueThreadImpl startNewBackgroundThread(String str, long j10, QueueThreadExceptionHandler queueThreadExceptionHandler) {
            Looper looper;
            final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
            new Thread(null, new Runnable() { // from class: com.facebook.react.bridge.queue.c
                @Override // java.lang.Runnable
                public final void run() {
                    MessageQueueThreadImpl.Companion.startNewBackgroundThread$lambda$1(simpleSettableFuture);
                }
            }, "mqt_" + str, j10).start();
            Pair pair = (Pair) simpleSettableFuture.b();
            if (pair == null || (looper = (Looper) pair.first) == null) {
                throw new RuntimeException("Looper not found for thread");
            }
            return new MessageQueueThreadImpl(str, looper, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startNewBackgroundThread$lambda$1(SimpleSettableFuture simpleSettableFuture) {
            Process.setThreadPriority(-4);
            Looper.prepare();
            MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
            MessageQueueThreadImpl.Companion.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            simpleSettableFuture.c(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
            Looper.loop();
        }

        @NotNull
        public final MessageQueueThreadImpl create(@NotNull MessageQueueThreadSpec spec, @NotNull QueueThreadExceptionHandler exceptionHandler) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            int i10 = WhenMappings.$EnumSwitchMapping$0[spec.getThreadType().ordinal()];
            if (i10 == 1) {
                return createForMainThread(spec.getName(), exceptionHandler);
            }
            if (i10 == 2) {
                return startNewBackgroundThread(spec.getName(), spec.getStackSize(), exceptionHandler);
            }
            throw new k();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler, messageQueueThreadPerfStats);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callOnQueue$lambda$0(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            simpleSettableFuture.c(callable.call());
        } catch (Exception e10) {
            simpleSettableFuture.d(e10);
        }
    }

    @NotNull
    public static final MessageQueueThreadImpl create(@NotNull MessageQueueThreadSpec messageQueueThreadSpec, @NotNull QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return Companion.create(messageQueueThreadSpec, queueThreadExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetPerfStats$lambda$1(MessageQueueThreadImpl messageQueueThreadImpl) {
        Companion.assignToPerfStats(messageQueueThreadImpl.stats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.assertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @NotNull
    public <T> Future<T> callOnQueue(@NotNull final Callable<T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.a
            @Override // java.lang.Runnable
            public final void run() {
                MessageQueueThreadImpl.callOnQueue$lambda$0(simpleSettableFuture, callable);
            }
        });
        return simpleSettableFuture;
    }

    @NotNull
    public final Looper getLooper() {
        return this.looper;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @Nullable
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.stats;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.looper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.looper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        this.isFinished = true;
        this.looper.quit();
        if (this.looper.getThread() != Thread.currentThread()) {
            try {
                this.looper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.name);
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        Companion.assignToPerfStats(this.stats, -1L, -1L);
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.b
            @Override // java.lang.Runnable
            public final void run() {
                MessageQueueThreadImpl.resetPerfStats$lambda$1(this.f14511a);
            }
        });
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (!this.isFinished) {
            this.handler.post(runnable);
            return true;
        }
        Z1.a.I("ReactNative", "Tried to enqueue runnable on already finished thread: '" + this.name + "... dropping Runnable.");
        return false;
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.name = str;
        this.looper = looper;
        this.stats = messageQueueThreadPerfStats;
        this.handler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.assertionErrorMessage = "Expected to be called from the '" + str + "' thread!";
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        boolean zIsOnThread = isOnThread();
        String str = this.assertionErrorMessage + " " + message;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        SoftAssertions.assertCondition(zIsOnThread, str);
    }

    /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler, (i10 & 8) != 0 ? null : messageQueueThreadPerfStats);
    }
}
