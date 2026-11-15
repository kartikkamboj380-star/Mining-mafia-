package H2;

import android.app.ActivityManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class o implements Y1.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1172b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f1173a;

    public o(ActivityManager activityManager) {
        this.f1173a = activityManager;
    }

    private int b() {
        int iMin = Math.min(this.f1173a.getMemoryClass() * 1048576, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    @Override // Y1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, f1172b);
    }
}
