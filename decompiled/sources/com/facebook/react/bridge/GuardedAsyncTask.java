package com.facebook.react.bridge;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.concurrent.Executor;
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
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Executor THREAD_POOL_EXECUTOR;

    @NotNull
    private final JSExceptionHandler exceptionHandler;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Executor THREAD_POOL_EXECUTOR2 = AsyncTask.THREAD_POOL_EXECUTOR;
        Intrinsics.checkNotNullExpressionValue(THREAD_POOL_EXECUTOR2, "THREAD_POOL_EXECUTOR");
        THREAD_POOL_EXECUTOR = THREAD_POOL_EXECUTOR2;
    }

    protected GuardedAsyncTask(@NotNull JSExceptionHandler exceptionHandler) {
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        this.exceptionHandler = exceptionHandler;
    }

    protected abstract void doInBackgroundGuarded(@NotNull Params... paramsArr);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    @Nullable
    public final Void doInBackground(@NotNull Params... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            doInBackgroundGuarded(Arrays.copyOf(params, params.length));
            return null;
        } catch (RuntimeException e10) {
            this.exceptionHandler.handleException(e10);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected GuardedAsyncTask(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        Intrinsics.checkNotNullExpressionValue(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
