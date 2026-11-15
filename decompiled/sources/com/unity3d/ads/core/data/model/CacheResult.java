package com.unity3d.ads.core.data.model;

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
public abstract class CacheResult {

    @Metadata
    public static final class Failure extends CacheResult {

        @NotNull
        private final CacheError error;

        @Nullable
        private final Throwable reason;

        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull CacheError error, @NotNull CacheSource source, @Nullable Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            this.error = error;
            this.source = source;
            this.reason = th;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, Throwable th, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i10 & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i10 & 4) != 0) {
                th = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th);
        }

        @NotNull
        public final CacheError component1() {
            return this.error;
        }

        @NotNull
        public final CacheSource component2() {
            return this.source;
        }

        @Nullable
        public final Throwable component3() {
            return this.reason;
        }

        @NotNull
        public final Failure copy(@NotNull CacheError error, @NotNull CacheSource source, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Failure(error, source, th);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source && Intrinsics.b(this.reason, failure.reason);
        }

        @NotNull
        public final CacheError getError() {
            return this.error;
        }

        @Nullable
        public final Throwable getReason() {
            return this.reason;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = ((this.error.hashCode() * 31) + this.source.hashCode()) * 31;
            Throwable th = this.reason;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cacheError, (i10 & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i10 & 4) != 0 ? null : th);
        }
    }

    @Metadata
    public static final class Success extends CacheResult {

        @NotNull
        private final CachedFile cachedFile;

        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull CachedFile cachedFile, @NotNull CacheSource source) {
            super(null);
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            Intrinsics.checkNotNullParameter(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i10 & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        @NotNull
        public final CachedFile component1() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource component2() {
            return this.source;
        }

        @NotNull
        public final Success copy(@NotNull CachedFile cachedFile, @NotNull CacheSource source) {
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Success(cachedFile, source);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.b(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        @NotNull
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    public /* synthetic */ CacheResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CacheResult() {
    }
}
