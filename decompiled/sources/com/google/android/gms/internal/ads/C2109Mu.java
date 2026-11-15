package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2109Mu extends AbstractC4020jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f20946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Display f20948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f20949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f20950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f20951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f20952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC2057Lu f20953h;

    C2109Mu(Context context) {
        super("OrientationMonitor", "ads");
        this.f20946a = (SensorManager) context.getSystemService("sensor");
        this.f20948c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f20949d = new float[9];
        this.f20950e = new float[9];
        this.f20947b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4020jj0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        synchronized (this.f20947b) {
            try {
                if (this.f20951f == null) {
                    this.f20951f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f20949d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f20948c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.f20950e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.f20950e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f20950e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f20950e);
        }
        float[] fArr3 = this.f20950e;
        float f10 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f10;
        float f11 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f11;
        float f12 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f12;
        synchronized (this.f20947b) {
            System.arraycopy(fArr3, 0, this.f20951f, 0, 9);
        }
        InterfaceC2057Lu interfaceC2057Lu = this.f20953h;
        if (interfaceC2057Lu != null) {
            interfaceC2057Lu.zza();
        }
    }

    final void b() {
        if (this.f20952g != null) {
            return;
        }
        SensorManager sensorManager = this.f20946a;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        HandlerC3644gj0 handlerC3644gj0 = new HandlerC3644gj0(handlerThread.getLooper());
        this.f20952g = handlerC3644gj0;
        if (sensorManager.registerListener(this, defaultSensor, 0, handlerC3644gj0)) {
            return;
        }
        int i11 = AbstractC0786o0.f2696b;
        L4.p.c("SensorManager.registerListener failed.");
        c();
    }

    final void c() {
        if (this.f20952g == null) {
            return;
        }
        this.f20946a.unregisterListener(this);
        this.f20952g.post(new RunnableC1954Ju(this));
        this.f20952g = null;
    }

    final void d(InterfaceC2057Lu interfaceC2057Lu) {
        this.f20953h = interfaceC2057Lu;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f20947b) {
            try {
                float[] fArr2 = this.f20951f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
