package A0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0001a f22b = new C0001a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23a;

        /* JADX INFO: renamed from: A0.h$a$a, reason: collision with other inner class name */
        public static final class C0001a {
            public /* synthetic */ C0001a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0001a() {
            }
        }

        public a(int i10) {
            this.f23a = i10;
        }

        private final void a(String str) {
            if (StringsKt.y(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z9 = false;
            while (i10 <= length) {
                boolean z10 = Intrinsics.e(str.charAt(!z9 ? i10 : length), 32) <= 0;
                if (z9) {
                    if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z10) {
                    i10++;
                } else {
                    z9 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                A0.b.a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String strY = db.Y();
                if (strY != null) {
                    a(strY);
                    return;
                }
                return;
            }
            List listO = null;
            try {
                try {
                    listO = db.o();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (listO != null) {
                    return;
                }
            } finally {
                if (listO != null) {
                    Iterator it = listO.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String strY2 = db.Y();
                    if (strY2 != null) {
                        a(strY2);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0002b f24f = new C0002b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f25a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f27c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f28d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f29e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Context f30a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f31b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private a f32c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f33d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f34e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f30a = context;
            }

            public a a(boolean z9) {
                this.f34e = z9;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f32c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f33d && ((str = this.f31b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f30a, this.f31b, aVar, this.f33d, this.f34e);
            }

            public a c(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f32c = callback;
                return this;
            }

            public a d(String str) {
                this.f31b = str;
                return this;
            }

            public a e(boolean z9) {
                this.f33d = z9;
                return this;
            }
        }

        /* JADX INFO: renamed from: A0.h$b$b, reason: collision with other inner class name */
        public static final class C0002b {
            public /* synthetic */ C0002b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            private C0002b() {
            }
        }

        public b(Context context, String str, a callback, boolean z9, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f25a = context;
            this.f26b = str;
            this.f27c = callback;
            this.f28d = z9;
            this.f29e = z10;
        }

        public static final a a(Context context) {
            return f24f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    g J0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z9);
}
