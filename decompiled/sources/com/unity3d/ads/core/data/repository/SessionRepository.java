package com.unity3d.ads.core.data.repository;

import L8.B;
import L8.InterfaceC0804e;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p169q8.b;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i10);

    @NotNull
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    @Nullable
    String getGameId();

    @Nullable
    Object getGatewayCache(@NotNull b bVar);

    @NotNull
    ByteString getGatewayState();

    @NotNull
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @NotNull
    InitializationState getInitializationState();

    @NotNull
    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    @NotNull
    InterfaceC0804e getObserveInitializationState();

    @NotNull
    B getOnChange();

    @Nullable
    Object getPrivacy(@NotNull b bVar);

    @Nullable
    Object getPrivacyFsm(@NotNull b bVar);

    @NotNull
    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    @NotNull
    SessionCountersOuterClass.SessionCounters getSessionCounters();

    @NotNull
    ByteString getSessionId();

    @NotNull
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @NotNull
    TokenCounters getTokenCounters();

    @Nullable
    String getUnityInstallationId();

    @Nullable
    String getUnityMegaSessionId();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @Nullable
    Object persistNativeConfiguration(@NotNull b bVar);

    void resetTokenCounters();

    void setGameId(@Nullable String str);

    @Nullable
    Object setGatewayCache(@NotNull ByteString byteString, @NotNull b bVar);

    void setGatewayState(@NotNull ByteString byteString);

    void setGatewayUrl(@NotNull String str);

    void setInitializationState(@NotNull InitializationState initializationState);

    void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    @Nullable
    Object setPrivacy(@NotNull ByteString byteString, @NotNull b bVar);

    @Nullable
    Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull b bVar);

    void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(@NotNull ByteString byteString);

    void setShouldInitialize(boolean z9);

    void setTokenCounters(@NotNull TokenCounters tokenCounters);
}
