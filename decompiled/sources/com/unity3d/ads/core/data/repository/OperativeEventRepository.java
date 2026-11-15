package com.unity3d.ads.core.data.repository;

import L8.AbstractC0806g;
import L8.B;
import L8.D;
import L8.w;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
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
public final class OperativeEventRepository {

    @NotNull
    private final w _operativeEvents;

    @NotNull
    private final B operativeEvents;

    public OperativeEventRepository() {
        w wVarA = D.a(10, 10, K8.a.DROP_OLDEST);
        this._operativeEvents = wVarA;
        this.operativeEvents = AbstractC0806g.a(wVarA);
    }

    public final void addOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        Intrinsics.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.c(operativeEventRequest);
    }

    @NotNull
    public final B getOperativeEvents() {
        return this.operativeEvents;
    }
}
