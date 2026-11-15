package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;

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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class UnityAds {

    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    @Metadata
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    @Metadata
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    @Metadata
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    @Metadata
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$30$lambda$29$lambda$28(IUnityAdsTokenListener tokenListener) {
        Intrinsics.checkNotNullParameter(tokenListener, "$tokenListener");
        tokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$33$lambda$32(IUnityAdsTokenListener listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onUnityAdsTokenReady(null);
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getInstance().version");
        return version;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final void initialize(@Nullable Context context, @Nullable String str) {
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().initialize(context, str, false, null);
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener listener, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener listener, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void load(@Nullable String str) {
        try {
            m.a aVar = m.f46450b;
            load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(@NotNull String placementId) {
                    Intrinsics.checkNotNullParameter(placementId, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(@NotNull String placementId, @NotNull UnityAds.UnityAdsLoadError error, @NotNull String message) {
                    Intrinsics.checkNotNullParameter(placementId, "placementId");
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            });
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$26$lambda$25$lambda$24(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final void setDebugMode(boolean z9) {
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().setDebugMode(z9);
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String str) {
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener listener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        listener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + exception.getMessage());
    }

    public static final void getToken(@Nullable final IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        if (m.d(objB) == null || iUnityAdsTokenListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.a
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.getToken$lambda$30$lambda$29$lambda$28(iUnityAdsTokenListener);
            }
        });
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, @Nullable final IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        final Throwable thD = m.d(objB);
        if (thD == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(iUnityAdsInitializationListener, thD);
            }
        });
    }

    public static final void load(@Nullable final String str, @Nullable final IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        final Throwable thD = m.d(objB);
        if (thD == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$22$lambda$21$lambda$20(iUnityAdsLoadListener, str, thD);
            }
        });
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable IUnityAdsShowListener iUnityAdsShowListener) {
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    public static final void getToken(@NotNull TokenConfiguration configuration, @NotNull final IUnityAdsTokenListener listener) {
        Object objB;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        if (m.d(objB) != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAds.getToken$lambda$33$lambda$32(listener);
                }
            });
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions) {
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, boolean z9) {
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().initialize(context, str, z9, null);
            m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            m.b(n.a(th));
        }
    }

    public static final void load(@Nullable final String str, @Nullable UnityAdsLoadOptions unityAdsLoadOptions, @Nullable final IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (unityAdsLoadOptions == null) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        final Throwable thD = m.d(objB);
        if (thD == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.g
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$26$lambda$25$lambda$24(iUnityAdsLoadListener, str, thD);
            }
        });
    }

    public static final void show(@Nullable Activity activity, @Nullable final String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @Nullable final IUnityAdsShowListener iUnityAdsShowListener) {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        final Throwable thD = m.d(objB);
        if (thD == null || iUnityAdsShowListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.f
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.show$lambda$16$lambda$15$lambda$14(iUnityAdsShowListener, str, thD);
            }
        });
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, boolean z9, @Nullable final IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            UnityAdsImplementation.getInstance().initialize(context, str, z9, iUnityAdsInitializationListener);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        final Throwable thD = m.d(objB);
        if (thD == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.b
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(iUnityAdsInitializationListener, thD);
            }
        });
    }
}
