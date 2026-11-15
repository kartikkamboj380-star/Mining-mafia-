package com.unity3d.ads.core.data.datasource;

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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public abstract class VolumeSettingsChange {

    @Metadata
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z9) {
            super(null);
            this.isMuted = z9;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = muteChange.isMuted;
            }
            return muteChange.copy(z9);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        @NotNull
        public final MuteChange copy(boolean z9) {
            return new MuteChange(z9);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted;
        }

        public int hashCode() {
            boolean z9 = this.isMuted;
            if (z9) {
                return 1;
            }
            return z9 ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        @NotNull
        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    @Metadata
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d10) {
            super(null);
            this.volume = d10;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = volumeChange.volume;
            }
            return volumeChange.copy(d10);
        }

        public final double component1() {
            return this.volume;
        }

        @NotNull
        public final VolumeChange copy(double d10) {
            return new VolumeChange(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            return Double.hashCode(this.volume);
        }

        @NotNull
        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    public /* synthetic */ VolumeSettingsChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VolumeSettingsChange() {
    }
}
