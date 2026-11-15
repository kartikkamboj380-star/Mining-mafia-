package p034d3;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f42984l = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double[] f42986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f42987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f42988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42991k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f42985e = -1L;
        this.f42986f = new double[0];
        this.f42989i = 1;
        this.f42990j = 1;
        a(config);
    }

    @Override // p034d3.e
    public void a(ReadableMap config) {
        int size;
        Intrinsics.checkNotNullParameter(config, "config");
        ReadableArray array = config.getArray("frames");
        if (array != null && this.f42986f.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = array.getDouble(i10);
            }
            this.f42986f = dArr;
        }
        this.f42987g = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i11 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.f42989i = i11;
        this.f42990j = 1;
        this.f42957a = i11 == 0;
        this.f42985e = -1L;
    }

    @Override // p034d3.e
    public void b(long j10) {
        double d10;
        B b10 = this.f42958b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.f42985e < 0) {
            this.f42985e = j10;
            if (this.f42990j == 1) {
                this.f42988h = b10.f42947f;
            }
        }
        int iRound = (int) Math.round(((j10 - this.f42985e) / ((long) 1000000)) / 16.666666666666668d);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j10 + " and mStartFrameTimeNanos " + this.f42985e;
            if (p084i3.a.f45066b) {
                throw new IllegalStateException(str.toString());
            }
            if (this.f42991k < 100) {
                Z1.a.I("ReactNative", str);
                this.f42991k++;
                return;
            }
            return;
        }
        if (this.f42957a) {
            return;
        }
        double[] dArr = this.f42986f;
        if (iRound >= dArr.length - 1) {
            int i10 = this.f42989i;
            if (i10 == -1 || this.f42990j < i10) {
                double d11 = this.f42988h;
                d10 = d11 + (dArr[dArr.length - 1] * (this.f42987g - d11));
                this.f42985e = -1L;
                this.f42990j++;
            } else {
                d10 = this.f42987g;
                this.f42957a = true;
            }
        } else {
            double d12 = this.f42988h;
            d10 = d12 + (dArr[iRound] * (this.f42987g - d12));
        }
        b10.f42947f = d10;
    }
}
