package com.facebook.react.bridge;

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
public final class CallbackImpl implements Callback {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int callbackId;
    private boolean invoked;

    @NotNull
    private final JSInstance jsInstance;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        p064g3.b.a("CallbackImpl", p064g3.a.ERROR);
    }

    public CallbackImpl(@NotNull JSInstance jsInstance, int i10) {
        Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
        this.jsInstance = jsInstance;
        this.callbackId = i10;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(@NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (this.invoked) {
            throw new RuntimeException("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
        }
        JSInstance jSInstance = this.jsInstance;
        int i10 = this.callbackId;
        WritableNativeArray writableNativeArrayFromJavaArgs = Arguments.fromJavaArgs(args);
        Intrinsics.checkNotNullExpressionValue(writableNativeArrayFromJavaArgs, "fromJavaArgs(...)");
        jSInstance.invokeCallback(i10, writableNativeArrayFromJavaArgs);
        this.invoked = true;
    }
}
