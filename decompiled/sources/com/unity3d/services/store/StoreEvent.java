package com.unity3d.services.store;

import kotlin.Metadata;

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
public enum StoreEvent {
    INITIALIZATION_REQUEST_RESULT,
    INITIALIZATION_REQUEST_FAILED,
    DISCONNECTED_RESULT,
    PURCHASES_ON_RESUME_RESULT,
    PURCHASES_ON_RESUME_ERROR,
    PURCHASES_UPDATED_RESULT,
    PURCHASES_UPDATED_ERROR,
    PURCHASES_REQUEST_RESULT,
    PURCHASES_REQUEST_ERROR,
    PURCHASE_HISTORY_LIST_REQUEST_RESULT,
    PURCHASE_HISTORY_LIST_REQUEST_ERROR,
    SKU_DETAILS_LIST_REQUEST_RESULT,
    SKU_DETAILS_LIST_REQUEST_ERROR,
    IS_FEATURE_SUPPORTED_REQUEST_RESULT,
    IS_FEATURE_SUPPORTED_REQUEST_ERROR
}
