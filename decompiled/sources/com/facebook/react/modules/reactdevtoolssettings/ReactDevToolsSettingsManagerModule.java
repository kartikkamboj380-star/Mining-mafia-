package com.facebook.react.modules.reactdevtoolssettings;

import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
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
@p234x3.a(name = "ReactDevToolsSettingsManager")
@Metadata
public final class ReactDevToolsSettingsManagerModule extends NativeReactDevToolsSettingsManagerSpec {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String KEY_HOOK_SETTINGS = "HookSettings";

    @NotNull
    public static final String NAME = "ReactDevToolsSettingsManager";

    @NotNull
    private static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";

    @NotNull
    private final SharedPreferences sharedPreferences;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactDevToolsSettingsManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        SharedPreferences sharedPreferences = reactContext.getSharedPreferences(SHARED_PREFERENCES_PREFIX, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec
    @Nullable
    public String getGlobalHookSettings() {
        return this.sharedPreferences.getString(KEY_HOOK_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec
    public void setGlobalHookSettings(@NotNull String settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.sharedPreferences.edit().putString(KEY_HOOK_SETTINGS, settings).apply();
    }
}
