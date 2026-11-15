package N0;

import S0.u;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C1188c;
import androidx.work.EnumC1186a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.q;
import androidx.work.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3625b = q.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f3626a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3627a;

        static {
            int[] iArr = new int[r.values().length];
            f3627a = iArr;
            try {
                iArr[r.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3627a[r.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3627a[r.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3627a[r.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3627a[r.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(Context context) {
        this.f3626a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(C1188c.C0181c c0181c) {
        return new JobInfo.TriggerContentUri(c0181c.a(), c0181c.b() ? 1 : 0);
    }

    static int c(r rVar) {
        int i10 = a.f3627a[rVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        q.e().a(f3625b, "API version too low. Cannot convert network type value " + rVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, r rVar) {
        if (Build.VERSION.SDK_INT < 30 || rVar != r.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(rVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(u uVar, int i10) {
        C1188c c1188c = uVar.f5402j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f5393a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f3626a).setRequiresCharging(c1188c.g()).setRequiresDeviceIdle(c1188c.h()).setExtras(persistableBundle);
        d(extras, c1188c.d());
        if (!c1188c.h()) {
            extras.setBackoffCriteria(uVar.f5405m, uVar.f5404l == EnumC1186a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(uVar.c() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!uVar.f5409q) {
            extras.setImportantWhileForeground(true);
        }
        if (c1188c.e()) {
            Iterator it = c1188c.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((C1188c.C0181c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c1188c.b());
            extras.setTriggerContentMaxDelay(c1188c.a());
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            extras.setRequiresBatteryNotLow(c1188c.f());
            extras.setRequiresStorageNotLow(c1188c.i());
        }
        boolean z9 = uVar.f5403k > 0;
        boolean z10 = jMax > 0;
        if (i11 >= 31 && uVar.f5409q && !z9 && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
