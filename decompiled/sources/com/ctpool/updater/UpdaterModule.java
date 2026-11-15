package com.ctpool.updater;

import Q1.e;
import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
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
public final class UpdaterModule extends ReactContextBaseJavaModule {

    @NotNull
    private final a activityEventListener;

    @Nullable
    private e updater;

    public static final class a extends BaseActivityEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            e eVar = UpdaterModule.this.updater;
            if (eVar != null) {
                eVar.e(activity, i10, i11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdaterModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.updater = new e(context);
        a aVar = new a();
        this.activityEventListener = aVar;
        context.addActivityEventListener(aVar);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "UpdaterModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        this.updater = null;
    }

    @ReactMethod
    public final void requestUpdateInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        e eVar = this.updater;
        if (eVar == null) {
            promise.reject("Missing updater");
            return;
        }
        try {
            eVar.g(promise);
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @ReactMethod
    public final void startUpdate(boolean z9, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("Missing activity");
            return;
        }
        e eVar = this.updater;
        if (eVar == null) {
            promise.reject("Missing updater");
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(eVar.k(z9, currentActivity)));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }
}
