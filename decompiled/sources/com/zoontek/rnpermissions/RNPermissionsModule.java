package com.zoontek.rnpermissions;

import D3.g;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069g8.d;
import p234x3.a;

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
@a(name = NativeRNPermissionsSpec.NAME)
@Metadata
public final class RNPermissionsModule extends NativeRNPermissionsSpec implements g {

    @NotNull
    private final SparseArray<Callback> callbacks;

    public RNPermissionsModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void canScheduleExactAlarms(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.c(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void canUseFullScreenIntent(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.d(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void check(@NotNull String permission, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.e(reactApplicationContext, permission, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void checkLocationAccuracy(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        d.f44432a.f(promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void checkMultiple(@NotNull ReadableArray permissions, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.g(reactApplicationContext, permissions, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void checkNotifications(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.h(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NativeRNPermissionsSpec.NAME;
    }

    @Override // D3.g
    public boolean onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return dVar.k(reactApplicationContext, this.callbacks, i10, grantResults);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void openPhotoPicker(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        d.f44432a.l(promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void openSettings(@Nullable String str, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.m(reactApplicationContext, str, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void request(@NotNull String permission, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.n(reactApplicationContext, this, this.callbacks, permission, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void requestLocationAccuracy(@NotNull String purposeKey, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(purposeKey, "purposeKey");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d.f44432a.p(promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void requestMultiple(@NotNull ReadableArray permissions, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.q(reactApplicationContext, this, this.callbacks, permissions, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void requestNotifications(@NotNull ReadableArray options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.s(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnpermissions.NativeRNPermissionsSpec
    public void shouldShowRequestRationale(@NotNull String permission, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        d dVar = d.f44432a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.t(reactApplicationContext, permission, promise);
    }
}
