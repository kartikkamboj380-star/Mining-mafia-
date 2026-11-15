package p034d3;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f42970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f42971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f42972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f42973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f42974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42976k;

    public g(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f42972g = -1L;
        this.f42975j = 1;
        this.f42976k = 1;
        a(config);
    }

    @Override // p034d3.e
    public void a(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f42970e = config.getDouble("velocity");
        this.f42971f = config.getDouble("deceleration");
        this.f42972g = -1L;
        this.f42973h = 0.0d;
        this.f42974i = 0.0d;
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f42975j = i10;
        this.f42976k = 1;
        this.f42957a = i10 == 0;
    }

    @Override // p034d3.e
    public void b(long j10) {
        B b10 = this.f42958b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / ((long) 1000000);
        if (this.f42972g == -1) {
            this.f42972g = j11 - ((long) 16);
            double d10 = this.f42973h;
            if (d10 == this.f42974i) {
                this.f42973h = b10.f42947f;
            } else {
                b10.f42947f = d10;
            }
            this.f42974i = b10.f42947f;
        }
        double d11 = this.f42973h;
        double d12 = this.f42970e;
        double d13 = 1;
        double d14 = this.f42971f;
        double dExp = d11 + ((d12 / (d13 - d14)) * (d13 - Math.exp((-(d13 - d14)) * (j11 - this.f42972g))));
        if (Math.abs(this.f42974i - dExp) < 0.1d) {
            int i10 = this.f42975j;
            if (i10 != -1 && this.f42976k >= i10) {
                this.f42957a = true;
                return;
            } else {
                this.f42972g = -1L;
                this.f42976k++;
            }
        }
        this.f42974i = dExp;
        b10.f42947f = dExp;
    }
}
