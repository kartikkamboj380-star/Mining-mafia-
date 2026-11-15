package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p158p7.f;
import p158p7.h;
import p158p7.j;

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
public final class OmidOptions {

    @Nullable
    private final f creativeType;

    @Nullable
    private final String customReferenceData;

    @Nullable
    private final j impressionOwner;

    @Nullable
    private final h impressionType;
    private final boolean isolateVerificationScripts;

    @Nullable
    private final j mediaEventsOwner;

    @Nullable
    private final j videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z9, j jVar, j jVar2, String str, h hVar, f fVar, j jVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = omidOptions.isolateVerificationScripts;
        }
        if ((i10 & 2) != 0) {
            jVar = omidOptions.impressionOwner;
        }
        if ((i10 & 4) != 0) {
            jVar2 = omidOptions.videoEventsOwner;
        }
        if ((i10 & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        if ((i10 & 16) != 0) {
            hVar = omidOptions.impressionType;
        }
        if ((i10 & 32) != 0) {
            fVar = omidOptions.creativeType;
        }
        if ((i10 & 64) != 0) {
            jVar3 = omidOptions.mediaEventsOwner;
        }
        f fVar2 = fVar;
        j jVar4 = jVar3;
        h hVar2 = hVar;
        j jVar5 = jVar2;
        return omidOptions.copy(z9, jVar, jVar5, str, hVar2, fVar2, jVar4);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    @Nullable
    public final j component2() {
        return this.impressionOwner;
    }

    @Nullable
    public final j component3() {
        return this.videoEventsOwner;
    }

    @Nullable
    public final String component4() {
        return this.customReferenceData;
    }

    @Nullable
    public final h component5() {
        return this.impressionType;
    }

    @Nullable
    public final f component6() {
        return this.creativeType;
    }

    @Nullable
    public final j component7() {
        return this.mediaEventsOwner;
    }

    @NotNull
    public final OmidOptions copy(boolean z9, @Nullable j jVar, @Nullable j jVar2, @Nullable String str, @Nullable h hVar, @Nullable f fVar, @Nullable j jVar3) {
        return new OmidOptions(z9, jVar, jVar2, str, hVar, fVar, jVar3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && Intrinsics.b(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    @Nullable
    public final f getCreativeType() {
        return this.creativeType;
    }

    @Nullable
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    @Nullable
    public final j getImpressionOwner() {
        return this.impressionOwner;
    }

    @Nullable
    public final h getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @Nullable
    public final j getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    @Nullable
    public final j getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z9 = this.isolateVerificationScripts;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        j jVar = this.impressionOwner;
        int iHashCode = (i10 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.videoEventsOwner;
        int iHashCode2 = (iHashCode + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        String str = this.customReferenceData;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.impressionType;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        f fVar = this.creativeType;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        j jVar3 = this.mediaEventsOwner;
        return iHashCode5 + (jVar3 != null ? jVar3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z9, @Nullable j jVar, @Nullable j jVar2, @Nullable String str, @Nullable h hVar, @Nullable f fVar, @Nullable j jVar3) {
        this.isolateVerificationScripts = z9;
        this.impressionOwner = jVar;
        this.videoEventsOwner = jVar2;
        this.customReferenceData = str;
        this.impressionType = hVar;
        this.creativeType = fVar;
        this.mediaEventsOwner = jVar3;
    }

    public /* synthetic */ OmidOptions(boolean z9, j jVar, j jVar2, String str, h hVar, f fVar, j jVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? null : jVar2, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : hVar, (i10 & 32) != 0 ? null : fVar, (i10 & 64) != 0 ? null : jVar3);
    }
}
