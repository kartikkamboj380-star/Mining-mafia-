package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.wcx.oq;
import com.bytedance.sdk.openadsdk.wcx.oq.kq;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BusMonitorDependWrapper implements oq {
    private oq kq;
    private Handler oq;

    public BusMonitorDependWrapper(oq oqVar) {
        this.kq = oqVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public Context getContext() {
        oq oqVar = this.kq;
        return (oqVar == null || oqVar.getContext() == null) ? getReflectContext() : this.kq.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public Handler getHandler() {
        oq oqVar = this.kq;
        if (oqVar != null && oqVar.getHandler() != null) {
            return this.kq.getHandler();
        }
        if (this.oq == null) {
            this.oq = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.oq;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public int getOnceLogCount() {
        oq oqVar = this.kq;
        if (oqVar != null) {
            return oqVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public int getOnceLogInterval() {
        oq oqVar = this.kq;
        if (oqVar != null) {
            return oqVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public HandlerThread getSafeHandlerThread(String str, int i10) {
        HandlerThread safeHandlerThread;
        oq oqVar = this.kq;
        if (oqVar != null && (safeHandlerThread = oqVar.getSafeHandlerThread(str, i10)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        oq oqVar = this.kq;
        if (oqVar == null || (uploadIntervalTime = oqVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public boolean isMonitorOpen() {
        oq oqVar = this.kq;
        if (oqVar != null) {
            return oqVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.oq
    public void onMonitorUpload(List<kq> list) {
        oq oqVar = this.kq;
        if (oqVar != null) {
            oqVar.onMonitorUpload(list);
        }
    }
}
