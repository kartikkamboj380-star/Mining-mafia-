package com.facebook.react.bridge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@p024c3.a
@Metadata
public final class ReactSoftExceptionLogger {

    @NotNull
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();

    @NotNull
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    @Metadata
    public static final class Categories {

        @NotNull
        public static final String CLIPPING_PROHIBITED_VIEW = "ReactClippingProhibitedView";

        @NotNull
        public static final Categories INSTANCE = new Categories();

        @NotNull
        public static final String RVG_IS_VIEW_CLIPPED = "ReactViewGroup.isViewClipped";

        @NotNull
        public static final String RVG_ON_VIEW_REMOVED = "ReactViewGroup.onViewRemoved";

        @NotNull
        public static final String SOFT_ASSERTIONS = "SoftAssertions";

        @NotNull
        public static final String SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE = "SurfaceMountingManager:MissingViewState";

        private Categories() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    public @interface CategoryMode {
    }

    @Metadata
    public interface ReactSoftExceptionListener {
        void logSoftException(@NotNull String str, @NotNull Throwable th);
    }

    private ReactSoftExceptionLogger() {
    }

    public static final void addListener(@NotNull ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @p024c3.a
    private static final void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    public static final void logSoftException(@NotNull String category, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.isEmpty()) {
            Z1.a.n(category, "Unhandled SoftException", cause);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(category, cause);
        }
    }

    public static final void logSoftExceptionVerbose(@NotNull String category, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        logSoftException(category + "|" + cause.getClass().getSimpleName() + ":" + cause.getMessage(), cause);
    }

    public static final void removeListener(@NotNull ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }
}
