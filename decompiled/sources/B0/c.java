package B0;

import A0.j;
import A0.k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import p259z8.o;

/* JADX INFO: loaded from: classes.dex */
public final class c implements A0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f146b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f147c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f148d = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f149a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f150a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f150a = jVar;
        }

        @Override // p259z8.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor d(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f150a;
            Intrinsics.c(sQLiteQuery);
            jVar.c(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f149a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor j(o tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor n(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.c(sQLiteQuery);
        query.c(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // A0.g
    public void D() {
        this.f149a.setTransactionSuccessful();
    }

    @Override // A0.g
    public int D0(String table, int i10, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(f147c[i10]);
        sb.append(table);
        sb.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb.append(i11 > 0 ? "," : "");
            sb.append(str2);
            objArr2[i11] = values.get(str2);
            sb.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        k kVarT0 = t0(string);
        A0.a.f14c.b(kVarT0, objArr2);
        return kVarT0.r();
    }

    @Override // A0.g
    public void E(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f149a.execSQL(sql, bindArgs);
    }

    @Override // A0.g
    public void H() {
        this.f149a.beginTransactionNonExclusive();
    }

    @Override // A0.g
    public Cursor K0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return f1(new A0.a(query));
    }

    @Override // A0.g
    public void L() {
        this.f149a.endTransaction();
    }

    @Override // A0.g
    public boolean X0() {
        return this.f149a.inTransaction();
    }

    @Override // A0.g
    public String Y() {
        return this.f149a.getPath();
    }

    @Override // A0.g
    public boolean a1() {
        return A0.b.b(this.f149a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f149a.close();
    }

    @Override // A0.g
    public Cursor f1(j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f149a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: B0.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.j(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.a(), f148d, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final boolean h(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.b(this.f149a, sqLiteDatabase);
    }

    @Override // A0.g
    public Cursor h0(final j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f149a;
        String strA = query.a();
        String[] strArr = f148d;
        Intrinsics.c(cancellationSignal);
        return A0.b.c(sQLiteDatabase, strA, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: B0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.n(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // A0.g
    public boolean isOpen() {
        return this.f149a.isOpen();
    }

    @Override // A0.g
    public void l() {
        this.f149a.beginTransaction();
    }

    @Override // A0.g
    public List o() {
        return this.f149a.getAttachedDbs();
    }

    @Override // A0.g
    public void p(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f149a.execSQL(sql);
    }

    @Override // A0.g
    public k t0(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f149a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }
}
