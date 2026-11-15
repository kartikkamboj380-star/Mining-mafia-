package Y0;

import android.os.Bundle;
import b9.q;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f6844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeUnit f6846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f6847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f6848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f6850g;

    public enum a {
        SET,
        SET_AND_ALLOW_WHILE_IDLE,
        SET_EXACT,
        SET_EXACT_AND_ALLOW_WHILE_IDLE,
        SET_ALARM_CLOCK
    }

    public d(Bundle bundle) {
        this.f6845b = -1;
        this.f6846c = null;
        this.f6847d = Boolean.FALSE;
        a aVar = a.SET_EXACT;
        this.f6848e = aVar;
        this.f6849f = null;
        this.f6850g = null;
        this.f6844a = bundle;
        if (bundle.containsKey("repeatFrequency")) {
            int iA = q.a(this.f6844a.get("repeatFrequency"));
            this.f6850g = Long.valueOf(q.d(this.f6844a.get("timestamp")));
            if (iA == 0) {
                this.f6845b = 1;
                this.f6846c = TimeUnit.HOURS;
                this.f6849f = "HOURLY";
            } else if (iA == 1) {
                this.f6845b = 1;
                this.f6846c = TimeUnit.DAYS;
                this.f6849f = "DAILY";
            } else if (iA == 2) {
                this.f6845b = 7;
                this.f6846c = TimeUnit.DAYS;
                this.f6849f = "WEEKLY";
            }
        }
        if (!this.f6844a.containsKey("alarmManager")) {
            if (this.f6844a.containsKey("allowWhileIdle")) {
                this.f6847d = Boolean.TRUE;
                this.f6848e = a.SET_EXACT_AND_ALLOW_WHILE_IDLE;
                return;
            }
            return;
        }
        this.f6847d = Boolean.TRUE;
        Bundle bundle2 = this.f6844a.getBundle("alarmManager");
        Object obj = bundle2.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        int iA2 = obj != null ? q.a(obj) : 2;
        if (bundle2.containsKey("allowWhileIdle") && bundle2.getBoolean("allowWhileIdle")) {
            iA2 = 3;
        }
        if (iA2 == 0) {
            this.f6848e = a.SET;
            return;
        }
        if (iA2 == 1) {
            this.f6848e = a.SET_AND_ALLOW_WHILE_IDLE;
            return;
        }
        if (iA2 == 3) {
            this.f6848e = a.SET_EXACT_AND_ALLOW_WHILE_IDLE;
        } else if (iA2 != 4) {
            this.f6848e = aVar;
        } else {
            this.f6848e = a.SET_ALARM_CLOCK;
        }
    }

    public void a() {
        long j10;
        if (this.f6849f == null) {
            return;
        }
        long jLongValue = this.f6850g.longValue();
        String str = this.f6849f;
        str.getClass();
        switch (str) {
            case "WEEKLY":
                j10 = 604800000;
                break;
            case "DAILY":
                j10 = 86400000;
                break;
            case "HOURLY":
                j10 = 3600000;
                break;
            default:
                j10 = 0;
                break;
        }
        while (jLongValue < System.currentTimeMillis()) {
            jLongValue += j10;
        }
        this.f6850g = Long.valueOf(jLongValue);
    }
}
