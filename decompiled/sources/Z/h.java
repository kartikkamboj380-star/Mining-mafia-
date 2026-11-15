package Z;

import androidx.datastore.preferences.protobuf.AbstractC1110f;
import androidx.datastore.preferences.protobuf.AbstractC1123t;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1123t implements K {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC1123t.a implements K {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a o(boolean z9) {
            i();
            ((h) this.f9672b).e0(z9);
            return this;
        }

        public a p(AbstractC1110f abstractC1110f) {
            i();
            ((h) this.f9672b).f0(abstractC1110f);
            return this;
        }

        public a q(double d10) {
            i();
            ((h) this.f9672b).g0(d10);
            return this;
        }

        public a r(float f10) {
            i();
            ((h) this.f9672b).h0(f10);
            return this;
        }

        public a s(int i10) {
            i();
            ((h) this.f9672b).i0(i10);
            return this;
        }

        public a t(long j10) {
            i();
            ((h) this.f9672b).j0(j10);
            return this;
        }

        public a u(String str) {
            i();
            ((h) this.f9672b).k0(str);
            return this;
        }

        public a w(g.a aVar) {
            i();
            ((h) this.f9672b).l0((g) aVar.f());
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7093a;

        b(int i10) {
            this.f7093a = i10;
        }

        public static b d(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1123t.H(h.class, hVar);
    }

    private h() {
    }

    public static h V() {
        return DEFAULT_INSTANCE;
    }

    public static a d0() {
        return (a) DEFAULT_INSTANCE.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z9) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(AbstractC1110f abstractC1110f) {
        abstractC1110f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC1110f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC1110f U() {
        return this.valueCase_ == 8 ? (AbstractC1110f) this.value_ : AbstractC1110f.f9469b;
    }

    public double W() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float X() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public int Y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long Z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String a0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g b0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.O();
    }

    public b c0() {
        return b.d(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123t
    protected final Object o(AbstractC1123t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f7081a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1123t.D(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s10 = PARSER;
                if (s10 != null) {
                    return s10;
                }
                synchronized (h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1123t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
