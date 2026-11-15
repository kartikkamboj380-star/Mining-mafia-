package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class ZP0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ZP0 f26174j = new ZP0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ZP0 f26175k = new ZP0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ZP0 f26176l = new ZP0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ZP0 f26177m = new ZP0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f26178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f26179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f26180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f26181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f26182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f26183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f26184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f26185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f26186i;

    public ZP0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f26178a = d14;
        this.f26179b = d15;
        this.f26180c = d16;
        this.f26181d = d10;
        this.f26182e = d11;
        this.f26183f = d12;
        this.f26184g = d13;
        this.f26185h = d17;
        this.f26186i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ZP0.class != obj.getClass()) {
            return false;
        }
        ZP0 zp0 = (ZP0) obj;
        return Double.compare(zp0.f26181d, this.f26181d) == 0 && Double.compare(zp0.f26182e, this.f26182e) == 0 && Double.compare(zp0.f26183f, this.f26183f) == 0 && Double.compare(zp0.f26184g, this.f26184g) == 0 && Double.compare(zp0.f26185h, this.f26185h) == 0 && Double.compare(zp0.f26186i, this.f26186i) == 0 && Double.compare(zp0.f26178a, this.f26178a) == 0 && Double.compare(zp0.f26179b, this.f26179b) == 0 && Double.compare(zp0.f26180c, this.f26180c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f26178a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f26179b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f26180c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f26181d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f26182e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f26183f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f26184g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f26185h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f26186i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f26174j)) {
            return "Rotate 0°";
        }
        if (equals(f26175k)) {
            return "Rotate 90°";
        }
        if (equals(f26176l)) {
            return "Rotate 180°";
        }
        if (equals(f26177m)) {
            return "Rotate 270°";
        }
        double d10 = this.f26178a;
        double d11 = this.f26179b;
        double d12 = this.f26180c;
        double d13 = this.f26181d;
        double d14 = this.f26182e;
        double d15 = this.f26183f;
        double d16 = this.f26184g;
        double d17 = this.f26185h;
        double d18 = this.f26186i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d10);
        sb.append(", v=");
        sb.append(d11);
        sb.append(", w=");
        sb.append(d12);
        sb.append(", a=");
        sb.append(d13);
        sb.append(", b=");
        sb.append(d14);
        sb.append(", c=");
        sb.append(d15);
        sb.append(", d=");
        sb.append(d16);
        sb.append(", tx=");
        sb.append(d17);
        sb.append(", ty=");
        sb.append(d18);
        sb.append("}");
        return sb.toString();
    }
}
