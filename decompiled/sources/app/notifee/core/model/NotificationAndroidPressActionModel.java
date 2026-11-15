package app.notifee.core.model;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationAndroidPressActionModel {
    private Bundle mNotificationAndroidPressActionBundle;

    private NotificationAndroidPressActionModel(Bundle bundle) {
        this.mNotificationAndroidPressActionBundle = bundle;
    }

    public static NotificationAndroidPressActionModel fromBundle(Bundle bundle) {
        return new NotificationAndroidPressActionModel(bundle);
    }

    @NonNull
    public String getId() {
        String string = this.mNotificationAndroidPressActionBundle.getString("id");
        Objects.requireNonNull(string);
        return string;
    }

    public String getLaunchActivity() {
        return this.mNotificationAndroidPressActionBundle.getString("launchActivity");
    }

    public int getLaunchActivityFlags() {
        int i10;
        if (!this.mNotificationAndroidPressActionBundle.containsKey("launchActivityFlags")) {
            return -1;
        }
        ArrayList<Integer> integerArrayList = this.mNotificationAndroidPressActionBundle.getIntegerArrayList("launchActivityFlags");
        Objects.requireNonNull(integerArrayList);
        int i11 = 0;
        for (int i12 = 0; i12 < integerArrayList.size(); i12++) {
            switch (integerArrayList.get(i12).intValue()) {
                case 0:
                    i10 = 1073741824;
                    break;
                case 1:
                    i10 = 536870912;
                    break;
                case 2:
                    i10 = 268435456;
                    break;
                case 3:
                    i10 = 134217728;
                    break;
                case 4:
                    i10 = 67108864;
                    break;
                case 5:
                    i10 = 33554432;
                    break;
                case 6:
                    i10 = 16777216;
                    break;
                case 7:
                    i10 = 8388608;
                    break;
                case 8:
                    i10 = 4194304;
                    break;
                case 9:
                    i10 = 2097152;
                    break;
                case 10:
                    i10 = 1048576;
                    break;
                case 11:
                case 12:
                    i10 = 524288;
                    break;
                case 13:
                    i10 = 262144;
                    break;
                case 14:
                    i10 = 131072;
                    break;
                case 15:
                    i10 = 65536;
                    break;
                case 16:
                    i10 = 32768;
                    break;
                case 17:
                    i10 = 16384;
                    break;
                case 18:
                    i10 = 8192;
                    break;
                case 19:
                    i10 = CodedOutputStream.DEFAULT_BUFFER_SIZE;
                    break;
                case 20:
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = 2048;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            i11 |= i10;
        }
        return i11;
    }

    public String getMainComponent() {
        return this.mNotificationAndroidPressActionBundle.getString("mainComponent");
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidPressActionBundle.clone();
    }
}
