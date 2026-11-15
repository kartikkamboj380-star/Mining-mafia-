package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f10835q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f10836r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f10841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1185c f10842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f10844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile A0.k f10845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f10846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m f10847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p150p.b f10848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f10849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f10850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f10851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f10852p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(A0.g database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.a1()) {
                database.H();
            } else {
                database.l();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f10853e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f10854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f10855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f10856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10857d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f10854a = new long[i10];
            this.f10855b = new boolean[i10];
            this.f10856c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f10857d) {
                        return null;
                    }
                    long[] jArr = this.f10854a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z9 = jArr[i10] > 0;
                        boolean[] zArr = this.f10855b;
                        if (z9 != zArr[i11]) {
                            int[] iArr = this.f10856c;
                            if (!z9) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f10856c[i11] = 0;
                        }
                        zArr[i11] = z9;
                        i10++;
                        i11 = i12;
                    }
                    this.f10857d = false;
                    return (int[]) this.f10856c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z9;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z9 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f10854a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z9 = true;
                            this.f10857d = true;
                        }
                    }
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z9;
        }

        public final boolean c(int... tableIds) {
            boolean z9;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z9 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f10854a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z9 = true;
                            this.f10857d = true;
                        }
                    }
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z9;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f10855b, false);
                this.f10857d = true;
                Unit unit = Unit.f45918a;
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f10858a;

        public c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f10858a = tables;
        }

        public final String[] a() {
            return this.f10858a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f10859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f10860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f10861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f10862d;

        public d(c observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f10859a = observer;
            this.f10860b = tableIds;
            this.f10861c = tableNames;
            this.f10862d = !(tableNames.length == 0) ? M.c(tableNames[0]) : M.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f10860b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setD;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f10860b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setB = M.b();
                    int[] iArr2 = this.f10860b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setB.add(this.f10861c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setD = M.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f10862d : M.d();
                }
            } else {
                setD = M.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f10859a.c(setD);
        }

        public final void c(String[] tables) {
            Set setD;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f10861c.length;
            if (length == 0) {
                setD = M.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setD = M.d();
                        break;
                    } else {
                        if (StringsKt.y(tables[i10], this.f10861c[0], true)) {
                            setD = this.f10862d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setB = M.b();
                for (String str : tables) {
                    for (String str2 : this.f10861c) {
                        if (StringsKt.y(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = M.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f10859a.c(setD);
        }
    }

    public static final class e implements Runnable {
        e() {
        }

        private final Set a() {
            o oVar = o.this;
            Set setB = M.b();
            Cursor cursorQuery$default = u.query$default(oVar.f(), new A0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorQuery$default.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p229w8.c.a(cursorQuery$default, th);
                        throw th2;
                    }
                }
            }
            Unit unit = Unit.f45918a;
            p229w8.c.a(cursorQuery$default, null);
            Set setA = M.a(setB);
            if (setA.isEmpty()) {
                return setA;
            }
            if (o.this.e() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            A0.k kVarE = o.this.e();
            if (kVarE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVarE.r();
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            C1185c c1185c;
            Lock closeLock$room_runtime_release = o.this.f().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                    if (!o.this.d()) {
                        closeLock$room_runtime_release.unlock();
                        C1185c c1185c2 = o.this.f10842f;
                        if (c1185c2 != null) {
                            c1185c2.e();
                            return;
                        }
                        return;
                    }
                    if (!o.this.h().compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        C1185c c1185c3 = o.this.f10842f;
                        if (c1185c3 != null) {
                            c1185c3.e();
                            return;
                        }
                        return;
                    }
                    if (o.this.f().inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        C1185c c1185c4 = o.this.f10842f;
                        if (c1185c4 != null) {
                            c1185c4.e();
                            return;
                        }
                        return;
                    }
                    A0.g gVarJ0 = o.this.f().getOpenHelper().J0();
                    gVarJ0.H();
                    try {
                        setD = a();
                        gVarJ0.D();
                        gVarJ0.L();
                        closeLock$room_runtime_release.unlock();
                        c1185c = o.this.f10842f;
                        if (c1185c != null) {
                            c1185c.e();
                        }
                        if (setD.isEmpty()) {
                            return;
                        }
                        p150p.b bVarG = o.this.g();
                        o oVar = o.this;
                        synchronized (bVarG) {
                            try {
                                Iterator it = oVar.g().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                                }
                                Unit unit = Unit.f45918a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        gVarJ0.L();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    closeLock$room_runtime_release.unlock();
                    C1185c c1185c5 = o.this.f10842f;
                    if (c1185c5 != null) {
                        c1185c5.e();
                    }
                    throw th3;
                }
            } catch (SQLiteException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                setD = M.d();
                closeLock$room_runtime_release.unlock();
                c1185c = o.this.f10842f;
                if (c1185c != null) {
                }
            } catch (IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                setD = M.d();
                closeLock$room_runtime_release.unlock();
                c1185c = o.this.f10842f;
                if (c1185c != null) {
                }
            }
        }
    }

    public o(u database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f10837a = database;
        this.f10838b = shadowTablesMap;
        this.f10839c = viewTables;
        this.f10843g = new AtomicBoolean(false);
        this.f10846j = new b(tableNames.length);
        this.f10847k = new m(database);
        this.f10848l = new p150p.b();
        this.f10850n = new Object();
        this.f10851o = new Object();
        this.f10840d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f10840d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f10838b.get(tableNames[i10]);
            if (str2 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f10841e = strArr;
        for (Map.Entry entry : this.f10838b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f10840d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f10840d;
                map.put(lowerCase4, E.h(map, lowerCase3));
            }
        }
        this.f10852p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f10851o) {
            this.f10844h = false;
            this.f10846j.d();
            A0.k kVar = this.f10845i;
            if (kVar != null) {
                kVar.close();
                Unit unit = Unit.f45918a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set setB = M.b();
        for (String str : strArr) {
            Map map = this.f10839c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f10839c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.c(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        Object[] array = M.a(setB).toArray(new String[0]);
        Intrinsics.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void r(A0.g gVar, int i10) {
        gVar.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f10841e[i10];
        for (String str2 : f10836r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f10835q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.p(str3);
        }
    }

    private final void t(A0.g gVar, int i10) {
        String str = this.f10841e[i10];
        for (String str2 : f10836r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f10835q.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.p(str3);
        }
    }

    public void c(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrO = o(observer.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f10840d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrV0 = CollectionsKt.v0(arrayList);
        d dVar2 = new d(observer, iArrV0, strArrO);
        synchronized (this.f10848l) {
            dVar = (d) this.f10848l.i(observer, dVar2);
        }
        if (dVar == null && this.f10846j.b(Arrays.copyOf(iArrV0, iArrV0.length))) {
            u();
        }
    }

    public final boolean d() {
        if (!this.f10837a.isOpenInternal()) {
            return false;
        }
        if (!this.f10844h) {
            this.f10837a.getOpenHelper().J0();
        }
        if (this.f10844h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final A0.k e() {
        return this.f10845i;
    }

    public final u f() {
        return this.f10837a;
    }

    public final p150p.b g() {
        return this.f10848l;
    }

    public final AtomicBoolean h() {
        return this.f10843g;
    }

    public final Map i() {
        return this.f10840d;
    }

    public final void j(A0.g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f10851o) {
            if (this.f10844h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.p("PRAGMA temp_store = MEMORY;");
            database.p("PRAGMA recursive_triggers='ON';");
            database.p("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            v(database);
            this.f10845i = database.t0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f10844h = true;
            Unit unit = Unit.f45918a;
        }
    }

    public final void k(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f10848l) {
            try {
                for (Map.Entry entry : this.f10848l) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        if (this.f10843g.compareAndSet(false, true)) {
            C1185c c1185c = this.f10842f;
            if (c1185c != null) {
                c1185c.j();
            }
            this.f10837a.getQueryExecutor().execute(this.f10852p);
        }
    }

    public void n(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f10848l) {
            dVar = (d) this.f10848l.j(observer);
        }
        if (dVar != null) {
            b bVar = this.f10846j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                u();
            }
        }
    }

    public final void p(C1185c autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f10842f = autoCloser;
        autoCloser.m(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f10834a.l();
            }
        });
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f10849m = new r(context, name, serviceIntent, this, this.f10837a.getQueryExecutor());
    }

    public final void s() {
        r rVar = this.f10849m;
        if (rVar != null) {
            rVar.o();
        }
        this.f10849m = null;
    }

    public final void u() {
        if (this.f10837a.isOpenInternal()) {
            v(this.f10837a.getOpenHelper().J0());
        }
    }

    public final void v(A0.g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.X0()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f10837a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f10850n) {
                    int[] iArrA = this.f10846j.a();
                    if (iArrA != null) {
                        f10835q.a(database);
                        try {
                            int length = iArrA.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length) {
                                int i12 = iArrA[i10];
                                int i13 = i11 + 1;
                                if (i12 == 1) {
                                    r(database, i11);
                                } else if (i12 == 2) {
                                    t(database, i11);
                                }
                                i10++;
                                i11 = i13;
                            }
                            database.D();
                            database.L();
                            Unit unit = Unit.f45918a;
                        } catch (Throwable th) {
                            database.L();
                            throw th;
                        }
                    }
                }
                closeLock$room_runtime_release.unlock();
            } catch (Throwable th2) {
                closeLock$room_runtime_release.unlock();
                throw th2;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
