package app.notifee.core.database;

import A0.g;
import android.content.Context;
import androidx.room.t;
import androidx.room.u;
import com.google.common.util.concurrent.r;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Executors;
import p231x0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotifeeCoreDatabase extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile NotifeeCoreDatabase f11458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f11459b = s.b(Executors.newCachedThreadPool());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11460c = new a(1, 2);

    public class a extends b {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p231x0.b
        public void a(g gVar) {
            gVar.p("ALTER TABLE work_data ADD COLUMN with_alarm_manager INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static NotifeeCoreDatabase d(Context context) {
        if (f11458a == null) {
            synchronized (NotifeeCoreDatabase.class) {
                try {
                    if (f11458a == null) {
                        f11458a = (NotifeeCoreDatabase) t.a(context.getApplicationContext(), NotifeeCoreDatabase.class, "notifee_core_database").b(f11460c).d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11458a;
    }

    public abstract b9.t e();
}
