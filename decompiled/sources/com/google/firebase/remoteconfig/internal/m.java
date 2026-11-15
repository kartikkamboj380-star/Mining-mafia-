package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7086c;
import p176r5.InterfaceC7093j;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f40599j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int[] f40600k = {2, 4, 8, 16, 32, 64, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H6.e f40601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G6.b f40602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f40603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f40604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f40605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f40606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f40607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f40608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f40609i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Date f40610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f40612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f40613d;

        private a(Date date, int i10, g gVar, String str) {
            this.f40610a = date;
            this.f40611b = i10;
            this.f40612c = gVar;
            this.f40613d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f40612c;
        }

        String e() {
            return this.f40613d;
        }

        int f() {
            return this.f40611b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40617a;

        b(String str) {
            this.f40617a = str;
        }

        String d() {
            return this.f40617a;
        }
    }

    public m(H6.e eVar, G6.b bVar, Executor executor, Clock clock, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map map) {
        this.f40601a = eVar;
        this.f40602b = bVar;
        this.f40603c = executor;
        this.f40604d = clock;
        this.f40605e = random;
        this.f40606f = fVar;
        this.f40607g = configFetchHttpClient;
        this.f40608h = tVar;
        this.f40609i = map;
    }

    public static /* synthetic */ Task a(m mVar, Task task, Task task2, Date date, Map map, Task task3) {
        mVar.getClass();
        if (task.isSuccessful()) {
            return !task2.isSuccessful() ? AbstractC7096m.e(new p008a7.h("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : mVar.l((String) task.getResult(), ((com.google.firebase.installations.g) task2.getResult()).b(), date, map);
        }
        return AbstractC7096m.e(new p008a7.h("Firebase Installations failed to get installation ID for fetch.", task.getException()));
    }

    public static /* synthetic */ Task c(m mVar, Date date, Task task) {
        mVar.x(task, date);
        return task;
    }

    private boolean f(long j10, Date date) {
        Date dateF = this.f40608h.f();
        if (dateF.equals(t.f40666f)) {
            return false;
        }
        return date.before(new Date(dateF.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private p008a7.l g(p008a7.l lVar) throws p008a7.h {
        String str;
        int iA = lVar.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new p008a7.h("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case PglCryptUtils.INPUT_INVALID /* 502 */:
                    case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                    case PglCryptUtils.BASE64_FAILED /* 504 */:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new p008a7.l(lVar.a(), "Fetch failed: " + str, lVar);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map map) throws p008a7.l, p008a7.j {
        Date date2;
        try {
            date2 = date;
            try {
                a aVarFetch = this.f40607g.fetch(this.f40607g.d(), str, str2, s(), this.f40608h.e(), map, p(), date2, this.f40608h.b());
                if (aVarFetch.d() != null) {
                    this.f40608h.n(aVarFetch.d().k());
                }
                if (aVarFetch.e() != null) {
                    this.f40608h.m(aVarFetch.e());
                }
                this.f40608h.j();
                return aVarFetch;
            } catch (p008a7.l e10) {
                e = e10;
                p008a7.l lVar = e;
                t.a aVarV = v(lVar.a(), date2);
                if (u(aVarV, lVar.a())) {
                    throw new p008a7.j(aVarV.a().getTime());
                }
                throw g(lVar);
            }
        } catch (p008a7.l e11) {
            e = e11;
            date2 = date;
        }
    }

    private Task l(String str, String str2, Date date, Map map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? AbstractC7096m.f(aVarK) : this.f40606f.i(aVarK.d()).o(this.f40603c, new InterfaceC7093j() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // p176r5.InterfaceC7093j
                public final Task then(Object obj) {
                    return AbstractC7096m.f(aVarK);
                }
            });
        } catch (p008a7.i e10) {
            return AbstractC7096m.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task m(Task task, long j10, final Map map) {
        final m mVar;
        Task taskJ;
        final Date date = new Date(this.f40604d.currentTimeMillis());
        if (task.isSuccessful() && f(j10, date)) {
            return AbstractC7096m.f(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            taskJ = AbstractC7096m.e(new p008a7.j(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            mVar = this;
        } else {
            final Task id = this.f40601a.getId();
            final Task taskA = this.f40601a.a(false);
            mVar = this;
            taskJ = AbstractC7096m.k(id, taskA).j(this.f40603c, new InterfaceC7086c() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // p176r5.InterfaceC7086c
                public final Object a(Task task2) {
                    return m.a(this.f40589a, id, taskA, date, map, task2);
                }
            });
        }
        return taskJ.j(mVar.f40603c, new InterfaceC7086c() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task2) {
                return m.c(this.f40594a, date, task2);
            }
        });
    }

    private Date o(Date date) {
        Date dateA = this.f40608h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long p() {
        p037d6.a aVar = (p037d6.a) this.f40602b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.e(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f40600k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f40605e.nextInt((int) millis));
    }

    private Map s() {
        HashMap map = new HashMap();
        p037d6.a aVar = (p037d6.a) this.f40602b.get();
        if (aVar != null) {
            for (Map.Entry entry : aVar.e(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private boolean u(t.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    private t.a v(int i10, Date date) {
        if (t(i10)) {
            w(date);
        }
        return this.f40608h.a();
    }

    private void w(Date date) {
        int iB = this.f40608h.a().b() + 1;
        this.f40608h.l(iB, new Date(date.getTime() + q(iB)));
    }

    private void x(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f40608h.r(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof p008a7.j) {
            this.f40608h.s();
        } else {
            this.f40608h.q();
        }
    }

    public Task i() {
        return j(this.f40608h.h());
    }

    public Task j(final long j10) {
        final HashMap map = new HashMap(this.f40609i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.d() + "/1");
        return this.f40606f.e().j(this.f40603c, new InterfaceC7086c() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task) {
                return this.f40586a.m(task, j10, map);
            }
        });
    }

    public Task n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f40609i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.d() + "/" + i10);
        return this.f40606f.e().j(this.f40603c, new InterfaceC7086c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task) {
                return this.f40596a.m(task, 0L, map);
            }
        });
    }

    public long r() {
        return this.f40608h.g();
    }
}
