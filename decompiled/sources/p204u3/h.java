package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f49899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f49900d;

    public h(boolean z9, boolean z10, boolean z11) {
        super(z10);
        this.f49898b = z9;
        this.f49899c = z10;
        this.f49900d = z11;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        return this.f49899c || this.f49898b;
    }

    @Override // p204u3.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        return this.f49899c || this.f49898b;
    }

    @Override // p204u3.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useShadowNodeStateOnClone() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        return this.f49899c || this.f49900d;
    }
}
