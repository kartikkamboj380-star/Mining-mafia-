package kotlin.reflect;

import F8.m;
import F8.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p129m8.k;

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
public final class KTypeProjection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f45999b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KTypeProjection f46000c = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f46001a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46002a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46002a = iArr;
        }
    }

    public KTypeProjection(n nVar, m mVar) {
        String str;
        this.f46001a = nVar;
        if (nVar == null) {
            return;
        }
        if (nVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + nVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KTypeProjection) && this.f46001a == ((KTypeProjection) obj).f46001a && Intrinsics.b(null, null);
    }

    public int hashCode() {
        n nVar = this.f46001a;
        return (nVar == null ? 0 : nVar.hashCode()) * 31;
    }

    public String toString() {
        n nVar = this.f46001a;
        int i10 = nVar == null ? -1 : b.f46002a[nVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return "null";
        }
        if (i10 == 2) {
            return "in " + ((Object) null);
        }
        if (i10 != 3) {
            throw new k();
        }
        return "out " + ((Object) null);
    }
}
