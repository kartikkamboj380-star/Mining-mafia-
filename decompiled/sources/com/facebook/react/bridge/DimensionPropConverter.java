package com.facebook.react.bridge;

import com.facebook.yoga.YogaValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DimensionPropConverter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final YogaValue getDimension(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Double) {
                return new YogaValue((float) ((Number) obj).doubleValue(), com.facebook.yoga.w.POINT);
            }
            if (obj instanceof String) {
                return YogaValue.a((String) obj);
            }
            throw new JSApplicationCausedNativeException("DimensionValue: the value must be a number or string.");
        }

        private Companion() {
        }
    }

    @Nullable
    public static final YogaValue getDimension(@Nullable Object obj) {
        return Companion.getDimension(obj);
    }
}
