package com.facebook.react.bridge;

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
@p024c3.a
@Metadata
public final class PromiseImpl implements Promise {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";

    @NotNull
    private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";

    @NotNull
    private static final String ERROR_MAP_KEY_CODE = "code";

    @NotNull
    private static final String ERROR_MAP_KEY_MESSAGE = "message";

    @NotNull
    private static final String ERROR_MAP_KEY_NAME = "name";

    @NotNull
    private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";

    @NotNull
    private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    private static final int ERROR_STACK_FRAME_LIMIT = 50;

    @NotNull
    private static final String STACK_FRAME_KEY_CLASS = "class";

    @NotNull
    private static final String STACK_FRAME_KEY_FILE = "file";

    @NotNull
    private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";

    @NotNull
    private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";

    @Nullable
    private Callback reject;

    @Nullable
    private Callback resolve;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @p024c3.a
    public PromiseImpl(@Nullable Callback callback, @Nullable Callback callback2) {
        this.resolve = callback;
        this.reject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        reject(code, str, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(@Nullable Object obj) {
        Callback callback = this.resolve;
        if (callback != null) {
            callback.invoke(obj);
            this.resolve = null;
            this.reject = null;
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(code, "code");
        reject(code, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable String str, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(code, "code");
        reject(code, str, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        reject(null, null, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(null, null, throwable, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(code, null, null, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable Throwable th, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(code, null, th, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable String str, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(code, str, null, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@Nullable String str, @Nullable String str2, @Nullable Throwable th, @Nullable WritableMap writableMap) {
        if (this.reject == null) {
            this.resolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str == null) {
            writableNativeMap.putString(ERROR_MAP_KEY_CODE, ERROR_DEFAULT_CODE);
        } else {
            writableNativeMap.putString(ERROR_MAP_KEY_CODE, str);
        }
        if (str2 != null) {
            writableNativeMap.putString("message", str2);
        } else if (th == null) {
            writableNativeMap.putString("message", ERROR_DEFAULT_MESSAGE);
        } else {
            String message = th.getMessage();
            if (message == null || message.length() == 0) {
                message = th.getClass().getCanonicalName();
            }
            writableNativeMap.putString("message", message);
        }
        if (writableMap != null) {
            writableNativeMap.putMap(ERROR_MAP_KEY_USER_INFO, writableMap);
        } else {
            writableNativeMap.putNull(ERROR_MAP_KEY_USER_INFO);
        }
        if (th == null) {
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, new WritableNativeArray());
        } else {
            writableNativeMap.putString("name", th.getClass().getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i10 = 0; i10 < stackTrace.length && i10 < 50; i10++) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString(STACK_FRAME_KEY_CLASS, stackTraceElement.getClassName());
                writableNativeMap2.putString(STACK_FRAME_KEY_FILE, stackTraceElement.getFileName());
                writableNativeMap2.putInt(STACK_FRAME_KEY_LINE_NUMBER, stackTraceElement.getLineNumber());
                writableNativeMap2.putString(STACK_FRAME_KEY_METHOD_NAME, stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
            }
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, writableNativeArray);
        }
        Callback callback = this.reject;
        if (callback != null) {
            callback.invoke(writableNativeMap);
        }
        this.resolve = null;
        this.reject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        reject(null, message, null, null);
    }
}
