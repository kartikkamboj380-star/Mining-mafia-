package com.zoontek.rnbootsplash;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
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
    */
/* JADX INFO: loaded from: classes3.dex */
@p234x3.a(name = NativeRNBootSplashSpec.NAME)
@Metadata
public final class RNBootSplashModule extends NativeRNBootSplashSpec implements LifecycleEventListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNBootSplashModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(this);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NativeRNBootSplashSpec.NAME;
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    @NotNull
    protected Map<String, Object> getTypedExportedConstants() {
        s sVar = s.f42840a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return sVar.k(reactApplicationContext);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    public void hide(boolean z9, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        s sVar = s.f42840a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        sVar.l(reactApplicationContext, z9, promise);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    public void isVisible(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        s.f42840a.w(promise);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        s.f42840a.x();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
