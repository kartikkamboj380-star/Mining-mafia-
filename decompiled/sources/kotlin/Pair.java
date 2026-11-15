package kotlin;

import java.io.Serializable;
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
public final class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f45916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f45917b;

    public Pair(Object obj, Object obj2) {
        this.f45916a = obj;
        this.f45917b = obj2;
    }

    public final Object a() {
        return this.f45916a;
    }

    public final Object b() {
        return this.f45917b;
    }

    public final Object c() {
        return this.f45916a;
    }

    public final Object d() {
        return this.f45917b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.b(this.f45916a, pair.f45916a) && Intrinsics.b(this.f45917b, pair.f45917b);
    }

    public int hashCode() {
        Object obj = this.f45916a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f45917b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f45916a + ", " + this.f45917b + ')';
    }
}
