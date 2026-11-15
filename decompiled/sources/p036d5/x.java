package p036d5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p096j5.f;

/* JADX INFO: loaded from: classes2.dex */
final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f43131c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ D f43134f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f43129a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f43130b = new Messenger(new f(Looper.getMainLooper(), new Handler.Callback() { // from class: d5.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            x xVar = this.f43126a;
            synchronized (xVar) {
                try {
                    A a10 = (A) xVar.f43133e.get(i10);
                    if (a10 == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    xVar.f43133e.remove(i10);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        a10.c(new B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    a10.a(data);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f43132d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f43133e = new SparseArray();

    /* synthetic */ x(D d10, w wVar) {
        this.f43134f = d10;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f43129a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f43129a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f43129a = 4;
            ConnectionTracker.getInstance().unbindService(this.f43134f.f43078a, this);
            B b10 = new B(i10, str, th);
            Iterator it = this.f43132d.iterator();
            while (it.hasNext()) {
                ((A) it.next()).c(b10);
            }
            this.f43132d.clear();
            for (int i12 = 0; i12 < this.f43133e.size(); i12++) {
                ((A) this.f43133e.valueAt(i12)).c(b10);
            }
            this.f43133e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        this.f43134f.f43079b.execute(new Runnable() { // from class: d5.r
            @Override // java.lang.Runnable
            public final void run() {
                final A a10;
                while (true) {
                    final x xVar = this.f43123a;
                    synchronized (xVar) {
                        try {
                            if (xVar.f43129a != 2) {
                                return;
                            }
                            if (xVar.f43132d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                a10 = (A) xVar.f43132d.poll();
                                xVar.f43133e.put(a10.f43073a, a10);
                                xVar.f43134f.f43079b.schedule(new Runnable() { // from class: d5.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xVar.e(a10.f43073a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a10)));
                    }
                    D d10 = xVar.f43134f;
                    Messenger messenger = xVar.f43130b;
                    int i10 = a10.f43075c;
                    Context context = d10.f43078a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = a10.f43073a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a10.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(JsonStorageKeyNames.DATA_KEY, a10.f43076d);
                    messageObtain.setData(bundle);
                    try {
                        xVar.f43131c.a(messageObtain);
                    } catch (RemoteException e10) {
                        xVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f43129a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        A a10 = (A) this.f43133e.get(i10);
        if (a10 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f43133e.remove(i10);
            a10.c(new B(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f43129a == 2 && this.f43132d.isEmpty() && this.f43133e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f43129a = 3;
                ConnectionTracker.getInstance().unbindService(this.f43134f.f43078a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(A a10) {
        int i10 = this.f43129a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f43132d.add(a10);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f43132d.add(a10);
            c();
            return true;
        }
        this.f43132d.add(a10);
        Preconditions.checkState(this.f43129a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f43129a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.f43134f.f43078a, intent, this, 1)) {
                this.f43134f.f43079b.schedule(new Runnable() { // from class: d5.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43124a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f43134f.f43079b.execute(new Runnable() { // from class: d5.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = this.f43121a;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f43131c = new y(iBinder2);
                        xVar.f43129a = 2;
                        xVar.c();
                    } catch (RemoteException e10) {
                        xVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f43134f.f43079b.execute(new Runnable() { // from class: d5.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f43125a.a(2, "Service disconnected");
            }
        });
    }
}
