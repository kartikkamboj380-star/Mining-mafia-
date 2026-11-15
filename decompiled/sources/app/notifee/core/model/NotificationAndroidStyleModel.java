package app.notifee.core.model;

import M.b;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.core.app.n;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import app.notifee.core.Logger;
import app.notifee.core.model.NotificationAndroidStyleModel;
import b9.q;
import b9.s;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.r;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationAndroidStyleModel {
    private static final String TAG = "NotificationAndroidStyle";
    private Bundle mNotificationAndroidStyleBundle;

    private NotificationAndroidStyleModel(Bundle bundle) {
        this.mNotificationAndroidStyleBundle = bundle;
    }

    public static n.h a(NotificationAndroidStyleModel notificationAndroidStyleModel) {
        String string;
        Bitmap bitmap;
        notificationAndroidStyleModel.getClass();
        n.b bVar = new n.b();
        Bitmap bitmap2 = null;
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("picture")) {
            String string2 = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("picture");
            Objects.requireNonNull(string2);
            try {
                bitmap = (Bitmap) s.b(string2).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e10) {
                Logger.e(TAG, "Timeout occurred whilst trying to retrieve a big picture style image: " + string2, (Exception) e10);
                bitmap = null;
            } catch (Exception e11) {
                Logger.e(TAG, "An error occurred whilst trying to retrieve a big picture style image: " + string2, e11);
                bitmap = null;
            }
            if (bitmap != null) {
                bVar.i(bitmap);
            }
        }
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("largeIcon")) {
            string = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("largeIcon");
            if (string == null) {
                bVar.h(null);
            }
        } else {
            string = null;
        }
        if (string != null) {
            try {
                bitmap2 = (Bitmap) s.b(string).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e12) {
                Logger.e(TAG, "Timeout occurred whilst trying to retrieve a big picture style large icon: " + string, (Exception) e12);
            } catch (Exception e13) {
                Logger.e(TAG, "An error occurred whilst trying to retrieve a big picture style large icon: " + string, e13);
            }
            if (bitmap2 != null) {
                bVar.h(bitmap2);
            }
        }
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("title")) {
            bVar = bVar.j(b.a(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        return notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("summary") ? bVar.k(b.a(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("summary"), 0)) : bVar;
    }

    public static /* synthetic */ v b(Bundle bundle) {
        Bitmap bitmap;
        v.b bVar = new v.b();
        bVar.f(bundle.getString(MediationMetaData.KEY_NAME));
        if (bundle.containsKey("id")) {
            bVar.e(bundle.getString("id"));
        }
        if (bundle.containsKey("bot")) {
            bVar.b(bundle.getBoolean("bot"));
        }
        if (bundle.containsKey("important")) {
            bVar.d(bundle.getBoolean("important"));
        }
        if (bundle.containsKey("icon")) {
            String string = bundle.getString("icon");
            Objects.requireNonNull(string);
            try {
                bitmap = (Bitmap) s.b(string).get(10L, TimeUnit.SECONDS);
            } catch (TimeoutException e10) {
                Logger.e(TAG, "Timeout occurred whilst trying to retrieve a person icon: " + string, (Exception) e10);
                bitmap = null;
            } catch (Exception e11) {
                Logger.e(TAG, "An error occurred whilst trying to retrieve a person icon: " + string, e11);
                bitmap = null;
            }
            if (bitmap != null) {
                bVar.c(IconCompat.b(bitmap));
            }
        }
        if (bundle.containsKey("uri")) {
            bVar.g(bundle.getString("uri"));
        }
        return bVar.a();
    }

    public static n.h c(NotificationAndroidStyleModel notificationAndroidStyleModel, r rVar) {
        v vVar;
        Bundle bundle = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getBundle("person");
        Objects.requireNonNull(bundle);
        n.g gVar = new n.g((v) getPerson(rVar, bundle).get(20L, TimeUnit.SECONDS));
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("title")) {
            gVar = gVar.k(b.a(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        if (notificationAndroidStyleModel.mNotificationAndroidStyleBundle.containsKey("group")) {
            gVar = gVar.l(notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getBoolean("group"));
        }
        ArrayList parcelableArrayList = notificationAndroidStyleModel.mNotificationAndroidStyleBundle.getParcelableArrayList("messages");
        int i10 = 0;
        while (true) {
            Objects.requireNonNull(parcelableArrayList);
            if (i10 >= parcelableArrayList.size()) {
                return gVar;
            }
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
            long jD = q.d(bundle2.get("timestamp"));
            if (bundle2.containsKey("person")) {
                Bundle bundle3 = bundle2.getBundle("person");
                Objects.requireNonNull(bundle3);
                vVar = (v) getPerson(rVar, bundle3).get(20L, TimeUnit.SECONDS);
            } else {
                vVar = null;
            }
            gVar = gVar.i(b.a(bundle2.getString("text"), 0), jD, vVar);
            i10++;
        }
    }

    public static NotificationAndroidStyleModel fromBundle(Bundle bundle) {
        return new NotificationAndroidStyleModel(bundle);
    }

    private p getBigPictureStyleTask(r rVar) {
        return rVar.submit(new Callable() { // from class: Y0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.a(this.f6840a);
            }
        });
    }

    private n.c getBigTextStyle() {
        n.c cVar = new n.c();
        if (this.mNotificationAndroidStyleBundle.containsKey("text")) {
            cVar = cVar.h(b.a(this.mNotificationAndroidStyleBundle.getString("text"), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("title")) {
            cVar = cVar.i(b.a(this.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        return this.mNotificationAndroidStyleBundle.containsKey("summary") ? cVar.j(b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0)) : cVar;
    }

    private n.f getInboxStyle() {
        n.f fVar = new n.f();
        if (this.mNotificationAndroidStyleBundle.containsKey("title")) {
            fVar = fVar.i(b.a(this.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("summary")) {
            fVar = fVar.j(b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0));
        }
        ArrayList<String> stringArrayList = this.mNotificationAndroidStyleBundle.getStringArrayList("lines");
        int i10 = 0;
        while (true) {
            Objects.requireNonNull(stringArrayList);
            if (i10 >= stringArrayList.size()) {
                return fVar;
            }
            fVar = fVar.h(b.a(stringArrayList.get(i10), 0));
            i10++;
        }
    }

    private p getMessagingStyleTask(final r rVar) {
        return rVar.submit(new Callable() { // from class: Y0.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.c(this.f6841a, rVar);
            }
        });
    }

    private static p getPerson(r rVar, final Bundle bundle) {
        return rVar.submit(new Callable() { // from class: Y0.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.b(bundle);
            }
        });
    }

    public p getStyleTask(r rVar) {
        int iA = q.a(this.mNotificationAndroidStyleBundle.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE));
        if (iA == 0) {
            return getBigPictureStyleTask(rVar);
        }
        if (iA == 1) {
            return j.c(getBigTextStyle());
        }
        if (iA == 2) {
            return j.c(getInboxStyle());
        }
        if (iA != 3) {
            return null;
        }
        return getMessagingStyleTask(rVar);
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidStyleBundle.clone();
    }
}
