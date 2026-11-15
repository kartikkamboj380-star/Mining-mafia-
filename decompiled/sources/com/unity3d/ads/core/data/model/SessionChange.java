package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
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
public abstract class SessionChange {

    @Metadata
    public static final class PrivacyFsmChange extends SessionChange {

        @NotNull
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(@NotNull ByteString value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        @NotNull
        public final ByteString component1() {
            return this.value;
        }

        @NotNull
        public final PrivacyFsmChange copy(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new PrivacyFsmChange(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && Intrinsics.b(this.value, ((PrivacyFsmChange) obj).value);
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class UserConsentChange extends SessionChange {

        @NotNull
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(@NotNull ByteString value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        @NotNull
        public final ByteString component1() {
            return this.value;
        }

        @NotNull
        public final UserConsentChange copy(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new UserConsentChange(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && Intrinsics.b(this.value, ((UserConsentChange) obj).value);
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    public /* synthetic */ SessionChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SessionChange() {
    }
}
