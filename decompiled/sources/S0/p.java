package S0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f5378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f5379b;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(A0.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.S0(1);
            } else {
                kVar.r0(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.S0(2);
            } else {
                kVar.r0(2, nVar.b());
            }
        }
    }

    public p(androidx.room.u uVar) {
        this.f5378a = uVar;
        this.f5379b = new a(uVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // S0.o
    public void a(n nVar) {
        this.f5378a.assertNotSuspendingTransaction();
        this.f5378a.beginTransaction();
        try {
            this.f5379b.insert(nVar);
            this.f5378a.setTransactionSuccessful();
        } finally {
            this.f5378a.endTransaction();
        }
    }

    @Override // S0.o
    public List b(String str) {
        androidx.room.x xVarH = androidx.room.x.h("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            xVarH.S0(1);
        } else {
            xVarH.r0(1, str);
        }
        this.f5378a.assertNotSuspendingTransaction();
        Cursor cursorB = p241y0.b.b(this.f5378a, xVarH, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarH.release();
        }
    }
}
