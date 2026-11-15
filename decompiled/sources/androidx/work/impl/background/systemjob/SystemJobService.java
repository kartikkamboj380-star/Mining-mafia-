package androidx.work.impl.background.systemjob;

import K0.C;
import K0.InterfaceC0752e;
import K0.v;
import K0.w;
import S0.m;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0752e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11330d = q.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C f11331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11332b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f11333c = new w();

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K0.InterfaceC0752e
    public void d(m mVar, boolean z9) {
        JobParameters jobParameters;
        q.e().a(f11330d, mVar.b() + " executed on JobScheduler");
        synchronized (this.f11332b) {
            jobParameters = (JobParameters) this.f11332b.remove(mVar);
        }
        this.f11333c.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z9);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C cQ = C.q(getApplicationContext());
            this.f11331a = cQ;
            cQ.s().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            q.e().k(f11330d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C c10 = this.f11331a;
        if (c10 != null) {
            c10.s().l(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f11331a == null) {
            q.e().a(f11330d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m mVarA = a(jobParameters);
        if (mVarA == null) {
            q.e().c(f11330d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f11332b) {
            try {
                if (this.f11332b.containsKey(mVarA)) {
                    q.e().a(f11330d, "Job is already being executed by SystemJobService: " + mVarA);
                    return false;
                }
                q.e().a(f11330d, "onStartJob for " + mVarA);
                this.f11332b.put(mVarA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f11197b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f11196a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f11198c = b.a(jobParameters);
                }
                this.f11331a.C(this.f11333c.d(mVarA), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f11331a == null) {
            q.e().a(f11330d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m mVarA = a(jobParameters);
        if (mVarA == null) {
            q.e().c(f11330d, "WorkSpec id not found!");
            return false;
        }
        q.e().a(f11330d, "onStopJob for " + mVarA);
        synchronized (this.f11332b) {
            this.f11332b.remove(mVarA);
        }
        v vVarB = this.f11333c.b(mVarA);
        if (vVarB != null) {
            this.f11331a.E(vVarB);
        }
        return !this.f11331a.s().j(mVarA.b());
    }
}
