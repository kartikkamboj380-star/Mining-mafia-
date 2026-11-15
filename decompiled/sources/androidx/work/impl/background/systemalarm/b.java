package androidx.work.impl.background.systemalarm;

import K0.InterfaceC0752e;
import K0.v;
import K0.w;
import S0.m;
import S0.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC0752e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11291e = q.i("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11293b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11294c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f11295d;

    b(Context context, w wVar) {
        this.f11292a = context;
        this.f11295d = wVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent c(Context context, m mVar, boolean z9) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z9);
        return q(intent, mVar);
    }

    static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, e eVar) {
        q.e().a(f11291e, "Handling constraints changed " + intent);
        new c(this.f11292a, i10, eVar).a();
    }

    private void h(Intent intent, int i10, e eVar) {
        synchronized (this.f11294c) {
            try {
                m mVarP = p(intent);
                q qVarE = q.e();
                String str = f11291e;
                qVarE.a(str, "Handing delay met for " + mVarP);
                if (this.f11293b.containsKey(mVarP)) {
                    q.e().a(str, "WorkSpec " + mVarP + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    d dVar = new d(this.f11292a, i10, eVar, this.f11295d.d(mVarP));
                    this.f11293b.put(mVarP, dVar);
                    dVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i10) {
        m mVarP = p(intent);
        boolean z9 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        q.e().a(f11291e, "Handling onExecutionCompleted " + intent + ", " + i10);
        d(mVarP, z9);
    }

    private void j(Intent intent, int i10, e eVar) {
        q.e().a(f11291e, "Handling reschedule " + intent + ", " + i10);
        eVar.g().z();
    }

    private void k(Intent intent, int i10, e eVar) {
        m mVarP = p(intent);
        q qVarE = q.e();
        String str = f11291e;
        qVarE.a(str, "Handling schedule work for " + mVarP);
        WorkDatabase workDatabaseV = eVar.g().v();
        workDatabaseV.beginTransaction();
        try {
            u uVarJ = workDatabaseV.j().j(mVarP.b());
            if (uVarJ == null) {
                q.e().k(str, "Skipping scheduling " + mVarP + " because it's no longer in the DB");
                return;
            }
            if (uVarJ.f5394b.d()) {
                q.e().k(str, "Skipping scheduling " + mVarP + "because it is finished.");
                return;
            }
            long jC = uVarJ.c();
            if (uVarJ.h()) {
                q.e().a(str, "Opportunistically setting an alarm for " + mVarP + "at " + jC);
                a.c(this.f11292a, workDatabaseV, mVarP, jC);
                eVar.f().a().execute(new e.b(eVar, a(this.f11292a), i10));
            } else {
                q.e().a(str, "Setting up Alarms for " + mVarP + "at " + jC);
                a.c(this.f11292a, workDatabaseV, mVarP, jC);
            }
            workDatabaseV.setTransactionSuccessful();
        } finally {
            workDatabaseV.endTransaction();
        }
    }

    private void l(Intent intent, e eVar) {
        List<v> listC;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            listC = new ArrayList(1);
            v vVarB = this.f11295d.b(new m(string, i10));
            if (vVarB != null) {
                listC.add(vVarB);
            }
        } else {
            listC = this.f11295d.c(string);
        }
        for (v vVar : listC) {
            q.e().a(f11291e, "Handing stopWork work for " + string);
            eVar.g().E(vVar);
            a.a(this.f11292a, eVar.g().v(), vVar.a());
            eVar.d(vVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // K0.InterfaceC0752e
    public void d(m mVar, boolean z9) {
        synchronized (this.f11294c) {
            try {
                d dVar = (d) this.f11293b.remove(mVar);
                this.f11295d.b(mVar);
                if (dVar != null) {
                    dVar.h(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z9;
        synchronized (this.f11294c) {
            z9 = !this.f11293b.isEmpty();
        }
        return z9;
    }

    void o(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            q.e().c(f11291e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        q.e().k(f11291e, "Ignoring intent " + intent);
    }
}
