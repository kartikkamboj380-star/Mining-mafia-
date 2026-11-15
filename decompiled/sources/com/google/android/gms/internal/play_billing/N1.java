package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class N1 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final N1 f37100G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final N1 f37101H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final N1 f37102I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final N1 f37103J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ N1[] f37104K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N1 f37105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N1 f37106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N1 f37107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N1 f37108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N1 f37109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final N1 f37110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final N1 f37111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final N1 f37112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final N1 f37113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final N1 f37114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final N1 f37115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N1 f37116m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final N1 f37117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final N1 f37118w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O1 f37119a;

    static {
        N1 n10 = new N1("DOUBLE", 0, O1.DOUBLE, 1);
        f37105b = n10;
        N1 n11 = new N1("FLOAT", 1, O1.FLOAT, 5);
        f37106c = n11;
        O1 o10 = O1.LONG;
        N1 n12 = new N1("INT64", 2, o10, 0);
        f37107d = n12;
        N1 n13 = new N1("UINT64", 3, o10, 0);
        f37108e = n13;
        O1 o11 = O1.INT;
        N1 n14 = new N1("INT32", 4, o11, 0);
        f37109f = n14;
        N1 n15 = new N1("FIXED64", 5, o10, 1);
        f37110g = n15;
        N1 n16 = new N1("FIXED32", 6, o11, 5);
        f37111h = n16;
        N1 n17 = new N1("BOOL", 7, O1.BOOLEAN, 0);
        f37112i = n17;
        N1 n18 = new N1("STRING", 8, O1.STRING, 2);
        f37113j = n18;
        O1 o12 = O1.MESSAGE;
        N1 n19 = new N1("GROUP", 9, o12, 3);
        f37114k = n19;
        N1 n20 = new N1("MESSAGE", 10, o12, 2);
        f37115l = n20;
        N1 n21 = new N1("BYTES", 11, O1.BYTE_STRING, 2);
        f37116m = n21;
        N1 n22 = new N1("UINT32", 12, o11, 0);
        f37117v = n22;
        N1 n23 = new N1("ENUM", 13, O1.ENUM, 0);
        f37118w = n23;
        N1 n24 = new N1("SFIXED32", 14, o11, 5);
        f37100G = n24;
        N1 n25 = new N1("SFIXED64", 15, o10, 1);
        f37101H = n25;
        N1 n26 = new N1("SINT32", 16, o11, 0);
        f37102I = n26;
        N1 n27 = new N1("SINT64", 17, o10, 0);
        f37103J = n27;
        f37104K = new N1[]{n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26, n27};
    }

    private N1(String str, int i10, O1 o10, int i11) {
        super(str, i10);
        this.f37119a = o10;
    }

    public static N1[] values() {
        return (N1[]) f37104K.clone();
    }

    public final O1 c() {
        return this.f37119a;
    }
}
