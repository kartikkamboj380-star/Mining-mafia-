package p204u3;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f49834a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function0 f49835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f49836c;

    static {
        Function0 function0 = new Function0() { // from class: u3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.b();
            }
        };
        f49835b = function0;
        f49836c = (c) function0.invoke();
    }

    private b() {
    }

    public static final boolean A() {
        return f49836c.useTurboModules();
    }

    public static final double B() {
        return f49836c.virtualViewPrerenderRatio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d b() {
        return new d();
    }

    public static final boolean c() {
        return f49836c.cxxNativeAnimatedEnabled();
    }

    public static final boolean d() {
        return f49836c.enableAccessibilityOrder();
    }

    public static final boolean e() {
        return f49836c.enableAndroidTextMeasurementOptimizations();
    }

    public static final boolean f() {
        return f49836c.enableBridgelessArchitecture();
    }

    public static final boolean g() {
        return f49836c.enableCustomFocusSearchOnClippedElementsAndroid();
    }

    public static final boolean h() {
        return f49836c.enableEagerRootViewAttachment();
    }

    public static final boolean i() {
        return f49836c.enableFabricLogs();
    }

    public static final boolean j() {
        return f49836c.enableFabricRenderer();
    }

    public static final boolean k() {
        return f49836c.enableFontScaleChangesUpdatingLayout();
    }

    public static final boolean l() {
        return f49836c.enableNewBackgroundAndBorderDrawables();
    }

    public static final boolean m() {
        return f49836c.enablePreparedTextLayout();
    }

    public static final boolean n() {
        return f49836c.enableViewRecycling();
    }

    public static final boolean o() {
        return f49836c.enableViewRecyclingForText();
    }

    public static final boolean p() {
        return f49836c.enableViewRecyclingForView();
    }

    public static final boolean q() {
        return f49836c.enableVirtualViewDebugFeatures();
    }

    public static final boolean r() {
        return f49836c.enableVirtualViewRenderState();
    }

    public static final boolean s() {
        return f49836c.enableVirtualViewWindowFocusDetection();
    }

    public static final void t(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        f49836c.a(provider);
    }

    public static final boolean u() {
        return f49836c.useFabricInterop();
    }

    public static final boolean v() {
        return f49836c.useNativeEqualsInNativeReadableArrayAndroid();
    }

    public static final boolean w() {
        return f49836c.useNativeTransformHelperAndroid();
    }

    public static final boolean x() {
        return f49836c.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean y() {
        return f49836c.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean z() {
        return f49836c.useTurboModuleInterop();
    }
}
