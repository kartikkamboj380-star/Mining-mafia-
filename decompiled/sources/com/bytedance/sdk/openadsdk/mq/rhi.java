package com.bytedance.sdk.openadsdk.mq;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private Context kq;
    private WeakReference<syt> oq;
    private Map<String, kq> bob = new HashMap();
    private SensorEventListener fou = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            syt sytVarFou;
            if (sensorEvent.sensor.getType() != 1 || (sytVarFou = rhi.this.fou()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                sytVarFou.kq("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener csi = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            syt sytVarFou;
            if (sensorEvent.sensor.getType() != 4 || (sytVarFou = rhi.this.fou()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                sytVarFou.kq("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener rhi = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            syt sytVarFou;
            if (sensorEvent.sensor.getType() != 10 || (sytVarFou = rhi.this.fou()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                sytVarFou.kq("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener rjo = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = nn.oq;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = nn.bob;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = nn.fou;
            SensorManager.getRotationMatrix(fArr5, null, nn.oq, nn.bob);
            float[] fArr6 = nn.csi;
            SensorManager.getOrientation(fArr5, fArr6);
            syt sytVarFou = rhi.this.fou();
            if (sytVarFou == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                sytVarFou.kq("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    interface kq {
        JSONObject kq(JSONObject jSONObject);
    }

    public rhi(syt sytVar) {
        this.kq = sytVar.kq();
        this.oq = new WeakReference<>(sytVar);
        bob();
    }

    private void bob() {
        this.bob.put("adInfo", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.45
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                if (sytVarFou == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectGm = sytVarFou.gm();
                if (jSONObjectGm != null) {
                    jSONObjectGm.put("code", 1);
                    return jSONObjectGm;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.bob.put("appInfo", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.56
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = rhi.this.kq().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                syt sytVarFou = rhi.this.fou();
                if (sytVarFou != null) {
                    jSONObject2.put("deviceId", sytVarFou.rjo());
                    jSONObject2.put("netType", sytVarFou.mxq());
                    jSONObject2.put("innerAppName", sytVarFou.fou());
                    jSONObject2.put("appName", sytVarFou.csi());
                    jSONObject2.put("appVersion", sytVarFou.rhi());
                    Map<String, String> mapOq = sytVarFou.oq();
                    for (String str : mapOq.keySet()) {
                        jSONObject2.put(str, mapOq.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.bob.put("playableSDKInfo", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.62
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.bob.put("subscribe_app_ad", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.63
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("download_app_ad", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.64
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("isViewable", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.2
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                if (sytVarFou == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", sytVarFou.dgq());
                return jSONObject3;
            }
        });
        this.bob.put("getVolume", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.3
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                if (sytVarFou == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", sytVarFou.syt());
                return jSONObject3;
            }
        });
        this.bob.put("getScreenSize", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.4
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                if (sytVarFou == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectWcx = sytVarFou.wcx();
                jSONObjectWcx.put("code", 1);
                return jSONObjectWcx;
            }
        });
        this.bob.put("start_accelerometer_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.5
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        rjo.kq("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nn.kq(rhi.this.kq, rhi.this.fou, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("close_accelerometer_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.6
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nn.kq(rhi.this.kq, rhi.this.fou);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    rjo.kq("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bob.put("start_gyro_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.7
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        rjo.kq("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nn.oq(rhi.this.kq, rhi.this.csi, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("close_gyro_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.8
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nn.kq(rhi.this.kq, rhi.this.csi);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    rjo.kq("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bob.put("start_accelerometer_grativityless_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.9
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        rjo.kq("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nn.bob(rhi.this.kq, rhi.this.rhi, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("close_accelerometer_grativityless_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.10
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nn.kq(rhi.this.kq, rhi.this.rhi);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    rjo.kq("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bob.put("start_rotation_vector_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.11
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        rjo.kq("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nn.fou(rhi.this.kq, rhi.this.rjo, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("close_rotation_vector_observer", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.13
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nn.kq(rhi.this.kq, rhi.this.rjo);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    rjo.kq("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bob.put("device_shake", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.14
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nn.kq(rhi.this.kq, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    rjo.kq("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bob.put("device_shake_short", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.15
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nn.kq(rhi.this.kq, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    rjo.kq("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bob.put("playable_style", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.16
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectBob = sytVarFou.bob();
                jSONObjectBob.put("code", 1);
                return jSONObjectBob;
            }
        });
        this.bob.put("sendReward", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.17
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.mq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playableInteractionTriggered", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.18
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.jhe();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("webview_time_track", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.19
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) {
                return new JSONObject();
            }
        });
        this.bob.put("playable_event", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.20
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.oq(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("reportAd", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.21
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("close", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.22
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("openAdLandPageLinks", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.24
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("get_viewport", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.25
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectFax = sytVarFou.fax();
                jSONObjectFax.put("code", 1);
                return jSONObjectFax;
            }
        });
        this.bob.put("jssdk_load_finish", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.26
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.zfx();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_material_render_result", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.27
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.dgq(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("detect_change_playable_click", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.28
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNn = sytVarFou.nn();
                jSONObjectNn.put("code", 1);
                return jSONObjectNn;
            }
        });
        this.bob.put("check_camera_permission", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.29
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectWki = sytVarFou.wki();
                jSONObjectWki.put("code", 1);
                return jSONObjectWki;
            }
        });
        this.bob.put("check_external_storage", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.30
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSuf = sytVarFou.suf();
                if (jSONObjectSuf.isNull("result")) {
                    jSONObjectSuf.put("code", -1);
                    return jSONObjectSuf;
                }
                jSONObjectSuf.put("code", 1);
                return jSONObjectSuf;
            }
        });
        this.bob.put("playable_open_camera", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.31
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_pick_photo", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.32
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_download_media_in_photos", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.33
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.kq(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_preventTouchEvent", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.35
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.oq(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_settings_info", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.36
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNze = sytVarFou.nze();
                jSONObjectNze.put("code", 1);
                return jSONObjectNze;
            }
        });
        this.bob.put("playable_load_main_scene", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.37
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.uml();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_enter_section", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.38
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.fou(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_end", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.39
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.nb();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_finish_play_playable", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.40
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.ou();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_transfrom_module_show", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.41
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.ebt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_transfrom_module_change_color", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.42
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.ibd();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_set_scroll_rect", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.43
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_click_area", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.44
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.csi(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_real_play_start", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.46
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_material_first_frame_show", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.47
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.rs();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_stuck_check_pong", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.48
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.ha();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_material_adnormal_mask", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.49
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                sytVarFou.rhi(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_long_press_panel", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.50
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_alpha_player_play", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.51
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_transfrom_module_highlight", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.52
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_send_click_event", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.53
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_query_media_permission_declare", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.54
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectRjo = sytVarFou.rjo(jSONObject);
                jSONObjectRjo.put("code", 1);
                return jSONObjectRjo;
            }
        });
        this.bob.put("playable_query_media_permission_enable", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.55
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                syt sytVarFou = rhi.this.fou();
                JSONObject jSONObject2 = new JSONObject();
                if (sytVarFou == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSyt = sytVarFou.syt(jSONObject);
                jSONObjectSyt.put("code", 1);
                return jSONObjectSyt;
            }
        });
        this.bob.put("playable_apply_media_permission", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.57
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_start_kws", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.58
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_close_kws", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.59
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_video_preload_task_add", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.60
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bob.put("playable_video_preload_task_cancel", new kq() { // from class: com.bytedance.sdk.openadsdk.mq.rhi.61
            @Override // com.bytedance.sdk.openadsdk.mq.rhi.kq
            public JSONObject kq(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.mq.kq kqVarCsi = rhi.this.csi();
                JSONObject jSONObject2 = new JSONObject();
                if (kqVarCsi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.mq.kq csi() {
        syt sytVarFou = fou();
        if (sytVarFou == null) {
            return null;
        }
        return sytVarFou.sns();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public syt fou() {
        WeakReference<syt> weakReference = this.oq;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Set<String> kq() {
        return this.bob.keySet();
    }

    public void oq() {
        nn.kq(this.kq, this.fou);
        nn.kq(this.kq, this.csi);
        nn.kq(this.kq, this.rhi);
        nn.kq(this.kq, this.rjo);
    }

    public JSONObject kq(String str, JSONObject jSONObject) {
        try {
            kq kqVar = this.bob.get(str);
            if (kqVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return kqVar.kq(jSONObject);
        } catch (Throwable th) {
            rjo.kq("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
