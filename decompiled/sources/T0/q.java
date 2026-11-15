package T0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f5591a;

    public q(WorkDatabase workDatabase) {
        this.f5591a = workDatabase;
    }

    public static void c(Context context, A0.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.l();
            try {
                gVar.E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.D();
            } finally {
                gVar.L();
            }
        }
    }

    public long a() {
        Long lB = this.f5591a.f().b("last_force_stop_ms");
        if (lB != null) {
            return lB.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lB = this.f5591a.f().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void d(long j10) {
        this.f5591a.f().a(new S0.d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z9) {
        this.f5591a.f().a(new S0.d("reschedule_needed", z9));
    }
}
