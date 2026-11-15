package com.apm.insight.k;

import com.apm.insight.CrashType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f12996a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12997a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f12997a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12997a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12997a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f12998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f12999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f13000c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.f13000c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f12998a = ((JSONArray) jSONObject.opt(JsonStorageKeyNames.DATA_KEY)).optJSONObject(0);
            } else {
                this.f12998a = jSONObject;
            }
            this.f12999b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f12998a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f12998a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i10 = AnonymousClass1.f12997a[this.f13000c.ordinal()];
            if (i10 == 1) {
                return this.f12998a.optString(JsonStorageKeyNames.DATA_KEY, null);
            }
            if (i10 == 2) {
                return this.f12998a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f12998a.optString(JsonStorageKeyNames.DATA_KEY, null);
        }
    }

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f12996a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f12996a.isEmpty()) {
            f12996a.poll();
        }
        f12996a = null;
    }
}
