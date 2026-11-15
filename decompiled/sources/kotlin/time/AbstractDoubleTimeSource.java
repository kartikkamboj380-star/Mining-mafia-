package kotlin.time;

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
public abstract class AbstractDoubleTimeSource implements H8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H8.b f46042a;

    private static final class a implements kotlin.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f46043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractDoubleTimeSource f46044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f46045c;

        public /* synthetic */ a(double d10, AbstractDoubleTimeSource abstractDoubleTimeSource, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10, abstractDoubleTimeSource, j10);
        }

        @Override // kotlin.time.a
        public long a(kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (Intrinsics.b(this.f46044b, aVar.f46044b)) {
                    if (b.m(this.f46045c, aVar.f46045c) && b.D(this.f46045c)) {
                        return b.f46051b.c();
                    }
                    long jG = b.G(this.f46045c, aVar.f46045c);
                    long jO = c.o(this.f46043a - aVar.f46043a, this.f46044b.b());
                    return b.m(jO, b.L(jG)) ? b.f46051b.c() : b.H(jO, jG);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.TimeMark
        public long c() {
            return b.G(c.o(this.f46044b.c() - this.f46043a, this.f46044b.b()), this.f46045c);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(kotlin.time.a aVar) {
            return kotlin.time.a.C0465a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f46044b, ((a) obj).f46044b) && b.m(a((kotlin.time.a) obj), b.f46051b.c());
        }

        public int hashCode() {
            return b.z(b.H(c.o(this.f46043a, this.f46044b.b()), this.f46045c));
        }

        public String toString() {
            return "DoubleTimeMark(" + this.f46043a + e.d(this.f46044b.b()) + " + " + ((Object) b.K(this.f46045c)) + ", " + this.f46044b + ')';
        }

        private a(double d10, AbstractDoubleTimeSource timeSource, long j10) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f46043a = d10;
            this.f46044b = timeSource;
            this.f46045c = j10;
        }
    }

    @Override // H8.c
    public kotlin.time.a a() {
        return new a(c(), this, b.f46051b.c(), null);
    }

    protected final H8.b b() {
        return this.f46042a;
    }

    protected abstract double c();
}
