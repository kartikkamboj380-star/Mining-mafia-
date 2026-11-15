package p215v4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p145o4.p;
import p185s4.a;
import p225w4.InterfaceC7144d;

/* JADX INFO: loaded from: classes2.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7144d f50129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f50130c;

    public d(Context context, InterfaceC7144d interfaceC7144d, f fVar) {
        this.f50128a = context;
        this.f50129b = interfaceC7144d;
        this.f50130c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p215v4.x
    public void a(p pVar, int i10, boolean z9) {
        ComponentName componentName = new ComponentName(this.f50128a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f50128a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z9 && d(jobScheduler, iC, i10)) {
            a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jC0 = this.f50129b.C0(pVar);
        JobInfo.Builder builderC = this.f50130c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jC0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, p255z4.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f50130c.g(pVar.d(), jC0, i10)), Long.valueOf(jC0), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // p215v4.x
    public void b(p pVar, int i10) {
        a(pVar, i10, false);
    }

    int c(p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f50128a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(p255z4.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
