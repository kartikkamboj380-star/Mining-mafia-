package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p024c3.a;

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
@a
@Metadata
public final class ReactNativeFeatureFlagsCxxInterop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReactNativeFeatureFlagsCxxInterop f14865a = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.t("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @a
    public static final native boolean animatedShouldSignalBatch();

    @a
    public static final native boolean commonTestFlag();

    @a
    public static final native boolean cxxNativeAnimatedEnabled();

    @a
    public static final native boolean cxxNativeAnimatedRemoveJsSync();

    @a
    @Nullable
    public static final native String dangerouslyForceOverride(@NotNull Object obj);

    @a
    public static final native void dangerouslyReset();

    @a
    public static final native boolean disableMainQueueSyncDispatchIOS();

    @a
    public static final native boolean disableMountItemReorderingAndroid();

    @a
    public static final native boolean disableTextLayoutManagerCacheAndroid();

    @a
    public static final native boolean enableAccessibilityOrder();

    @a
    public static final native boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @a
    public static final native boolean enableAndroidTextMeasurementOptimizations();

    @a
    public static final native boolean enableBridgelessArchitecture();

    @a
    public static final native boolean enableCppPropsIteratorSetter();

    @a
    public static final native boolean enableCustomFocusSearchOnClippedElementsAndroid();

    @a
    public static final native boolean enableDestroyShadowTreeRevisionAsync();

    @a
    public static final native boolean enableDoubleMeasurementFixAndroid();

    @a
    public static final native boolean enableEagerRootViewAttachment();

    @a
    public static final native boolean enableFabricLogs();

    @a
    public static final native boolean enableFabricRenderer();

    @a
    public static final native boolean enableFixForParentTagDuringReparenting();

    @a
    public static final native boolean enableFontScaleChangesUpdatingLayout();

    @a
    public static final native boolean enableIOSTextBaselineOffsetPerLine();

    @a
    public static final native boolean enableIOSViewClipToPaddingBox();

    @a
    public static final native boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    @a
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @a
    public static final native boolean enableLayoutAnimationsOnIOS();

    @a
    public static final native boolean enableMainQueueCoordinatorOnIOS();

    @a
    public static final native boolean enableMainQueueModulesOnIOS();

    @a
    public static final native boolean enableModuleArgumentNSNullConversionIOS();

    @a
    public static final native boolean enableNativeCSSParsing();

    @a
    public static final native boolean enableNetworkEventReporting();

    @a
    public static final native boolean enableNewBackgroundAndBorderDrawables();

    @a
    public static final native boolean enablePreparedTextLayout();

    @a
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @a
    public static final native boolean enableResourceTimingAPI();

    @a
    public static final native boolean enableSynchronousStateUpdates();

    @a
    public static final native boolean enableViewCulling();

    @a
    public static final native boolean enableViewRecycling();

    @a
    public static final native boolean enableViewRecyclingForText();

    @a
    public static final native boolean enableViewRecyclingForView();

    @a
    public static final native boolean enableVirtualViewDebugFeatures();

    @a
    public static final native boolean enableVirtualViewRenderState();

    @a
    public static final native boolean enableVirtualViewWindowFocusDetection();

    @a
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    public static final native boolean fuseboxEnabledRelease();

    @a
    public static final native boolean fuseboxNetworkInspectionEnabled();

    @a
    public static final native boolean hideOffscreenVirtualViewsOnIOS();

    @a
    public static final native void override(@NotNull Object obj);

    @a
    public static final native double preparedTextCacheSize();

    @a
    public static final native boolean preventShadowTreeCommitExhaustion();

    @a
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    public static final native boolean updateRuntimeShadowNodeReferencesOnCommit();

    @a
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @a
    public static final native boolean useFabricInterop();

    @a
    public static final native boolean useNativeEqualsInNativeReadableArrayAndroid();

    @a
    public static final native boolean useNativeTransformHelperAndroid();

    @a
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @a
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @a
    public static final native boolean useRawPropsJsiValue();

    @a
    public static final native boolean useShadowNodeStateOnClone();

    @a
    public static final native boolean useTurboModuleInterop();

    @a
    public static final native boolean useTurboModules();

    @a
    public static final native double virtualViewPrerenderRatio();
}
