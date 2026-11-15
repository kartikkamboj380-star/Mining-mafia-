package app.notifee.core.model;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.core.app.n;
import androidx.core.app.x;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationAndroidActionModel {
    private Bundle mNotificationAndroidActionBundle;

    private NotificationAndroidActionModel(Bundle bundle) {
        this.mNotificationAndroidActionBundle = bundle;
    }

    public static NotificationAndroidActionModel fromBundle(Bundle bundle) {
        return new NotificationAndroidActionModel(bundle);
    }

    public String getIcon() {
        return this.mNotificationAndroidActionBundle.getString("icon");
    }

    @NonNull
    public NotificationAndroidPressActionModel getPressAction() {
        return NotificationAndroidPressActionModel.fromBundle(this.mNotificationAndroidActionBundle.getBundle("pressAction"));
    }

    public x getRemoteInput(n.a.C0146a c0146a) {
        if (!this.mNotificationAndroidActionBundle.containsKey("input")) {
            return null;
        }
        Bundle bundle = this.mNotificationAndroidActionBundle.getBundle("input");
        Objects.requireNonNull(bundle);
        x.d dVar = new x.d("app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY");
        if (bundle.containsKey("allowFreeFormInput")) {
            dVar.b(bundle.getBoolean("allowFreeFormInput"));
        }
        if (bundle.containsKey("allowGeneratedReplies")) {
            c0146a.d(bundle.getBoolean("allowGeneratedReplies"));
        }
        if (bundle.containsKey("placeholder")) {
            dVar.e(bundle.getCharSequence("placeholder"));
        }
        if (bundle.containsKey("choices")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("choices");
            Objects.requireNonNull(stringArrayList);
            dVar.c((CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]));
        }
        if (!bundle.containsKey("editableChoices")) {
            dVar.d(0);
        } else if (bundle.getBoolean("editableChoices")) {
            dVar.d(2);
        } else {
            dVar.d(1);
        }
        return dVar.a();
    }

    @NonNull
    public String getTitle() {
        String string = this.mNotificationAndroidActionBundle.getString("title");
        Objects.requireNonNull(string);
        return string;
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidActionBundle.clone();
    }
}
