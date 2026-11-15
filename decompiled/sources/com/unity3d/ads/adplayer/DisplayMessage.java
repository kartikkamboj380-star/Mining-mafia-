package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.webkit.WebView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public abstract class DisplayMessage {

    @NotNull
    private final String opportunityId;

    @Metadata
    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    @Metadata
    public static final class DisplayError extends DisplayMessage {

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(@NotNull String opportunityId, @NotNull String reason) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }
    }

    @Metadata
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    @Metadata
    public static final class DisplayReady extends DisplayMessage {

        @Nullable
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(@NotNull String opportunityId, @Nullable Map<String, ? extends Object> map) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        @Nullable
        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : map);
        }
    }

    @Metadata
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(@NotNull String opportunityId, boolean z9) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isFocused = z9;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    @Metadata
    public static final class OpenUrl extends DisplayMessage {

        @NotNull
        private final Intent intent;
        private final boolean useActivityForResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(@NotNull String opportunityId, @NotNull Intent intent, boolean z9) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.intent = intent;
            this.useActivityForResult = z9;
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }

    @Metadata
    public static final class OpenUrlResult extends DisplayMessage {
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlResult(@NotNull String opportunityId, boolean z9) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.success = z9;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    @Metadata
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(@NotNull String opportunityId, int i10) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.orientation = i10;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    @Metadata
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(@NotNull String opportunityId, boolean z9) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isVisible = z9;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    @Metadata
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    @Metadata
    public static final class WebViewInstanceResponse extends DisplayMessage {

        @NotNull
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(@NotNull String opportunityId, @NotNull WebView webView) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @NotNull
        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}
