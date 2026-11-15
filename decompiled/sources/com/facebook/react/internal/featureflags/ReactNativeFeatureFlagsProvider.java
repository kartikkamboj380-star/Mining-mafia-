package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
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
public interface ReactNativeFeatureFlagsProvider {
    @a
    boolean animatedShouldSignalBatch();

    @a
    boolean commonTestFlag();

    @a
    boolean cxxNativeAnimatedEnabled();

    @a
    boolean cxxNativeAnimatedRemoveJsSync();

    @a
    boolean disableMainQueueSyncDispatchIOS();

    @a
    boolean disableMountItemReorderingAndroid();

    @a
    boolean disableTextLayoutManagerCacheAndroid();

    @a
    boolean enableAccessibilityOrder();

    @a
    boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @a
    boolean enableAndroidTextMeasurementOptimizations();

    @a
    boolean enableBridgelessArchitecture();

    @a
    boolean enableCppPropsIteratorSetter();

    @a
    boolean enableCustomFocusSearchOnClippedElementsAndroid();

    @a
    boolean enableDestroyShadowTreeRevisionAsync();

    @a
    boolean enableDoubleMeasurementFixAndroid();

    @a
    boolean enableEagerRootViewAttachment();

    @a
    boolean enableFabricLogs();

    @a
    boolean enableFabricRenderer();

    @a
    boolean enableFixForParentTagDuringReparenting();

    @a
    boolean enableFontScaleChangesUpdatingLayout();

    @a
    boolean enableIOSTextBaselineOffsetPerLine();

    @a
    boolean enableIOSViewClipToPaddingBox();

    @a
    boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    @a
    boolean enableLayoutAnimationsOnAndroid();

    @a
    boolean enableLayoutAnimationsOnIOS();

    @a
    boolean enableMainQueueCoordinatorOnIOS();

    @a
    boolean enableMainQueueModulesOnIOS();

    @a
    boolean enableModuleArgumentNSNullConversionIOS();

    @a
    boolean enableNativeCSSParsing();

    @a
    boolean enableNetworkEventReporting();

    @a
    boolean enableNewBackgroundAndBorderDrawables();

    @a
    boolean enablePreparedTextLayout();

    @a
    boolean enablePropsUpdateReconciliationAndroid();

    @a
    boolean enableResourceTimingAPI();

    @a
    boolean enableSynchronousStateUpdates();

    @a
    boolean enableViewCulling();

    @a
    boolean enableViewRecycling();

    @a
    boolean enableViewRecyclingForText();

    @a
    boolean enableViewRecyclingForView();

    @a
    boolean enableVirtualViewDebugFeatures();

    @a
    boolean enableVirtualViewRenderState();

    @a
    boolean enableVirtualViewWindowFocusDetection();

    @a
    boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    boolean fuseboxEnabledRelease();

    @a
    boolean fuseboxNetworkInspectionEnabled();

    @a
    boolean hideOffscreenVirtualViewsOnIOS();

    @a
    double preparedTextCacheSize();

    @a
    boolean preventShadowTreeCommitExhaustion();

    @a
    boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    boolean updateRuntimeShadowNodeReferencesOnCommit();

    @a
    boolean useAlwaysAvailableJSErrorHandling();

    @a
    boolean useFabricInterop();

    @a
    boolean useNativeEqualsInNativeReadableArrayAndroid();

    @a
    boolean useNativeTransformHelperAndroid();

    @a
    boolean useNativeViewConfigsInBridgelessMode();

    @a
    boolean useOptimizedEventBatchingOnAndroid();

    @a
    boolean useRawPropsJsiValue();

    @a
    boolean useShadowNodeStateOnClone();

    @a
    boolean useTurboModuleInterop();

    @a
    boolean useTurboModules();

    @a
    double virtualViewPrerenderRatio();
}
