package p076h5;

import W4.b;
import W4.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f44773e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f44776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f44777d;

    l(Context context) {
        this.f44775b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f44776c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f44777d = Executors.newSingleThreadExecutor();
        this.f44774a = context;
        if (this.f44775b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f44775b = true;
    }

    static synchronized b d(Context context) {
        try {
            Preconditions.checkNotNull(context, "Context must not be null");
            if (f44773e == null) {
                f44773e = new l(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44773e;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) throws k {
        if (g(context).edit().putLong("app_set_id_last_used_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    protected final long a() {
        long j10 = g(this.f44774a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    @Override // W4.b
    public final Task b() {
        final C7094k c7094k = new C7094k();
        this.f44777d.execute(new Runnable() { // from class: h5.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f44770a.e(c7094k);
            }
        });
        return c7094k.a();
    }

    final /* synthetic */ void e(C7094k c7094k) {
        String string = g(this.f44774a).getString("app_set_id", null);
        long jA = a();
        if (string == null || DefaultClock.getInstance().currentTimeMillis() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f44774a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f44774a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e10) {
                c7094k.b(e10);
                return;
            }
        } else {
            try {
                h(this.f44774a);
            } catch (k e11) {
                c7094k.b(e11);
                return;
            }
        }
        c7094k.c(new c(string, 1));
    }
}
