package com.bytedance.sdk.openadsdk.uml;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi implements fou {
    Handler kq = null;
    private fou oq;

    csi(fou fouVar) {
        this.oq = fouVar;
    }

    private Context syt() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public String bob() {
        fou fouVar = this.oq;
        return (fouVar == null || TextUtils.isEmpty(fouVar.bob())) ? "null" : this.oq.bob();
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public String csi() {
        fou fouVar = this.oq;
        if (fouVar != null) {
            return fouVar.csi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public Handler fou() {
        fou fouVar = this.oq;
        if (fouVar != null && fouVar.rjo() != null) {
            return this.oq.fou();
        }
        Handler handler = new Handler(kq("pag_strategy", -1).getLooper());
        this.kq = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public ExecutorService kq() {
        fou fouVar = this.oq;
        return (fouVar == null || fouVar.kq() == null) ? Executors.newCachedThreadPool() : this.oq.kq();
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public Context oq() {
        fou fouVar = this.oq;
        return (fouVar == null || fouVar.oq() == null) ? syt() : this.oq.oq();
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public JSONObject rhi() {
        fou fouVar = this.oq;
        if (fouVar != null) {
            return fouVar.rhi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public Map<String, String> rjo() {
        fou fouVar = this.oq;
        return (fouVar == null || fouVar.rjo() == null) ? new HashMap() : this.oq.rjo();
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public JSONObject kq(JSONObject jSONObject) {
        fou fouVar = this.oq;
        return fouVar != null ? fouVar.kq(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.uml.fou
    public HandlerThread kq(String str, int i10) {
        HandlerThread handlerThreadKq;
        fou fouVar = this.oq;
        if (fouVar != null && (handlerThreadKq = fouVar.kq(str, i10)) != null) {
            return handlerThreadKq;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
