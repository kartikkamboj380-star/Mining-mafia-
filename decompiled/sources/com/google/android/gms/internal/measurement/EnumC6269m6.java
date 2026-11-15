package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6269m6 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final EnumC6269m6 f36753G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final EnumC6269m6 f36754H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final EnumC6269m6 f36755I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final EnumC6269m6 f36756J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final EnumC6269m6 f36757K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ EnumC6269m6[] f36758L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6269m6 f36759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6269m6 f36760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC6269m6 f36761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC6269m6 f36762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC6269m6 f36763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC6269m6 f36764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC6269m6 f36765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC6269m6 f36766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC6269m6 f36767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC6269m6 f36768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC6269m6 f36769m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumC6269m6 f36770v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC6269m6 f36771w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC6278n6 f36772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36773b;

    static {
        EnumC6269m6 enumC6269m6 = new EnumC6269m6("DOUBLE", 0, EnumC6278n6.DOUBLE, 1);
        f36759c = enumC6269m6;
        EnumC6269m6 enumC6269m7 = new EnumC6269m6("FLOAT", 1, EnumC6278n6.FLOAT, 5);
        f36760d = enumC6269m7;
        EnumC6278n6 enumC6278n6 = EnumC6278n6.LONG;
        EnumC6269m6 enumC6269m8 = new EnumC6269m6("INT64", 2, enumC6278n6, 0);
        f36761e = enumC6269m8;
        EnumC6269m6 enumC6269m9 = new EnumC6269m6("UINT64", 3, enumC6278n6, 0);
        f36762f = enumC6269m9;
        EnumC6278n6 enumC6278n7 = EnumC6278n6.INT;
        EnumC6269m6 enumC6269m10 = new EnumC6269m6("INT32", 4, enumC6278n7, 0);
        f36763g = enumC6269m10;
        EnumC6269m6 enumC6269m11 = new EnumC6269m6("FIXED64", 5, enumC6278n6, 1);
        f36764h = enumC6269m11;
        EnumC6269m6 enumC6269m12 = new EnumC6269m6("FIXED32", 6, enumC6278n7, 5);
        f36765i = enumC6269m12;
        EnumC6269m6 enumC6269m13 = new EnumC6269m6("BOOL", 7, EnumC6278n6.BOOLEAN, 0);
        f36766j = enumC6269m13;
        EnumC6269m6 enumC6269m14 = new EnumC6269m6("STRING", 8, EnumC6278n6.STRING, 2);
        f36767k = enumC6269m14;
        EnumC6278n6 enumC6278n8 = EnumC6278n6.MESSAGE;
        EnumC6269m6 enumC6269m15 = new EnumC6269m6("GROUP", 9, enumC6278n8, 3);
        f36768l = enumC6269m15;
        EnumC6269m6 enumC6269m16 = new EnumC6269m6("MESSAGE", 10, enumC6278n8, 2);
        f36769m = enumC6269m16;
        EnumC6269m6 enumC6269m17 = new EnumC6269m6("BYTES", 11, EnumC6278n6.BYTE_STRING, 2);
        f36770v = enumC6269m17;
        EnumC6269m6 enumC6269m18 = new EnumC6269m6("UINT32", 12, enumC6278n7, 0);
        f36771w = enumC6269m18;
        EnumC6269m6 enumC6269m19 = new EnumC6269m6("ENUM", 13, EnumC6278n6.ENUM, 0);
        f36753G = enumC6269m19;
        EnumC6269m6 enumC6269m20 = new EnumC6269m6("SFIXED32", 14, enumC6278n7, 5);
        f36754H = enumC6269m20;
        EnumC6269m6 enumC6269m21 = new EnumC6269m6("SFIXED64", 15, enumC6278n6, 1);
        f36755I = enumC6269m21;
        EnumC6269m6 enumC6269m22 = new EnumC6269m6("SINT32", 16, enumC6278n7, 0);
        f36756J = enumC6269m22;
        EnumC6269m6 enumC6269m23 = new EnumC6269m6("SINT64", 17, enumC6278n6, 0);
        f36757K = enumC6269m23;
        f36758L = new EnumC6269m6[]{enumC6269m6, enumC6269m7, enumC6269m8, enumC6269m9, enumC6269m10, enumC6269m11, enumC6269m12, enumC6269m13, enumC6269m14, enumC6269m15, enumC6269m16, enumC6269m17, enumC6269m18, enumC6269m19, enumC6269m20, enumC6269m21, enumC6269m22, enumC6269m23};
    }

    private EnumC6269m6(String str, int i10, EnumC6278n6 enumC6278n6, int i11) {
        super(str, i10);
        this.f36772a = enumC6278n6;
        this.f36773b = i11;
    }

    public static EnumC6269m6[] values() {
        return (EnumC6269m6[]) f36758L.clone();
    }

    public final EnumC6278n6 c() {
        return this.f36772a;
    }

    public final int d() {
        return this.f36773b;
    }
}
