package kotlin.time;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public abstract class AbstractLongTimeSource implements H8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H8.b f46046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f46047b;

    private static final class a implements kotlin.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f46048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractLongTimeSource f46049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f46050c;

        public /* synthetic */ a(long j10, AbstractLongTimeSource abstractLongTimeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, abstractLongTimeSource, j11);
        }

        @Override // kotlin.time.a
        public long a(kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (Intrinsics.b(this.f46049b, aVar.f46049b)) {
                    return b.H(f.d(this.f46048a, aVar.f46048a, this.f46049b.d()), b.G(this.f46050c, aVar.f46050c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.TimeMark
        public long c() {
            return b.G(f.d(this.f46049b.c(), this.f46048a, this.f46049b.d()), this.f46050c);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(kotlin.time.a aVar) {
            return kotlin.time.a.C0465a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f46049b, ((a) obj).f46049b) && b.m(a((kotlin.time.a) obj), b.f46051b.c());
        }

        public int hashCode() {
            return (b.z(this.f46050c) * 37) + Long.hashCode(this.f46048a);
        }

        public String toString() {
            return "LongTimeMark(" + this.f46048a + e.d(this.f46049b.d()) + " + " + ((Object) b.K(this.f46050c)) + ", " + this.f46049b + ')';
        }

        private a(long j10, AbstractLongTimeSource timeSource, long j11) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f46048a = j10;
            this.f46049b = timeSource;
            this.f46050c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.f46047b.getValue()).longValue();
    }

    @Override // H8.c
    public kotlin.time.a a() {
        return new a(c(), this, b.f46051b.c(), null);
    }

    protected final H8.b d() {
        return this.f46046a;
    }

    protected abstract long f();
}
