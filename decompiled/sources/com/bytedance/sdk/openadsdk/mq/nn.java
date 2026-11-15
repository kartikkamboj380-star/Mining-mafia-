package com.bytedance.sdk.openadsdk.mq;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    public static WeakReference<kq> kq;
    protected static final float[] oq = new float[3];
    protected static final float[] bob = new float[3];
    protected static final float[] fou = new float[9];
    protected static final float[] csi = new float[3];

    public static void bob(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kq> weakReference = kq;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            rjo.kq("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void fou(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kq> weakReference = kq;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            rjo.kq("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void kq(Context context, SensorEventListener sensorEventListener) {
    }

    public static void oq(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kq> weakReference = kq;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            rjo.kq("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void kq(kq kqVar) {
        kq = new WeakReference<>(kqVar);
    }

    public static void kq(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kq> weakReference = kq;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            rjo.kq("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void kq(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
