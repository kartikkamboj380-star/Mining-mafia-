package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f13177a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f13178b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f13179c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f13180d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f13181e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13182a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f13182a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13182a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13182a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13182a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13182a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f13182a[crashType.ordinal()];
        if (i10 == 1) {
            this.f13177a.add(iCrashCallback);
            this.f13178b.add(iCrashCallback);
            this.f13179c.add(iCrashCallback);
            this.f13180d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f13180d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f13178b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f13177a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f13179c.add(iCrashCallback);
        }
    }

    final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f13182a[crashType.ordinal()];
        if (i10 == 1) {
            this.f13177a.remove(iCrashCallback);
            this.f13178b.remove(iCrashCallback);
            this.f13179c.remove(iCrashCallback);
            this.f13180d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f13180d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f13178b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f13177a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f13179c.remove(iCrashCallback);
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f13178b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f13179c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f13180d;
    }

    final void a(IOOMCallback iOOMCallback) {
        this.f13181e.add(iOOMCallback);
    }

    final void b(IOOMCallback iOOMCallback) {
        this.f13181e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f13181e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f13177a;
    }
}
