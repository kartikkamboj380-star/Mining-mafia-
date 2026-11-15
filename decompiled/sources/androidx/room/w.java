package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class w extends A0.h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10914g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f10915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f10916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10918f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(A0.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorK0 = db.K0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z9 = false;
                if (cursorK0.moveToFirst() && cursorK0.getInt(0) == 0) {
                    z9 = true;
                }
                p229w8.c.a(cursorK0, null);
                return z9;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p229w8.c.a(cursorK0, th);
                    throw th2;
                }
            }
        }

        public final boolean b(A0.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorK0 = db.K0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z9 = false;
                if (cursorK0.moveToFirst() && cursorK0.getInt(0) != 0) {
                    z9 = true;
                }
                p229w8.c.a(cursorK0, null);
                return z9;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p229w8.c.a(cursorK0, th);
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    public static abstract class b {
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(A0.g gVar);

        public abstract void dropAllTables(A0.g gVar);

        public abstract void onCreate(A0.g gVar);

        public abstract void onOpen(A0.g gVar);

        public abstract void onPostMigrate(A0.g gVar);

        public abstract void onPreMigrate(A0.g gVar);

        public abstract c onValidateSchema(A0.g gVar);

        protected void validateMigration(@NotNull A0.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10920b;

        public c(boolean z9, String str) {
            this.f10919a = z9;
            this.f10920b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f10915c = configuration;
        this.f10916d = delegate;
        this.f10917e = identityHash;
        this.f10918f = legacyHash;
    }

    private final void h(A0.g gVar) {
        if (!f10914g.b(gVar)) {
            c cVarOnValidateSchema = this.f10916d.onValidateSchema(gVar);
            if (cVarOnValidateSchema.f10919a) {
                this.f10916d.onPostMigrate(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f10920b);
            }
        }
        Cursor cursorF1 = gVar.f1(new A0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorF1.moveToFirst() ? cursorF1.getString(0) : null;
            p229w8.c.a(cursorF1, null);
            if (Intrinsics.b(this.f10917e, string) || Intrinsics.b(this.f10918f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f10917e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p229w8.c.a(cursorF1, th);
                throw th2;
            }
        }
    }

    private final void i(A0.g gVar) {
        gVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(A0.g gVar) {
        i(gVar);
        gVar.p(v.a(this.f10917e));
    }

    @Override // A0.h.a
    public void b(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.b(db);
    }

    @Override // A0.h.a
    public void d(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean zA = f10914g.a(db);
        this.f10916d.createAllTables(db);
        if (!zA) {
            c cVarOnValidateSchema = this.f10916d.onValidateSchema(db);
            if (!cVarOnValidateSchema.f10919a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f10920b);
            }
        }
        j(db);
        this.f10916d.onCreate(db);
    }

    @Override // A0.h.a
    public void e(A0.g db, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db, "db");
        g(db, i10, i11);
    }

    @Override // A0.h.a
    public void f(A0.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.f(db);
        h(db);
        this.f10916d.onOpen(db);
        this.f10915c = null;
    }

    @Override // A0.h.a
    public void g(A0.g db, int i10, int i11) {
        List listD;
        Intrinsics.checkNotNullParameter(db, "db");
        f fVar = this.f10915c;
        if (fVar == null || (listD = fVar.f10811d.d(i10, i11)) == null) {
            f fVar2 = this.f10915c;
            if (fVar2 != null && !fVar2.a(i10, i11)) {
                this.f10916d.dropAllTables(db);
                this.f10916d.createAllTables(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f10916d.onPreMigrate(db);
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((p231x0.b) it.next()).a(db);
        }
        c cVarOnValidateSchema = this.f10916d.onValidateSchema(db);
        if (cVarOnValidateSchema.f10919a) {
            this.f10916d.onPostMigrate(db);
            j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.f10920b);
        }
    }
}
