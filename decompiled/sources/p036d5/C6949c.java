package p036d5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p096j5.a;
import p176r5.AbstractC7096m;
import p176r5.C7094k;
import p176r5.InterfaceC7086c;
import p176r5.InterfaceC7093j;
import p190t.k;

/* JADX INFO: renamed from: d5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C6949c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f43092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f43093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f43094j = new Executor() { // from class: d5.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f43095k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f43097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f43098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f43099d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f43101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f43102g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f43096a = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f43100e = new Messenger(new i(this, Looper.getMainLooper()));

    public C6949c(Context context) {
        this.f43097b = context;
        this.f43098c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f43099d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? AbstractC7096m.f(null) : AbstractC7096m.f(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C6949c c6949c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c6949c.f43102g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c6949c.f43101f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f43095k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c6949c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(LogEvent.LEVEL_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c6949c.f43096a) {
                        for (int i10 = 0; i10 < c6949c.f43096a.size(); i10++) {
                            try {
                                c6949c.l((String) c6949c.f43096a.g(i10), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c6949c.l(str, intent2.putExtra(LogEvent.LEVEL_ERROR, strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    private final Task i(Bundle bundle) {
        final String strJ = j();
        final C7094k c7094k = new C7094k();
        synchronized (this.f43096a) {
            this.f43096a.put(strJ, c7094k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f43098c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f43097b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f43100e);
        if (this.f43101f != null || this.f43102g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f43101f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f43102g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f43098c.b() == 2) {
                    this.f43097b.sendBroadcast(intent);
                } else {
                    this.f43097b.startService(intent);
                }
            }
        } else if (this.f43098c.b() == 2) {
            this.f43097b.sendBroadcast(intent);
        } else {
            this.f43097b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f43099d.schedule(new Runnable() { // from class: d5.g
            @Override // java.lang.Runnable
            public final void run() {
                if (c7094k.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c7094k.a().c(f43094j, new OnCompleteListener() { // from class: d5.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f43106a.h(strJ, scheduledFutureSchedule, task);
            }
        });
        return c7094k.a();
    }

    private static synchronized String j() {
        int i10;
        i10 = f43092h;
        f43092h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f43093i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f43093i = PendingIntent.getBroadcast(context, 0, intent2, a.f45548a);
            }
            intent.putExtra("app", f43093i);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f43096a) {
            try {
                C7094k c7094k = (C7094k) this.f43096a.remove(str);
                if (c7094k != null) {
                    c7094k.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a() {
        return this.f43098c.a() >= 241100000 ? D.b(this.f43097b).d(5, Bundle.EMPTY).h(f43094j, new InterfaceC7086c() { // from class: d5.f
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C6947a(intent);
                }
                return null;
            }
        }) : AbstractC7096m.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C6947a c6947a) {
        if (this.f43098c.a() < 233700000) {
            return AbstractC7096m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c6947a.j());
        Integer numV = c6947a.v();
        if (numV != null) {
            bundle.putInt("google.product_id", numV.intValue());
        }
        return D.b(this.f43097b).c(3, bundle);
    }

    public Task c(final Bundle bundle) {
        if (this.f43098c.a() < 12000000) {
            return this.f43098c.b() != 0 ? i(bundle).j(f43094j, new InterfaceC7086c() { // from class: d5.H
                @Override // p176r5.InterfaceC7086c
                public final Object a(Task task) {
                    return this.f43087a.f(bundle, task);
                }
            }) : AbstractC7096m.e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return D.b(this.f43097b).d(1, bundle).h(f43094j, new InterfaceC7086c() { // from class: d5.e
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    public Task d(boolean z9) {
        if (this.f43098c.a() < 241100000) {
            return AbstractC7096m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z9);
        return D.b(this.f43097b).c(4, bundle);
    }

    final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).o(f43094j, new InterfaceC7093j() { // from class: d5.F
            @Override // p176r5.InterfaceC7093j
            public final Task then(Object obj) {
                return C6949c.e((Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f43096a) {
            this.f43096a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
