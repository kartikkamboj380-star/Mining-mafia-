package K4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.AbstractC2321Qw;
import com.google.android.gms.internal.ads.C2703Yf;
import com.google.android.gms.internal.ads.EnumC1668Eh;
import com.google.android.gms.internal.ads.InterfaceC1750Fw;
import com.google.android.gms.internal.ads.KX;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class R0 {
    /* synthetic */ R0(byte[] bArr) {
    }

    public abstract CookieManager a(Context context);

    public abstract AbstractC2321Qw b(InterfaceC1750Fw interfaceC1750Fw, C2703Yf c2703Yf, boolean z9, KX kx);

    public abstract WebResourceResponse c(String str, String str2, int i10, String str3, Map map, InputStream inputStream);

    public abstract boolean d(Activity activity, Configuration configuration);

    public EnumC1668Eh e(Context context, TelephonyManager telephonyManager) {
        return EnumC1668Eh.ENUM_UNKNOWN;
    }

    public boolean g(Context context, String str) {
        return false;
    }

    public Intent h(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int j(AudioManager audioManager) {
        return 0;
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void i(Activity activity) {
    }

    public void f(Context context, String str, String str2) {
    }
}
