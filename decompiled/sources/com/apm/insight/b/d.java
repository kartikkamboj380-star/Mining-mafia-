package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.l.m;
import com.unity3d.services.core.di.ServiceProvider;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f12750a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f12751b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f12752c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static FileObserver f12753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f12754e;

    public static boolean b() {
        return f12752c;
    }

    public static void c() {
        f12754e = null;
    }

    public static void a(final String str, final h.a aVar) {
        FileObserver fileObserver = f12753d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i10, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f12750a = aVar.a();
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        };
        f12753d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static JSONObject a() {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", m.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            return null;
        }
    }

    static String a(Context context) {
        if (SystemClock.uptimeMillis() - f12751b < ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = com.apm.insight.l.a.a(context);
            if (processErrorStateInfoA != null && Process.myPid() == processErrorStateInfoA.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f12754e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfoA.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfoA.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfoA.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfoA.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfoA.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfoA.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfoA.longMsg))) {
                    return null;
                }
                f12754e = processErrorStateInfoA;
                f12750a = null;
                f12751b = SystemClock.uptimeMillis();
                f12752c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("|------------- processErrorStateInfo--------------|\n");
                sb.append("condition: " + processErrorStateInfoA.condition + "\n");
                sb.append("processName: " + processErrorStateInfoA.processName + "\n");
                sb.append("pid: " + processErrorStateInfoA.pid + "\n");
                sb.append("uid: " + processErrorStateInfoA.uid + "\n");
                sb.append("tag: " + processErrorStateInfoA.tag + "\n");
                sb.append("shortMsg : " + processErrorStateInfoA.shortMsg + "\n");
                sb.append("longMsg : " + processErrorStateInfoA.longMsg + "\n");
                sb.append("-----------------------end----------------------------");
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        String str = f12750a;
        if (str == null) {
            return null;
        }
        f12752c = true;
        f12750a = null;
        f12751b = SystemClock.uptimeMillis();
        return str;
    }
}
