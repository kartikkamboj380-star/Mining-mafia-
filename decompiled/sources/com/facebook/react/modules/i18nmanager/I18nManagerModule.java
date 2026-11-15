package com.facebook.react.modules.i18nmanager;

import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.q;

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
@p234x3.a(name = "I18nManager")
@Metadata
public final class I18nManagerModule extends NativeI18nManagerSpec {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String NAME = "I18nManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public I18nManagerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z9) {
        com.facebook.react.modules.i18nmanager.a aVarA = com.facebook.react.modules.i18nmanager.a.f14969a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        aVarA.b(reactApplicationContext, z9);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z9) {
        com.facebook.react.modules.i18nmanager.a aVarA = com.facebook.react.modules.i18nmanager.a.f14969a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        aVarA.e(reactApplicationContext, z9);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    @NotNull
    protected Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        Locale locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        com.facebook.react.modules.i18nmanager.a.C0342a c0342a = com.facebook.react.modules.i18nmanager.a.f14969a;
        return E.j(q.a("isRTL", Boolean.valueOf(c0342a.a().i(reactApplicationContext))), q.a("doLeftAndRightSwapInRTL", Boolean.valueOf(c0342a.a().d(reactApplicationContext))), q.a("localeIdentifier", locale.toString()));
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z9) {
        com.facebook.react.modules.i18nmanager.a aVarA = com.facebook.react.modules.i18nmanager.a.f14969a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        aVarA.m(reactApplicationContext, z9);
    }
}
