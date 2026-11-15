package S0;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f5362b;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(A0.k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.S0(1);
            } else {
                kVar.r0(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.S0(2);
            } else {
                kVar.B0(2, dVar.b().longValue());
            }
        }
    }

    public f(androidx.room.u uVar) {
        this.f5361a = uVar;
        this.f5362b = new a(uVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // S0.e
    public void a(d dVar) {
        this.f5361a.assertNotSuspendingTransaction();
        this.f5361a.beginTransaction();
        try {
            this.f5362b.insert(dVar);
            this.f5361a.setTransactionSuccessful();
        } finally {
            this.f5361a.endTransaction();
        }
    }

    @Override // S0.e
    public Long b(String str) {
        androidx.room.x xVarH = androidx.room.x.h("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            xVarH.S0(1);
        } else {
            xVarH.r0(1, str);
        }
        this.f5361a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorB = p241y0.b.b(this.f5361a, xVarH, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            xVarH.release();
        }
    }
}
