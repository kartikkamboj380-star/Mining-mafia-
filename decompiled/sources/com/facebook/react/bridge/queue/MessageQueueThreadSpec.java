package com.facebook.react.bridge.queue;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
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
public final class MessageQueueThreadSpec {
    public static final long DEFAULT_STACK_SIZE_BYTES = 0;

    @NotNull
    private final String name;
    private final long stackSize;

    @NotNull
    private final ThreadType threadType;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final MessageQueueThreadSpec MAIN_UI_SPEC = new MessageQueueThreadSpec(ThreadType.MAIN_UI, "main_ui", 0, 4, null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageQueueThreadSpec mainThreadSpec() {
            return MessageQueueThreadSpec.MAIN_UI_SPEC;
        }

        @NotNull
        public final MessageQueueThreadSpec newBackgroundThreadSpec(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, name, 0L, 4, null);
        }

        @NotNull
        public final MessageQueueThreadSpec newUIBackgroundTreadSpec(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, name, 0L, 4, null);
        }

        private Companion() {
        }

        @NotNull
        public final MessageQueueThreadSpec newBackgroundThreadSpec(@NotNull String name, long j10) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, name, j10, null);
        }
    }

    @Metadata
    public enum ThreadType {
        MAIN_UI,
        NEW_BACKGROUND;

        private static final /* synthetic */ EnumEntries $ENTRIES = p189s8.a.a(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ MessageQueueThreadSpec(ThreadType threadType, String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(threadType, str, j10);
    }

    @NotNull
    public static final MessageQueueThreadSpec mainThreadSpec() {
        return Companion.mainThreadSpec();
    }

    @NotNull
    public static final MessageQueueThreadSpec newBackgroundThreadSpec(@NotNull String str) {
        return Companion.newBackgroundThreadSpec(str);
    }

    @NotNull
    public static final MessageQueueThreadSpec newUIBackgroundTreadSpec(@NotNull String str) {
        return Companion.newUIBackgroundTreadSpec(str);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getStackSize() {
        return this.stackSize;
    }

    @NotNull
    public final ThreadType getThreadType() {
        return this.threadType;
    }

    private MessageQueueThreadSpec(ThreadType threadType, String str, long j10) {
        this.threadType = threadType;
        this.name = str;
        this.stackSize = j10;
    }

    @NotNull
    public static final MessageQueueThreadSpec newBackgroundThreadSpec(@NotNull String str, long j10) {
        return Companion.newBackgroundThreadSpec(str, j10);
    }

    /* synthetic */ MessageQueueThreadSpec(ThreadType threadType, String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(threadType, str, (i10 & 4) != 0 ? 0L : j10);
    }
}
