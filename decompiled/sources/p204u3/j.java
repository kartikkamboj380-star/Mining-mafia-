package p204u3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49902a;

    public j(boolean z9) {
        this.f49902a = z9;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBridgelessArchitecture() {
        return this.f49902a;
    }

    @Override // p204u3.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        return this.f49902a || super.useNativeViewConfigsInBridgelessMode();
    }

    @Override // p204u3.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        return this.f49902a || super.useTurboModuleInterop();
    }
}
