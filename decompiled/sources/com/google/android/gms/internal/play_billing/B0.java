package com.google.android.gms.internal.play_billing;

import com.unity3d.services.UnityAdsConstants;

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
/* JADX INFO: loaded from: classes2.dex */
public final class B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f37051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B0 f37052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B0 f37053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B0 f37054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B0 f37055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B0 f37056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final B0 f37057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final B0 f37058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final B0 f37059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final B0 f37060m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ B0[] f37061v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f37062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f37063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37064c;

    static {
        B0 b10 = new B0("VOID", 0, Void.class, Void.class, null);
        f37051d = b10;
        Class cls = Integer.TYPE;
        B0 b11 = new B0("INT", 1, cls, Integer.class, 0);
        f37052e = b11;
        B0 b12 = new B0("LONG", 2, Long.TYPE, Long.class, 0L);
        f37053f = b12;
        B0 b13 = new B0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        f37054g = b13;
        B0 b14 = new B0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f37055h = b14;
        B0 b15 = new B0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f37056i = b15;
        B0 b16 = new B0("STRING", 6, String.class, String.class, "");
        f37057j = b16;
        B0 b17 = new B0("BYTE_STRING", 7, Q.class, Q.class, Q.f37133b);
        f37058k = b17;
        B0 b18 = new B0("ENUM", 8, cls, Integer.class, null);
        f37059l = b18;
        B0 b19 = new B0("MESSAGE", 9, Object.class, Object.class, null);
        f37060m = b19;
        f37061v = new B0[]{b10, b11, b12, b13, b14, b15, b16, b17, b18, b19};
    }

    private B0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f37062a = cls;
        this.f37063b = cls2;
        this.f37064c = obj;
    }

    public static B0[] values() {
        return (B0[]) f37061v.clone();
    }

    public final Class c() {
        return this.f37063b;
    }
}
