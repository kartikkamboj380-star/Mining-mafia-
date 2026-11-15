package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    @NotNull
    public static final c Companion = new c(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private C1185c autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private A0.h internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @Nullable
    protected List<? extends b> mCallbacks;

    @Nullable
    protected volatile A0.g mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final o invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends p231x0.a>, p231x0.a> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f10884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f10885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f10887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f10888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f10889f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Executor f10890g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Executor f10891h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private A0.h.c f10892i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f10893j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f10894k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Intent f10895l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f10896m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f10897n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f10898o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private TimeUnit f10899p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final e f10900q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Set f10901r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Set f10902s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f10903t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private File f10904u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Callable f10905v;

        public a(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f10884a = context;
            this.f10885b = klass;
            this.f10886c = str;
            this.f10887d = new ArrayList();
            this.f10888e = new ArrayList();
            this.f10889f = new ArrayList();
            this.f10894k = d.AUTOMATIC;
            this.f10896m = true;
            this.f10898o = -1L;
            this.f10900q = new e();
            this.f10901r = new LinkedHashSet();
        }

        public a a(b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f10887d.add(callback);
            return this;
        }

        public a b(p231x0.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f10902s == null) {
                this.f10902s = new HashSet();
            }
            for (p231x0.b bVar : migrations) {
                Set set = this.f10902s;
                Intrinsics.c(set);
                set.add(Integer.valueOf(bVar.f50513a));
                Set set2 = this.f10902s;
                Intrinsics.c(set2);
                set2.add(Integer.valueOf(bVar.f50514b));
            }
            this.f10900q.b((p231x0.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.f10893j = true;
            return this;
        }

        public u d() {
            Executor executor = this.f10890g;
            if (executor == null && this.f10891h == null) {
                Executor executorF = p140o.c.f();
                this.f10891h = executorF;
                this.f10890g = executorF;
            } else if (executor != null && this.f10891h == null) {
                this.f10891h = executor;
            } else if (executor == null) {
                this.f10890g = this.f10891h;
            }
            Set set = this.f10902s;
            if (set != null) {
                Intrinsics.c(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f10901r.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            A0.h.c zVar = this.f10892i;
            if (zVar == null) {
                zVar = new B0.f();
            }
            if (zVar != null) {
                if (this.f10898o > 0) {
                    if (this.f10886c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f10898o;
                    TimeUnit timeUnit = this.f10899p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f10890g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    zVar = new androidx.room.e(zVar, new C1185c(j10, timeUnit, executor2));
                }
                String str = this.f10903t;
                if (str != null || this.f10904u != null || this.f10905v != null) {
                    if (this.f10886c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f10904u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f10905v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    zVar = new z(str, file, callable, zVar);
                }
            } else {
                zVar = null;
            }
            A0.h.c cVar = zVar;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f10884a;
            String str2 = this.f10886c;
            e eVar = this.f10900q;
            List list = this.f10887d;
            boolean z9 = this.f10893j;
            d dVarE = this.f10894k.e(context);
            Executor executor3 = this.f10890g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f10891h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            androidx.room.f fVar = new androidx.room.f(context, str2, cVar, eVar, list, z9, dVarE, executor3, executor4, this.f10895l, this.f10896m, this.f10897n, this.f10901r, this.f10903t, this.f10904u, this.f10905v, null, this.f10888e, this.f10889f);
            u uVar = (u) t.b(this.f10885b, "_Impl");
            uVar.init(fVar);
            return uVar;
        }

        public a e() {
            this.f10896m = false;
            this.f10897n = true;
            return this;
        }

        public a f(A0.h.c cVar) {
            this.f10892i = cVar;
            return this;
        }

        public a g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f10890g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(A0.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void b(A0.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(A0.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean d(ActivityManager activityManager) {
            return A0.c.b(activityManager);
        }

        public final d e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !d((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f10910a = new LinkedHashMap();

        private final void a(p231x0.b bVar) {
            int i10 = bVar.f50513a;
            int i11 = bVar.f50514b;
            Map map = this.f10910a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap2.put(Integer.valueOf(i11), bVar);
        }

        private final List e(List list, boolean z9, int i10, int i11) {
            boolean z10;
            do {
                if (z9) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f10910a.get(Integer.valueOf(i10));
                if (treeMap != null) {
                    Iterator it = (z9 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        Integer targetVersion = (Integer) it.next();
                        if (!z9) {
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i11 <= iIntValue && iIntValue < i10) {
                                Object obj = treeMap.get(targetVersion);
                                Intrinsics.c(obj);
                                list.add(obj);
                                i10 = targetVersion.intValue();
                                z10 = true;
                                break;
                                break;
                            }
                        } else {
                            int i12 = i10 + 1;
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (i12 <= iIntValue2 && iIntValue2 <= i11) {
                                Object obj2 = treeMap.get(targetVersion);
                                Intrinsics.c(obj2);
                                list.add(obj2);
                                i10 = targetVersion.intValue();
                                z10 = true;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z10);
            return null;
        }

        public void b(p231x0.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (p231x0.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int i10, int i11) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map mapG = (Map) mapF.get(Integer.valueOf(i10));
            if (mapG == null) {
                mapG = E.g();
            }
            return mapG.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return CollectionsKt.i();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map f() {
            return this.f10910a;
        }
    }

    public static abstract class f {
    }

    static final class g extends kotlin.jvm.internal.m implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A0.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            u.this.a();
            return null;
        }
    }

    static final class h extends kotlin.jvm.internal.m implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A0.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            u.this.b();
            return null;
        }
    }

    public u() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        assertNotMainThread();
        A0.g gVarJ0 = getOpenHelper().J0();
        getInvalidationTracker().v(gVarJ0);
        if (gVarJ0.a1()) {
            gVarJ0.H();
        } else {
            gVarJ0.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        getOpenHelper().J0().L();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().m();
    }

    private final Object c(Class cls, A0.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof androidx.room.g) {
            return c(cls, ((androidx.room.g) hVar).getDelegate());
        }
        return null;
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(u uVar, A0.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return uVar.query(jVar, cancellationSignal);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        C1185c c1185c = this.autoCloser;
        if (c1185c == null) {
            a();
        } else {
            c1185c.g(new g());
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().s();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public A0.k compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().J0().t0(sql);
    }

    @NotNull
    protected abstract o createInvalidationTracker();

    @NotNull
    protected abstract A0.h createOpenHelper(@NotNull androidx.room.f fVar);

    public void endTransaction() {
        C1185c c1185c = this.autoCloser;
        if (c1185c == null) {
            b();
        } else {
            c1185c.g(new h());
        }
    }

    @NotNull
    protected final Map<Class<? extends p231x0.a>, p231x0.a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @NotNull
    public List<p231x0.b> getAutoMigrations(@NotNull Map<Class<? extends p231x0.a>, p231x0.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.i();
    }

    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    @NotNull
    public o getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public A0.h getOpenHelper() {
        A0.h hVar = this.internalOpenHelper;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("internalOpenHelper");
        return null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.r("internalQueryExecutor");
        return null;
    }

    @NotNull
    public Set<Class<? extends p231x0.a>> getRequiredAutoMigrationSpecs() {
        return M.d();
    }

    @NotNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return E.g();
    }

    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.r("internalTransactionExecutor");
        return null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().J0().X0();
    }

    public void init(@NotNull androidx.room.f configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends p231x0.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends p231x0.a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends p231x0.a> next = it.next();
                int size = configuration.f10825r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.f10825r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, (p231x0.a) configuration.f10825r.get(i10));
            } else {
                int size2 = configuration.f10825r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (p231x0.b bVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.f10811d.c(bVar.f50513a, bVar.f50514b)) {
                        configuration.f10811d.b(bVar);
                    }
                }
                y yVar = (y) c(y.class, getOpenHelper());
                if (yVar != null) {
                    yVar.h(configuration);
                }
                androidx.room.d dVar = (androidx.room.d) c(androidx.room.d.class, getOpenHelper());
                if (dVar != null) {
                    this.autoCloser = dVar.f10781b;
                    getInvalidationTracker().p(dVar.f10781b);
                }
                boolean z9 = configuration.f10814g == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z9);
                this.mCallbacks = configuration.f10812e;
                this.internalQueryExecutor = configuration.f10815h;
                this.internalTransactionExecutor = new C(configuration.f10816i);
                this.allowMainThreadQueries = configuration.f10813f;
                this.writeAheadLoggingEnabled = z9;
                if (configuration.f10817j != null) {
                    if (configuration.f10809b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().q(configuration.f10808a, configuration.f10809b, configuration.f10817j);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f10824q.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i13 = size3 - 1;
                            if (cls.isAssignableFrom(configuration.f10824q.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i13 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i13;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.f10824q.get(size3));
                    }
                }
                int size4 = configuration.f10824q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f10824q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(@NotNull A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        getInvalidationTracker().j(db);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        C1185c c1185c = this.autoCloser;
        if (c1185c == null) {
            A0.g gVar = this.mDatabase;
            if (gVar != null) {
                zIsOpen = gVar.isOpen();
            } else {
                boolValueOf = null;
            }
            return Intrinsics.b(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = c1185c.l();
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.b(boolValueOf, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        A0.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    @NotNull
    public final Cursor query(@NotNull A0.j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(@NotNull Map<Class<? extends p231x0.a>, p231x0.a> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().J0().D();
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().J0().f1(new A0.a(query, objArr));
    }

    @NotNull
    public Cursor query(@NotNull A0.j query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().J0().h0(query, cancellationSignal);
        }
        return getOpenHelper().J0().f1(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }
}
