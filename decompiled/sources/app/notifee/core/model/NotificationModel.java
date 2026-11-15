package app.notifee.core.model;

import android.os.Bundle;
import app.notifee.core.KeepForSdk;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class NotificationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f11481a;

    public NotificationModel(Bundle bundle) {
        this.f11481a = bundle;
    }

    public NotificationAndroidModel a() {
        return NotificationAndroidModel.fromBundle(this.f11481a.getBundle("android"));
    }

    public Integer b() {
        return Integer.valueOf(c().hashCode());
    }

    public String c() {
        String string = this.f11481a.getString("id");
        Objects.requireNonNull(string);
        return string;
    }

    @KeepForSdk
    public Bundle toBundle() {
        return (Bundle) this.f11481a.clone();
    }
}
