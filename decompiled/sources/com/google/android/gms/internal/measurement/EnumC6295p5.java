package com.google.android.gms.internal.measurement;

import com.unity3d.services.UnityAdsConstants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6295p5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6295p5 f36822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6295p5 f36823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6295p5 f36824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC6295p5 f36825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC6295p5 f36826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC6295p5 f36827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC6295p5 f36828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC6295p5 f36829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC6295p5 f36830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC6295p5 f36831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC6295p5[] f36832l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f36833a;

    static {
        EnumC6295p5 enumC6295p5 = new EnumC6295p5("VOID", 0, Void.class, Void.class, null);
        f36822b = enumC6295p5;
        Class cls = Integer.TYPE;
        EnumC6295p5 enumC6295p6 = new EnumC6295p5("INT", 1, cls, Integer.class, 0);
        f36823c = enumC6295p6;
        EnumC6295p5 enumC6295p7 = new EnumC6295p5("LONG", 2, Long.TYPE, Long.class, 0L);
        f36824d = enumC6295p7;
        EnumC6295p5 enumC6295p8 = new EnumC6295p5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        f36825e = enumC6295p8;
        EnumC6295p5 enumC6295p9 = new EnumC6295p5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f36826f = enumC6295p9;
        EnumC6295p5 enumC6295p10 = new EnumC6295p5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f36827g = enumC6295p10;
        EnumC6295p5 enumC6295p11 = new EnumC6295p5("STRING", 6, String.class, String.class, "");
        f36828h = enumC6295p11;
        EnumC6295p5 enumC6295p12 = new EnumC6295p5("BYTE_STRING", 7, K4.class, K4.class, K4.f36323b);
        f36829i = enumC6295p12;
        EnumC6295p5 enumC6295p13 = new EnumC6295p5("ENUM", 8, cls, Integer.class, null);
        f36830j = enumC6295p13;
        EnumC6295p5 enumC6295p14 = new EnumC6295p5("MESSAGE", 9, Object.class, Object.class, null);
        f36831k = enumC6295p14;
        f36832l = new EnumC6295p5[]{enumC6295p5, enumC6295p6, enumC6295p7, enumC6295p8, enumC6295p9, enumC6295p10, enumC6295p11, enumC6295p12, enumC6295p13, enumC6295p14};
    }

    private EnumC6295p5(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f36833a = cls2;
    }

    public static EnumC6295p5[] values() {
        return (EnumC6295p5[]) f36832l.clone();
    }

    public final Class c() {
        return this.f36833a;
    }
}
