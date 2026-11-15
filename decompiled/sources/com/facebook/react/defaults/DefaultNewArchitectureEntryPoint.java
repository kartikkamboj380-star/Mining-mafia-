package com.facebook.react.defaults;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p129m8.k;
import p129m8.q;
import p204u3.h;

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
public final class DefaultNewArchitectureEntryPoint {
    private static boolean privateBridgelessEnabled;
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;

    @NotNull
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();

    @NotNull
    private static p044e3.e releaseLevel = p044e3.e.STABLE;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14561a;

        static {
            int[] iArr = new int[p044e3.e.values().length];
            try {
                iArr[p044e3.e.EXPERIMENTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p044e3.e.CANARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p044e3.e.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14561a = iArr;
        }
    }

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }

    public static final void load() {
        load(true, true, true);
    }

    public static /* synthetic */ void load$default(boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        load(z9);
    }

    public static final void loadWithFeatureFlags$ReactAndroid_release(@NotNull ReactNativeFeatureFlagsProvider featureFlags) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        p204u3.b.t(featureFlags);
        privateFabricEnabled = featureFlags.enableFabricRenderer();
        privateTurboModulesEnabled = featureFlags.useTurboModules();
        privateConcurrentReactEnabled = featureFlags.enableFabricRenderer();
        privateBridgelessEnabled = featureFlags.enableBridgelessArchitecture();
        f.a();
    }

    @NotNull
    public final p044e3.e getReleaseLevel() {
        return releaseLevel;
    }

    @NotNull
    public final Pair<Boolean, String> isConfigurationValid(boolean z9, boolean z10, boolean z11) {
        if (!z10 || z9) {
            return (!z11 || (z9 && z10)) ? q.a(Boolean.TRUE, "") : q.a(Boolean.FALSE, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
        }
        return q.a(Boolean.FALSE, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }

    public final void setReleaseLevel(@NotNull p044e3.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        releaseLevel = eVar;
    }

    public static final void load(boolean z9) {
        load(z9, true, true);
    }

    public static /* synthetic */ void load$default(boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        load(z9, z10);
    }

    public static final void load(boolean z9, boolean z10) {
        load(z9, z10, true);
    }

    public static /* synthetic */ void load$default(boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        load(z9, z10, z11);
    }

    public static final void load(boolean z9, boolean z10, boolean z11) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(z9, z10, z11);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.a()).booleanValue();
        String str = (String) pairIsConfigurationValid.b();
        if (zBooleanValue) {
            int i10 = a.f14561a[releaseLevel.ordinal()];
            if (i10 == 1) {
                p204u3.b.t(new p204u3.g());
            } else if (i10 == 2) {
                p204u3.b.t(new p204u3.f());
            } else if (i10 == 3) {
                p204u3.b.t(new h(z10, z11, z9));
            } else {
                throw new k();
            }
            privateFabricEnabled = z10;
            privateTurboModulesEnabled = z9;
            privateConcurrentReactEnabled = z10;
            privateBridgelessEnabled = z11;
            f.a();
            return;
        }
        throw new IllegalStateException(str.toString());
    }
}
