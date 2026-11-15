package B0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d implements A0.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f151h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A0.h.a f154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f158g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B0.c f159a;

        public b(B0.c cVar) {
            this.f159a = cVar;
        }

        public final B0.c a() {
            return this.f159a;
        }

        public final void b(B0.c cVar) {
            this.f159a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0005c f160h = new C0005c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final A0.h.a f163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C0.a f166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f167g;

        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f169b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f168a = callbackName;
                this.f169b = cause;
            }

            public final b a() {
                return this.f168a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f169b;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: B0.d$c$c, reason: collision with other inner class name */
        public static final class C0005c {
            public /* synthetic */ C0005c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final B0.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                B0.c cVarA = refHolder.a();
                if (cVarA != null && cVarA.h(sqLiteDatabase)) {
                    return cVarA;
                }
                B0.c cVar = new B0.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            private C0005c() {
            }
        }

        /* JADX INFO: renamed from: B0.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0006d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f176a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f176a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final A0.h.a callback, boolean z9) {
            String string;
            super(context, str, null, callback.f23a, new DatabaseErrorHandler() { // from class: B0.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.c(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f161a = context;
            this.f162b = dbRef;
            this.f163c = callback;
            this.f164d = z9;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f166f = new C0.a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(A0.h.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0005c c0005c = f160h;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0005c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase n(boolean z9) {
            if (z9) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase v(boolean z9) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z10 = this.f167g;
            if (databaseName != null && !z10 && (parentFile = this.f161a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return n(z9);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return n(z9);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i10 = C0006d.f176a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f164d) {
                        throw th;
                    }
                    this.f161a.deleteDatabase(databaseName);
                    try {
                        return n(z9);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C0.a.c(this.f166f, false, 1, null);
                super.close();
                this.f162b.b(null);
                this.f167g = false;
            } finally {
                this.f166f.d();
            }
        }

        public final A0.g h(boolean z9) {
            A0.g gVarJ;
            try {
                this.f166f.b((this.f167g || getDatabaseName() == null) ? false : true);
                this.f165e = false;
                SQLiteDatabase sQLiteDatabaseV = v(z9);
                if (this.f165e) {
                    close();
                    gVarJ = h(z9);
                } else {
                    gVarJ = j(sQLiteDatabaseV);
                }
                return gVarJ;
            } finally {
                this.f166f.d();
            }
        }

        public final B0.c j(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f160h.a(this.f162b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f165e && this.f163c.f23a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.f163c.b(j(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f163c.d(j(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.f165e = true;
            try {
                this.f163c.e(j(db), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f165e) {
                try {
                    this.f163c.f(j(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f167g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f165e = true;
            try {
                this.f163c.g(j(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: B0.d$d, reason: collision with other inner class name */
    static final class C0007d extends m implements Function0 {
        C0007d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f153b == null || !d.this.f155d) {
                cVar = new c(d.this.f152a, d.this.f153b, new b(null), d.this.f154c, d.this.f156e);
            } else {
                cVar = new c(d.this.f152a, new File(A0.d.a(d.this.f152a), d.this.f153b).getAbsolutePath(), new b(null), d.this.f154c, d.this.f156e);
            }
            A0.b.d(cVar, d.this.f158g);
            return cVar;
        }
    }

    public d(Context context, String str, A0.h.a callback, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f152a = context;
        this.f153b = str;
        this.f154c = callback;
        this.f155d = z9;
        this.f156e = z10;
        this.f157f = p129m8.g.a(new C0007d());
    }

    private final c w() {
        return (c) this.f157f.getValue();
    }

    @Override // A0.h
    public A0.g J0() {
        return w().h(true);
    }

    @Override // A0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f157f.isInitialized()) {
            w().close();
        }
    }

    @Override // A0.h
    public String getDatabaseName() {
        return this.f153b;
    }

    @Override // A0.h
    public void setWriteAheadLoggingEnabled(boolean z9) {
        if (this.f157f.isInitialized()) {
            A0.b.d(w(), z9);
        }
        this.f158g = z9;
    }
}
