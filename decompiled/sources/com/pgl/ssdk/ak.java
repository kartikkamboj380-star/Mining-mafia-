package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f41920a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f41921b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f41922c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f41928i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f41923d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f41924e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sensor f41925f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f41926g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f41927h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f41929j = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f41930k = 999999;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f41931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f41932b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f41933c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f41934d = null;

        public a(long j10) {
            this.f41931a = j10;
        }
    }

    private ak(Context context) {
        this.f41928i = context;
    }

    public static ak a(Context context) {
        if (f41922c == null) {
            synchronized (ak.class) {
                try {
                    if (f41922c == null) {
                        f41922c = new ak(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (f41921b) {
            f41922c.c();
        }
        return f41922c;
    }

    private void c() {
        if (this.f41927h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f41928i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f41923d = sensorManager.getDefaultSensor(1);
                this.f41924e = sensorManager.getDefaultSensor(2);
                this.f41925f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f41927h = true;
    }

    private void e() {
        this.f41930k = -1L;
        this.f41926g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f41928i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f41929j.get();
        if (!f41921b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f41923d == null || aVar.f41932b != null) && ((this.f41924e == null || aVar.f41933c != null) && (this.f41925f == null || aVar.f41934d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f41926g = false;
        a(objArr, aVar);
        this.f41929j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f41923d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f41928i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f41923d, 2);
                    Sensor sensor = this.f41924e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f41925f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f41930k = jCurrentTimeMillis;
                        this.f41929j.set(new a(jCurrentTimeMillis));
                        this.f41926g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f41926g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f41929j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f41932b == null) {
                aVar.f41932b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f41933c == null) {
                aVar.f41933c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f41934d == null) {
            aVar.f41934d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f41920a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f41932b;
        if (fArr != null) {
            float[] fArr2 = aVar.f41933c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f41932b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f41920a;
        }
        objArr[3] = Long.valueOf(aVar.f41931a);
        float[] fArr3 = aVar.f41934d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f41920a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float[] fArr4 = new float[3];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, fArr4);
        return new float[]{(((float) Math.toDegrees(fArr4[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f41921b || this.f41926g) {
            return;
        }
        d();
    }
}
