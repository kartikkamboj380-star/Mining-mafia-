package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f9247d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static f f9250g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f9252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9246c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f9248e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f9249f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void d(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel f(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> g(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> h(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    static class c {
        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    private static class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f9253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f9254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f9255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f9256d;

        d(String str, int i10, String str2, Notification notification) {
            this.f9253a = str;
            this.f9254b = i10;
            this.f9255c = str2;
            this.f9256d = notification;
        }

        @Override // androidx.core.app.r.g
        public void a(p020c.a aVar) {
            aVar.l6(this.f9253a, this.f9254b, this.f9255c, this.f9256d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f9253a + ", id:" + this.f9254b + ", tag:" + this.f9255c + "]";
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f9257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f9258b;

        e(ComponentName componentName, IBinder iBinder) {
            this.f9257a = componentName;
            this.f9258b = iBinder;
        }
    }

    private static class f implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f9260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f9261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f9262d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set f9263e = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f9264a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            p020c.a f9266c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f9265b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque f9267d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f9268e = 0;

            a(ComponentName componentName) {
                this.f9264a = componentName;
            }
        }

        f(Context context) {
            this.f9259a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f9260b = handlerThread;
            handlerThread.start();
            this.f9261c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f9265b) {
                return true;
            }
            boolean zBindService = this.f9259a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f9264a), this, 33);
            aVar.f9265b = zBindService;
            if (zBindService) {
                aVar.f9268e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f9264a);
                this.f9259a.unbindService(this);
            }
            return aVar.f9265b;
        }

        private void b(a aVar) {
            if (aVar.f9265b) {
                this.f9259a.unbindService(this);
                aVar.f9265b = false;
            }
            aVar.f9266c = null;
        }

        private void c(g gVar) {
            j();
            for (a aVar : this.f9262d.values()) {
                aVar.f9267d.add(gVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f9262d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f9262d.get(componentName);
            if (aVar != null) {
                aVar.f9266c = p020c.a.AbstractBinderC0191a.J(iBinder);
                aVar.f9268e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f9262d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f9264a + ", " + aVar.f9267d.size() + " queued tasks");
            }
            if (aVar.f9267d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f9266c == null) {
                i(aVar);
                return;
            }
            while (true) {
                g gVar = (g) aVar.f9267d.peek();
                if (gVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + gVar);
                    }
                    gVar.a(aVar.f9266c);
                    aVar.f9267d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f9264a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f9264a, e10);
                }
            }
            if (aVar.f9267d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f9261c.hasMessages(3, aVar.f9264a)) {
                return;
            }
            int i10 = aVar.f9268e;
            int i11 = i10 + 1;
            aVar.f9268e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f9261c.sendMessageDelayed(this.f9261c.obtainMessage(3, aVar.f9264a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f9267d.size() + " tasks to " + aVar.f9264a + " after " + aVar.f9268e + " retries");
            aVar.f9267d.clear();
        }

        private void j() {
            Set setJ = r.j(this.f9259a);
            if (setJ.equals(this.f9263e)) {
                return;
            }
            this.f9263e = setJ;
            List<ResolveInfo> listQueryIntentServices = this.f9259a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setJ.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f9262d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f9262d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f9262d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(g gVar) {
            this.f9261c.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f9257a, eVar.f9258b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f9261c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f9261c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface g {
        void a(p020c.a aVar);
    }

    private r(Context context) {
        this.f9251a = context;
        this.f9252b = (NotificationManager) context.getSystemService("notification");
    }

    public static r i(Context context) {
        return new r(context);
    }

    public static Set j(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f9246c) {
            if (string != null) {
                try {
                    if (!string.equals(f9247d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f9248e = hashSet;
                        f9247d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f9248e;
        }
        return set;
    }

    private void q(g gVar) {
        synchronized (f9249f) {
            try {
                if (f9250g == null) {
                    f9250g = new f(this.f9251a.getApplicationContext());
                }
                f9250g.h(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean r(Notification notification) {
        Bundle bundleA = n.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f9252b);
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f9252b.cancel(str, i10);
    }

    public void d() {
        this.f9252b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f9252b, notificationChannel);
        }
    }

    public void f(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.b(this.f9252b, notificationChannelGroup);
        }
    }

    public void g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.c(this.f9252b, str);
        }
    }

    public void h(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.d(this.f9252b, str);
        }
    }

    public NotificationChannel k(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(this.f9252b, str);
        }
        return null;
    }

    public NotificationChannelGroup l(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return c.a(this.f9252b, str);
        }
        if (i10 >= 26) {
            Iterator it = m().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupA = q.a(it.next());
                if (b.e(notificationChannelGroupA).equals(str)) {
                    return notificationChannelGroupA;
                }
            }
        }
        return null;
    }

    public List m() {
        return Build.VERSION.SDK_INT >= 26 ? b.g(this.f9252b) : Collections.EMPTY_LIST;
    }

    public List n() {
        return Build.VERSION.SDK_INT >= 26 ? b.h(this.f9252b) : Collections.EMPTY_LIST;
    }

    public void o(int i10, Notification notification) {
        p(null, i10, notification);
    }

    public void p(String str, int i10, Notification notification) {
        if (!r(notification)) {
            this.f9252b.notify(str, i10, notification);
        } else {
            q(new d(this.f9251a.getPackageName(), i10, str, notification));
            this.f9252b.cancel(str, i10);
        }
    }
}
