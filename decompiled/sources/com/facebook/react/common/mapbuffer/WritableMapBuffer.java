package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import java.util.Iterator;
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
/* JADX INFO: loaded from: classes.dex */
@p024c3.a
@Metadata
public final class WritableMapBuffer implements com.facebook.react.common.mapbuffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f14542a = new SparseArray();

    private final class a implements com.facebook.react.common.mapbuffer.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.facebook.react.common.mapbuffer.a.b f14545c;

        public a(int i10) {
            this.f14543a = i10;
            this.f14544b = WritableMapBuffer.this.f14542a.keyAt(i10);
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(i10);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            this.f14545c = WritableMapBuffer.this.e(objValueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(this.f14543a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Long) {
                return ((Number) objValueAt).longValue();
            }
            throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a b() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(this.f14543a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof com.facebook.react.common.mapbuffer.a) {
                return (com.facebook.react.common.mapbuffer.a) objValueAt;
            }
            throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean c() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(this.f14543a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Boolean) {
                return ((Boolean) objValueAt).booleanValue();
            }
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double getDoubleValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(this.f14543a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Double) {
                return ((Number) objValueAt).doubleValue();
            }
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getIntValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(this.f14543a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Integer) {
                return ((Number) objValueAt).intValue();
            }
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return this.f14544b;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String getStringValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f14542a.valueAt(this.f14543a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof String) {
                return (String) objValueAt;
            }
            throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a.b getType() {
            return this.f14545c;
        }
    }

    public static final class b implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14547a;

        b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.facebook.react.common.mapbuffer.a.c next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i10 = this.f14547a;
            this.f14547a = i10 + 1;
            return writableMapBuffer.new a(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14547a < WritableMapBuffer.this.f14542a.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.facebook.react.common.mapbuffer.a.b e(Object obj, int i10) {
        if (obj instanceof Boolean) {
            return com.facebook.react.common.mapbuffer.a.b.BOOL;
        }
        if (obj instanceof Integer) {
            return com.facebook.react.common.mapbuffer.a.b.INT;
        }
        if (obj instanceof Long) {
            return com.facebook.react.common.mapbuffer.a.b.LONG;
        }
        if (obj instanceof Double) {
            return com.facebook.react.common.mapbuffer.a.b.DOUBLE;
        }
        if (obj instanceof String) {
            return com.facebook.react.common.mapbuffer.a.b.STRING;
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return com.facebook.react.common.mapbuffer.a.b.MAP;
        }
        throw new IllegalStateException("Key " + i10 + " has value of unknown type: " + obj.getClass());
    }

    @p024c3.a
    private final int[] getKeys() {
        int size = this.f14542a.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f14542a.keyAt(i10);
        }
        return iArr;
    }

    @p024c3.a
    private final Object[] getValues() {
        int size = this.f14542a.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object objValueAt = this.f14542a.valueAt(i10);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            objArr[i10] = objValueAt;
        }
        return objArr;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public com.facebook.react.common.mapbuffer.a M(int i10) {
        Object obj = this.f14542a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return (com.facebook.react.common.mapbuffer.a) obj;
        }
        throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + i10 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean R(int i10) {
        return this.f14542a.get(i10) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int i10) {
        Object obj = this.f14542a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i10 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.f14542a.size();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int i10) {
        Object obj = this.f14542a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + i10 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int i10) {
        Object obj = this.f14542a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i10 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int i10) {
        Object obj = this.f14542a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + i10 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }
}
