package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class ErrorKt {

    @NotNull
    public static final ErrorKt INSTANCE = new ErrorKt();

    @Metadata
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final ErrorOuterClass.Error.Builder _builder;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error errorBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(errorBuild, "_builder.build()");
            return errorBuild;
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        @NotNull
        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "_builder.getErrorCode()");
            return errorCode;
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        @NotNull
        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            Intrinsics.checkNotNullExpressionValue(errorText, "_builder.getErrorText()");
            return errorText;
        }

        @NotNull
        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            Intrinsics.checkNotNullExpressionValue(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final void setErrorCode(@NotNull ErrorOuterClass.PublicErrorCode value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorCode(value);
        }

        public final void setErrorCodeValue(int i10) {
            this._builder.setErrorCodeValue(i10);
        }

        public final void setErrorText(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorText(value);
        }

        public final void setErrorToken(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorToken(value);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }
    }

    private ErrorKt() {
    }
}
