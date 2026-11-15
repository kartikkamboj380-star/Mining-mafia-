package com.facebook.react.bridge;

import java.util.Iterator;
import java.util.Map;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ReadableNativeMap$entryIterator$1$1 implements Iterator<Map.Entry<? extends String, ? extends Object>>, A8.a {
    final /* synthetic */ String[] $iteratorKeys;
    final /* synthetic */ Object[] $iteratorValues;
    private int currentIndex;

    ReadableNativeMap$entryIterator$1$1(String[] strArr, Object[] objArr) {
        this.$iteratorKeys = strArr;
        this.$iteratorValues = objArr;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex < this.$iteratorKeys.length;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrentIndex(int i10) {
        this.currentIndex = i10;
    }

    @Override // java.util.Iterator
    public Map.Entry<? extends String, ? extends Object> next() {
        int i10 = this.currentIndex;
        this.currentIndex = i10 + 1;
        return new ReadableNativeMap$entryIterator$1$1$next$1(this.$iteratorKeys, i10, this.$iteratorValues);
    }
}
