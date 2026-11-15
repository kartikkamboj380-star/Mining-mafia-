package W0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import app.notifee.core.Logger;
import app.notifee.core.NotificationAlarmReceiver;
import app.notifee.core.model.NotificationModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f6507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.common.util.concurrent.r f6508b;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        f6507a = executorServiceNewCachedThreadPool;
        f6508b = com.google.common.util.concurrent.s.b(executorServiceNewCachedThreadPool);
    }

    public static PendingIntent a(String str) {
        try {
            Context context = b9.f.f11648a;
            Intent intent = new Intent(context, (Class<?>) NotificationAlarmReceiver.class);
            intent.putExtra("notificationId", str);
            return PendingIntent.getBroadcast(context, str.hashCode(), intent, 167772160);
        } catch (Exception e10) {
            Logger.e("NotifeeAlarmManager", "Unable to create AlarmManager intent", e10);
            return null;
        }
    }

    public static com.google.common.util.concurrent.p b() {
        return new b9.h(X0.i.i(b9.f.f11648a).j(Boolean.TRUE)).b(new com.google.common.util.concurrent.d() { // from class: W0.f0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return g0.e((List) obj);
            }
        }, f6508b);
    }

    public static com.google.common.util.concurrent.p c(Bundle bundle, NotificationModel notificationModel, String str, b9.v vVar, Void r10) {
        if (!bundle.containsKey("repeatFrequency") || b9.q.a(bundle.get("repeatFrequency")) == -1) {
            X0.i.i(b9.f.f11648a).m(str);
        } else {
            Y0.d dVar = new Y0.d(bundle);
            dVar.a();
            g(notificationModel, dVar);
            X0.i.i(b9.f.f11648a).y(new b9.v(str, vVar.f11671b, b9.q.c(bundle), Boolean.TRUE));
        }
        return com.google.common.util.concurrent.j.c(null);
    }

    public static com.google.common.util.concurrent.p d(final String str, final b9.v vVar) {
        byte[] bArr;
        if (vVar == null || vVar.f11671b == null || (bArr = vVar.f11672c) == null) {
            Logger.w("NotifeeAlarmManager", "Attempted to handle doScheduledWork but no notification data was found.");
            return com.google.common.util.concurrent.j.c(null);
        }
        final Bundle bundleB = b9.q.b(bArr);
        final NotificationModel notificationModel = new NotificationModel(b9.q.b(vVar.f11671b));
        return new b9.h(E0.y(notificationModel, bundleB)).b(new com.google.common.util.concurrent.d() { // from class: W0.e0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return g0.c(bundleB, notificationModel, str, vVar, (Void) obj);
            }
        }, f6507a);
    }

    public static com.google.common.util.concurrent.p e(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PendingIntent pendingIntentA = a(((b9.v) it.next()).f11670a);
                AlarmManager alarmManagerA = b9.a.a();
                if (pendingIntentA != null) {
                    alarmManagerA.cancel(pendingIntentA);
                }
            }
        }
        return com.google.common.util.concurrent.j.c(null);
    }

    public static void f(Bundle bundle) {
        final String string;
        if (bundle == null || (string = bundle.getString("notificationId")) == null) {
            return;
        }
        b9.h hVar = new b9.h(new X0.i(b9.f.f11648a).p(string));
        com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d() { // from class: W0.c0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return g0.d(string, (b9.v) obj);
            }
        };
        ExecutorService executorService = f6507a;
        hVar.b(dVar, executorService).a(new b9.b() { // from class: W0.d0
            @Override // b9.b
            public final void a(Exception exc, Object obj) {
                g0.h(exc, obj);
            }
        }, executorService);
    }

    public static void g(NotificationModel notificationModel, Y0.d dVar) {
        PendingIntent pendingIntentA = a(notificationModel.c());
        AlarmManager alarmManagerA = b9.a.a();
        Y0.d.a aVar = dVar.f6848e;
        if (Build.VERSION.SDK_INT >= 31 && Arrays.asList(Y0.d.a.SET_EXACT, Y0.d.a.SET_EXACT_AND_ALLOW_WHILE_IDLE, Y0.d.a.SET_ALARM_CLOCK).contains(aVar) && !alarmManagerA.canScheduleExactAlarms()) {
            System.err.println("Missing SCHEDULE_EXACT_ALARM permission. Trigger not scheduled. See: https://notifee.app/react-native/docs/triggers#android-12-limitations");
            return;
        }
        dVar.a();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            alarmManagerA.set(1, dVar.f6850g.longValue(), pendingIntentA);
            return;
        }
        if (iOrdinal == 1) {
            androidx.core.app.e.b(alarmManagerA, 0, dVar.f6850g.longValue(), pendingIntentA);
            return;
        }
        if (iOrdinal == 2) {
            androidx.core.app.e.c(alarmManagerA, 0, dVar.f6850g.longValue(), pendingIntentA);
            return;
        }
        if (iOrdinal == 3) {
            androidx.core.app.e.d(alarmManagerA, 0, dVar.f6850g.longValue(), pendingIntentA);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            Context context = b9.f.f11648a;
            androidx.core.app.e.a(alarmManagerA, dVar.f6850g.longValue(), PendingIntent.getActivity(context, notificationModel.c().hashCode(), context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 201326592), pendingIntentA);
        }
    }

    public static /* synthetic */ void h(Exception exc, Object obj) {
        if (exc != null) {
            Logger.e("NotifeeAlarmManager", "Failed to display notification", exc);
        }
    }

    public void i() {
        Logger.d("NotifeeAlarmManager", "Reschedule Notifications on reboot");
        com.google.common.util.concurrent.j.a(new X0.i(b9.f.f11648a).j(Boolean.TRUE), new a(), f6508b);
    }

    public class a implements com.google.common.util.concurrent.i {
        public a() {
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            byte[] bArr;
            for (b9.v vVar : (List) obj) {
                g0.this.getClass();
                byte[] bArr2 = vVar.f11671b;
                if (bArr2 != null && (bArr = vVar.f11672c) != null) {
                    Bundle bundleB = b9.q.b(bArr);
                    NotificationModel notificationModel = new NotificationModel(b9.q.b(bArr2));
                    if (b9.q.a(bundleB.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) == 0) {
                        Y0.d dVar = new Y0.d(bundleB);
                        if (dVar.f6847d.booleanValue()) {
                            g0.g(notificationModel, dVar);
                        }
                    }
                }
            }
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
        }
    }
}
