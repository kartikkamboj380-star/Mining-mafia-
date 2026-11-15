package androidx.datastore.preferences.protobuf;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f9550a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f9551b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f9552c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f9553d = c(3, 2);

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
    public static class b {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final b f9554G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final b f9555H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final b f9556I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final b f9557J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final b f9558K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private static final /* synthetic */ b[] f9559L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f9560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f9561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f9562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f9563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f9564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f9565h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f9566i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f9567j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f9568k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f9569l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f9570m;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f9571v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f9572w;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f9573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9574b;

        final enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$b, reason: collision with other inner class name */
        final enum C0151b extends b {
            C0151b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        final enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        final enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f9560c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f9561d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f9562e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f9563f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f9564g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f9565h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f9566i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f9567j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f9568k = aVar;
            c cVar3 = c.MESSAGE;
            C0151b c0151b = new C0151b("GROUP", 9, cVar3, 3);
            f9569l = c0151b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f9570m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f9571v = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f9572w = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f9554G = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f9555H = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f9556I = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f9557J = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f9558K = bVar14;
            f9559L = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0151b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9559L.clone();
        }

        public c c() {
            return this.f9573a;
        }

        public int d() {
            return this.f9574b;
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f9573a = cVar;
            this.f9574b = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC1110f.f9469b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f9585a;

        c(Object obj) {
            this.f9585a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
