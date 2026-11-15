package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import p129m8.k;
import p129m8.v;

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
@p024c3.a
@Metadata
public final class ReadableMapBuffer extends HybridClassBase implements com.facebook.react.common.mapbuffer.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14531d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.facebook.react.common.mapbuffer.a.b[] f14532e = com.facebook.react.common.mapbuffer.a.b.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f14533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14535c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements com.facebook.react.common.mapbuffer.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14536a;

        public b(int i10) {
            this.f14536a = i10;
        }

        private final void d(com.facebook.react.common.mapbuffer.a.b bVar) {
            com.facebook.react.common.mapbuffer.a.b type = getType();
            if (bVar == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            d(com.facebook.react.common.mapbuffer.a.b.LONG);
            return ReadableMapBuffer.this.C(this.f14536a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a b() {
            d(com.facebook.react.common.mapbuffer.a.b.MAP);
            return ReadableMapBuffer.this.D(this.f14536a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean c() {
            d(com.facebook.react.common.mapbuffer.a.b.BOOL);
            return ReadableMapBuffer.this.w(this.f14536a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double getDoubleValue() {
            d(com.facebook.react.common.mapbuffer.a.b.DOUBLE);
            return ReadableMapBuffer.this.z(this.f14536a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getIntValue() {
            d(com.facebook.react.common.mapbuffer.a.b.INT);
            return ReadableMapBuffer.this.B(this.f14536a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return ReadableMapBuffer.this.F(this.f14536a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String getStringValue() {
            d(com.facebook.react.common.mapbuffer.a.b.STRING);
            return ReadableMapBuffer.this.E(this.f14536a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a.b getType() {
            return p204u3.b.e() ? ReadableMapBuffer.f14532e[65535 & ReadableMapBuffer.this.F(this.f14536a + 2)] : com.facebook.react.common.mapbuffer.a.b.values()[65535 & ReadableMapBuffer.this.F(this.f14536a + 2)];
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14538a;

        static {
            int[] iArr = new int[com.facebook.react.common.mapbuffer.a.b.values().length];
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f14538a = iArr;
        }
    }

    public static final class d implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14540b;

        d() {
            this.f14540b = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.facebook.react.common.mapbuffer.a.c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i10 = this.f14539a;
            this.f14539a = i10 + 1;
            return readableMapBuffer.new b(readableMapBuffer.s(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14539a <= this.f14540b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @p024c3.a
    private ReadableMapBuffer(ByteBuffer byteBuffer, int i10) {
        this.f14533a = byteBuffer;
        this.f14534b = i10;
        A();
    }

    private final void A() {
        if (this.f14533a.getShort() != 254) {
            this.f14533a.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f14535c = F(this.f14533a.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B(int i10) {
        return this.f14533a.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C(int i10) {
        return this.f14533a.getLong(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer D(int i10) {
        return q(u() + this.f14533a.getInt(i10) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(int i10) {
        int iU = u() + this.f14533a.getInt(i10);
        int i11 = this.f14533a.getInt(iU);
        byte[] bArr = new byte[i11];
        this.f14533a.position(iU + 4);
        this.f14533a.get(bArr, 0, i11);
        return new String(bArr, Charsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final short F(int i10) {
        return v.c(this.f14533a.getShort(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence H(com.facebook.react.common.mapbuffer.a.c entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        StringBuilder sb = new StringBuilder();
        sb.append(entry.getKey());
        sb.append('=');
        switch (c.f14538a[entry.getType().ordinal()]) {
            case 1:
                sb.append(entry.c());
                return sb;
            case 2:
                sb.append(entry.getIntValue());
                return sb;
            case 3:
                sb.append(entry.a());
                return sb;
            case 4:
                sb.append(entry.getDoubleValue());
                return sb;
            case 5:
                sb.append('\"');
                sb.append(entry.getStringValue());
                sb.append('\"');
                return sb;
            case 6:
                sb.append(entry.b().toString());
                return sb;
            default:
                throw new k();
        }
    }

    private final ReadableMapBuffer q(int i10) {
        ByteBuffer byteBufferDuplicate = this.f14533a.duplicate();
        byteBufferDuplicate.position(i10);
        Intrinsics.checkNotNullExpressionValue(byteBufferDuplicate, "apply(...)");
        return new ReadableMapBuffer(byteBufferDuplicate, i10);
    }

    private final int r(int i10) {
        IntRange intRangeA = com.facebook.react.common.mapbuffer.a.f14549t.a();
        int iA = intRangeA.a();
        if (i10 <= intRangeA.b() && iA <= i10) {
            short sC = v.c((short) i10);
            int count = getCount() - 1;
            int i11 = 0;
            while (i11 <= count) {
                int i12 = (i11 + count) >>> 1;
                int iF = F(s(i12)) & 65535;
                int i13 = 65535 & sC;
                if (Intrinsics.e(iF, i13) < 0) {
                    i11 = i12 + 1;
                } else {
                    if (Intrinsics.e(iF, i13) <= 0) {
                        return i12;
                    }
                    count = i12 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s(int i10) {
        return this.f14534b + 8 + (i10 * 12);
    }

    private final int u() {
        return s(getCount());
    }

    private final int v(int i10, com.facebook.react.common.mapbuffer.a.b bVar) {
        int iR = r(i10);
        if (iR == -1) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        com.facebook.react.common.mapbuffer.a.b bVarY = y(iR);
        if (bVarY == bVar) {
            return s(iR) + 4;
        }
        throw new IllegalStateException(("Expected " + bVar + " for key: " + i10 + ", found " + bVarY + " instead.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w(int i10) {
        return B(i10) == 1;
    }

    private final com.facebook.react.common.mapbuffer.a.b y(int i10) {
        int iF = F(s(i10) + 2) & 65535;
        return p204u3.b.e() ? f14532e[iF] : com.facebook.react.common.mapbuffer.a.b.values()[iF];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double z(int i10) {
        return this.f14533a.getDouble(i10);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean R(int i10) {
        return r(i10) != -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.f14533a;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).f14533a;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return Intrinsics.b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int i10) {
        return w(v(i10, com.facebook.react.common.mapbuffer.a.b.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.f14535c;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int i10) {
        return z(v(i10, com.facebook.react.common.mapbuffer.a.b.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int i10) {
        return B(v(i10, com.facebook.react.common.mapbuffer.a.b.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int i10) {
        return E(v(i10, com.facebook.react.common.mapbuffer.a.b.STRING));
    }

    public int hashCode() {
        this.f14533a.rewind();
        return this.f14533a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ReadableMapBuffer M(int i10) {
        return D(v(i10, com.facebook.react.common.mapbuffer.a.b.MAP));
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder("{");
        CollectionsKt___CollectionsKt.b0(this, sb, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: j3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReadableMapBuffer.H((com.facebook.react.common.mapbuffer.a.c) obj);
            }
        });
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
