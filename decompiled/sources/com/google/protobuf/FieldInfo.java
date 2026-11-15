package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class FieldInfo implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Field f41071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FieldType f41072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f41073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.reflect.Field f41075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f41077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f41078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.reflect.Field f41079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class f41080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f41081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Internal.EnumVerifier f41082l;

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private G oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public FieldInfo build() {
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.i(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                return this.required ? FieldInfo.h(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : FieldInfo.e(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                return field2 == null ? FieldInfo.g(this.field, this.fieldNumber, this.type, enumVerifier) : FieldInfo.k(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            return field3 == null ? FieldInfo.f(this.field, this.fieldNumber, this.type, this.enforceUtf8) : FieldInfo.j(this.field, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z9) {
            this.enforceUtf8 = z9;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.field = field;
            return this;
        }

        public Builder withFieldNumber(int i10) {
            this.fieldNumber = i10;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(G g10, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneofStoredType = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i10) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i10;
            return this;
        }

        public Builder withRequired(boolean z9) {
            this.required = z9;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41083a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f41083a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41083a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41083a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41083a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i10, FieldType fieldType, Class cls, java.lang.reflect.Field field2, int i11, boolean z9, boolean z10, G g10, Class cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f41071a = field;
        this.f41072b = fieldType;
        this.f41073c = cls;
        this.f41074d = i10;
        this.f41075e = field2;
        this.f41076f = i11;
        this.f41077g = z9;
        this.f41078h = z10;
        this.f41080j = cls2;
        this.f41081k = obj;
        this.f41082l = enumVerifier;
        this.f41079i = field3;
    }

    private static void c(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static FieldInfo e(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z9, Internal.EnumVerifier enumVerifier) {
        c(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || w(i11)) {
            return new FieldInfo(field, i10, fieldType, null, field2, i11, false, z9, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static FieldInfo f(java.lang.reflect.Field field, int i10, FieldType fieldType, boolean z9) {
        c(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, z9, null, null, null, null, null);
    }

    public static FieldInfo g(java.lang.reflect.Field field, int i10, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        c(i10);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo h(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z9, Internal.EnumVerifier enumVerifier) {
        c(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || w(i11)) {
            return new FieldInfo(field, i10, fieldType, null, field2, i11, true, z9, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static FieldInfo i(java.lang.reflect.Field field, int i10, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        c(i10);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i10, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo j(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2) {
        c(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static FieldInfo k(java.lang.reflect.Field field, int i10, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        c(i10);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    private static boolean w(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f41074d - fieldInfo.f41074d;
    }

    public java.lang.reflect.Field l() {
        return this.f41079i;
    }

    public Internal.EnumVerifier m() {
        return this.f41082l;
    }

    public java.lang.reflect.Field n() {
        return this.f41071a;
    }

    public int o() {
        return this.f41074d;
    }

    public Object p() {
        return this.f41081k;
    }

    public Class q() {
        int i10 = a.f41083a[this.f41072b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            java.lang.reflect.Field field = this.f41071a;
            return field != null ? field.getType() : this.f41080j;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f41073c;
        }
        return null;
    }

    public G r() {
        return null;
    }

    public java.lang.reflect.Field s() {
        return this.f41075e;
    }

    public int t() {
        return this.f41076f;
    }

    public FieldType u() {
        return this.f41072b;
    }

    public boolean v() {
        return this.f41078h;
    }

    public boolean x() {
        return this.f41077g;
    }
}
