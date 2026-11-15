package com.facebook.react.modules.devtoolsruntimesettings;

import com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
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
@DoNotStripAny
@p234x3.a(name = "ReactDevToolsRuntimeSettingsModule")
@Metadata
public final class ReactDevToolsRuntimeSettingsModule extends NativeReactDevToolsRuntimeSettingsModuleSpec {

    @NotNull
    public static final String NAME = "ReactDevToolsRuntimeSettingsModule";

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final com.facebook.react.modules.devtoolsruntimesettings.a settings = new com.facebook.react.modules.devtoolsruntimesettings.a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ReactDevToolsRuntimeSettingsModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec
    @NotNull
    public WritableMap getReloadAndProfileConfig() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        com.facebook.react.modules.devtoolsruntimesettings.a aVar = settings;
        writableMapCreateMap.putBoolean("shouldReloadAndProfile", aVar.b());
        writableMapCreateMap.putBoolean("recordChangeDescriptions", aVar.a());
        return writableMapCreateMap;
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec
    public void setReloadAndProfileConfig(@NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.hasKey("shouldReloadAndProfile")) {
            settings.d(map.getBoolean("shouldReloadAndProfile"));
        }
        if (map.hasKey("recordChangeDescriptions")) {
            settings.c(map.getBoolean("recordChangeDescriptions"));
        }
    }
}
