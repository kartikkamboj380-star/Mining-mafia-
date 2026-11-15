package gatewayprotocol.v1;

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
public final class RequestUrlOverrideKt {

    @NotNull
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    @Metadata
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverrideBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(requestUrlOverrideBuild, "_builder.build()");
            return requestUrlOverrideBuild;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        @NotNull
        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            Intrinsics.checkNotNullExpressionValue(requestType, "_builder.getRequestType()");
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        @NotNull
        public final String getUrl() {
            String url = this._builder.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "_builder.getUrl()");
            return url;
        }

        public final void setRequestType(@NotNull InitializationResponseOuterClass.RequestType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRequestType(value);
        }

        public final void setRequestTypeValue(int i10) {
            this._builder.setRequestTypeValue(i10);
        }

        public final void setUrl(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUrl(value);
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestUrlOverrideKt() {
    }
}
