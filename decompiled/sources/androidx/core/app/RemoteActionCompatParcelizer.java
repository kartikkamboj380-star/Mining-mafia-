package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f9105a = (IconCompat) aVar.v(remoteActionCompat.f9105a, 1);
        remoteActionCompat.f9106b = aVar.l(remoteActionCompat.f9106b, 2);
        remoteActionCompat.f9107c = aVar.l(remoteActionCompat.f9107c, 3);
        remoteActionCompat.f9108d = (PendingIntent) aVar.r(remoteActionCompat.f9108d, 4);
        remoteActionCompat.f9109e = aVar.h(remoteActionCompat.f9109e, 5);
        remoteActionCompat.f9110f = aVar.h(remoteActionCompat.f9110f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f9105a, 1);
        aVar.D(remoteActionCompat.f9106b, 2);
        aVar.D(remoteActionCompat.f9107c, 3);
        aVar.H(remoteActionCompat.f9108d, 4);
        aVar.z(remoteActionCompat.f9109e, 5);
        aVar.z(remoteActionCompat.f9110f, 6);
    }
}
