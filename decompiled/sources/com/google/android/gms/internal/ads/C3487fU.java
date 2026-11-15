package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3487fU extends AbstractC4020jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f28317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Sensor f28318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC3361eU f28321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28322g;

    C3487fU(Context context) {
        super("ShakeDetector", "ads");
        this.f28316a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4020jj0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.va)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) >= ((Float) H4.B.c().d(AbstractC3892ii.wa)).floatValue()) {
                long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
                if (this.f28319d + ((long) ((Integer) H4.B.c().d(AbstractC3892ii.xa)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f28319d + ((long) ((Integer) H4.B.c().d(AbstractC3892ii.ya)).intValue()) < jCurrentTimeMillis) {
                        this.f28320e = 0;
                    }
                    AbstractC0786o0.k("Shake detected.");
                    this.f28319d = jCurrentTimeMillis;
                    int i10 = this.f28320e + 1;
                    this.f28320e = i10;
                    InterfaceC3361eU interfaceC3361eU = this.f28321f;
                    if (interfaceC3361eU != null) {
                        if (i10 == ((Integer) H4.B.c().d(AbstractC3892ii.za)).intValue()) {
                            BT bt = (BT) interfaceC3361eU;
                            bt.p(new BinderC5876yT(bt), AT.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b(InterfaceC3361eU interfaceC3361eU) {
        this.f28321f = interfaceC3361eU;
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.va)).booleanValue()) {
                    if (this.f28317b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f28316a.getSystemService("sensor");
                        this.f28317b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i10 = AbstractC0786o0.f2696b;
                            L4.p.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f28318c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f28322g && (sensorManager = this.f28317b) != null && (sensor = this.f28318c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f28319d = G4.t.o().currentTimeMillis() - ((long) ((Integer) H4.B.c().d(AbstractC3892ii.xa)).intValue());
                        this.f28322g = true;
                        AbstractC0786o0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f28322g) {
                    SensorManager sensorManager = this.f28317b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f28318c);
                        AbstractC0786o0.k("Stopped listening for shake gestures.");
                    }
                    this.f28322g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
