package p208u7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p158p7.g;
import p158p7.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f50002a = i.UNKNOWN;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            i iVar;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    iVar = i.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    iVar = i.UNKNOWN;
                }
                i unused = e.f50002a = iVar;
            }
        }
    }

    public static i a() {
        return p208u7.a.a() != g.CTV ? i.UNKNOWN : f50002a;
    }

    public static void c(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
