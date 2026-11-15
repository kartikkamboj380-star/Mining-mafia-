package com.unity3d.ads.core.data.datasource;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlin.text.StringsKt;
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
final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends m implements Function1<String, Unit> {
    final /* synthetic */ String $prefix;
    final /* synthetic */ E $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, E e10) {
        super(1);
        this.$prefix = str;
        this.$value = e10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f45918a;
    }

    public final void invoke(@NotNull String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        if (StringsKt.J(line, this.$prefix, false, 2, null)) {
            E e10 = this.$value;
            String strSubstring = line.substring(this.$prefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            e10.f45973a = strSubstring;
        }
    }
}
