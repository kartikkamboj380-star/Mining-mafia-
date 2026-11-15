package com.unity3d.ads.core.data.model;

import java.io.File;
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
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class CachedFile {
    private final long contentLength;

    @Nullable
    private final String extension;

    @Nullable
    private final File file;

    @NotNull
    private final String name;
    private final int priority;

    @NotNull
    private final String protocol;

    @NotNull
    private final String url;

    public CachedFile(@NotNull String url, @NotNull String name, @Nullable File file, @Nullable String str, long j10, @NotNull String protocol, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j10;
        this.protocol = protocol;
        this.priority = i10;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i11 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i11 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i11 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i11 & 16) != 0) {
            j10 = cachedFile.contentLength;
        }
        if ((i11 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i11 & 64) != 0) {
            i10 = cachedFile.priority;
        }
        long j11 = j10;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j11, str4, i10);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final File component3() {
        return this.file;
    }

    @Nullable
    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    @NotNull
    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    @NotNull
    public final CachedFile copy(@NotNull String url, @NotNull String name, @Nullable File file, @Nullable String str, long j10, @NotNull String protocol, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new CachedFile(url, name, file, str, j10, protocol, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return Intrinsics.b(this.url, cachedFile.url) && Intrinsics.b(this.name, cachedFile.name) && Intrinsics.b(this.file, cachedFile.file) && Intrinsics.b(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && Intrinsics.b(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    @NotNull
    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10);
    }
}
