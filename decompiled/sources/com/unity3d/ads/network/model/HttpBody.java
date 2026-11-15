package com.unity3d.ads.network.model;

import kotlin.Metadata;
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
public interface HttpBody {

    @Metadata
    public static final class ByteArrayBody implements HttpBody {

        @NotNull
        private final byte[] content;

        public ByteArrayBody(@NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final byte[] getContent() {
            return this.content;
        }
    }

    @Metadata
    public static final class EmptyBody implements HttpBody {

        @NotNull
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    @Metadata
    public static final class StringBody implements HttpBody {

        @NotNull
        private final String content;

        public StringBody(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }
    }
}
