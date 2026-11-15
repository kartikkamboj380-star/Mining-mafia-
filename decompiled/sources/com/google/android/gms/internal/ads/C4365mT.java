package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4365mT extends AbstractC4020jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f31511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sensor f31512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f31514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC4239lT f31519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31520j;

    C4365mT(Context context) {
        super("FlickDetector", "ads");
        this.f31513c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f31514d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f31515e = G4.t.o().currentTimeMillis();
        this.f31516f = 0;
        this.f31517g = false;
        this.f31518h = false;
        this.f31519i = null;
        this.f31520j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f31511a = sensorManager;
        if (sensorManager != null) {
            this.f31512b = sensorManager.getDefaultSensor(4);
        } else {
            this.f31512b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4020jj0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Aa)).booleanValue()) {
            long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
            if (this.f31515e + ((long) ((Integer) H4.B.c().d(AbstractC3892ii.Ca)).intValue()) < jCurrentTimeMillis) {
                this.f31516f = 0;
                this.f31515e = jCurrentTimeMillis;
                this.f31517g = false;
                this.f31518h = false;
                this.f31513c = this.f31514d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f31514d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f31514d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f10 = this.f31513c;
            AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.Ba;
            if (fFloatValue > f10 + ((Float) H4.B.c().d(abstractC2759Zh)).floatValue()) {
                this.f31513c = this.f31514d.floatValue();
                this.f31518h = true;
            } else if (this.f31514d.floatValue() < this.f31513c - ((Float) H4.B.c().d(abstractC2759Zh)).floatValue()) {
                this.f31513c = this.f31514d.floatValue();
                this.f31517g = true;
            }
            if (this.f31514d.isInfinite()) {
                this.f31514d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.f31513c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.f31517g && this.f31518h) {
                AbstractC0786o0.k("Flick detected.");
                this.f31515e = jCurrentTimeMillis;
                int i10 = this.f31516f + 1;
                this.f31516f = i10;
                this.f31517g = false;
                this.f31518h = false;
                InterfaceC4239lT interfaceC4239lT = this.f31519i;
                if (interfaceC4239lT != null) {
                    if (i10 == ((Integer) H4.B.c().d(AbstractC3892ii.Da)).intValue()) {
                        BT bt = (BT) interfaceC4239lT;
                        bt.p(new BinderC6002zT(bt), AT.GESTURE);
                    }
                }
            }
        }
    }

    public final void b(InterfaceC4239lT interfaceC4239lT) {
        this.f31519i = interfaceC4239lT;
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Aa)).booleanValue()) {
                    if (!this.f31520j && (sensorManager = this.f31511a) != null && (sensor = this.f31512b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f31520j = true;
                        AbstractC0786o0.k("Listening for flick gestures.");
                    }
                    if (this.f31511a == null || this.f31512b == null) {
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f31520j && (sensorManager = this.f31511a) != null && (sensor = this.f31512b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f31520j = false;
                    AbstractC0786o0.k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
