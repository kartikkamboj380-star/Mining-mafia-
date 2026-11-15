package com.google.android.gms.internal.ads;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3850iM0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3850iM0 f29361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3850iM0 f29362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3850iM0 f29363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3850iM0 f29364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3850iM0 f29365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3850iM0 f29366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3850iM0 f29367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3850iM0 f29368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC3850iM0 f29369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC3850iM0 f29370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC3850iM0[] f29371l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f29372a;

    static {
        EnumC3850iM0 enumC3850iM0 = new EnumC3850iM0("VOID", 0, Void.class, Void.class, null);
        f29361b = enumC3850iM0;
        Class cls = Integer.TYPE;
        EnumC3850iM0 enumC3850iM1 = new EnumC3850iM0("INT", 1, cls, Integer.class, 0);
        f29362c = enumC3850iM1;
        EnumC3850iM0 enumC3850iM2 = new EnumC3850iM0("LONG", 2, Long.TYPE, Long.class, 0L);
        f29363d = enumC3850iM2;
        EnumC3850iM0 enumC3850iM3 = new EnumC3850iM0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        f29364e = enumC3850iM3;
        EnumC3850iM0 enumC3850iM4 = new EnumC3850iM0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f29365f = enumC3850iM4;
        EnumC3850iM0 enumC3850iM5 = new EnumC3850iM0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f29366g = enumC3850iM5;
        EnumC3850iM0 enumC3850iM6 = new EnumC3850iM0("STRING", 6, String.class, String.class, "");
        f29367h = enumC3850iM6;
        EnumC3850iM0 enumC3850iM7 = new EnumC3850iM0("BYTE_STRING", 7, AbstractC5231tL0.class, AbstractC5231tL0.class, AbstractC5231tL0.f33386b);
        f29368i = enumC3850iM7;
        EnumC3850iM0 enumC3850iM8 = new EnumC3850iM0("ENUM", 8, cls, Integer.class, null);
        f29369j = enumC3850iM8;
        EnumC3850iM0 enumC3850iM9 = new EnumC3850iM0("MESSAGE", 9, Object.class, Object.class, null);
        f29370k = enumC3850iM9;
        f29371l = new EnumC3850iM0[]{enumC3850iM0, enumC3850iM1, enumC3850iM2, enumC3850iM3, enumC3850iM4, enumC3850iM5, enumC3850iM6, enumC3850iM7, enumC3850iM8, enumC3850iM9};
    }

    private EnumC3850iM0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f29372a = cls2;
    }

    public static EnumC3850iM0[] values() {
        return (EnumC3850iM0[]) f29371l.clone();
    }

    public final Class c() {
        return this.f29372a;
    }
}
