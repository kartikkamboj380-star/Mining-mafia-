package com.facebook.react.bridge;

import javax.inject.Provider;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ModuleSpec {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "ModuleSpec";

    @Nullable
    private final String name;

    @NotNull
    private final Provider provider;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ModuleSpec nativeModuleSpec(@NotNull Class<? extends NativeModule> type, @NotNull Provider provider) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(provider, "provider");
            p234x3.a aVar = (p234x3.a) type.getAnnotation(p234x3.a.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (aVar != null) {
                return new ModuleSpec(provider, aVar.name(), defaultConstructorMarker);
            }
            Z1.a.I(ModuleSpec.TAG, "Could not find @ReactModule annotation on " + type.getName() + ". Creating the module eagerly to get the name. Consider adding the annotation.");
            Object obj = provider.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new ModuleSpec(provider, ((NativeModule) obj).getName(), defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ModuleSpec viewManagerSpec(@NotNull Provider provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            return new ModuleSpec(provider, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        @NotNull
        public final ModuleSpec nativeModuleSpec(@NotNull String className, @NotNull Provider provider) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(provider, "provider");
            return new ModuleSpec(provider, className, null);
        }
    }

    public /* synthetic */ ModuleSpec(Provider provider, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, str);
    }

    @NotNull
    public static final ModuleSpec nativeModuleSpec(@NotNull Class<? extends NativeModule> cls, @NotNull Provider provider) {
        return Companion.nativeModuleSpec(cls, provider);
    }

    @NotNull
    public static final ModuleSpec viewManagerSpec(@NotNull Provider provider) {
        return Companion.viewManagerSpec(provider);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Provider getProvider() {
        return this.provider;
    }

    @Nullable
    public final String moduleName() {
        return this.name;
    }

    @NotNull
    public final Provider provider() {
        return this.provider;
    }

    private ModuleSpec(Provider provider, String str) {
        this.provider = provider;
        this.name = str;
    }

    @NotNull
    public static final ModuleSpec nativeModuleSpec(@NotNull String str, @NotNull Provider provider) {
        return Companion.nativeModuleSpec(str, provider);
    }

    /* synthetic */ ModuleSpec(Provider provider, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, (i10 & 2) != 0 ? null : str);
    }
}
