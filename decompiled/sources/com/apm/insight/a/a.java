package com.apm.insight.a;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f12703d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f12704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f12705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f12706c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f12707e = false;

    private a() {
    }

    public static a a() {
        if (f12703d == null) {
            synchronized (a.class) {
                try {
                    if (f12703d == null) {
                        f12703d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12703d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f12704a = str;
        this.f12705b = aVar;
        this.f12706c = aVar2;
        if (this.f12707e) {
            return;
        }
        this.f12707e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
