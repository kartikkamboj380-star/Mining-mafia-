package com.unity3d.services.core.domain;

import I8.C0666e0;
import I8.K;
import kotlin.Metadata;
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
public final class SDKDispatchers implements ISDKDispatchers {

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    @NotNull
    private final K f42817io = C0666e0.b();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private final K f0default = C0666e0.a();

    @NotNull
    private final K main = C0666e0.c();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public K getDefault() {
        return this.f0default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public K getIo() {
        return this.f42817io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public K getMain() {
        return this.main;
    }
}
