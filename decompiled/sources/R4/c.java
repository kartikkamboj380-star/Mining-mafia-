package R4;

import android.net.Uri;
import com.google.android.gms.internal.ads.AbstractC3266dj;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5289a = (String) AbstractC3266dj.f27498a.e();

    public String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f5289a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
