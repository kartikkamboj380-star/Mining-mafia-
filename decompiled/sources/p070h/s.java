package p070h;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends Service {

    private static class a {
        static int a() {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) s.class), a.a() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    }
}
