package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
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
public abstract class ShowEvent {

    @Metadata
    public static final class CancelTimeout extends ShowEvent {

        @NotNull
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    @Metadata
    public static final class Clicked extends ShowEvent {

        @NotNull
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    @Metadata
    public static final class Completed extends ShowEvent {

        @Nullable
        private final String reason;

        @Nullable
        private final String reasonDebug;

        @NotNull
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull ShowStatus status, @Nullable String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i10 & 2) != 0) {
                str = completed.reason;
            }
            if ((i10 & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        @NotNull
        public final ShowStatus component1() {
            return this.status;
        }

        @Nullable
        public final String component2() {
            return this.reason;
        }

        @Nullable
        public final String component3() {
            return this.reasonDebug;
        }

        @NotNull
        public final Completed copy(@NotNull ShowStatus status, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new Completed(status, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return this.status == completed.status && Intrinsics.b(this.reason, completed.reason) && Intrinsics.b(this.reasonDebug, completed.reasonDebug);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @NotNull
        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Completed(status=" + this.status + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(showStatus, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }
    }

    @Metadata
    public static final class Error extends ShowEvent {
        private final int errorCode;

        @NotNull
        private final String message;

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String message, int i10, @NotNull String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.errorCode = i10;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            if ((i11 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i10, str2);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @NotNull
        public final String component3() {
            return this.reason;
        }

        @NotNull
        public final Error copy(@NotNull String message, int i10, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Error(message, i10, reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.b(this.message, error.message) && this.errorCode == error.errorCode && Intrinsics.b(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Integer.hashCode(this.errorCode)) * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    @Metadata
    public static final class LeftApplication extends ShowEvent {

        @NotNull
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    @Metadata
    public static final class Started extends ShowEvent {

        @NotNull
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ShowEvent() {
    }
}
