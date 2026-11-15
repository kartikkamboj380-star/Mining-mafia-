package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class IndexedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f45923b;

    public IndexedValue(int i10, Object obj) {
        this.f45922a = i10;
        this.f45923b = obj;
    }

    public final int a() {
        return this.f45922a;
    }

    public final Object b() {
        return this.f45923b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f45922a == indexedValue.f45922a && Intrinsics.b(this.f45923b, indexedValue.f45923b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f45922a) * 31;
        Object obj = this.f45923b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f45922a + ", value=" + this.f45923b + ')';
    }
}
