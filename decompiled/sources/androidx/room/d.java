package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements A0.h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0.h f10780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1185c f10781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f10782c;

    public static final class a implements A0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1185c f10783a;

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        static final class C0170a extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0170a f10784a = new C0170a();

            C0170a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(A0.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.o();
            }
        }

        static final class b extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f10785a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f10785a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A0.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.p(this.f10785a);
                return null;
            }
        }

        static final class c extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f10786a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object[] f10787b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f10786a = str;
                this.f10787b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A0.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.E(this.f10786a, this.f10787b);
                return null;
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$a$d, reason: collision with other inner class name */
        /* synthetic */ class C0171d extends kotlin.jvm.internal.k implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0171d f10788a = new C0171d();

            C0171d() {
                super(1, A0.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A0.g p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return Boolean.valueOf(p10.X0());
            }
        }

        static final class e extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f10789a = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A0.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Boolean.valueOf(db.a1());
            }
        }

        static final class f extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f10790a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(A0.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.Y();
            }
        }

        static final class g extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f10791a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A0.g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        static final class h extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f10792a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f10793b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f10794c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f10795d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f10796e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f10792a = str;
                this.f10793b = i10;
                this.f10794c = contentValues;
                this.f10795d = str2;
                this.f10796e = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(A0.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Integer.valueOf(db.D0(this.f10792a, this.f10793b, this.f10794c, this.f10795d, this.f10796e));
            }
        }

        public a(C1185c autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f10783a = autoCloser;
        }

        @Override // A0.g
        public void D() {
            Unit unit;
            A0.g gVarH = this.f10783a.h();
            if (gVarH != null) {
                gVarH.D();
                unit = Unit.f45918a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // A0.g
        public int D0(String table, int i10, ContentValues values, String str, Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f10783a.g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // A0.g
        public void E(String sql, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f10783a.g(new c(sql, bindArgs));
        }

        @Override // A0.g
        public void H() {
            try {
                this.f10783a.j().H();
            } catch (Throwable th) {
                this.f10783a.e();
                throw th;
            }
        }

        @Override // A0.g
        public Cursor K0(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f10783a.j().K0(query), this.f10783a);
            } catch (Throwable th) {
                this.f10783a.e();
                throw th;
            }
        }

        @Override // A0.g
        public void L() {
            if (this.f10783a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                A0.g gVarH = this.f10783a.h();
                Intrinsics.c(gVarH);
                gVarH.L();
            } finally {
                this.f10783a.e();
            }
        }

        @Override // A0.g
        public boolean X0() {
            if (this.f10783a.h() == null) {
                return false;
            }
            return ((Boolean) this.f10783a.g(C0171d.f10788a)).booleanValue();
        }

        @Override // A0.g
        public String Y() {
            return (String) this.f10783a.g(f.f10790a);
        }

        public final void a() {
            this.f10783a.g(g.f10791a);
        }

        @Override // A0.g
        public boolean a1() {
            return ((Boolean) this.f10783a.g(e.f10789a)).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10783a.d();
        }

        @Override // A0.g
        public Cursor f1(A0.j query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f10783a.j().f1(query), this.f10783a);
            } catch (Throwable th) {
                this.f10783a.e();
                throw th;
            }
        }

        @Override // A0.g
        public Cursor h0(A0.j query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f10783a.j().h0(query, cancellationSignal), this.f10783a);
            } catch (Throwable th) {
                this.f10783a.e();
                throw th;
            }
        }

        @Override // A0.g
        public boolean isOpen() {
            A0.g gVarH = this.f10783a.h();
            if (gVarH == null) {
                return false;
            }
            return gVarH.isOpen();
        }

        @Override // A0.g
        public void l() {
            try {
                this.f10783a.j().l();
            } catch (Throwable th) {
                this.f10783a.e();
                throw th;
            }
        }

        @Override // A0.g
        public List o() {
            return (List) this.f10783a.g(C0170a.f10784a);
        }

        @Override // A0.g
        public void p(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f10783a.g(new b(sql));
        }

        @Override // A0.g
        public A0.k t0(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f10783a);
        }
    }

    private static final class b implements A0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1185c f10798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f10799c;

        static final class a extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f10800a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(A0.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.l0());
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$b$b, reason: collision with other inner class name */
        static final class C0172b extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f10802b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172b(Function1 function1) {
                super(1);
                this.f10802b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A0.g db) {
                Intrinsics.checkNotNullParameter(db, "db");
                A0.k kVarT0 = db.t0(b.this.f10797a);
                b.this.h(kVarT0);
                return this.f10802b.invoke(kVarT0);
            }
        }

        static final class c extends kotlin.jvm.internal.m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f10803a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(A0.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.r());
            }
        }

        public b(String sql, C1185c autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f10797a = sql;
            this.f10798b = autoCloser;
            this.f10799c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(A0.k kVar) {
            ArrayList arrayList = this.f10799c;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                arrayList.get(i11);
                i11++;
                int i12 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.r();
                }
                Object obj = this.f10799c.get(i10);
                if (obj == null) {
                    kVar.S0(i12);
                } else if (obj instanceof Long) {
                    kVar.B0(i12, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.t(i12, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.r0(i12, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.F0(i12, (byte[]) obj);
                }
                i10 = i12;
            }
        }

        private final Object j(Function1 function1) {
            return this.f10798b.g(new C0172b(function1));
        }

        private final void n(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f10799c.size() && (size = this.f10799c.size()) <= i11) {
                while (true) {
                    this.f10799c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f10799c.set(i11, obj);
        }

        @Override // A0.i
        public void B0(int i10, long j10) {
            n(i10, Long.valueOf(j10));
        }

        @Override // A0.i
        public void F0(int i10, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            n(i10, value);
        }

        @Override // A0.i
        public void S0(int i10) {
            n(i10, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // A0.k
        public long l0() {
            return ((Number) j(a.f10800a)).longValue();
        }

        @Override // A0.k
        public int r() {
            return ((Number) j(c.f10803a)).intValue();
        }

        @Override // A0.i
        public void r0(int i10, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            n(i10, value);
        }

        @Override // A0.i
        public void t(int i10, double d10) {
            n(i10, Double.valueOf(d10));
        }
    }

    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cursor f10804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1185c f10805b;

        public c(Cursor delegate, C1185c autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f10804a = delegate;
            this.f10805b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10804a.close();
            this.f10805b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f10804a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f10804a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f10804a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f10804a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f10804a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f10804a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f10804a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f10804a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f10804a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f10804a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f10804a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f10804a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f10804a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f10804a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return A0.c.a(this.f10804a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return A0.f.a(this.f10804a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f10804a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f10804a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f10804a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f10804a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f10804a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f10804a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f10804a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f10804a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f10804a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f10804a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f10804a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f10804a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f10804a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f10804a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f10804a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f10804a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f10804a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f10804a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f10804a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f10804a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f10804a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            A0.e.a(this.f10804a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f10804a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            A0.f.b(this.f10804a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f10804a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f10804a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(A0.h delegate, C1185c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f10780a = delegate;
        this.f10781b = autoCloser;
        autoCloser.k(getDelegate());
        this.f10782c = new a(autoCloser);
    }

    @Override // A0.h
    public A0.g J0() {
        this.f10782c.a();
        return this.f10782c;
    }

    @Override // A0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10782c.close();
    }

    @Override // A0.h
    public String getDatabaseName() {
        return this.f10780a.getDatabaseName();
    }

    @Override // androidx.room.g
    public A0.h getDelegate() {
        return this.f10780a;
    }

    @Override // A0.h
    public void setWriteAheadLoggingEnabled(boolean z9) {
        this.f10780a.setWriteAheadLoggingEnabled(z9);
    }
}
