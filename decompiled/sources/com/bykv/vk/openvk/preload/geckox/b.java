package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f13462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f13463s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f13465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f13466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f13467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f13468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f13469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f13470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f13471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f13472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f13473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f13474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f13475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f13476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f13477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f13478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f13479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f13480q;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f13481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f13482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f13483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f13484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f13485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f13486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f13487g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f13488h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f13489i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f13490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f13491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f13492l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private File f13493m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f13494n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f13495o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f13496p;

        public a(Context context) {
            this.f13484d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f13483c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f13482b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f13492l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f13481a = iNetWork;
            return this;
        }

        public final a b() {
            this.f13489i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f13496p = j10;
            return this;
        }

        public final a b(String str) {
            this.f13491k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f13486f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f13487g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f13488h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f13490j = str;
            return this;
        }

        public final a a(File file) {
            this.f13493m = file;
            return this;
        }
    }

    /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f13462r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f13463s == null) {
            synchronized (b.class) {
                try {
                    if (f13463s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f13463s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13463s;
    }

    public final Context a() {
        return this.f13464a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f13470g;
    }

    public final boolean c() {
        return this.f13478o;
    }

    public final List<String> d() {
        return this.f13469f;
    }

    public final List<String> e() {
        return this.f13468e;
    }

    public final JSONObject f() {
        return this.f13480q;
    }

    public final INetWork i() {
        return this.f13467d;
    }

    public final String j() {
        return this.f13474k;
    }

    public final long k() {
        return this.f13471h.longValue();
    }

    public final String l() {
        return this.f13476m;
    }

    public final String m() {
        return this.f13475l;
    }

    public final File n() {
        return this.f13477n;
    }

    public final String o() {
        return this.f13472i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f13465b;
    }

    public final IStatisticMonitor q() {
        return this.f13466c;
    }

    public final String r() {
        return this.f13473j;
    }

    public final long s() {
        return this.f13479p;
    }

    private b(a aVar) {
        Context context = aVar.f13484d;
        this.f13464a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f13482b;
        this.f13468e = list;
        this.f13469f = aVar.f13483c;
        this.f13465b = aVar.f13485e;
        this.f13470g = aVar.f13488h;
        Long l10 = aVar.f13489i;
        this.f13471h = l10;
        if (TextUtils.isEmpty(aVar.f13490j)) {
            this.f13472i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f13472i = aVar.f13490j;
        }
        String str = aVar.f13491k;
        this.f13473j = str;
        this.f13475l = aVar.f13494n;
        this.f13476m = aVar.f13495o;
        this.f13479p = aVar.f13496p;
        if (aVar.f13493m == null) {
            this.f13477n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f13477n = aVar.f13493m;
        }
        String str2 = aVar.f13492l;
        this.f13474k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f13467d = aVar.f13481a;
        this.f13466c = aVar.f13486f;
        this.f13478o = aVar.f13487g;
    }

    public final void a(JSONObject jSONObject) {
        this.f13480q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f13462r = iThreadPoolCallback;
    }
}
