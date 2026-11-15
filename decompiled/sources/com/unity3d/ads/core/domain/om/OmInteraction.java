package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p169q8.b;

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
public interface OmInteraction {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final String OMID_CREATIVE_TYPE = "creativeType";

    @NotNull
    public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";

    @NotNull
    public static final String OMID_IMPRESSION_OWNER = "impressionOwner";

    @NotNull
    public static final String OMID_IMPRESSION_TYPE = "impressionType";

    @NotNull
    public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";

    @NotNull
    public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";

    @NotNull
    public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String OMID_CREATIVE_TYPE = "creativeType";

        @NotNull
        public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";

        @NotNull
        public static final String OMID_IMPRESSION_OWNER = "impressionOwner";

        @NotNull
        public static final String OMID_IMPRESSION_TYPE = "impressionType";

        @NotNull
        public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";

        @NotNull
        public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";

        @NotNull
        public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

        private Companion() {
        }
    }

    @NotNull
    OmidOptions getOMidOptions(@NotNull JSONObject jSONObject);

    @Nullable
    WebView getWebview(@NotNull AdObject adObject);

    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull JSONObject jSONObject, @NotNull b bVar);
}
