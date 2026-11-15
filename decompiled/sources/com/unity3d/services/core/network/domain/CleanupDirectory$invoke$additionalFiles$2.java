package com.unity3d.services.core.network.domain;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import p129m8.q;

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
final class CleanupDirectory$invoke$additionalFiles$2 extends m implements Function2<Pair<? extends Long, ? extends List<? extends File>>, File, Pair<? extends Long, ? extends List<? extends File>>> {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<Long, List<File>> invoke(@NotNull Pair<Long, ? extends List<? extends File>> pair, @NotNull File file) {
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        Intrinsics.checkNotNullParameter(file, "file");
        return q.a(Long.valueOf(((Number) pair.a()).longValue() - file.length()), CollectionsKt.l0((List) pair.b(), file));
    }
}
