package com.facebook.react.bridge.queue;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ReactQueueConfigurationImpl implements ReactQueueConfiguration {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final MessageQueueThreadImpl jsQueueThread;

    @NotNull
    private final MessageQueueThreadImpl nativeModulesQueueThread;

    @NotNull
    private final MessageQueueThreadImpl uiQueueThread;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReactQueueConfigurationImpl create(@NotNull ReactQueueConfigurationSpec spec, @NotNull QueueThreadExceptionHandler exceptionHandler) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            MessageQueueThreadImpl.Companion companion = MessageQueueThreadImpl.Companion;
            return new ReactQueueConfigurationImpl(companion.create(MessageQueueThreadSpec.Companion.mainThreadSpec(), exceptionHandler), companion.create(spec.getNativeModulesQueueThreadSpec(), exceptionHandler), companion.create(spec.getJSQueueThreadSpec(), exceptionHandler), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageQueueThreadImpl, messageQueueThreadImpl2, messageQueueThreadImpl3);
    }

    @NotNull
    public static final ReactQueueConfigurationImpl create(@NotNull ReactQueueConfigurationSpec reactQueueConfigurationSpec, @NotNull QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return Companion.create(reactQueueConfigurationSpec, queueThreadExceptionHandler);
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public void destroy() {
        if (!Intrinsics.b(this.nativeModulesQueueThread.getLooper(), Looper.getMainLooper())) {
            this.nativeModulesQueueThread.quitSynchronous();
        }
        if (Intrinsics.b(this.jsQueueThread.getLooper(), Looper.getMainLooper())) {
            return;
        }
        this.jsQueueThread.quitSynchronous();
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    @NotNull
    public MessageQueueThread getJSQueueThread() {
        return this.jsQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    @NotNull
    public MessageQueueThread getNativeModulesQueueThread() {
        return this.nativeModulesQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    @NotNull
    public MessageQueueThread getUIQueueThread() {
        return this.uiQueueThread;
    }

    private ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3) {
        this.uiQueueThread = messageQueueThreadImpl;
        this.nativeModulesQueueThread = messageQueueThreadImpl2;
        this.jsQueueThread = messageQueueThreadImpl3;
    }
}
