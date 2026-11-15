package p044e3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f43281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SensorManager f43286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f43287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f43289i;

    public interface a {
        void a();
    }

    public f(a shakeListener, int i10) {
        Intrinsics.checkNotNullParameter(shakeListener, "shakeListener");
        this.f43281a = shakeListener;
        this.f43282b = i10;
    }

    private final boolean a(float f10) {
        return Math.abs(f10) > 13.042845f;
    }

    private final void b(long j10) {
        if (this.f43288h >= this.f43282b * 8) {
            d();
            this.f43281a.a();
        }
        if (j10 - this.f43289i > g.f43291b) {
            d();
        }
    }

    private final void c(long j10) {
        this.f43289i = j10;
        this.f43288h++;
    }

    private final void d() {
        this.f43288h = 0;
        this.f43283c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f43284d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f43285e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void e(SensorManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.f43286f = manager;
        this.f43287g = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.f43289i = 0L;
        d();
    }

    public final void f() {
        SensorManager sensorManager = this.f43286f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f43286f = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Intrinsics.checkNotNullParameter(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.f43287g < g.f43290a) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2] - 9.80665f;
        this.f43287g = sensorEvent.timestamp;
        if (a(f10) && this.f43283c * f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c(sensorEvent.timestamp);
            this.f43283c = f10;
        } else if (a(f11) && this.f43284d * f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c(sensorEvent.timestamp);
            this.f43284d = f11;
        } else if (a(f12) && this.f43285e * f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c(sensorEvent.timestamp);
            this.f43285e = f12;
        }
        b(sensorEvent.timestamp);
    }
}
