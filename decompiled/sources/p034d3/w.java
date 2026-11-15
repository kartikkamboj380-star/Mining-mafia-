package p034d3;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w extends e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f43044u = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f43045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f43047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f43048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f43049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f43050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f43051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f43052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f43053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f43054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double f43055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f43056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f43057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f43058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f43059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f43060t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f43061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f43062b;

        public b(double d10, double d11) {
            this.f43061a = d10;
            this.f43062b = d11;
        }

        public final double a() {
            return this.f43061a;
        }

        public final double b() {
            return this.f43062b;
        }

        public final void c(double d10) {
            this.f43061a = d10;
        }

        public final void d(double d10) {
            this.f43062b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f43061a, bVar.f43061a) == 0 && Double.compare(this.f43062b, bVar.f43062b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f43061a) * 31) + Double.hashCode(this.f43062b);
        }

        public String toString() {
            return "PhysicsState(position=" + this.f43061a + ", velocity=" + this.f43062b + ")";
        }

        public /* synthetic */ b(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    public w(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        b bVar = new b(0.0d, 0.0d, 3, null);
        this.f43052l = bVar;
        bVar.d(config.getDouble("initialVelocity"));
        a(config);
    }

    private final void c(double d10) {
        double dSin;
        double dSin2;
        if (e()) {
            return;
        }
        this.f43057q += d10 <= 0.064d ? d10 : 0.064d;
        double d11 = this.f43048h;
        double d12 = this.f43049i;
        double d13 = this.f43047g;
        double d14 = -this.f43050j;
        double dSqrt = d11 / (((double) 2) * Math.sqrt(d13 * d12));
        double dSqrt2 = Math.sqrt(d13 / d12);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d15 = this.f43054n - this.f43053m;
        double d16 = this.f43057q;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d16);
            double d17 = dSqrt2 * dSqrt;
            double d18 = d14 + (d17 * d15);
            double d19 = d16 * dSqrt3;
            dSin2 = this.f43054n - ((((d18 / dSqrt3) * Math.sin(d19)) + (Math.cos(d19) * d15)) * dExp);
            dSin = ((d17 * dExp) * (((Math.sin(d19) * d18) / dSqrt3) + (Math.cos(d19) * d15))) - (dExp * ((Math.cos(d19) * d18) - ((dSqrt3 * d15) * Math.sin(d19))));
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d16);
            double d20 = this.f43054n - (((((dSqrt2 * d15) + d14) * d16) + d15) * dExp2);
            dSin = dExp2 * ((d14 * ((d16 * dSqrt2) - ((double) 1))) + (d16 * d15 * dSqrt2 * dSqrt2));
            dSin2 = d20;
        }
        this.f43052l.c(dSin2);
        this.f43052l.d(dSin);
        if (e() || (this.f43051k && f())) {
            if (this.f43047g > 0.0d) {
                double d21 = this.f43054n;
                this.f43053m = d21;
                this.f43052l.c(d21);
            } else {
                double dA = this.f43052l.a();
                this.f43054n = dA;
                this.f43053m = dA;
            }
            this.f43052l.d(0.0d);
        }
    }

    private final double d(b bVar) {
        return Math.abs(this.f43054n - bVar.a());
    }

    private final boolean e() {
        if (Math.abs(this.f43052l.b()) <= this.f43055o) {
            return d(this.f43052l) <= this.f43056p || this.f43047g == 0.0d;
        }
        return false;
    }

    private final boolean f() {
        if (this.f43047g <= 0.0d) {
            return false;
        }
        if (this.f43053m >= this.f43054n || this.f43052l.a() <= this.f43054n) {
            return this.f43053m > this.f43054n && this.f43052l.a() < this.f43054n;
        }
        return true;
    }

    @Override // p034d3.e
    public void a(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43047g = config.getDouble("stiffness");
        this.f43048h = config.getDouble("damping");
        this.f43049i = config.getDouble("mass");
        this.f43050j = this.f43052l.b();
        this.f43054n = config.getDouble("toValue");
        this.f43055o = config.getDouble("restSpeedThreshold");
        this.f43056p = config.getDouble("restDisplacementThreshold");
        this.f43051k = config.getBoolean("overshootClamping");
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f43058r = i10;
        this.f42957a = i10 == 0;
        this.f43059s = 0;
        this.f43057q = 0.0d;
        this.f43046f = false;
    }

    @Override // p034d3.e
    public void b(long j10) {
        B b10 = this.f42958b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / ((long) 1000000);
        if (!this.f43046f) {
            if (this.f43059s == 0) {
                this.f43060t = b10.f42947f;
                this.f43059s = 1;
            }
            this.f43052l.c(b10.f42947f);
            this.f43053m = this.f43052l.a();
            this.f43045e = j11;
            this.f43057q = 0.0d;
            this.f43046f = true;
        }
        c((j11 - this.f43045e) / 1000.0d);
        this.f43045e = j11;
        b10.f42947f = this.f43052l.a();
        if (e()) {
            int i10 = this.f43058r;
            if (i10 != -1 && this.f43059s >= i10) {
                this.f42957a = true;
                return;
            }
            this.f43046f = false;
            b10.f42947f = this.f43060t;
            this.f43059s++;
        }
    }
}
