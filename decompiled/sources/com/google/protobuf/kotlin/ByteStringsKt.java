package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class ByteStringsKt {
    public static final byte get(@NotNull ByteString byteString, int i10) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final boolean isNotEmpty(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return !byteString.isEmpty();
    }

    @NotNull
    public static final ByteString plus(@NotNull ByteString byteString, @NotNull ByteString other) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        ByteString byteStringConcat = byteString.concat(other);
        Intrinsics.checkNotNullExpressionValue(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    @NotNull
    public static final ByteString toByteStringUtf8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        Intrinsics.checkNotNullExpressionValue(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }
}
