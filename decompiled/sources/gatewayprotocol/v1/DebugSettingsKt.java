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
public final class DebugSettingsKt {

    @NotNull
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    @Metadata
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            NativeConfigurationOuterClass.DebugSettings debugSettingsBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(debugSettingsBuild, "_builder.build()");
            return debugSettingsBuild;
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setCleanCache(boolean z9) {
            this._builder.setCleanCache(z9);
        }

        public final void setEnableTracing(boolean z9) {
            this._builder.setEnableTracing(z9);
        }

        public final void setWebviewInspectable(boolean z9) {
            this._builder.setWebviewInspectable(z9);
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }
    }

    private DebugSettingsKt() {
    }
}
