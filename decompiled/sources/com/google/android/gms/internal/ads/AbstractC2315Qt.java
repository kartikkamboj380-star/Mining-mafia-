package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2315Qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceExecutorServiceC1805Gx0 f22473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceExecutorServiceC1805Gx0 f22474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceExecutorServiceC1805Gx0 f22475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f22476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceScheduledExecutorServiceC1857Hx0 f22477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceExecutorServiceC1805Gx0 f22478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceExecutorServiceC1805Gx0 f22479g;

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceC;
        ExecutorService executorServiceA;
        if (ClientLibraryUtils.isPackageSide()) {
            AbstractC3518fj0.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC2159Nt("Default")));
        } else {
            AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.Lc;
            if (H4.B.c().e(abstractC2759Zh) == null || !((Boolean) H4.B.c().e(abstractC2759Zh)).booleanValue()) {
                threadPoolExecutor = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC2159Nt("Default"));
            } else {
                AbstractC2759Zh abstractC2759Zh2 = AbstractC3892ii.Mc;
                if (H4.B.c().e(abstractC2759Zh2) != null) {
                    AbstractC2759Zh abstractC2759Zh3 = AbstractC3892ii.Nc;
                    if (H4.B.c().e(abstractC2759Zh3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) H4.B.c().e(abstractC2759Zh2)).intValue(), ((Integer) H4.B.c().e(abstractC2759Zh2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2159Nt("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) H4.B.c().e(abstractC2759Zh3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC2159Nt("Default"));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC2159Nt("Default"));
                }
            }
        }
        byte[] bArr = null;
        f22473a = new C2263Pt(threadPoolExecutor, bArr);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceC = AbstractC3518fj0.a().c(5, new ThreadFactoryC2159Nt("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2159Nt("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceC = threadPoolExecutor3;
        }
        f22474b = new C2263Pt(executorServiceC, bArr);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceA = AbstractC3518fj0.a().a(new ThreadFactoryC2159Nt("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2159Nt("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceA = threadPoolExecutor4;
        }
        f22475c = new C2263Pt(executorServiceA, bArr);
        C2107Mt c2107Mt = new C2107Mt(3, new ThreadFactoryC2159Nt("Schedule"));
        f22476d = c2107Mt;
        f22477e = AbstractC2272Px0.c(c2107Mt);
        f22478f = new C2263Pt(new ExecutorC2211Ot(), bArr);
        f22479g = new C2263Pt(AbstractC2272Px0.a(), bArr);
    }
}
