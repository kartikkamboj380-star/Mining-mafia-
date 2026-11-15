package com.facebook.react.bridge;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ReactIgnorableMountingException extends RuntimeException {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isIgnorable(@NotNull Throwable e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            while (e10 != null) {
                if (e10 instanceof ReactIgnorableMountingException) {
                    return true;
                }
                e10 = e10.getCause();
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactIgnorableMountingException(@NotNull String m10) {
        super(m10);
        Intrinsics.checkNotNullParameter(m10, "m");
    }

    public static final boolean isIgnorable(@NotNull Throwable th) {
        return Companion.isIgnorable(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactIgnorableMountingException(@NotNull Throwable e10) {
        super(e10);
        Intrinsics.checkNotNullParameter(e10, "e");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactIgnorableMountingException(@NotNull String m10, @NotNull Throwable e10) {
        super(m10, e10);
        Intrinsics.checkNotNullParameter(m10, "m");
        Intrinsics.checkNotNullParameter(e10, "e");
    }
}
