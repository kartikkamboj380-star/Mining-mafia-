package com.facebook.react.bridge.queue;

import kotlin.Metadata;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ReactQueueConfigurationSpec {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final MessageQueueThreadSpec jSQueueThreadSpec;

    @NotNull
    private final MessageQueueThreadSpec nativeModulesQueueThreadSpec;

    @Metadata
    public static final class Builder {

        @Nullable
        private MessageQueueThreadSpec jsQueueSpec;

        @Nullable
        private MessageQueueThreadSpec nativeModulesQueueSpec;

        @NotNull
        public final ReactQueueConfigurationSpec build() {
            MessageQueueThreadSpec messageQueueThreadSpec = this.nativeModulesQueueSpec;
            if (messageQueueThreadSpec == null) {
                throw new IllegalStateException("Required value was null.");
            }
            MessageQueueThreadSpec messageQueueThreadSpec2 = this.jsQueueSpec;
            if (messageQueueThreadSpec2 != null) {
                return new ReactQueueConfigurationSpec(messageQueueThreadSpec, messageQueueThreadSpec2);
            }
            throw new IllegalStateException("Required value was null.");
        }

        @NotNull
        public final Builder setJSQueueThreadSpec(@Nullable MessageQueueThreadSpec messageQueueThreadSpec) {
            if (this.jsQueueSpec != null) {
                throw new IllegalStateException("Setting JS queue multiple times!");
            }
            this.jsQueueSpec = messageQueueThreadSpec;
            return this;
        }

        @NotNull
        public final Builder setNativeModulesQueueThreadSpec(@Nullable MessageQueueThreadSpec messageQueueThreadSpec) {
            if (this.nativeModulesQueueSpec != null) {
                throw new IllegalStateException("Setting native modules queue spec multiple times!");
            }
            this.nativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        @NotNull
        public final ReactQueueConfigurationSpec createDefault() {
            MessageQueueThreadSpec.Companion companion = MessageQueueThreadSpec.Companion;
            return new ReactQueueConfigurationSpec(companion.newBackgroundThreadSpec("native_modules"), companion.newBackgroundThreadSpec("js"));
        }

        private Companion() {
        }
    }

    public ReactQueueConfigurationSpec(@NotNull MessageQueueThreadSpec nativeModulesQueueThreadSpec, @NotNull MessageQueueThreadSpec jSQueueThreadSpec) {
        Intrinsics.checkNotNullParameter(nativeModulesQueueThreadSpec, "nativeModulesQueueThreadSpec");
        Intrinsics.checkNotNullParameter(jSQueueThreadSpec, "jSQueueThreadSpec");
        this.nativeModulesQueueThreadSpec = nativeModulesQueueThreadSpec;
        this.jSQueueThreadSpec = jSQueueThreadSpec;
    }

    @NotNull
    public static final ReactQueueConfigurationSpec createDefault() {
        return Companion.createDefault();
    }

    @NotNull
    public final MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.jSQueueThreadSpec;
    }

    @NotNull
    public final MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.nativeModulesQueueThreadSpec;
    }
}
