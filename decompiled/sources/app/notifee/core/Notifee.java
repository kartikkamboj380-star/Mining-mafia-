package app.notifee.core;

import W0.AbstractC0995b0;
import W0.E0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import app.notifee.core.Notifee;
import app.notifee.core.interfaces.EventListener;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;
import com.google.common.util.concurrent.r;
import com.google.common.util.concurrent.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Notifee {

    @KeepForSdk
    public static final int REQUEST_CODE_NOTIFICATION_PERMISSION = 11111;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Notifee f11437b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11438c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f11439d = s.b(Executors.newCachedThreadPool());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodCallResult f11440a;

    public class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11441a;

        public a(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11441a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11441a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11441a.onComplete(null, (List) obj);
        }
    }

    public class b implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11442a;

        public b(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11442a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11442a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11442a.onComplete(null, (Bundle) obj);
        }
    }

    public class c implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11443a;

        public c(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11443a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11443a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11443a.onComplete(null, (List) obj);
        }
    }

    public class d implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11444a;

        public d(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11444a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11444a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11444a.onComplete(null, (Bundle) obj);
        }
    }

    public class e implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11445a;

        public e(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11445a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11445a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11445a.onComplete(null, (Boolean) obj);
        }
    }

    public class f implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11446a;

        public f(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11446a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11446a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11446a.onComplete(null, (Boolean) obj);
        }
    }

    public class g implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11447a;

        public g(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11447a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11447a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11447a.onComplete(null, (Void) obj);
        }
    }

    public class h implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11448a;

        public h(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11448a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11448a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11448a.onComplete(null, (Void) obj);
        }
    }

    public class i implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11449a;

        public i(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11449a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11449a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11449a.onComplete(null, (Void) obj);
        }
    }

    public class j implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11450a;

        public j(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11450a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11450a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11450a.onComplete(null, (Void) obj);
        }
    }

    public class k implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11451a;

        public k(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11451a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11451a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11451a.onComplete(null, (Void) obj);
        }
    }

    public class l implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11452a;

        public l(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11452a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11452a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11452a.onComplete(null, (Void) obj);
        }
    }

    public class m implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11453a;

        public m(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11453a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            Exception exc = new Exception(th);
            Logger.e("API", "displayNotification", exc);
            this.f11453a.onComplete(exc, null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11453a.onComplete(null, (Void) obj);
        }
    }

    public class n implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11454a;

        public n(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11454a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            Exception exc = new Exception(th);
            Logger.e("API", "createTriggerNotification", exc);
            this.f11454a.onComplete(exc, null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11454a.onComplete(null, (Void) obj);
        }
    }

    public class o implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f11455a;

        public o(Notifee notifee, MethodCallResult methodCallResult) {
            this.f11455a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11455a.onComplete(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11455a.onComplete(null, (List) obj);
        }
    }

    @KeepForSdk
    public static Context getContext() {
        return b9.f.f11648a;
    }

    @KeepForSdk
    public static Notifee getInstance() {
        if (!f11438c) {
            Logger.w("API", "getInstance() accessed before event listener is initialized");
            f11437b = new Notifee();
        }
        return f11437b;
    }

    @KeepForSdk
    public static r getListeningExecutorService() {
        return f11439d;
    }

    @KeepForSdk
    public static void initialize(EventListener eventListener) {
        synchronized (Notifee.class) {
            try {
                if (f11438c) {
                    return;
                }
                if (f11437b == null) {
                    f11437b = new Notifee();
                }
                if (eventListener != null) {
                    EventSubscriber.register(eventListener);
                }
                f11438c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void cancelAllNotifications(int i10, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.e(i10), new g(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void cancelAllNotificationsWithIds(int i10, List<String> list, String str, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.h(i10, list, str), new h(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void createChannel(Bundle bundle, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.e(new b9.d(bundle)), new i(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void createChannelGroup(Bundle bundle, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.d(new b9.c(bundle)), new k(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void createChannelGroups(List<Bundle> list, MethodCallResult<Void> methodCallResult) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b9.c(it.next()));
        }
        com.google.common.util.concurrent.j.a(AbstractC0995b0.g(arrayList), new l(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void createChannels(List<Bundle> list, MethodCallResult<Void> methodCallResult) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b9.d(it.next()));
        }
        com.google.common.util.concurrent.j.a(AbstractC0995b0.j(arrayList), new j(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void createTriggerNotification(Bundle bundle, Bundle bundle2, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.m(new NotificationModel(bundle), bundle2), new n(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void deleteChannel(String str, MethodCallResult<Void> methodCallResult) {
        androidx.core.app.r.i(b9.f.f11648a).g(str);
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void deleteChannelGroup(String str, MethodCallResult<Void> methodCallResult) {
        androidx.core.app.r.i(b9.f.f11648a).h(str);
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void displayNotification(Bundle bundle, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.y(new NotificationModel(bundle), null), new m(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void getChannel(String str, MethodCallResult<Bundle> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.f(str), new b(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void getChannelGroup(String str, MethodCallResult<Bundle> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.i(str), new d(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void getChannelGroups(MethodCallResult<List<Bundle>> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.c(), new c(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void getChannels(MethodCallResult<List<Bundle>> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.h(), new a(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void getDisplayedNotifications(MethodCallResult<List<Bundle>> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.d(), new o(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void getInitialNotification(Activity activity, MethodCallResult<Bundle> methodCallResult) {
        b9.i iVar = (b9.i) b9.g.f11649b.f11650a.s(b9.i.class);
        Bundle bundle = new Bundle();
        if (iVar != null) {
            bundle.putAll(iVar.f11654b);
            bundle.putBundle("notification", iVar.f11653a.toBundle());
            methodCallResult.onComplete(null, bundle);
            return;
        }
        if (activity != null) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null && intent.getExtras() != null && intent.hasExtra("notification")) {
                    bundle.putBundle("notification", intent.getBundleExtra("notification"));
                    methodCallResult.onComplete(null, bundle);
                    return;
                }
            } catch (Exception e10) {
                Logger.e("API", "getInitialNotification", e10);
            }
        }
        methodCallResult.onComplete(null, null);
    }

    @NonNull
    @KeepForSdk
    public String getMainComponent(@NonNull String str) {
        b9.l lVar = (b9.l) b9.g.f11649b.f11650a.s(b9.l.class);
        return lVar == null ? str : lVar.f11657a;
    }

    @KeepForSdk
    public void getNotificationSettings(MethodCallResult<Bundle> methodCallResult) {
        boolean zA = androidx.core.app.r.i(b9.f.f11648a).a();
        Bundle bundle = new Bundle();
        if (zA) {
            bundle.putInt("authorizationStatus", 1);
        } else {
            bundle.putInt("authorizationStatus", 0);
        }
        boolean zCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? b9.a.a().canScheduleExactAlarms() : true;
        Bundle bundle2 = new Bundle();
        if (zCanScheduleExactAlarms) {
            bundle2.putInt("alarm", 1);
        } else {
            bundle2.putInt("alarm", 0);
        }
        bundle.putBundle("android", bundle2);
        methodCallResult.onComplete(null, bundle);
    }

    @KeepForSdk
    public void getPowerManagerInfo(MethodCallResult<Bundle> methodCallResult) {
        String strB = b9.k.b(b9.r.a(b9.f.f11648a));
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        Bundle bundle = new Bundle();
        bundle.putString("manufacturer", str);
        bundle.putString("model", str2);
        bundle.putString("version", str3);
        bundle.putString("activity", strB);
        methodCallResult.onComplete(null, bundle);
    }

    @KeepForSdk
    public void getTriggerNotificationIds(MethodCallResult<List<String>> methodCallResult) {
        ExecutorService executorService = E0.f6484a;
        com.google.common.util.concurrent.j.a(new X0.i(b9.f.f11648a).o(), new b9.n(methodCallResult), E0.f6485b);
    }

    @KeepForSdk
    public void getTriggerNotifications(MethodCallResult<List<Bundle>> methodCallResult) {
        ExecutorService executorService = E0.f6484a;
        com.google.common.util.concurrent.j.a(new X0.i(b9.f.f11648a).o(), new b9.m(new ArrayList(), methodCallResult), E0.f6485b);
    }

    @KeepForSdk
    public void isBatteryOptimizationEnabled(MethodCallResult<Boolean> methodCallResult) {
        Context context = b9.f.f11648a;
        methodCallResult.onComplete(null, Boolean.valueOf(!((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName())));
    }

    @KeepForSdk
    public void isChannelBlocked(String str, MethodCallResult<Boolean> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.m(str), new f(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public void isChannelCreated(String str, MethodCallResult<Boolean> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC0995b0.p(str), new e(this, methodCallResult), getListeningExecutorService());
    }

    @KeepForSdk
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        MethodCallResult<Bundle> methodCallResult;
        if (i10 != 11111 || (methodCallResult = this.f11440a) == null) {
            return false;
        }
        getNotificationSettings(methodCallResult);
        return true;
    }

    @KeepForSdk
    public void openAlarmPermissionSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + b9.f.f11648a.getPackageName()));
                b9.k.c(activity, intent);
            } catch (Exception e10) {
                Logger.e("AlarmUtils", "An error occurred whilst trying to open alarm permission settings", e10);
            }
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void openBatteryOptimizationSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
            intent.setFlags(268435456);
            if (activity != null) {
                if (b9.k.d(b9.f.f11648a, intent)) {
                    b9.k.c(activity, intent);
                } else {
                    Logger.d("PowerManagerUtils", "battery optimization settings is not available on device");
                }
            }
        } catch (Exception e10) {
            Logger.e("PowerManagerUtils", "An error occurred whilst trying to open battery optimization settings", e10);
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void openNotificationSettings(String str, Activity activity, MethodCallResult<Void> methodCallResult) {
        final Intent intent;
        if (getContext() == null || activity == null) {
            Logger.d("openNotificationSettings", "attempted to start activity but no current activity or context was available.");
            methodCallResult.onComplete(null, null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (str != null) {
                intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", str);
            } else {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", getContext().getPackageName());
        } else {
            intent = new Intent("android.settings.APPLICATION_SETTINGS");
        }
        intent.setFlags(268435456);
        activity.runOnUiThread(new Runnable() { // from class: W0.g
            @Override // java.lang.Runnable
            public final void run() {
                Notifee.getContext().startActivity(intent);
            }
        });
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void openPowerManagerSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        Intent intentA;
        synchronized (b9.r.class) {
            intentA = b9.r.f11661a;
        }
        if (intentA == null) {
            intentA = b9.r.a(b9.f.f11648a);
        }
        if (intentA != null) {
            try {
                intentA.setFlags(268435456);
                b9.k.c(activity, intentA);
            } catch (Exception e10) {
                Logger.e("PowerManagerUtils", "Unable to start activity: " + b9.k.b(intentA), e10);
            }
        } else {
            Logger.w("PowerManagerUtils", "Unable to find an activity to open the device's power manager");
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void setRequestPermissionCallback(MethodCallResult<Bundle> methodCallResult) {
        this.f11440a = methodCallResult;
    }

    @KeepForSdk
    public void stopForegroundService(MethodCallResult<Void> methodCallResult) {
        String str = ForegroundService.f11435a;
        Intent intent = new Intent(b9.f.f11648a, (Class<?>) ForegroundService.class);
        intent.setAction("app.notifee.core.ForegroundService.STOP");
        try {
            b9.f.f11648a.startService(intent);
        } catch (IllegalStateException unused) {
            b9.f.f11648a.stopService(intent);
        } catch (Exception e10) {
            Logger.e("ForegroundService", "Unable to stop foreground service", e10);
        }
        methodCallResult.onComplete(null, null);
    }
}
