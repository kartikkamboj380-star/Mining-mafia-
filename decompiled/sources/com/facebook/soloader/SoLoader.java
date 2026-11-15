package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static x f16522b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f16533m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f16523c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Context f16524d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile E[] f16525e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f16526f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static p055f4.i f16527g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f16528h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f16529i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f16530j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f16531k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f16532l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f16534n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static l f16535o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f16521a = true;

    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    private static int A() {
        f16523c.writeLock().lock();
        try {
            int i10 = f16533m;
            int i11 = (i10 & 2) != 0 ? 1 : 0;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                i11 |= 4;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                i11 |= 8;
            }
            return i11;
        } finally {
            f16523c.writeLock().unlock();
        }
    }

    private static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    private static p055f4.h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, p055f4.h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f16523c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (hVar == null) {
                try {
                    hVar = j();
                    if (hVar == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (v e10) {
                    p.c("SoLoader", "Base APK not found during recovery", e10);
                    throw e10;
                } catch (Exception e11) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, hVar)) {
                f16526f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return hVar;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th) {
            f16523c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, p055f4.h hVar) {
        p045e4.b.h(hVar);
        try {
            boolean zA = hVar.a(unsatisfiedLinkError, f16525e);
            p045e4.b.g(null);
            return zA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p045e4.b.g(th);
                throw th2;
            }
        }
    }

    private static void a(ArrayList arrayList, int i10) {
        C1413a c1413a = new C1413a(f16524d, i10);
        p.a("SoLoader", "Adding application source: " + c1413a.toString());
        arrayList.add(0, c1413a);
    }

    private static void b(Context context, ArrayList arrayList, boolean z9) {
        if ((f16533m & 8) != 0) {
            return;
        }
        arrayList.add(0, new C1415c(context, "lib-main", !z9));
    }

    private static void c(Context context, ArrayList arrayList) {
        C1416d c1416d = new C1416d(context);
        p.a("SoLoader", "validating/adding directApk source: " + c1416d.toString());
        if (c1416d.o()) {
            arrayList.add(0, c1416d);
        }
    }

    private static void d(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C1418f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z9;
        ReentrantReadWriteLock reentrantReadWriteLock = f16523c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f16525e == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z9 = true;
            } else {
                z9 = false;
            }
            if (f16521a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (E e10 : f16525e) {
                            if (x(e10, str, i10, threadPolicy)) {
                                f16523c.readLock().unlock();
                                if (f16521a) {
                                    if (str2 != null) {
                                        Api18TraceUtils.b();
                                    }
                                    Api18TraceUtils.b();
                                }
                                if (z9) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw B.b(str, f16524d, f16525e);
                    } catch (IOException e11) {
                        C c10 = new C(str, e11.toString());
                        c10.initCause(e11);
                        throw c10;
                    }
                } catch (Throwable th) {
                    f16523c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                if (f16521a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z9) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            f16523c.readLock().unlock();
            throw th3;
        }
    }

    private static int h(Context context) {
        int i10 = f16534n;
        if (i10 != 0) {
            return i10;
        }
        int i11 = 1;
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i12 = applicationInfo.flags;
        if ((i12 & 1) != 0) {
            i11 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 3 : 2;
        }
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i11);
        return i11;
    }

    private static int i() {
        int i10 = f16534n;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) {
        k(context, i10, null);
    }

    private static synchronized p055f4.h j() {
        p055f4.i iVar;
        iVar = f16527g;
        return iVar == null ? null : iVar.get();
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zO = o(context);
            f16532l = zO;
            if (zO) {
                int iH = h(context);
                f16534n = iH;
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0 && SysUtil.l(context, iH)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                p035d4.a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                p035d4.a.b(new p035d4.c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void l(Context context, l lVar) {
        synchronized (SoLoader.class) {
            f16535o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z9) {
        try {
            k(context, z9 ? 1 : 0, null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void n() {
        if (f16525e != null) {
            return;
        }
        f16523c.writeLock().lock();
        try {
            if (f16525e == null) {
                f16525e = new E[0];
            }
        } finally {
            f16523c.writeLock().unlock();
        }
    }

    private static boolean o(Context context) {
        String packageName;
        if (f16535o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
            } catch (Exception e10) {
                e = e10;
                p.h("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e11) {
            e = e11;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void p(Context context, x xVar, int i10) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f16524d = context;
                f16527g = new p055f4.f(context, B(i10));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null || f16522b == null) {
            if (xVar != null) {
                f16522b = xVar;
            } else {
                f16522b = new o(new y());
            }
        }
    }

    private static void q(Context context, int i10) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f16525e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f16523c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f16525e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f16533m = i10;
                ArrayList arrayList = new ArrayList();
                boolean z9 = true;
                boolean z10 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
                boolean z11 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
                if (z10) {
                    e(context, arrayList);
                } else if (z11) {
                    d(arrayList);
                    arrayList.add(0, new C1417e("base"));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i10 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f16534n)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i10 & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 0) {
                                z9 = false;
                            }
                            b(context, arrayList, z9);
                        }
                    }
                }
                E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
                int iA = A();
                int length = eArr.length;
                while (true) {
                    int i11 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                    boolean z12 = f16521a;
                    if (z12) {
                        Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                    }
                    eArr[i11].e(iA);
                    if (z12) {
                        Api18TraceUtils.b();
                    }
                    length = i11;
                }
                f16525e = eArr;
                f16526f.getAndIncrement();
                p.d("SoLoader", "init finish: " + f16525e.length + " SO sources prepared");
                writeLock = f16523c.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            f16523c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean r() {
        if (f16525e != null) {
            return true;
        }
        f16523c.readLock().lock();
        try {
            return f16525e != null;
        } finally {
            f16523c.readLock().unlock();
        }
    }

    static void s(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        p045e4.b.d(str, i10);
        try {
            p045e4.b.c(null, w(str, null, null, i10 | 1, threadPolicy));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p045e4.b.c(th, false);
                throw th2;
            }
        }
    }

    public static boolean t(String str) {
        return f16532l ? u(str, 0) : p035d4.a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean boolZ = z(str);
        if (boolZ != null) {
            return boolZ.booleanValue();
        }
        if (!f16532l) {
            return p035d4.a.d(str);
        }
        if (f16534n != 2) {
        }
        return y(str, i10);
    }

    private static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        p055f4.h hVarC = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                hVarC = C(str, e10, hVarC);
            }
        }
    }

    private static boolean w(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z9;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f16530j.contains(str2)) {
            return false;
        }
        Set set = f16528h;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z9 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z9 = true;
                }
                Map map = f16529i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map map2 = f16531k;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f16523c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z9) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z9 = true;
                            }
                            if (!z9) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i10, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e10) {
                                    String message = e10.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e10;
                                    }
                                    throw new a(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i10 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f16530j.contains(str2)) {
                                        boolean z10 = f16521a;
                                        if (z10 && f16535o == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            try {
                                                p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                                l lVar = f16535o;
                                                if (lVar != null) {
                                                    lVar.a(str2);
                                                } else {
                                                    r.a(str2);
                                                }
                                                f16530j.add(str2);
                                                if (z10 && f16535o == null) {
                                                    Api18TraceUtils.b();
                                                }
                                            } catch (UnsatisfiedLinkError e11) {
                                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                            }
                                        } catch (Throwable th) {
                                            if (f16521a && f16535o == null) {
                                                Api18TraceUtils.b();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z9;
                    }
                } catch (Throwable th3) {
                    f16523c.readLock().unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static boolean x(E e10, String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        p045e4.b.l(e10);
        try {
            boolean z9 = e10.d(str, i10, threadPolicy) != 0;
            p045e4.b.k(null);
            return z9;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p045e4.b.k(th);
                throw th2;
            }
        }
    }

    private static boolean y(String str, int i10) {
        l lVar = f16535o;
        String strB = lVar != null ? lVar.b(str) : r.b(str);
        String str2 = strB != null ? strB : str;
        p045e4.b.f(str, strB, i10);
        try {
            boolean zV = v(System.mapLibraryName(str2), str, strB, i10, null);
            p045e4.b.e(null, zV);
            return zV;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p045e4.b.e(th, false);
                throw th2;
            }
        }
    }

    private static Boolean z(String str) {
        Boolean boolValueOf;
        if (f16525e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f16523c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f16525e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = f16528h.contains(str);
                            boolean z9 = !zContains;
                            if (!zContains) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z9);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            f16523c.readLock().unlock();
            throw th2;
        }
    }
}
