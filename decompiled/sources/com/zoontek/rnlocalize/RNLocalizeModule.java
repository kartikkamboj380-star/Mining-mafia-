package com.zoontek.rnlocalize;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p059f8.i;
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
@a(name = NativeRNLocalizeSpec.NAME)
@Metadata
public final class RNLocalizeModule extends NativeRNLocalizeSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNLocalizeModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public String getCalendar() {
        return i.f43757a.b();
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public String getCountry() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.c(reactApplicationContext);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public WritableArray getCurrencies() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.e(reactApplicationContext);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public WritableArray getLocales() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.h(reactApplicationContext);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NativeRNLocalizeSpec.NAME;
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public WritableMap getNumberFormatSettings() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.j(reactApplicationContext);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public String getTemperatureUnit() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.n(reactApplicationContext);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public String getTimeZone() {
        return i.f43757a.o();
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    public void openAppLanguageSettings(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        iVar.p(reactApplicationContext, promise);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    public boolean uses24HourClock() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.q(reactApplicationContext);
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public Boolean usesAutoDateAndTime() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return Boolean.valueOf(iVar.r(reactApplicationContext));
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    @NotNull
    public Boolean usesAutoTimeZone() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return Boolean.valueOf(iVar.s(reactApplicationContext));
    }

    @Override // com.zoontek.rnlocalize.NativeRNLocalizeSpec
    public boolean usesMetricSystem() {
        i iVar = i.f43757a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return iVar.t(reactApplicationContext);
    }
}
