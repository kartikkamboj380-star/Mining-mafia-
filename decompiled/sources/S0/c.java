package S0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0959b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f5356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f5357b;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(A0.k kVar, C0958a c0958a) {
            if (c0958a.b() == null) {
                kVar.S0(1);
            } else {
                kVar.r0(1, c0958a.b());
            }
            if (c0958a.a() == null) {
                kVar.S0(2);
            } else {
                kVar.r0(2, c0958a.a());
            }
        }
    }

    public c(androidx.room.u uVar) {
        this.f5356a = uVar;
        this.f5357b = new a(uVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // S0.InterfaceC0959b
    public List a(String str) {
        androidx.room.x xVarH = androidx.room.x.h("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            xVarH.S0(1);
        } else {
            xVarH.r0(1, str);
        }
        this.f5356a.assertNotSuspendingTransaction();
        Cursor cursorB = p241y0.b.b(this.f5356a, xVarH, false, null);
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

    @Override // S0.InterfaceC0959b
    public boolean b(String str) {
        androidx.room.x xVarH = androidx.room.x.h("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            xVarH.S0(1);
        } else {
            xVarH.r0(1, str);
        }
        this.f5356a.assertNotSuspendingTransaction();
        boolean z9 = false;
        Cursor cursorB = p241y0.b.b(this.f5356a, xVarH, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z9 = cursorB.getInt(0) != 0;
            }
            return z9;
        } finally {
            cursorB.close();
            xVarH.release();
        }
    }

    @Override // S0.InterfaceC0959b
    public boolean c(String str) {
        androidx.room.x xVarH = androidx.room.x.h("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            xVarH.S0(1);
        } else {
            xVarH.r0(1, str);
        }
        this.f5356a.assertNotSuspendingTransaction();
        boolean z9 = false;
        Cursor cursorB = p241y0.b.b(this.f5356a, xVarH, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z9 = cursorB.getInt(0) != 0;
            }
            return z9;
        } finally {
            cursorB.close();
            xVarH.release();
        }
    }

    @Override // S0.InterfaceC0959b
    public void d(C0958a c0958a) {
        this.f5356a.assertNotSuspendingTransaction();
        this.f5356a.beginTransaction();
        try {
            this.f5357b.insert(c0958a);
            this.f5356a.setTransactionSuccessful();
        } finally {
            this.f5356a.endTransaction();
        }
    }
}
