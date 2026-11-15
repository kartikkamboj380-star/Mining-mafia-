package p085i4;

import N4.AbstractC0822d;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static void a(PAGRequest pAGRequest, String str, AbstractC0822d abstractC0822d) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strD = abstractC0822d.d();
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", strD);
        pAGRequest.setExtraInfo(extraInfo);
    }
}
