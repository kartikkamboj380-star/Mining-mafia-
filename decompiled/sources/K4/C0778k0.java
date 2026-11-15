package K4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: K4.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0778k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f2677e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2675c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2674b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f2673a = new C0776j0(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f2674b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Context context) {
        try {
            if (this.f2675c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f2677e = applicationContext;
            if (applicationContext == null) {
                this.f2677e = context;
            }
            AbstractC3892ii.a(this.f2677e);
            this.f2676d = ((Boolean) H4.B.c().d(AbstractC3892ii.f29584I4)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.xc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f2677e.registerReceiver(this.f2673a, intentFilter);
            } else {
                this.f2677e.registerReceiver(this.f2673a, intentFilter, 4);
            }
            this.f2675c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f2676d) {
            this.f2674b.put(broadcastReceiver, intentFilter);
            return;
        }
        AbstractC3892ii.a(context);
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.xc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f2676d) {
            this.f2674b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
