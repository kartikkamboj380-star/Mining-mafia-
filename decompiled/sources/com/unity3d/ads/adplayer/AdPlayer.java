package com.unity3d.ads.adplayer;

import I8.O;
import I8.P;
import L8.D;
import L8.InterfaceC0804e;
import L8.w;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.l;

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
public interface AdPlayer {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    @Metadata
    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final w broadcastEventChannel = D.b(0, 0, null, 7, null);

        private Companion() {
        }

        @NotNull
        public final w getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    @Metadata
    public static final class DefaultImpls {
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull p169q8.b bVar) {
            P.d(adPlayer.getScope(), null, 1, null);
            return Unit.f45918a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new l(null, 1, null);
        }
    }

    @Nullable
    Object destroy(@NotNull p169q8.b bVar);

    void dispatchShowCompleted();

    @NotNull
    InterfaceC0804e getOnLoadEvent();

    @NotNull
    InterfaceC0804e getOnOfferwallEvent();

    @NotNull
    InterfaceC0804e getOnScarEvent();

    @NotNull
    InterfaceC0804e getOnShowEvent();

    @NotNull
    O getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull p169q8.b bVar);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull p169q8.b bVar);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull p169q8.b bVar);

    @Nullable
    Object sendActivityDestroyed(@NotNull p169q8.b bVar);

    @Nullable
    Object sendFocusChange(boolean z9, @NotNull p169q8.b bVar);

    @Nullable
    Object sendGmaEvent(@NotNull com.unity3d.scar.adapter.common.c cVar, @NotNull p169q8.b bVar);

    @Nullable
    Object sendMuteChange(boolean z9, @NotNull p169q8.b bVar);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull p169q8.b bVar);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull p169q8.b bVar);

    @Nullable
    Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull p169q8.b bVar);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull p169q8.b bVar);

    @Nullable
    Object sendVisibilityChange(boolean z9, @NotNull p169q8.b bVar);

    @Nullable
    Object sendVolumeChange(double d10, @NotNull p169q8.b bVar);

    void show(@NotNull ShowOptions showOptions);
}
