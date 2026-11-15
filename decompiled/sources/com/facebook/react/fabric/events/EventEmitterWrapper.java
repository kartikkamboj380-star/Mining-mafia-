package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.b;
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
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
@SuppressLint({"MissingNativeLoadLibrary"})
public final class EventEmitterWrapper extends HybridClassBase {

    @NotNull
    private static final a Companion = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        b.a();
    }

    private EventEmitterWrapper() {
    }

    private final native void dispatchEvent(String str, NativeMap nativeMap, int i10);

    private final native void dispatchEventSynchronously(String str, NativeMap nativeMap);

    private final native void dispatchUniqueEvent(String str, NativeMap nativeMap);

    public final synchronized void destroy() {
        if (isValid()) {
            resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatch(@NotNull String eventName, @Nullable WritableMap writableMap, int i10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (isValid()) {
            dispatchEvent(eventName, (NativeMap) writableMap, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchEventSynchronously(@NotNull String eventName, @Nullable WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (isValid()) {
            UiThreadUtil.assertOnUiThread();
            dispatchEventSynchronously(eventName, (NativeMap) writableMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchUnique(@NotNull String eventName, @Nullable WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (isValid()) {
            dispatchUniqueEvent(eventName, (NativeMap) writableMap);
        }
    }
}
