package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1126w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1126w f9690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1126w f9691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1126w f9692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1126w f9693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1126w f9694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1126w f9695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC1126w f9696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC1126w f9697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC1126w f9698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC1126w f9699m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC1126w[] f9700v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f9701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f9702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9703c;

    static {
        EnumC1126w enumC1126w = new EnumC1126w("VOID", 0, Void.class, Void.class, null);
        f9690d = enumC1126w;
        Class cls = Integer.TYPE;
        EnumC1126w enumC1126w2 = new EnumC1126w("INT", 1, cls, Integer.class, 0);
        f9691e = enumC1126w2;
        EnumC1126w enumC1126w3 = new EnumC1126w("LONG", 2, Long.TYPE, Long.class, 0L);
        f9692f = enumC1126w3;
        EnumC1126w enumC1126w4 = new EnumC1126w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        f9693g = enumC1126w4;
        EnumC1126w enumC1126w5 = new EnumC1126w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f9694h = enumC1126w5;
        EnumC1126w enumC1126w6 = new EnumC1126w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f9695i = enumC1126w6;
        EnumC1126w enumC1126w7 = new EnumC1126w("STRING", 6, String.class, String.class, "");
        f9696j = enumC1126w7;
        EnumC1126w enumC1126w8 = new EnumC1126w("BYTE_STRING", 7, AbstractC1110f.class, AbstractC1110f.class, AbstractC1110f.f9469b);
        f9697k = enumC1126w8;
        EnumC1126w enumC1126w9 = new EnumC1126w("ENUM", 8, cls, Integer.class, null);
        f9698l = enumC1126w9;
        EnumC1126w enumC1126w10 = new EnumC1126w("MESSAGE", 9, Object.class, Object.class, null);
        f9699m = enumC1126w10;
        f9700v = new EnumC1126w[]{enumC1126w, enumC1126w2, enumC1126w3, enumC1126w4, enumC1126w5, enumC1126w6, enumC1126w7, enumC1126w8, enumC1126w9, enumC1126w10};
    }

    private EnumC1126w(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f9701a = cls;
        this.f9702b = cls2;
        this.f9703c = obj;
    }

    public static EnumC1126w valueOf(String str) {
        return (EnumC1126w) Enum.valueOf(EnumC1126w.class, str);
    }

    public static EnumC1126w[] values() {
        return (EnumC1126w[]) f9700v.clone();
    }

    public Class c() {
        return this.f9702b;
    }
}
