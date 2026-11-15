package S0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f5383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f5384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.A f5385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.A f5386d;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(A0.k kVar, q qVar) throws Throwable {
            if (qVar.b() == null) {
                kVar.S0(1);
            } else {
                kVar.r0(1, qVar.b());
            }
            byte[] bArrO = androidx.work.e.o(qVar.a());
            if (bArrO == null) {
                kVar.S0(2);
            } else {
                kVar.F0(2, bArrO);
            }
        }
    }

    class b extends androidx.room.A {
        b(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends androidx.room.A {
        c(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(androidx.room.u uVar) {
        this.f5383a = uVar;
        this.f5384b = new a(uVar);
        this.f5385c = new b(uVar);
        this.f5386d = new c(uVar);
    }

    public static List d() {
        return Collections.EMPTY_LIST;
    }

    @Override // S0.r
    public void a(String str) {
        this.f5383a.assertNotSuspendingTransaction();
        A0.k kVarAcquire = this.f5385c.acquire();
        if (str == null) {
            kVarAcquire.S0(1);
        } else {
            kVarAcquire.r0(1, str);
        }
        this.f5383a.beginTransaction();
        try {
            kVarAcquire.r();
            this.f5383a.setTransactionSuccessful();
        } finally {
            this.f5383a.endTransaction();
            this.f5385c.release(kVarAcquire);
        }
    }

    @Override // S0.r
    public void b(q qVar) {
        this.f5383a.assertNotSuspendingTransaction();
        this.f5383a.beginTransaction();
        try {
            this.f5384b.insert(qVar);
            this.f5383a.setTransactionSuccessful();
        } finally {
            this.f5383a.endTransaction();
        }
    }

    @Override // S0.r
    public void c() {
        this.f5383a.assertNotSuspendingTransaction();
        A0.k kVarAcquire = this.f5386d.acquire();
        this.f5383a.beginTransaction();
        try {
            kVarAcquire.r();
            this.f5383a.setTransactionSuccessful();
        } finally {
            this.f5383a.endTransaction();
            this.f5386d.release(kVarAcquire);
        }
    }
}
