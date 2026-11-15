package K4;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* JADX INFO: renamed from: K4.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0774i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0774i0 f2668b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f2669a;

    private C0774i0() {
    }

    public static C0774i0 a() {
        if (f2668b == null) {
            f2668b = new C0774i0();
        }
        return f2668b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final void b(Context context) {
        SharedPreferences.Editor editorPutString;
        AbstractC0786o0.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f2669a)) {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (ClientLibraryUtils.isPackageSide()) {
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, editorPutString, "admob_user_agent");
                }
            } else if (remoteContext == null) {
                remoteContext = null;
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, editorPutString, "admob_user_agent");
                }
            }
            this.f2669a = defaultUserAgent;
        }
        AbstractC0786o0.k("User agent is updated.");
    }
}
