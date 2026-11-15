package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.reactperflogger.NativeModulePerfLogger;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
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
@p024c3.a
@Metadata
public final class TurboModulePerfLogger {

    @NotNull
    public static final TurboModulePerfLogger INSTANCE = new TurboModulePerfLogger();

    @Nullable
    private static NativeModulePerfLogger nativeModulePerfLogger;

    static {
        SoLoader.t("turbomodulejsijni");
    }

    private TurboModulePerfLogger() {
    }

    @p024c3.a
    private final native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger2);

    public static final void moduleCreateCacheHit(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.a(str, i10);
        }
    }

    public static final void moduleCreateConstructEnd(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.b(str, i10);
        }
    }

    public static final void moduleCreateConstructStart(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.c(str, i10);
        }
    }

    public static final void moduleCreateEnd(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.d(str, i10);
        }
    }

    public static final void moduleCreateFail(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.e(str, i10);
        }
    }

    public static final void moduleCreateSetUpEnd(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.f(str, i10);
        }
    }

    public static final void moduleCreateSetUpStart(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.g(str, i10);
        }
    }

    public static final void moduleCreateStart(@Nullable String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.h(str, i10);
        }
    }

    public final void enableLogging(@Nullable NativeModulePerfLogger nativeModulePerfLogger2) {
        if (nativeModulePerfLogger2 != null) {
            nativeModulePerfLogger = nativeModulePerfLogger2;
            jniEnableCppLogging(nativeModulePerfLogger2);
        }
    }
}
