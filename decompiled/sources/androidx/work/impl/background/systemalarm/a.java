package androidx.work.impl.background.systemalarm;

import S0.i;
import S0.j;
import S0.l;
import S0.m;
import T0.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11290a = q.i("Alarms");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    static class C0182a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j jVarG = workDatabase.g();
        i iVarA = jVarG.a(mVar);
        if (iVarA != null) {
            b(context, mVar, iVarA.f5366c);
            q.e().a(f11290a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            jVarG.d(mVar);
        }
    }

    private static void b(Context context, m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        q.e().a(f11290a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j10) {
        j jVarG = workDatabase.g();
        i iVarA = jVarG.a(mVar);
        if (iVarA != null) {
            b(context, mVar, iVarA.f5366c);
            d(context, mVar, iVarA.f5366c, j10);
        } else {
            int iC = new k(workDatabase).c();
            jVarG.g(l.a(mVar, iC));
            d(context, mVar, iC, j10);
        }
    }

    private static void d(Context context, m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 201326592);
        if (alarmManager != null) {
            C0182a.a(alarmManager, 0, j10, service);
        }
    }
}
