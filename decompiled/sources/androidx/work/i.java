package androidx.work;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f11269c;

    public i(int i10, Notification notification, int i11) {
        this.f11267a = i10;
        this.f11269c = notification;
        this.f11268b = i11;
    }

    public int a() {
        return this.f11268b;
    }

    public Notification b() {
        return this.f11269c;
    }

    public int c() {
        return this.f11267a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11267a == iVar.f11267a && this.f11268b == iVar.f11268b) {
            return this.f11269c.equals(iVar.f11269c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f11267a * 31) + this.f11268b) * 31) + this.f11269c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f11267a + ", mForegroundServiceType=" + this.f11268b + ", mNotification=" + this.f11269c + '}';
    }
}
